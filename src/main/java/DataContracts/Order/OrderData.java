package DataContracts.Order;

import java.util.Date;
import java.util.UUID;

/**
 * Dados do pedido
 */
public class OrderData {
    
    /**
     * Construtor da Classe
     */
    public OrderData() {}
    
    /**
     * Data de criação do pedido no gateway
     */
    private Date CreateDate;
    
    /**
     * Chave do pedido. Utilizado para identificar um pedido no gateway
     */
    private UUID OrderKey;
    
    /**
     * Número do pedido do sistema da loja
     */
    private String OrderReference;

    /**
     * Recupera Número do pedido do sistema da loja
     * @return 
     */
    public String getOrderReference() {
        return OrderReference;
    }

    /**
     * Altera Número do pedido do sistema da loja
     * @param OrderReference 
     */
    public void setOrderReference(String OrderReference) {
        this.OrderReference = OrderReference;
    }

    /**
     * Recupera Chave do pedido. Utilizado para identificar um pedido no gateway
     * @return 
     */
    public UUID getOrderKey() {
        return OrderKey;
    }

    /**
     * Altera Chave do pedido. Utilizado para identificar um pedido no gateway
     * @param OrderKey 
     */
    public void setOrderKey(UUID OrderKey) {
        this.OrderKey = OrderKey;
    }

    /**
     * Recupera Data de criação do pedido no gateway
     * @return 
     */
    public Date getCreateDate() {
        return CreateDate;
    }

    /**
     * Altera Data de criação do pedido no gateway
     * @param CreateDate 
     */
    public void setCreateDate(Date CreateDate) {
        this.CreateDate = CreateDate;
    }
}
