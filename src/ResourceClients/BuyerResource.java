/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResourceClients;

import DataContracts.InstantBuy.GetInstantBuyDataResponse;
import EnumTypes.HttpContentTypeEnum;
import EnumTypes.HttpVerbEnum;
import EnumTypes.PlatformEnvironmentEnum;
import Utility.HttpResponseGenericResponse;
import java.util.UUID;
import org.apache.http.message.BasicHeader;

/**
 *
 * @author munir
 */
public class BuyerResource extends BaseResource {

    public BuyerResource(UUID merchantKey, PlatformEnvironmentEnum platformEnvironment, HttpContentTypeEnum httpContentType) {
        super(merchantKey, platformEnvironment, httpContentType, "/Buyer");
    }
    
    public BuyerResource(UUID merchantKey, PlatformEnvironmentEnum platformEnvironment, HttpContentTypeEnum httpContentType, String hostUri) {
        super(merchantKey, platformEnvironment, httpContentType, "/Buyer", hostUri);
    }
    
    private HttpResponseGenericResponse<GetInstantBuyDataResponse> GetBuyerImplementation(UUID key, String identifierName) throws Exception {
        
        String actionName = "/" + identifierName + key.toString();

        HttpVerbEnum httpVerb = HttpVerbEnum.Get;

        BasicHeader[] header = new BasicHeader[1];
        header[0] = new BasicHeader("MerchantKey", this.getMerchantKey().toString());

        String serviceUri = this.getHostUri() + this.getResourceName() + actionName;
        
        return this.getHttpUtility().<GetInstantBuyDataResponse>SubmitRequest(GetInstantBuyDataResponse.class, serviceUri, httpVerb, this.getHttpContentType(), header);
    }
    
}
