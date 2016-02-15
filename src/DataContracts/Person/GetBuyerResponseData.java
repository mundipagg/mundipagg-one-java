/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataContracts.Person;

import DataContracts.BaseResponse;
import java.util.UUID;

/**
 *
 * @author munir
 */
public class GetBuyerResponseData extends BaseResponse {
    private UUID BuyerKey;
    
    private Boolean Success;

    public UUID getBuyerKey() {
        return BuyerKey;
    }

    public void setBuyerKey(UUID BuyerKey) {
        this.BuyerKey = BuyerKey;
    }

    public Boolean getSuccess() {
        return Success;
    }

    public void setSuccess(Boolean Success) {
        this.Success = Success;
    }
}
