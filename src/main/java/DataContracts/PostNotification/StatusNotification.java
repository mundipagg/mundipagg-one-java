package DataContracts.PostNotification;

import DataContracts.BoletoTransaction.BoletoTransactionNotification;
import DataContracts.CreditCardTransaction.CreditCardTransactionNotification;
import DataContracts.OnlineDebitTransaction.OnlineDebitTransactionNotification;
import EnumTypes.OrderStatusEnum;
import java.util.UUID;

/**
 * Status de notificação
 */
public class StatusNotification {
    
    /**
     * Construtor da Classe
     */
    public StatusNotification() {}
            
    /**
     * Total em centavos
     */
    private Long AmountInCents;
    
    /**
     * Total pago em centavos
     */
    private Long AmountPaidInCents;
    
    /**
     * Notificação de Transação de Boleto
     */
    private BoletoTransactionNotification BoletoTransaction;
    
    /**
     * Notificação de Transação de Cartão de Crédito
     */
    private CreditCardTransactionNotification CreditCardTransaction;
    
    /**
     * Notificação de Transação de Débito Online
     */
    private OnlineDebitTransactionNotification OnlineDebitTransaction;
    
    /**
     * Chave da loja
     */
    private UUID MerchantKey;
    
    /**
     * Chave do pedido
     */
    private UUID OrderKey;    
    
    /**
     * Referencia do pedido na loja
     */
    private String OrderReference;    
    
    /**
     * Status do Pedido
     */
    private OrderStatusEnum OrderStatus;
    
    /**
     * Recupera Chave da Loja
     * @return 
     */
    public UUID getMerchantKey() {
        return MerchantKey;
    }

    /**
     * Altera Chave da Loja
     * @param MerchantKey 
     */
    public void setMerchantKey(UUID MerchantKey) {
        this.MerchantKey = MerchantKey;
    }
    
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
     * Recupera valor original em centavos
     * @return 
     */
    public Long getAmountInCents() {
        return AmountInCents;
    }

    /**
     * Altera valor original em centavos
     * @param AmountInCents 
     */
    public void setAmountInCents(Long AmountInCents) {
        this.AmountInCents = AmountInCents;
    }
    
    /**
     * Recupera valor pago em centavos
     * @return 
     */
    public Long getAmountPaidInCents() {
        return AmountPaidInCents;
    }

    /**
     * Altera valor pago em centavos
     * @param AmountPaidInCents 
     */
    public void setAmountPaidInCents(Long AmountPaidInCents) {
        this.AmountPaidInCents = AmountPaidInCents;
    }

    /**
     * Recupera Notificação de Transação de Boleto
     * @return 
     */
    public BoletoTransactionNotification getBoletoTransaction() {
        return BoletoTransaction;
    }

    /**
     * Altera Notificação de Transação de Boleto
     * @param BoletoTransaction 
     */
    public void setBoletoTransaction(BoletoTransactionNotification BoletoTransaction) {
        this.BoletoTransaction = BoletoTransaction;
    }

    /**
     * Recupera Notificação de Transação de Cartão de Crédito
     * @return 
     */
    public CreditCardTransactionNotification getCreditCardTransaction() {
        return CreditCardTransaction;
    }

    /**
     * Altera Notificação de Transação de Cartão de Crédito
     * @param CreditCardTransaction 
     */
    public void setCreditCardTransaction(CreditCardTransactionNotification CreditCardTransaction) {
        this.CreditCardTransaction = CreditCardTransaction;
    }

    /**
     * Recupera Notificação de Transação de Débito Online
     * @return 
     */
    public OnlineDebitTransactionNotification getOnlineDebitTransaction() {
        return OnlineDebitTransaction;
    }

    /**
     * Altera Notificação de Transação de Débito Online
     * @param OnlineDebitTransaction 
     */
    public void setOnlineDebitTransaction(OnlineDebitTransactionNotification OnlineDebitTransaction) {
        this.OnlineDebitTransaction = OnlineDebitTransaction;
    }

    /**
     * Recupera status do pedido
     * @return 
     */
    public OrderStatusEnum getOrderStatus() {
        return OrderStatus;
    }

    /**
     * Altera status do pedido
     * @param OrderStatus 
     */
    public void setOrderStatus(OrderStatusEnum OrderStatus) {
        this.OrderStatus = OrderStatus;
    }    
}
