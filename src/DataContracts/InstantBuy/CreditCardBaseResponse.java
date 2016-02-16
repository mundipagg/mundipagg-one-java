/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataContracts.InstantBuy;

import DataContracts.BaseResponse;

/**
 *
 * @author Munir
 */
public class CreditCardBaseResponse extends BaseResponse {
    /**
     * Indicador de sucesso
     */
    private Boolean Success;

    /**
     * Retorna sucesso
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
