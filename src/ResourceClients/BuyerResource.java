/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResourceClients;

import DataContracts.Person.BuyerRequest;
import DataContracts.Person.BuyerResponse;
import DataContracts.Person.GetBuyerResponseData;
import EnumTypes.HttpContentTypeEnum;
import EnumTypes.HttpVerbEnum;
import EnumTypes.PlatformEnvironmentEnum;
import Utility.HttpResponseGenericResponse;
import Utility.HttpResponseGenerics;
import java.util.UUID;
import org.apache.http.message.BasicHeader;

/**
 *
 * @author munir
 */
public class BuyerResource extends BaseResource {

    /**
     * Construtor com a chave da loja, ambiente da plataforma e o content type
     * @param merchantKey
     * @param platformEnvironment
     * @param httpContentType 
     */
    public BuyerResource(UUID merchantKey, PlatformEnvironmentEnum platformEnvironment, HttpContentTypeEnum httpContentType) {
        super(merchantKey, platformEnvironment, httpContentType, "/Buyer/");
    }
    
    /**
     * Construtor com a chave da loja, ambiente da plataforma, content type e URL
     * @param merchantKey
     * @param platformEnvironment
     * @param httpContentType
     * @param hostUri 
     */
    public BuyerResource(UUID merchantKey, PlatformEnvironmentEnum platformEnvironment, HttpContentTypeEnum httpContentType, String hostUri) {
        super(merchantKey, platformEnvironment, httpContentType, "/Buyer/", hostUri);
    }
    
    /**
     * Resgata o comprador
     * @param buyerKey
     * @return
     * @throws Exception 
     */
    public HttpResponseGenericResponse<BuyerResponse> GetBuyer(UUID buyerKey) throws Exception {
        
        HttpVerbEnum httpVerb = HttpVerbEnum.Get;

        BasicHeader[] header = new BasicHeader[1];
        header[0] = new BasicHeader("MerchantKey", this.getMerchantKey().toString());

        String serviceUri = this.getHostUri() + this.getResourceName() + buyerKey.toString();
        
        return this.getHttpUtility().<BuyerResponse>SubmitRequest(BuyerResponse.class, serviceUri, httpVerb, this.getHttpContentType(), header);
    }
    
    /**
     * Cria um comprador
     * @param buyerRequest
     * @return
     * @throws Exception 
     */
    public HttpResponseGenerics<GetBuyerResponseData, BuyerRequest> CreateBuyer(BuyerRequest buyerRequest) throws Exception {

        HttpVerbEnum httpVerb = HttpVerbEnum.Post;
        
        BasicHeader[] header = new BasicHeader[1];
        header[0] = new BasicHeader("MerchantKey", this.getMerchantKey().toString());

        String serviceUri = this.getHostUri() + this.getResourceName();
        
        return this.getHttpUtility().<GetBuyerResponseData, BuyerRequest>
                SubmitRequest(GetBuyerResponseData.class, buyerRequest, 
                        serviceUri, httpVerb, this.getHttpContentType(), header);
    }
}
