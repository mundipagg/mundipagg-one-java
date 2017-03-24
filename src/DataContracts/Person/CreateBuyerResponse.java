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
public class CreateBuyerResponse extends BaseResponse {
    /**
     * Chave do Comprador
     */
    private UUID BuyerKey;
    
    /**
     * Indicador de sucesso
     */
    private Boolean Success;

    /**
     * Retorna a chave do comprador
     * @return 
     */
    public UUID getBuyerKey() {
        return BuyerKey;
    }

    /**
     * Define a chave do comprador
     * @param BuyerKey 
     */
    public void setBuyerKey(UUID BuyerKey) {
        this.BuyerKey = BuyerKey;
    }

    /**
     * Retorna o sucesso
     * @return 
     */
    public Boolean getSuccess() {
        return Success;
    }

    /**
     * Define o Sucesso
     * @param Success 
     */
    public void setSuccess(Boolean Success) {
        this.Success = Success;
    }
}
