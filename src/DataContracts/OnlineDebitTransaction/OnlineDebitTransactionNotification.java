package DataContracts.OnlineDebitTransaction;

import EnumTypes.OnlineDebitTransactionStatusEnum;
import java.util.Date;
import java.util.UUID;

/**
 * Dados da notificação de débito online
 */
public class OnlineDebitTransactionNotification {
    
    /**
     * Construtor da Classe
     */
    public OnlineDebitTransactionNotification() {}
    
    /**
     * Valor original em centavos
     */
    private Long AmountInCents;
    
    /**
     * Valor total pago em centavos
     */
    private Long AmountPaidInCents;
    
    /**
     * Data de modificação do status
     */
    private Date StatusChangedDate;
    
    /**
     * Chave da transação. Utilizada para identificar a transação de débito online no gateway
     */
    private UUID TransactionKey;   

    /**
     * Identificador da transação no sistema da loja
     */
    private String TransactionReference;
    
    /**
     * Status anterior da transação de débito online
     */
    private OnlineDebitTransactionStatusEnum PreviousOnlineDebitTransactionStatus;        
            
    /**
     * Status atual da transação de débito online
     */
    private OnlineDebitTransactionStatusEnum OnlineDebitTransactionStatus;
    
    /**
     * Recupera data de modificação do status
     * @return 
     */
    public Date getStatusChangedDate() {
        return StatusChangedDate;
    }

    /**
     * Altera data de modificação do status
     * @param StatusChangedDate 
     */
    public void setStatusChangedDate(Date StatusChangedDate) {
        this.StatusChangedDate = StatusChangedDate;
    }

    /**
     * Recupera status atual da transação
     * @return 
     */
    public OnlineDebitTransactionStatusEnum getOnlineDebitTransactionStatus() {
        return OnlineDebitTransactionStatus;
    }

    /**
     * Altera status atual da transação
     * @param OnlineDebitTransactionStatus 
     */
    public void setOnlineDebitTransactionStatus(OnlineDebitTransactionStatusEnum OnlineDebitTransactionStatus) {
        this.OnlineDebitTransactionStatus = OnlineDebitTransactionStatus;
    }
    
    /**
     * Recupera status anterior da transação
     * @return 
     */
    public OnlineDebitTransactionStatusEnum getPreviousOnlineDebitTransactionStatus() {
        return PreviousOnlineDebitTransactionStatus;
    }

    /**
     * Altera status anterior da transação
     * @param PreviousOnlineDebitTransactionStatus
     */
    public void setPreviousOnlineDebitTransactionStatus(OnlineDebitTransactionStatusEnum PreviousOnlineDebitTransactionStatus) {
        this.PreviousOnlineDebitTransactionStatus = PreviousOnlineDebitTransactionStatus;
    }

    /**
     * Recupera chave da transação. Utilizada para identificar a transação de boleto no gateway
     * @return 
     */
    public UUID getTransactionKey() {
        return TransactionKey;
    }

    /**
     * Altera chave da transação. Utilizada para identificar a transação de boleto no gateway
     * @param TransactionKey 
     */
    public void setTransactionKey(UUID TransactionKey) {
        this.TransactionKey = TransactionKey;
    }

    /**
     * Recupera Valor original do boleto em centavos
     * @return 
     */
    public Long getAmountInCents() {
        return AmountInCents;
    }

    /**
     * Altera Valor original do boleto em centavos
     * @param AmountInCents 
     */
    public void setAmountInCents(Long AmountInCents) {
        this.AmountInCents = AmountInCents;
    }

    /**
     * Recupera Identificador da transação no sistema da loja
     * @return 
     */
    public String getTransactionReference() {
        return TransactionReference;
    }

    /**
     * Altera Identificador da transação no sistema da loja
     * @param TransactionReference 
     */
    public void setTransactionReference(String TransactionReference) {
        this.TransactionReference = TransactionReference;
    }

    /**
     * Recupera Valor total pago em centavos
     * @return 
     */
    public Long getAmountPaidInCents() {
        return AmountPaidInCents;
    }

    /**
     * Altera Valor total pago em centavos
     * @param AmountPaidInCents 
     */
    public void setAmountPaidInCents(Long AmountPaidInCents) {
        this.AmountPaidInCents = AmountPaidInCents;
    }
}
