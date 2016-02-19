/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataContracts.InstantBuy;

import java.util.UUID;

/**
 *
 * @author Munir
 */
public class UpdateInstantBuyDataRequest {
    /**
     * Chave do comprador
     */    
    private UUID BuyerKey;

    /**
     * Recupera chave do comprador
     * @return 
     */
    public UUID getBuyerKey() {
        return BuyerKey;
    }

    /**
     * Define a cheave do comprador
     * @param BuyerKey 
     */
    public void setBuyerKey(UUID BuyerKey) {
        this.BuyerKey = BuyerKey;
    }
}
