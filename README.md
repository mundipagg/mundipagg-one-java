# MundiPagg One Java Library

## Getting Started

Após efetuar o download do projeto (Criado a partir da IDE *NetBeans*), junto com o código fonte, pode-se localizar na pasta ***library*** um arquivo chamado ***MundiPaggg.jar***, referente a este SDK já compilado com as suas dependências (*Gson 2.3.1*, *XStream 1.4.8* e *HttpClient 4.5*). 

Adicione uma referência deste arquivo *Jar* em seu projeto, e a SDK estará pronta para ser utilizada.

Caso deseje adicionar separadamente nosso SDK e suas dependências, compile o projeto e referencie os arquivos criados na pasta ***dist*** e ***dist/lib***;
 
## Recursos:

Os recursos básicos oferecidos pelo SDK Mundi One em Java no seu projeto são:

### Cliente de acesso aos recursos

```java
import MundiPagg.Client.GatewayServiceClient;
```

Contém a definição da classe ApiClient, que contém os métodos que solicitam o processamento das requisições de requisição à API.

### Recursos

Após inicializar o cliente, como no exemplo abaixo:

```java

// Define loja e ambiente de integração
UUID merchantKey = UUID.fromString("50CB81FB-7164-4E1D-94F3-9B1E6E12C73D"); // Chave da Loja - MerchantKey
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

Exemplo no teste *createSale* na classe de teste *MundiPagg.One.IntegrationTest*

```java

try {
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
 
 try {
     // Cria o cliente que vai enviar a transação
     GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey, environment, HttpContentTypeEnum.Json);
     
     // Autoriza a transação e retorna a resposta do gateway
     HttpResponseGenerics<CreateSaleResponse, CreateSaleRequest> httpResponse = 
             serviceClient.getSale().Create(createSaleRequest);

     // Obtem objeto de requisição/resposta montado
     CreateSaleRequest createSaleRequestResult = httpResponse.getRequest();
     CreateSaleResponse createSaleResponseResult = httpResponse.getResponse();
     
     // Obtem objeto de requisição/resposta em texto no formato definido no cliente
     String createSaleRawRequest = httpResponse.getRawRequest();
     String createSaleRawResponse = httpResponse.getRawResponse();
 }
 catch (Exception ex) { }
```

Para outros exemplos, consultar a classe de teste [MundiPagg.One.IntegrationTest](../master/test/MundiPagg/One/IntegrationTest.java) no projeto.


## Regras do simulador por valor

### Autorização

* `<= $ 1.050,00 -> Autorizado`
* `>= $ 1.050,01 && < $ 1.051,71 -> Timeout`
* `>= $ 1.500,00 -> Não autorizado`
 
### Captura

* `<= $ 1.050,00 -> Capturado`
* `>= $ 1.050,01 -> Não capturado`
 
### Cancelamento

* `<= $ 1.050,00 -> Cancelado`
* `>= $ 1.050,01 -> Não cancelado`
 
### Estorno
* `<= $ 1.050,00 -> Estornado`
* `>= $ 1.050,01 -> Não estornado`

## Documentação da API

  http://docs.mundipagg.com/
