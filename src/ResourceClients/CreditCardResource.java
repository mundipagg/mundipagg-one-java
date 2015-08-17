package ResourceClients;

import DataContracts.InstantBuy.GetInstantBuyDataResponse;
import EnumTypes.*;
import Utility.HttpResponseGenericResponse;
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
        super(merchantKey, platformEnvironment, httpContentType, "/CreditCard");
    }
    
    /**
     * Construtor da Classe
     * @param merchantKey
     * @param platformEnvironment
     * @param httpContentType
     * @param hostUri 
     */
    public CreditCardResource(UUID merchantKey, PlatformEnvironmentEnum platformEnvironment, HttpContentTypeEnum httpContentType, String hostUri) {
        super(merchantKey, platformEnvironment, httpContentType, "/CreditCard", hostUri);
    }

    /**
     * Recupera dados do InstantBuy 
     * @param instantBuyKey
     * @return 
     * @throws java.lang.Exception 
     */
    public HttpResponseGenericResponse<GetInstantBuyDataResponse> GetInstantBuyData(UUID instantBuyKey) throws Exception {
        return this.GetInstantBuyDataImplementation(instantBuyKey, "");
    }
    
    /**
     * Recupera dados do InstantBuy com chave do comprador
     * @param buyerKey
     * @return 
     * @throws java.lang.Exception 
     */
    public HttpResponseGenericResponse<GetInstantBuyDataResponse> GetInstantBuyDataWithBuyerKey(UUID buyerKey) throws Exception {
        return this.GetInstantBuyDataImplementation(buyerKey, "/BuyerKey");
    }

    /**
     * Implementação para recuperar InstantBuy pela chave do comprador
     * @param key
     * @param identifierName
     * @return 
     */
    private HttpResponseGenericResponse<GetInstantBuyDataResponse> GetInstantBuyDataImplementation(UUID key, String identifierName) throws Exception {
        
        String actionName = "/" + key.toString() + identifierName;

        HttpVerbEnum httpVerb = HttpVerbEnum.Get;

        BasicHeader[] header = new BasicHeader[1];
        header[0] = new BasicHeader("MerchantKey", this.getMerchantKey().toString());

        String serviceUri = this.getHostUri() + this.getResourceName() + actionName;
        
        return this.getHttpUtility().<GetInstantBuyDataResponse>SubmitRequest(GetInstantBuyDataResponse.class, serviceUri, httpVerb, this.getHttpContentType(), header);
    }
}
