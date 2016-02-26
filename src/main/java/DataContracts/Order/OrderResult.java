package DataContracts.Order;

import java.util.Date;
import java.util.UUID;

/**
 * Dados do Pedido
 */
public class OrderResult {
    
    /**
     * Construtor da Classe
     */
    public OrderResult() {}
    
    /**
     * Data de criação do pedido no gateway
     */
    private Date CreateDate;
    
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
     * Recupera data de criação no gateway
     * @return 
     */
    public Date getCreateDate() {
        return CreateDate;
    }

    /**
     * Altera data de criação no gateway
     * @param CreateDate 
     */
    public void setCreateDate(Date CreateDate) {
        this.CreateDate = CreateDate;
    }
}
