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
import static org.junit.Assert.*;

/**
 * Testes do SDK simulando integração
 */
public class IntegrationTest {
    
    public IntegrationTest() {}

    ///////////////////////////
    // SALE RESOURCES TESTS  //
    ///////////////////////////
    
    /**
     * Testa a criação de uma venda no ambiente de homologação / JSON
     */    
    @Test
    public void CreateSale() {
        
        // Define loja e ambiente de integração
        UUID merchantKey = UUID.fromString("50CB81FB-7164-4E1D-94F3-9B1E6E12C73D"); // Chave da Loja - MerchantKey
        PlatformEnvironmentEnum environment = PlatformEnvironmentEnum.Sandbox; // Ambiente de Staging
        
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
            GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey, environment, HttpContentTypeEnum.Json);
            
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
            assertNull(createSaleResponseResult.getErrorReport());
            assertNotNull(createSaleResponseResult.getCreditCardTransactionResultCollection());
            assertNotNull(createSaleRawRequest);
            assertNotNull(createSaleRawResponse);
            assertEquals(createSaleRequestResult, createSaleRequest);
        }
        catch (Exception ex) { assertTrue(false); }
    }
    
    /**
     * Testa a criação de uma transação de cartão de crédito no ambiente de homologação / JSON
     */    
    @Test
    public void CreateSaleCreditCard() {
        
        // Define loja e ambiente de integração
        UUID merchantKey = UUID.fromString("50CB81FB-7164-4E1D-94F3-9B1E6E12C73D"); // Chave da Loja - MerchantKey
        PlatformEnvironmentEnum environment = PlatformEnvironmentEnum.Sandbox; // Ambiente de Staging
     
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
            GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey, environment, HttpContentTypeEnum.Json);
            
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
            assertNull(createSaleResponseResult.getErrorReport());
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
    public void CreateSaleBoleto() {
        
        // Define loja e ambiente de integração
        UUID merchantKey = UUID.fromString("50CB81FB-7164-4E1D-94F3-9B1E6E12C73D"); // Chave da Loja - MerchantKey
        PlatformEnvironmentEnum environment = PlatformEnvironmentEnum.Sandbox; // Ambiente de Staging
            
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
            GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey, environment, HttpContentTypeEnum.Json);
            
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
            assertNull(createSaleResponseResult.getErrorReport());
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
    public void ManageSale_Capture() {
        
        // Define loja e ambiente de integração
        UUID merchantKey = UUID.fromString("50CB81FB-7164-4E1D-94F3-9B1E6E12C73D"); // Chave da Loja - MerchantKey
        PlatformEnvironmentEnum environment = PlatformEnvironmentEnum.Sandbox; // Ambiente de Staging
        
        try {
            // Cria o cliente que vai enviar a transação
            GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey, environment, HttpContentTypeEnum.Json);
            
            // Define a chave do pedido
            UUID orderKey = UUID.fromString("5b8b6f0d-398e-4f7a-a5b2-0b5088e2c8ea");
            
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
            assertNull(manageSaleResponseResult.getErrorReport());
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
    public void ManageSale_Cancel() {
        
        // Define loja e ambiente de integração
        UUID merchantKey = UUID.fromString("50CB81FB-7164-4E1D-94F3-9B1E6E12C73D"); // Chave da Loja - MerchantKey
        PlatformEnvironmentEnum environment = PlatformEnvironmentEnum.Sandbox; // Ambiente de Staging
        
        try {
            // Cria o cliente que vai enviar a transação
            GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey, environment, HttpContentTypeEnum.Json);
            
            // Define a chave do pedido
            UUID orderKey = UUID.fromString("5b8b6f0d-398e-4f7a-a5b2-0b5088e2c8ea");
            
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
            assertNull(manageSaleResponseResult.getErrorReport());
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
    public void ManageSale_Authorize() {
        
        // Define loja e ambiente de integração
        UUID merchantKey = UUID.fromString("50CB81FB-7164-4E1D-94F3-9B1E6E12C73D"); // Chave da Loja - MerchantKey
        PlatformEnvironmentEnum environment = PlatformEnvironmentEnum.Sandbox; // Ambiente de Staging
        
        try {
            // Cria o cliente que vai enviar a transação
            GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey, environment, HttpContentTypeEnum.Json);
            
            // Define a chave do pedido
            UUID orderKey = UUID.fromString("5b8b6f0d-398e-4f7a-a5b2-0b5088e2c8ea");
            
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
            assertNull(manageSaleResponseResult.getErrorReport());
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
    public void RetrySale() {
        
        // Define loja e ambiente de integração
        UUID merchantKey = UUID.fromString("50CB81FB-7164-4E1D-94F3-9B1E6E12C73D"); // Chave da Loja - MerchantKey
        PlatformEnvironmentEnum environment = PlatformEnvironmentEnum.Sandbox; // Ambiente de Staging
        
        try {
            // Cria o cliente que vai enviar a transação
            GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey, environment, HttpContentTypeEnum.Json);
            
            // Define a chave do pedido
            UUID orderKey = UUID.fromString("5b8b6f0d-398e-4f7a-a5b2-0b5088e2c8ea");
            
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
            assertNull(retrySaleResponseResult.getErrorReport());
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
    public void QuerySale() {
        
        // Define loja e ambiente de integração
        UUID merchantKey = UUID.fromString("50CB81FB-7164-4E1D-94F3-9B1E6E12C73D"); // Chave da Loja - MerchantKey
        PlatformEnvironmentEnum environment = PlatformEnvironmentEnum.Sandbox; // Ambiente de Staging
        
        try {
            // Cria o cliente que vai enviar a transação
            GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey, environment, HttpContentTypeEnum.Json);
            
            // Define a chave do pedido
            UUID orderKey = UUID.fromString("5b8b6f0d-398e-4f7a-a5b2-0b5088e2c8ea");
            
            // Submete a requisição e retorna a resposta do gateway
            HttpResponseGenericResponse<QuerySaleResponse> httpResponse = 
                    serviceClient.getSale().QueryOrder(orderKey);

            // Obtem objeto de resposta montado
            QuerySaleResponse querySaleResponseResult = httpResponse.getResponse();
            String querySaleRawResponse = httpResponse.getRawResponse();
            
            // Testa se conseguiu obter recurso
            assertEquals(httpResponse.getHttpStatusCode().getStatusCode(), 200); 
            assertNull(querySaleResponseResult.getErrorReport());
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
    public void GetInstantBuyData() {
        
        // Define loja e ambiente de integração
        UUID merchantKey = UUID.fromString("50CB81FB-7164-4E1D-94F3-9B1E6E12C73D"); // Chave da Loja - MerchantKey
        PlatformEnvironmentEnum environment = PlatformEnvironmentEnum.Sandbox; // Ambiente de Staging
                
        try {
            // Cria o cliente que vai enviar a requisição
            GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey, environment, HttpContentTypeEnum.Json);
            
            // Define a chave do InstantBuy
            UUID instantBuyKey = UUID.fromString("bfcd798a-6431-47b1-9f6e-57b7e25d553f");
            
            // Autoriza a transação e retorna a resposta do gateway
            HttpResponseGenericResponse<GetInstantBuyDataResponse> httpResponse = 
                    serviceClient.getCreditCard().GetInstantBuyData(instantBuyKey);

            // Obtem objeto de resposta montado
            GetInstantBuyDataResponse getInstantBuyDataResponse = httpResponse.getResponse();
            String getInstantBuyDataRawResponse = httpResponse.getRawResponse();
                    
            // Testa se conseguiu obter recurso
            assertEquals(httpResponse.getHttpStatusCode().getStatusCode(), 200); 
            assertNull(getInstantBuyDataResponse.getErrorReport());
            assertNotNull(getInstantBuyDataResponse.getCreditCardDataCollection());
            assertTrue(getInstantBuyDataResponse.getCreditCardDataCount() > 0);
        }
        catch (Exception ex) { assertTrue(false); }
    }
    
    /**
     * Testa a obtenção dos dados do InstantBuy pela chave do comprador / JSON
     */    
    @Test
    public void GetInstantBuyDataWithBuyerKey() {
        
        // Define loja e ambiente de integração
        UUID merchantKey = UUID.fromString("50CB81FB-7164-4E1D-94F3-9B1E6E12C73D"); // Chave da Loja - MerchantKey
        PlatformEnvironmentEnum environment = PlatformEnvironmentEnum.Sandbox; // Ambiente de Staging
                
        try {
            // Cria o cliente que vai enviar a requisição
            GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey, environment, HttpContentTypeEnum.Json);
            
            // Define a chave do InstantBuy
            UUID buyerKey = UUID.fromString("ec2103cb-c0d0-4fa6-bc22-2a9ec25b3740");
            
            // Autoriza a transação e retorna a resposta do gateway
            HttpResponseGenericResponse<GetInstantBuyDataResponse> httpResponse = 
                    serviceClient.getCreditCard().GetInstantBuyDataWithBuyerKey(buyerKey);

            // Obtem objeto de resposta montado
            GetInstantBuyDataResponse getInstantBuyDataResponse = httpResponse.getResponse();
            String getInstantBuyDataRawResponse = httpResponse.getRawResponse();
                    
            // Testa se conseguiu obter recurso
            assertEquals(httpResponse.getHttpStatusCode().getStatusCode(), 200); 
            assertNull(getInstantBuyDataResponse.getErrorReport());
            assertNotNull(getInstantBuyDataResponse.getCreditCardDataCollection());
            assertTrue(getInstantBuyDataResponse.getCreditCardDataCount() > 0);
        }
        catch (Exception ex) { assertTrue(false); }
    }
}
