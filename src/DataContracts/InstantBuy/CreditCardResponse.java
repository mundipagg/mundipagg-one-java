/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataContracts.InstantBuy;

import DataContracts.BaseResponse;
import java.util.UUID;

/**
 *
 * @author Munir
 */
public class CreditCardResponse extends BaseResponse {
    /**
     * Id do InstantBuy
     */
    private UUID InstantBuyKey;
    
    /**
     * Sucesso do OneDollarAuth
     */
    private Boolean OneDollarAuthSuccess;
    
    /**
     * Sucesso
     */
    private Boolean Success;

    /**
     * Recupera InstantBuyKey
     * @return 
     */
    public UUID getInstantBuyKey() {
        return InstantBuyKey;
    }

    /**
     * Define InstantBuyKey
     * @param InstantBuyKey 
     */
    public void setInstantBuyKey(UUID InstantBuyKey) {
        this.InstantBuyKey = InstantBuyKey;
    }

    /**
     * Recupera sucesso do OneDollarAuth
     * @return 
     */
    public Boolean getOneDollarAuthSuccess() {
        return OneDollarAuthSuccess;
    }

    /**
     * Define sucesso do OneDollarAuth
     * @param OneDollarAuthSuccess 
     */
    public void setOneDollarAuthSuccess(Boolean OneDollarAuthSuccess) {
        this.OneDollarAuthSuccess = OneDollarAuthSuccess;
    }

    /**
     * Recupera sucesso
     * @return 
     */
    public Boolean getSuccess() {
        return Success;
    }

    /**
     * Define sucesso
     * @param Success 
     */
    public void setSuccess(Boolean Success) {
        this.Success = Success;
    }
}
