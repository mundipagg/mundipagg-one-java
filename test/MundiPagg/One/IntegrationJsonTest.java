package MundiPagg.One;

import Client.GatewayServiceClient;
import DataContracts.Address.*;
import DataContracts.BoletoTransaction.*;
import DataContracts.CreditCardTransaction.*;
import DataContracts.InstantBuy.*;
import DataContracts.Order.*;
import DataContracts.Person.*;
import DataContracts.Sale.*;
import DataContracts.ShoppingCart.*;
import EnumTypes.*;
import Utility.*;
import java.util.ArrayList;
import java.util.UUID;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;
import static org.junit.Assert.*;

/**
 * Testes do SDK simulando integração usando Json
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IntegrationJsonTest {
    
    /**
     * MerchantKey para os testes
     */
    private final UUID MerchantKey;
    
    /**
     * MerchantKey para os testes
     */
    private final PlatformEnvironmentEnum Environment;
    
    /**
     * BuyerKey criado nos testes
     */
    private static UUID BuyerKey;
    
    /**
     * InstantBuyKey criado nos testes
     */
    private static UUID InstantBuyKey;
    
    /**
     * BuyerKey criado nos testes
     */
    private static UUID OrderKey;
    
    /**
     * Construtor
     */
    public IntegrationJsonTest() {
        // Define propriedades para o teste de acordo com a classe de configuração dos testes
        this.MerchantKey = TestsConfiguration.MerchantKey;
        this.Environment = TestsConfiguration.Environment;
    }

    ///////////////////////////
    // SALE RESOURCES TESTS  //
    ///////////////////////////
    
    /**
     * Testa a criação de uma venda no ambiente de homologação / JSON
     */    
    @Test
    public void TestA_CreateSale() {
        
        // Define loja e ambiente de integração
        UUID merchantKey = this.MerchantKey;  // Chave da Loja - MerchantKey
        PlatformEnvironmentEnum environment = this.Environment; // Ambiente de integração para o teste
        
        // Cria pedido 
        Order order = new Order();
        order.setOrderReference("REF123456");
        
        // Cria comprador
        Buyer buyer = new Buyer();
        buyer.setName("Comprador da Silva");
        buyer.setBuyerReference("COMP12345");
        buyer.setDocumentType(DocumentTypeEnum.CPF);
        buyer.setDocumentNumber("11122233344");
        buyer.setEmailType(EmailTypeEnum.Comercial);
        buyer.setEmail("comprador@provedor.com");
        buyer.setPersonType(PersonTypeEnum.Person);
        buyer.setHomePhone("(21)22223333");
        
        // Cria um item para o carrinho de compras
        ShoppingCartItem shoppingCartItem = new ShoppingCartItem();
        shoppingCartItem.setItemReference("123");
        shoppingCartItem.setName("Ingressos para o Rock in Rio");
        shoppingCartItem.setDescription("Ingressos para Rock in Rio, todos os dias!");
        shoppingCartItem.setQuantity(1);
        shoppingCartItem.setTotalCostInCents(90000);
        shoppingCartItem.setUnitCostInCents(90000);
      
        // Cria carrinho de compras e adiciona a coleção de itens o item definido acima
        ShoppingCart shoppingCart = new ShoppingCart();       
        shoppingCart.setFreightCostInCents(2000);
        shoppingCart.setShippingCompany("Correios");
        shoppingCart.setShoppingCartItemCollection(new ArrayList<>());
        shoppingCart.getShoppingCartItemCollection().add(shoppingCartItem);
        
        // Cria um cartão de crédito e define endereço de cobrança
        CreditCard creditCard = new CreditCard();
        creditCard.setCreditCardNumber("4111111111111111");
        creditCard.setCreditCardBrand(CreditCardBrandEnum.Visa);
        creditCard.setExpMonth(10);
        creditCard.setExpYear(2018);
        creditCard.setSecurityCode("123");
        creditCard.setHolderName("Comprador da S");
        creditCard.setBillingAddress(new BillingAddress());
        creditCard.getBillingAddress().setZipCode("23000-123");
        creditCard.getBillingAddress().setCountry(CountryEnum.Brazil);
        creditCard.getBillingAddress().setCity("Rio de Janeiro");
        creditCard.getBillingAddress().setState("RJ");
        creditCard.getBillingAddress().setDistrict("Centro");
        creditCard.getBillingAddress().setStreet("Rua da Quitanda");
        creditCard.getBillingAddress().setNumber("199");
        
        // Cria a transação de cartão de crédito e define cartão criado anteriormente
        CreditCardTransaction creditCardTransaction = new CreditCardTransaction();
        creditCardTransaction.setAmountInCents(92000L);
        creditCardTransaction.setOptions(new CreditCardTransactionOptions());
        creditCardTransaction.getOptions().setPaymentMethodCode(1); // Simulator       
        creditCardTransaction.setCreditCard(creditCard);

        // Cria requisição de venda e usa objetos criados acima
        CreateSaleRequest createSaleRequest = new CreateSaleRequest();
        createSaleRequest.setCreditCardTransactionCollection(new ArrayList<>());
        createSaleRequest.getCreditCardTransactionCollection().add(creditCardTransaction);
        createSaleRequest.setShoppingCartCollection(new ArrayList<>());
        createSaleRequest.getShoppingCartCollection().add(shoppingCart);
        createSaleRequest.setOrder(order);
        createSaleRequest.setBuyer(buyer);
        
        try {
            // Cria o cliente que vai enviar a transação
            GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey, environment);
            
            // Autoriza a transação e retorna a resposta do gateway
            HttpResponseGenerics<CreateSaleResponse, CreateSaleRequest> httpResponse = 
                    serviceClient.getSale().Create(createSaleRequest);

            // Obtem objeto de resposta montado
            CreateSaleRequest createSaleRequestResult = httpResponse.getRequest();
            CreateSaleResponse createSaleResponseResult = httpResponse.getResponse();
            String createSaleRawRequest = httpResponse.getRawRequest();
            String createSaleRawResponse = httpResponse.getRawResponse();
            
            // Testa se conseguiu obter recurso
            assertEquals(httpResponse.getHttpStatusCode().getStatusCode(), 201); 
            assertNotNull(createSaleResponseResult.getCreditCardTransactionResultCollection());
            assertNotNull(createSaleRawRequest);
            assertNotNull(createSaleRawResponse);
            assertEquals(createSaleRequestResult, createSaleRequest);
            
            IntegrationJsonTest.BuyerKey = createSaleResponseResult.getBuyerKey();
            IntegrationJsonTest.OrderKey = createSaleResponseResult.getOrderResult().getOrderKey();
            IntegrationJsonTest.InstantBuyKey = createSaleResponseResult.getCreditCardTransactionResultCollection().get(0).getCreditCard().getInstantBuyKey();
        }
        catch (Exception ex) { assertTrue(false); }
    }
    
    /**
     * Testa a criação de uma transação de cartão de crédito no ambiente de homologação / JSON
     */    
    @Test
    public void TestB_CreateSaleCreditCard() {
        
        // Define loja e ambiente de integração
        UUID merchantKey = this.MerchantKey;  // Chave da Loja - MerchantKey
        PlatformEnvironmentEnum environment = this.Environment; // Ambiente de integração para o teste
     
        // Cria um cartão de crédito e define endereço de cobrança
        CreditCard creditCard = new CreditCard();
        creditCard.setCreditCardNumber("4111111111111111");
        creditCard.setCreditCardBrand(CreditCardBrandEnum.Visa);
        creditCard.setExpMonth(10);
        creditCard.setExpYear(2018);
        creditCard.setSecurityCode("123");
        creditCard.setHolderName("Comprador da S");
        creditCard.setBillingAddress(new BillingAddress());
        creditCard.getBillingAddress().setZipCode("23000-123");
        creditCard.getBillingAddress().setCountry(CountryEnum.Brazil);
        creditCard.getBillingAddress().setCity("Rio de Janeiro");
        creditCard.getBillingAddress().setState("RJ");
        creditCard.getBillingAddress().setDistrict("Centro");
        creditCard.getBillingAddress().setStreet("Rua da Quitanda");
        creditCard.getBillingAddress().setNumber("199");
        
        // Cria a transação de cartão de crédito e define cartão criado anteriormente
        CreditCardTransaction creditCardTransaction = new CreditCardTransaction();
        creditCardTransaction.setAmountInCents(92000L);
        creditCardTransaction.setOptions(new CreditCardTransactionOptions());
        creditCardTransaction.getOptions().setPaymentMethodCode(1); // Simulator       
        creditCardTransaction.setCreditCard(creditCard);
        
        try {
            // Cria o cliente que vai enviar a transação
            GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey, environment);
            
            // Submete a transação e retorna a resposta do gateway
            HttpResponseGenerics<CreateSaleResponse, CreateSaleRequest> httpResponse = 
                    serviceClient.getSale().CreateCreditCard(creditCardTransaction);

            // Obtem objeto de resposta montado
            CreateSaleRequest createSaleRequestResult = httpResponse.getRequest();
            CreateSaleResponse createSaleResponseResult = httpResponse.getResponse();
            String createSaleRawRequest = httpResponse.getRawRequest();
            String createSaleRawResponse = httpResponse.getRawResponse();
            
            // Testa se conseguiu obter recurso
            assertEquals(httpResponse.getHttpStatusCode().getStatusCode(), 201); 
            assertNotNull(createSaleRequestResult.getCreditCardTransactionCollection().get(0));
            assertNotNull(createSaleResponseResult.getCreditCardTransactionResultCollection());
            assertNotNull(createSaleRawRequest);
            assertNotNull(createSaleRawResponse);
            
        }
        catch (Exception ex) { assertTrue(false); }
    }
    
    /**
     * Testa a criação de uma transação de boleto no ambiente de homologação / JSON
     */    
    @Test
    public void TestC_CreateSaleBoleto() {
        
        // Define loja e ambiente de integração
        UUID merchantKey = this.MerchantKey;  // Chave da Loja - MerchantKey
        PlatformEnvironmentEnum environment = this.Environment; // Ambiente de integração para o teste
            
        // Cria a transação de boleto
        BoletoTransaction boletoTransaction = new BoletoTransaction();
        boletoTransaction.setAmountInCents(92000L);
        boletoTransaction.setOptions(new BoletoTransactionOptions());
        boletoTransaction.getOptions().setDaysToAddInBoletoExpirationDate(7);
        boletoTransaction.getOptions().setCurrencyIso(CurrencyIsoEnum.BRL);
        boletoTransaction.setBankNumber("347");
        boletoTransaction.setDocumentNumber("DOC123456");
        boletoTransaction.setInstructions("Não aceitar após o vencimento.");
        boletoTransaction.setBillingAddress(new BillingAddress());
        boletoTransaction.getBillingAddress().setZipCode("23000-123");
        boletoTransaction.getBillingAddress().setCountry(CountryEnum.Brazil);
        boletoTransaction.getBillingAddress().setCity("Rio de Janeiro");
        boletoTransaction.getBillingAddress().setState("RJ");
        boletoTransaction.getBillingAddress().setDistrict("Centro");
        boletoTransaction.getBillingAddress().setStreet("Rua da Quitanda");
        boletoTransaction.getBillingAddress().setNumber("199");
        
        try {
            // Cria o cliente que vai enviar a transação
            GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey, environment);
            
            // Submete a transação e retorna a resposta do gateway
            HttpResponseGenerics<CreateSaleResponse, CreateSaleRequest> httpResponse = 
                    serviceClient.getSale().CreateBoleto(boletoTransaction);

            // Obtem objeto de resposta montado
            CreateSaleRequest createSaleRequestResult = httpResponse.getRequest();
            CreateSaleResponse createSaleResponseResult = httpResponse.getResponse();
            String createSaleRawRequest = httpResponse.getRawRequest();
            String createSaleRawResponse = httpResponse.getRawResponse();
            
            // Testa se conseguiu obter recurso
            assertEquals(httpResponse.getHttpStatusCode().getStatusCode(), 201); 
            assertNotNull(createSaleRequestResult.getBoletoTransactionCollection().get(0));
            assertNotNull(createSaleResponseResult.getCreditCardTransactionResultCollection());
            assertNotNull(createSaleRawRequest);
            assertNotNull(createSaleRawResponse);
        }
        catch (Exception ex) { assertTrue(false); }
    }
    
    /**
     * Testa o gerenciamento (captura) de uma transação de cartão de crédito no ambiente de homologação / JSON
     */    
    @Test
    public void TestD_ManageSale_Capture() {
        
        // Define loja e ambiente de integração
        UUID merchantKey = this.MerchantKey;  // Chave da Loja - MerchantKey
        PlatformEnvironmentEnum environment = this.Environment; // Ambiente de integração para o teste
        
        try {
            // Cria o cliente que vai enviar a transação
            GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey, environment);
            
            // Define a chave do pedido
            UUID orderKey = IntegrationJsonTest.OrderKey;
            
            // Submete a requisição e retorna a resposta do gateway
            HttpResponseGenerics<ManageSaleResponse, ManageSaleRequest> httpResponse = 
                    serviceClient.getSale().Manage(ManageOperationEnum.Capture, orderKey);

            // Obtem objeto de resposta montado
            ManageSaleRequest manageSaleRequestResult = httpResponse.getRequest();
            ManageSaleResponse manageSaleResponseResult = httpResponse.getResponse();
            String manageSaleRawRequest = httpResponse.getRawRequest();
            String manageSaleRawResponse = httpResponse.getRawResponse();
            
            // Testa se conseguiu obter recurso
            assertEquals(httpResponse.getHttpStatusCode().getStatusCode(), 200); 
            assertNotNull(manageSaleRequestResult.getOrderKey());
            assertNotNull(manageSaleResponseResult.getCreditCardTransactionResultCollection());
            assertNotNull(manageSaleRawRequest);
            assertNotNull(manageSaleRawResponse);
        }
        catch (Exception ex) { assertTrue(false); }
    }
    
    /**
     * Testa o gerenciamento (cancelamento) de uma transação de cartão de crédito no ambiente de homologação / JSON
     */    
    @Test
    public void TestE_ManageSale_Cancel() {
        
        // Define loja e ambiente de integração
        UUID merchantKey = this.MerchantKey;  // Chave da Loja - MerchantKey
        PlatformEnvironmentEnum environment = this.Environment; // Ambiente de integração para o teste
        
        try {
            // Cria o cliente que vai enviar a transação
            GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey, environment);
            
            // Define a chave do pedido
            UUID orderKey = IntegrationJsonTest.OrderKey;
            
            // Submete a requisição e retorna a resposta do gateway
            HttpResponseGenerics<ManageSaleResponse, ManageSaleRequest> httpResponse = 
                    serviceClient.getSale().Manage(ManageOperationEnum.Cancel, orderKey);

            // Obtem objeto de resposta montado
            ManageSaleRequest manageSaleRequestResult = httpResponse.getRequest();
            ManageSaleResponse manageSaleResponseResult = httpResponse.getResponse();
            String manageSaleRawRequest = httpResponse.getRawRequest();
            String manageSaleRawResponse = httpResponse.getRawResponse();
            
            // Testa se conseguiu obter recurso
            assertEquals(httpResponse.getHttpStatusCode().getStatusCode(), 200); 
            assertNotNull(manageSaleRequestResult.getOrderKey());
            assertNotNull(manageSaleResponseResult.getCreditCardTransactionResultCollection());
            assertNotNull(manageSaleRawRequest);
            assertNotNull(manageSaleRawResponse);
        }
        catch (Exception ex) { assertTrue(false); }
    }
    
    /**
     * Testa o gerenciamento (autorização) de uma transação de cartão de crédito no ambiente de homologação / JSON
     */    
    @Test
    public void TestF_ManageSale_Authorize() {
        
        // Define loja e ambiente de integração
        UUID merchantKey = this.MerchantKey;  // Chave da Loja - MerchantKey
        PlatformEnvironmentEnum environment = this.Environment; // Ambiente de integração para o teste
        
        try {
            // Cria o cliente que vai enviar a transação
            GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey, environment);
            
            // Define a chave do pedido
            UUID orderKey = IntegrationJsonTest.OrderKey;
            
            // Submete a requisição e retorna a resposta do gateway
            HttpResponseGenerics<ManageSaleResponse, ManageSaleRequest> httpResponse = 
                    serviceClient.getSale().Manage(ManageOperationEnum.Authorize, orderKey);

            // Obtem objeto de resposta montado
            ManageSaleRequest manageSaleRequestResult = httpResponse.getRequest();
            ManageSaleResponse manageSaleResponseResult = httpResponse.getResponse();
            String manageSaleRawRequest = httpResponse.getRawRequest();
            String manageSaleRawResponse = httpResponse.getRawResponse();
            
            // Testa se conseguiu obter recurso
            assertEquals(httpResponse.getHttpStatusCode().getStatusCode(), 200); 
            assertNotNull(manageSaleRequestResult.getOrderKey());
            assertNotNull(manageSaleResponseResult.getCreditCardTransactionResultCollection());
            assertNotNull(manageSaleRawRequest);
            assertNotNull(manageSaleRawResponse);
        }
        catch (Exception ex) { assertTrue(false); }
    }
    
    /**
     * Testa a retentativa de uma transação de cartão de crédito no ambiente de homologação / JSON
     */    
    @Test
    public void TestG_RetrySale() {
        
        // Define loja e ambiente de integração
        UUID merchantKey = this.MerchantKey;  // Chave da Loja - MerchantKey
        PlatformEnvironmentEnum environment = this.Environment; // Ambiente de integração para o teste
        
        try {
            // Cria o cliente que vai enviar a transação
            GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey, environment);
            
            // Define a chave do pedido
            UUID orderKey = IntegrationJsonTest.OrderKey;
            
            // Submete a requisição e retorna a resposta do gateway
            HttpResponseGenerics<RetrySaleResponse, RetrySaleRequest> httpResponse = 
                    serviceClient.getSale().Retry(orderKey);

            // Obtem objeto de resposta montado
            RetrySaleRequest retrySaleRequestResult = httpResponse.getRequest();
            RetrySaleResponse retrySaleResponseResult = httpResponse.getResponse();
            String retrySaleRawRequest = httpResponse.getRawRequest();
            String retrySaleRawResponse = httpResponse.getRawResponse();
            
            // Testa se conseguiu obter recurso
            assertEquals(httpResponse.getHttpStatusCode().getStatusCode(), 200); 
            assertNotNull(retrySaleRequestResult.getOrderKey());
            assertNotNull(retrySaleResponseResult.getCreditCardTransactionResultCollection());
            assertNotNull(retrySaleRawRequest);
            assertNotNull(retrySaleRawResponse);
        }
        catch (Exception ex) { assertTrue(false); }
    }
    
     /**
     * Testa a consulta de um pedido ambiente de homologação / JSON
     */    
    @Test
    public void TestH_QuerySale() {
        
        // Define loja e ambiente de integração
        UUID merchantKey = this.MerchantKey;  // Chave da Loja - MerchantKey
        PlatformEnvironmentEnum environment = this.Environment; // Ambiente de integração para o teste
        
        try {
            // Cria o cliente que vai enviar a transação
            GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey, environment);
            
            // Define a chave do pedido
            UUID orderKey = IntegrationJsonTest.OrderKey;
            
            // Submete a requisição e retorna a resposta do gateway
            HttpResponseGenericResponse<QuerySaleResponse> httpResponse = 
                    serviceClient.getSale().QueryOrder(orderKey);

            // Obtem objeto de resposta montado
            QuerySaleResponse querySaleResponseResult = httpResponse.getResponse();
            String querySaleRawResponse = httpResponse.getRawResponse();
            
            // Testa se conseguiu obter recurso
            assertEquals(httpResponse.getHttpStatusCode().getStatusCode(), 200); 
            assertNotNull(querySaleResponseResult.getSaleDataCollection().get(0));
            assertNotNull(querySaleRawResponse);
        }
        catch (Exception ex) { assertTrue(false); }
    }
    
    //////////////////////////////////
    // CREDIT CARD RESOURCES TESTS  //
    //////////////////////////////////
    
    /**
     * Testa a obtenção dos dados do InstantBuy / JSON
     */    
    @Test
    public void TestI_GetInstantBuyData() {
        
        // Define loja e ambiente de integração
        UUID merchantKey = this.MerchantKey;  // Chave da Loja - MerchantKey
        PlatformEnvironmentEnum environment = this.Environment; // Ambiente de integração para o teste
                
        try {
            // Cria o cliente que vai enviar a requisição
            GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey, environment);
            
            // Define a chave do InstantBuy
            UUID instantBuyKey = IntegrationJsonTest.InstantBuyKey;
            
            // Autoriza a transação e retorna a resposta do gateway
            HttpResponseGenericResponse<GetInstantBuyDataResponse> httpResponse = 
                    serviceClient.getCreditCard().GetInstantBuyData(instantBuyKey);

            // Obtem objeto de resposta montado
            GetInstantBuyDataResponse getInstantBuyDataResponse = httpResponse.getResponse();
            String getInstantBuyDataRawResponse = httpResponse.getRawResponse();
                    
            // Testa se conseguiu obter recurso
            assertEquals(httpResponse.getHttpStatusCode().getStatusCode(), 200); 
            assertNotNull(getInstantBuyDataResponse.getCreditCardDataCollection());
            assertTrue(getInstantBuyDataResponse.getCreditCardDataCount() > 0);
        }
        catch (Exception ex) { assertTrue(false); }
    }
    
    /**
     * Testa a obtenção dos dados do InstantBuy pela chave do comprador / JSON
     */    
    @Test
    public void TestJ_GetInstantBuyDataWithBuyerKey() {
        
        // Define loja e ambiente de integração
        UUID merchantKey = this.MerchantKey;  // Chave da Loja - MerchantKey
        PlatformEnvironmentEnum environment = this.Environment; // Ambiente de integração para o teste
                
        try {
            // Cria o cliente que vai enviar a requisição
            GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey, environment);
            
            // Define a chave do InstantBuy
            UUID buyerKey = IntegrationJsonTest.BuyerKey;
            
            // Autoriza a transação e retorna a resposta do gateway
            HttpResponseGenericResponse<GetInstantBuyDataResponse> httpResponse = 
                    serviceClient.getCreditCard().GetInstantBuyDataWithBuyerKey(buyerKey);

            // Obtem objeto de resposta montado
            GetInstantBuyDataResponse getInstantBuyDataResponse = httpResponse.getResponse();
            String getInstantBuyDataRawResponse = httpResponse.getRawResponse();
                    
            // Testa se conseguiu obter recurso
            assertEquals(httpResponse.getHttpStatusCode().getStatusCode(), 200); 
            assertNotNull(getInstantBuyDataResponse.getCreditCardDataCollection());
            assertTrue(getInstantBuyDataResponse.getCreditCardDataCount() > 0);
        }
        catch (Exception ex) { assertTrue(false); }
    }
}
