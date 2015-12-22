# MundiPagg One Java Library

## Getting Started

Após efetuar o download do projeto (Criado a partir da IDE *NetBeans*), junto com o código fonte, pode-se localizar na pasta ***library*** um arquivo chamado ***MundiPagg.jar***, referente a este SDK já compilado com as suas dependências (*Gson 2.3.1*, *XStream 1.4.8* e *HttpClient 4.5*). 

Adicione uma referência deste arquivo *Jar* em seu projeto, e a SDK estará pronta para ser utilizada.

Caso deseje adicionar separadamente nosso SDK e suas dependências, compile o projeto e referencie os arquivos criados na pasta ***dist*** e ***dist/lib***;
 
## Recursos:

Os recursos básicos oferecidos pelo SDK Mundi One em Java no seu projeto são:

### Cliente de acesso aos recursos

```javaA
import MundiPagg.Client.GatewayServiceClient;
```

Contém a definição da classe ApiClient, que contém os métodos que solicitam o processamento das requisições de requisição à API.

### Recursos

Após inicializar o cliente, como no exemplo abaixo:

```java

// Define loja e ambiente de integração
UUID merchantKey = UUID.fromString("sua merchant key"); // Chave da Loja - MerchantKey
PlatformEnvironmentEnum environment = PlatformEnvironmentEnum.Sandbox; // Ambiente de Staging

// Cria o cliente que vai submeter as requisições
GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey, environment);

```

Com o objeto instanciado é possível fazer operações nesse formato:

```java

// Onde 
// CreateSaleResponse será o tipo do objeto de resposta desejado, 
// CreateSaleRequest é o tipo do objeto de requisição passado
// serviceClient.getSale() contém operações de venda
// serviceClient.getCreditCard() contém operações de InstantBuy
// serviceClient.getPostNotification() contém operações de PostNotification
// serviceClient.getTransactionReport() contém operações de TransactionReportFile
HttpResponseGenerics<CreateSaleResponse, CreateSaleRequest> httpResponse = serviceClient.getSale().Create(createSaleRequest);

```

Os objetos de resposta podem ser:

```java

// Indica tipo de objeto complexo genérico de Resposta e de Request
HttpResponseGenerics<TResponse, TRequest> httpResponse;

// Indica tipo de objeto complexo genérico apenas de Resposta
HttpResponseGenericResponse<TResponse> httpResponse;

```
## Exemplos Básicos de Utilização:

### Create Sale

```java

try {
     // Define loja
     UUID merchantKey = UUID.fromString("sua merchant key"); // Chave da Loja - MerchantKey
    
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
     creditCard.getBillingAddress().setCountry(CountryEnum.Brazil);
     creditCard.getBillingAddress().setCity("Rio de Janeiro");
     creditCard.getBillingAddress().setState("RJ");
     creditCard.getBillingAddress().setDistrict("Centro");
     creditCard.getBillingAddress().setZipCode("23000-123");
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
 
     // Cria o cliente que vai enviar a transação
     GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey);
     
     // Autoriza a transação e retorna a resposta do gateway
     HttpResponseGenerics<CreateSaleResponse, CreateSaleRequest> httpResponse = 
             serviceClient.getSale().Create(createSaleRequest);
             
 }
 catch (Exception ex) { }
```

### Create CreditCardTransaction

```java

try {
     // Define loja
     UUID merchantKey = UUID.fromString("sua merchant key"); // Chave da Loja - MerchantKey
    
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
 
     // Cria o cliente que vai enviar a transação
     GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey);
     
     // Submete a transação e retorna a resposta do gateway
     HttpResponseGenerics<CreateSaleResponse, CreateSaleRequest> httpResponse = 
             serviceClient.getSale().CreateCreditCard(creditCardTransaction);
             
 }
 catch (Exception ex) { }
```

### Create BoletoTransaction

```java

try {
     // Define loja
     UUID merchantKey = UUID.fromString("sua merchant key"); // Chave da Loja - MerchantKey
    
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
 
     // Cria o cliente que vai enviar a transação
     GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey);
     
     // Submete a transação e retorna a resposta do gateway
     HttpResponseGenerics<CreateSaleResponse, CreateSaleRequest> httpResponse = 
                    serviceClient.getSale().CreateBoleto(boletoTransaction);
             
 }
 catch (Exception ex) { }
```

### Cancel 

```java

try {

      // Define loja 
      UUID merchantKey = UUID.fromString("sua merchant key"); // Chave da Loja - MerchantKey

      // Cria o cliente que vai efetuar a operação
      GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey);

      // Define a chave do pedido que será cancelado
      UUID instantBuyKey = UUID.fromString("chave do pedido"); // Chave do pedido
      
      // Submete a requisição de cancelamento
      HttpResponseGenerics<ManageSaleResponse, ManageSaleRequest> httpResponse = 
                    serviceClient.getSale().Manage(ManageOperationEnum.Cancel, orderKey);
      
 }
 catch (Exception ex) { }
```

### Capture

```java

try {

      // Define loja 
      UUID merchantKey = UUID.fromString("sua merchant key"); // Chave da Loja - MerchantKey

      // Cria o cliente que vai efetuar a operação
      GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey);

      // Define a chave do pedido que será capturado
      UUID instantBuyKey = UUID.fromString("chave do pedido"); // Chave do pedido
      
      // Submete a requisição de captura
      HttpResponseGenerics<ManageSaleResponse, ManageSaleRequest> httpResponse = 
                    serviceClient.getSale().Manage(ManageOperationEnum.Capture, orderKey);
      
 }
 catch (Exception ex) { }
```

### Retry

```java

try {

      // Define loja 
      UUID merchantKey = UUID.fromString("sua merchant key"); // Chave da Loja - MerchantKey

      // Cria o cliente que vai efetuar a operação
      GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey);

      // Define a chave do pedido que será retentado
      UUID instantBuyKey = UUID.fromString("chave do pedido"); // Chave do pedido
      
      // Submete a requisição de retentativa
      HttpResponseGenerics<RetrySaleResponse, RetrySaleRequest> httpResponse = 
                    serviceClient.getSale().Retry(orderKey);
      
 }
 catch (Exception ex) { }
```

### Query

```java

try {

      // Define loja 
      UUID merchantKey = UUID.fromString("sua merchant key"); // Chave da Loja - MerchantKey

      // Cria o cliente que vai efetuar a operação
      GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey);

      // Define a chave do pedido que será consultado
      UUID instantBuyKey = UUID.fromString("chave do pedido"); // Chave do pedido
      
      // Submete a requisição de consulta
      HttpResponseGenericResponse<QuerySaleResponse> httpResponse = 
                    serviceClient.getSale().QueryOrder(orderKey);
      
 }
 catch (Exception ex) { }
```

### Get InstantBuy

```java

try {

      // Define loja 
      UUID merchantKey = UUID.fromString("sua merchant key"); // Chave da Loja - MerchantKey

      // Cria o cliente que vai efetuar a operação
      GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey);

      // Define a chave do InstantBuy
      UUID instantBuyKey = UUID.fromString("chave do instantbuy"); // Chave da InstantBuy
      
      // Obtem dados
      HttpResponseGenericResponse<GetInstantBuyDataResponse> httpResponse = 
              serviceClient.getCreditCard().GetInstantBuyData(instantBuyKey);
      
 }
 catch (Exception ex) { }
```

### Get InstantBuy With BuyerKey

```java

try {

      // Define loja 
      UUID merchantKey = UUID.fromString("sua merchant key"); // Chave da Loja - MerchantKey

      // Cria o cliente que vai efetuar a operação
      GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey);

      // Define a chave do comprador
      UUID buyerKey = UUID.fromString("chave do comprador"); // Chave do comprador
      
      // Obtem dados
      HttpResponseGenericResponse<GetInstantBuyDataResponse> httpResponse = 
             serviceClient.getCreditCard().GetInstantBuyDataWithBuyerKey(buyerKey);

 }
 catch (Exception ex) { }
```

### Get TransactionReportFile

```java

try {

      // Define loja 
      UUID merchantKey = UUID.fromString("sua merchant key"); // Chave da Loja - MerchantKey

      // Cria data para obtenção do relatório 
      Date date = new SimpleDateFormat("dd/MM/yyyy").parse("17/09/2015");          
  
      // Cria o cliente que vai efetuar a requisição
      GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey);
      
      // Efetua o a solicitação do relatório
      String transactionReportFile = serviceClient.getTransactionReport().getTransactionReportFile(date);
      
 }
 catch (Exception ex) { }
```

### Parse TransactionReportFile

```java

try {

      // Define loja 
      UUID merchantKey = UUID.fromString("sua merchant key"); // Chave da Loja - MerchantKey

      // Cria o cliente que vai efetuar a operação
      GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey);

      // Efetua conversão
      TransactionReportFile report = serviceClient.getTransactionReport().parserTransactionReportFile("Dados obtidos pelo Get ReportTransactionFile");
      
 }
 catch (Exception ex) { }
```

### Save TransactionReportFile

```java

try {

      // Define loja 
      UUID merchantKey = UUID.fromString("sua merchant key"); // Chave da Loja - MerchantKey

      // Cria o cliente que vai efetuar a operação
      GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey);

      string path = "C:\\Reports";
      string fileName = "TransactionReportTest";

       // Salva o arquivo 
       serviceClient.getTransactionReport().saveTransactionReportFile("Dados obtidos pelo Get ReportTransactionFile", path, fileName);
      
 }
 catch (Exception ex) { }
```

### Parse PostNotification

```java

try {

     // Define loja
     UUID merchantKey = UUID.fromString("sua merchant key"); // Chave da Loja - MerchantKey

     // Cria o cliente que vai efetuar o parse da notificação
     GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey);
     
     // Efetua o parse do xml em um objeto de StatusNotification
     StatusNotification statusNotification = serviceClient.getPostNotification().parseFromXML("XML recebido do PostNotification");

 }
 catch (Exception ex) { }
```

## Documentação da API

  http://docs.mundipagg.com/
