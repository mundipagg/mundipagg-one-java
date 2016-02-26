package ResourceClients;

import DataContracts.BoletoTransaction.BoletoTransaction;
import DataContracts.CreditCardTransaction.CreditCardTransaction;
import DataContracts.Sale.*;
import DataContracts.*;
import DataContracts.CreditCardTransaction.ManageCreditCardTransaction;
import DataContracts.CreditCardTransaction.RetrySaleCreditCardTransaction;
import EnumTypes.*;
import Utility.*;
import java.util.ArrayList;
import java.util.UUID;
import org.apache.http.message.BasicHeader;

/**
 * Recurso de Vendas
 */
public class SaleResource extends BaseResource {
    
    /**
     * Construtor da Classe
     * @param merchantKey
     * @param platformEnvironment
     * @param httpContentType 
     */
    public SaleResource(UUID merchantKey, PlatformEnvironmentEnum platformEnvironment, HttpContentTypeEnum httpContentType) {
        super(merchantKey, platformEnvironment, httpContentType, "/Sale/");
    }
    
    /**
     * Construtor da Classe
     * @param merchantKey
     * @param platformEnvironment
     * @param httpContentType
     * @param hostUri 
     */
    public SaleResource(UUID merchantKey, PlatformEnvironmentEnum platformEnvironment, HttpContentTypeEnum httpContentType, String hostUri) {
        super(merchantKey, platformEnvironment, httpContentType, "/Sale/", hostUri);
    }
    
    // BEGIN CREATE
    
    /**
     * Cria uma venda, contendo transações de boleto e/ou cartão de crédito
     * @param createSaleRequest
     * @return 
     * @throws java.lang.Exception 
     */
    public HttpResponseGenerics<CreateSaleResponse, CreateSaleRequest> Create(CreateSaleRequest createSaleRequest) throws Exception {

        HttpVerbEnum httpVerb = HttpVerbEnum.Post;
        
        BasicHeader[] header = new BasicHeader[1];
        header[0] = new BasicHeader("MerchantKey", this.getMerchantKey().toString());

        String serviceUri = this.getHostUri() + this.getResourceName();
        
        return this.getHttpUtility().<CreateSaleResponse, CreateSaleRequest>
                SubmitRequest(CreateSaleResponse.class, createSaleRequest, 
                        serviceUri, httpVerb, this.getHttpContentType(), header);
    }

    /**
     * Cria uma venda com uma coleção de transações de cartão de crédito
     * @param creditCardTransactionCollection
     * @return 
     * @throws java.lang.Exception 
     */
    public HttpResponseGenerics<CreateSaleResponse, CreateSaleRequest> CreateCreditCard(ArrayList<CreditCardTransaction> creditCardTransactionCollection) throws Exception {
        
        CreateSaleRequest createSaleRequest = new CreateSaleRequest();
        createSaleRequest.setCreditCardTransactionCollection(creditCardTransactionCollection);        
        createSaleRequest.setOptions(new SaleOptions());
        createSaleRequest.getOptions().setIsAntiFraudEnabled(false);

        return this.Create(createSaleRequest);
    }

    /**
     * Cria uma transação de cartão de crédito
     * @param creditCardTransaction
     * @return
     * @throws Exception 
     */
    public HttpResponseGenerics<CreateSaleResponse, CreateSaleRequest> CreateCreditCard(CreditCardTransaction creditCardTransaction) throws Exception {

        ArrayList<CreditCardTransaction> creditCardTransactionCollection = new ArrayList<>();
        creditCardTransactionCollection.add(creditCardTransaction);

        return this.CreateCreditCard(creditCardTransactionCollection);
    }

    /**
     * Cria uma venda com uma coleção de boletos
     * @param boletoTransactionCollection
     * @return 
     * @throws java.lang.Exception 
     */
    public HttpResponseGenerics<CreateSaleResponse, CreateSaleRequest> CreateBoleto(ArrayList<BoletoTransaction> boletoTransactionCollection) throws Exception {
        
        CreateSaleRequest createSaleRequest = new CreateSaleRequest();
        createSaleRequest.setBoletoTransactionCollection(boletoTransactionCollection);
        createSaleRequest.setOptions(new SaleOptions()); 
        createSaleRequest.getOptions().setIsAntiFraudEnabled(false);

        return this.Create(createSaleRequest);
    }

    /**
     * Cria uma transação de boleto
     * @param boletoTransaction
     * @return
     * @throws Exception 
     */
    public HttpResponseGenerics<CreateSaleResponse, CreateSaleRequest> CreateBoleto(BoletoTransaction boletoTransaction) throws Exception {

        ArrayList<BoletoTransaction> boletoTransactionCollection = new ArrayList<>();
        boletoTransactionCollection.add(boletoTransaction);
        
        return this.CreateBoleto(boletoTransactionCollection);
    }

    // END CREATE

    // BEGIN MANAGE

    /**
     * Gerencia uam venda
     * @param manageOperation
     * @param manageSaleRequest
     * @return
     * @throws Exception 
     */
    public HttpResponseGenerics<ManageSaleResponse, ManageSaleRequest> Manage(ManageOperationEnum manageOperation, ManageSaleRequest manageSaleRequest) throws Exception {

        String actionName = manageOperation.toString();

        HttpVerbEnum httpVerb = HttpVerbEnum.Post;
        
        BasicHeader[] header = new BasicHeader[1];
        header[0] = new BasicHeader("MerchantKey", this.getMerchantKey().toString());

        String serviceUri = this.getHostUri() + this.getResourceName() + actionName;
        
        return this.getHttpUtility().<ManageSaleResponse, ManageSaleRequest>SubmitRequest(
                ManageSaleResponse.class, manageSaleRequest, serviceUri, httpVerb, this.getHttpContentType(), header);
    }

    /**
     * Gerencia uma venda
     * @param manageOperation
     * @param orderKey
     * @return
     * @throws Exception 
     */
    public HttpResponseGenerics<ManageSaleResponse, ManageSaleRequest> Manage(ManageOperationEnum manageOperation, UUID orderKey) throws Exception {

        ManageSaleRequest manageSaleRequest = new ManageSaleRequest();
        manageSaleRequest.setOrderKey(orderKey);

        return this.Manage(manageOperation, manageSaleRequest);
    }

    /**
     * Gerencia uma coleção de transações de cartão de crédito.
     * @param manageOperation
     * @param orderKey
     * @param manageCreditCardTransactionCollection
     * @return
     * @throws Exception 
     */
    public HttpResponseGenerics<ManageSaleResponse, ManageSaleRequest> Manage(ManageOperationEnum manageOperation, UUID orderKey, ArrayList<ManageCreditCardTransaction> manageCreditCardTransactionCollection) throws Exception {

        ManageSaleRequest manageSaleRequest = new ManageSaleRequest();
        manageSaleRequest.setOrderKey(orderKey);
        manageSaleRequest.setCreditCardTransactionCollection(manageCreditCardTransactionCollection);

        return this.Manage(manageOperation, manageSaleRequest);
    }

    /**
     * Gerencia uma transação de cartão de crédito específica
     * @param manageOperation
     * @param orderKey
     * @param manageCreditCardTransaction
     * @return
     * @throws Exception 
     */
    public HttpResponseGenerics<ManageSaleResponse, ManageSaleRequest> Manage(ManageOperationEnum manageOperation, UUID orderKey, ManageCreditCardTransaction manageCreditCardTransaction) throws Exception {

        ArrayList<ManageCreditCardTransaction> manageCreditCardTransactionCollection = new ArrayList<>();
        manageCreditCardTransactionCollection.add(manageCreditCardTransaction);

        return this.Manage(manageOperation, orderKey, manageCreditCardTransactionCollection);
    }

    // END MANAGE

    // BEGIN RETRY

    /**
     * Retenta venda com cartão de crédito
     * @param retrySaleRequest
     * @return
     * @throws Exception 
     */
    public HttpResponseGenerics<RetrySaleResponse, RetrySaleRequest> Retry(RetrySaleRequest retrySaleRequest) throws Exception {

        HttpVerbEnum httpVerb = HttpVerbEnum.Post;
        
        BasicHeader[] header = new BasicHeader[1];
        header[0] = new BasicHeader("MerchantKey", this.getMerchantKey().toString());

        String serviceUri = this.getHostUri() + this.getResourceName() + "Retry";

        return this.getHttpUtility().<RetrySaleResponse, RetrySaleRequest>SubmitRequest(
                RetrySaleResponse.class, retrySaleRequest, serviceUri, httpVerb, this.getHttpContentType(), header);
    }

    /**
     * Retenta venda com cartão de crédito
     * @param orderKey
     * @return
     * @throws Exception 
     */
    public HttpResponseGenerics<RetrySaleResponse, RetrySaleRequest> Retry(UUID orderKey) throws Exception {

        RetrySaleRequest retrySaleRequest = new RetrySaleRequest();
        retrySaleRequest.setOrderKey(orderKey);

        return this.Retry(retrySaleRequest);
    }

    /**
     * Retenta venda com cartão de crédito
     * @param orderKey
     * @param retrySaleCreditCardTransactionCollection
     * @return
     * @throws Exception 
     */
    public HttpResponseGenerics<RetrySaleResponse, RetrySaleRequest> Retry(UUID orderKey, ArrayList<RetrySaleCreditCardTransaction> retrySaleCreditCardTransactionCollection) throws Exception {

        RetrySaleRequest retrySaleRequest = new RetrySaleRequest();
        retrySaleRequest.setOrderKey(orderKey);
        retrySaleRequest.setRetrySaleCreditCardTransactionCollection(retrySaleCreditCardTransactionCollection);
        
        return this.Retry(retrySaleRequest);
    }

    /**
     * Retenta venda com cartão de crédito
     * @param orderKey
     * @param retrySaleCreditCardTransaction
     * @return
     * @throws Exception 
     */
    public HttpResponseGenerics<RetrySaleResponse, RetrySaleRequest> Retry(UUID orderKey, RetrySaleCreditCardTransaction retrySaleCreditCardTransaction) throws Exception {

        ArrayList<RetrySaleCreditCardTransaction> retrySaleCreditCardTransactionCollection = new ArrayList<>();
        retrySaleCreditCardTransactionCollection.add(retrySaleCreditCardTransaction);

        return this.Retry(orderKey, retrySaleCreditCardTransactionCollection);
    }
    
    // END RETRY
    
    // BEGIN QUERY

    /**
     * Consulta uma venda
     * @param orderKey
     * @return
     * @throws Exception 
     */
    public HttpResponseGenericResponse<QuerySaleResponse> QueryOrder(UUID orderKey) throws Exception {
        return this.QueryImplementation("OrderKey", orderKey.toString());
    }

    /**
     * Consulta uma venda
     * @param orderReference
     * @return
     * @throws Exception 
     */
    public HttpResponseGenericResponse<QuerySaleResponse> QueryOrder(String orderReference) throws Exception {
        return this.QueryImplementation("OrderReference", orderReference);
    }

    /**
     * Consulta uma transação de cartão de crédito
     * @param creditCardTransactionKey
     * @return
     * @throws Exception 
     */
    public HttpResponseGenericResponse<QuerySaleResponse> QueryCreditCardTransaction(UUID creditCardTransactionKey) throws Exception {
        return this.QueryImplementation("CreditCardTransactionKey", creditCardTransactionKey.toString());
    }

    /**
     * Consulta uma transação de cartão de crédito
     * @param creditCardTransactionReference
     * @return
     * @throws Exception 
     */
    public HttpResponseGenericResponse<QuerySaleResponse> QueryCreditCardTransaction(String creditCardTransactionReference) throws Exception {
        return this.QueryImplementation("CreditCardTransactionReference", creditCardTransactionReference);
    }

    /**
     * Consulta uma transação de boleto
     * @param boletoTransactionKey
     * @return
     * @throws Exception 
     */
    public HttpResponseGenericResponse<QuerySaleResponse> QueryBoletoTransaction(UUID boletoTransactionKey) throws Exception {
        return this.QueryImplementation("BoletoTransactionKey", boletoTransactionKey.toString());
    }

    /**
     * Consulta uma transação de boleto
     * @param boletoTransactionReference 
     * @return 
     * @throws java.lang.Exception 
     */
    public HttpResponseGenericResponse<QuerySaleResponse> QueryBoletoTransaction(String boletoTransactionReference) throws Exception {
        return this.QueryImplementation("BoletoTransactionReference", boletoTransactionReference);
    }

    /**
     * Implementação da chamada do método Query
     * @param identifierName
     * @param value
     * @return
     * @throws Exception 
     */
    private HttpResponseGenericResponse<QuerySaleResponse> QueryImplementation(String identifierName, String value) throws Exception {

        String actionName = "Query/" + identifierName + "=" + value;

        HttpVerbEnum httpVerb = HttpVerbEnum.Get;

        BasicHeader[] header = new BasicHeader[1];
        header[0] = new BasicHeader("MerchantKey", this.getMerchantKey().toString());

        String serviceUri = this.getHostUri() + this.getResourceName() + actionName;
        
        return this.getHttpUtility().<QuerySaleResponse>SubmitRequest(QuerySaleResponse.class,serviceUri, httpVerb, this.getHttpContentType(), header);
    }
    
    // END QUERYS
}
