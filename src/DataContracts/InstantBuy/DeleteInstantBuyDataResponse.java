/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataContracts.InstantBuy;

/**
 *
 * @author Munir
 */
public class DeleteInstantBuyDataResponse {
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
