package ResourceClients;

import DataContracts.InstantBuy.CreditCardRequest;
import DataContracts.InstantBuy.CreditCardResponse;
import DataContracts.InstantBuy.GetInstantBuyDataResponse;
import EnumTypes.*;
import Utility.HttpResponseGenericResponse;
import Utility.HttpResponseGenerics;
import java.util.UUID;
import org.apache.http.message.BasicHeader;

/**
 * Recurso de Cartão de Crédito
 */
public class CreditCardResource extends BaseResource {

    /**
     * Construtor da Classe
     * @param merchantKey
     * @param platformEnvironment
     * @param httpContentType 
     */
    public CreditCardResource(UUID merchantKey, PlatformEnvironmentEnum platformEnvironment, HttpContentTypeEnum httpContentType) {
        super(merchantKey, platformEnvironment, httpContentType, "/CreditCard/");
    }
    
    /**
     * Construtor da Classe
     * @param merchantKey
     * @param platformEnvironment
     * @param httpContentType
     * @param hostUri 
     */
    public CreditCardResource(UUID merchantKey, PlatformEnvironmentEnum platformEnvironment, HttpContentTypeEnum httpContentType, String hostUri) {
        super(merchantKey, platformEnvironment, httpContentType, "/CreditCard/", hostUri);
    }

    /**
     * @deprecated Classe deprecated, a nova classe a ser usada é {@link #GetCreditCard(java.util.UUID) }
     * Recupera dados do InstantBuy 
     * @param instantBuyKey
     * @return 
     * @throws java.lang.Exception 
     */
    @Deprecated public HttpResponseGenericResponse<GetInstantBuyDataResponse> GetInstantBuyData(UUID instantBuyKey) throws Exception {
        return this.GetInstantBuyDataImplementation(instantBuyKey, "");
    }
    
    /**
     * Retorna informações do cartão de crédito passando InstantBuyKey
     * @param instantBuyKey
     * @return
     * @throws Exception 
     */
    public HttpResponseGenericResponse<GetInstantBuyDataResponse> GetCreditCard(UUID instantBuyKey) throws Exception {
        return this.GetInstantBuyDataImplementation(instantBuyKey, "");
    }
    
    /**
     * @deprecated Classe deprecated, a nova classe a ser usada é {@link #GetCreditCardWithBuyerKey(java.util.UUID) }
     * Recupera dados do InstantBuy com chave do comprador
     * @param buyerKey
     * @return 
     * @throws java.lang.Exception 
     */
    @Deprecated public HttpResponseGenericResponse<GetInstantBuyDataResponse> GetInstantBuyDataWithBuyerKey(UUID buyerKey) throws Exception {
        return this.GetInstantBuyDataImplementation(buyerKey, "BuyerKey=");
    }
    
    /**
     * Recupera os dados de cartão de crédito com a chave do comprador
     * @param buyerKey
     * @return
     * @throws Exception 
     */
    public HttpResponseGenericResponse<GetInstantBuyDataResponse> GetCreditCardWithBuyerKey(UUID buyerKey) throws Exception {
        return this.GetInstantBuyDataImplementation(buyerKey, "BuyerKey=");
    }

    /**
     * Implementação para recuperar InstantBuy pela chave do comprador
     * @param key
     * @param identifierName
     * @return 
     */
    private HttpResponseGenericResponse<GetInstantBuyDataResponse> GetInstantBuyDataImplementation(UUID key, String identifierName) throws Exception {
        
        String actionName = identifierName + key.toString();

        HttpVerbEnum httpVerb = HttpVerbEnum.Get;

        BasicHeader[] header = new BasicHeader[1];
        header[0] = new BasicHeader("MerchantKey", this.getMerchantKey().toString());

        String serviceUri = this.getHostUri() + this.getResourceName() + actionName;
        
        return this.getHttpUtility().<GetInstantBuyDataResponse>SubmitRequest(GetInstantBuyDataResponse.class, serviceUri, httpVerb, this.getHttpContentType(), header);
    }
    
    /**
     * Cria um cartão de crédito
     * @param creditCardRequest
     * @return
     * @throws Exception
     */
    public HttpResponseGenerics<CreditCardResponse, CreditCardRequest>CreateCreditCard(CreditCardRequest creditCardRequest) throws Exception {
        HttpVerbEnum httpVerb = HttpVerbEnum.Post;
        
        BasicHeader[] header = new BasicHeader[1];
        header[0] = new BasicHeader("MerchantKey", this.getMerchantKey().toString());

        String serviceUri = this.getHostUri() + this.getResourceName();
        
        return this.getHttpUtility().<CreditCardResponse, CreditCardRequest>
                SubmitRequest(CreditCardResponse.class, creditCardRequest, serviceUri, httpVerb, this.getHttpContentType(), header);
    }
}
