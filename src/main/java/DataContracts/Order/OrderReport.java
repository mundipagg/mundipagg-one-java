/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataContracts.Order;

import java.util.UUID;

/**
 * Dados de pedido no relatório
 */
public class OrderReport {
    
    /**
     * Construtor da classe
     */
    public OrderReport() {}
    
    /**
     * Nome da loja
     */
    private String MerchantName;
    
    /**
     * Chave da Loja
     */
    private UUID MerchantKey;
    
    /**
     * Identificador do pedido na loja
     */
    private String OrderReference;
    
    /**
     * Identificador do pedido no gateway
     */
    private UUID OrderKey;
    
    /**
     * Recupera identificador da loja na plataforma
     * @return 
     */
    public String getOrderReference() {
        return OrderReference;
    }

    /**
     * Altera identificador da loja na plataforma
     * @param OrderReference 
     */
    public void setOrderReference(String OrderReference) {
        this.OrderReference = OrderReference;
    }

    /**
     * Recupera identificador do pedido no gateway
     * @return 
     */
    public UUID getOrderKey() {
        return OrderKey;
    }

    /**
     * Altera identificador do pedido no gateway
     * @param OrderKey 
     */
    public void setOrderKey(UUID OrderKey) {
        this.OrderKey = OrderKey;
    }

    /**
     * Recupera nome da loja
     * @return 
     */
    public String getMerchantName() {
        return MerchantName;
    }

    /**
     * Altera nome da loja
     * @param MerchantName 
     */
    public void setMerchantName(String MerchantName) {
        this.MerchantName = MerchantName;
    }

    /**
     * Recupera chave da loja
     * @return 
     */
    public UUID getMerchantKey() {
        return MerchantKey;
    }

    /**
     * Altera nome da loja
     * @param MerchantKey 
     */
    public void setMerchantKey(UUID MerchantKey) {
        this.MerchantKey = MerchantKey;
    }    
}
