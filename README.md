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

    // Endereço de IP
    String ipAddress = "127.0.0.1";

    // Chave da Loja
    UUID merchantKey = UUID.fromString("50CB81FB-7164-4E1D-94F3-9B1E6E12C73D");

    // Define o Processador das Requests/Responses
    ApiClient apiClient = new ApiClient(
       ApiEnvironmentEnum.Staging, // Define ambiente de integração
       merchantKey                 // Chave da Loja
    );

    // Cria Objeto de Requisição de Token 
    TokenRequest tokenRequest = new TokenRequest();

    // Dados do pedido.
    tokenRequest.setOrder(new OrderRequest());
    tokenRequest.getOrder().setAmountInCents(10000L);
    tokenRequest.getOrder().setOrderReference(UUID.randomUUID().toString().substring(0, 20));
    tokenRequest.getOrder().setIpAddress(ipAddress);

    // Opções do pedido
    tokenRequest.setOptions(new OptionsRequest());
    tokenRequest.getOptions().setIsCreditCardPaymentEnabled(true);
    tokenRequest.getOptions().setIsBoletoPaymentEnabled(false);
    tokenRequest.getOptions().setIsAntiFraudEnabled(false);
    
    // Solicita criação do Token e obtém a Resposta no Objeto TokenResponse
    TokenResponse tokenResponse = apiClient.process(tokenRequest);

} 
catch(Exception e) {}
```

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
