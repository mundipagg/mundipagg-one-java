package DataContracts.BoletoTransaction;

import EnumTypes.BoletoTransactionStatusEnum;
import java.util.Date;
import java.util.UUID;

/**
 * Dados da notificação de Transação de Boleto 
 */
public class BoletoTransactionNotification {
   
    /**
      * Construtor da Classe
      */
    public BoletoTransactionNotification() {}
    
    /**
     * Valor original do boleto em centavos
     */
    private Long AmountInCents;
    
    /**
     * Valor total pago em centavos
     */
    private Long AmountPaidInCents;
    
    /**
     * Data de expiração do boleto
     */
    private Date BoletoExpirationDate;
    
    /**
     * Identificador do boleto
     */
    private String NossoNumero;
    
    /**
     * Data de modificação do status
     */
    private Date StatusChangedDate;
    
    /**
     * Chave da transação. Utilizada para identificar a transação de boleto no gateway
     */
    private UUID TransactionKey;   

    /**
     * Identificador da transação no sistema da loja
     */
    private String TransactionReference;
    
    /**
     * Status anterior do boleto
     */
    private BoletoTransactionStatusEnum PreviousBoletoTransactionStatus;        
            
    /**
     * Status atual do boleto
     */
    private BoletoTransactionStatusEnum BoletoTransactionStatus;
    
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
    public BoletoTransactionStatusEnum getBoletoTransactionStatus() {
        return BoletoTransactionStatus;
    }

    /**
     * Altera status atual da transação
     * @param BoletoTransactionStatus 
     */
    public void setBoletoTransactionStatus(BoletoTransactionStatusEnum BoletoTransactionStatus) {
        this.BoletoTransactionStatus = BoletoTransactionStatus;
    }
    
    /**
     * Recupera status anterior da transação
     * @return 
     */
    public BoletoTransactionStatusEnum getPreviousBoletoTransactionStatus() {
        return PreviousBoletoTransactionStatus;
    }

    /**
     * Altera status anterior da transação
     * @param PreviousBoletoTransactionStatus 
     */
    public void setPreviousBoletoTransactionStatus(BoletoTransactionStatusEnum PreviousBoletoTransactionStatus) {
        this.PreviousBoletoTransactionStatus = PreviousBoletoTransactionStatus;
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
     * Recupera data de vencimento
     * @return 
     */
    public Date getBoletoExpirationDate() {
        return BoletoExpirationDate;
    }

    /**
     * Altera data de vencimento
     * @param BoletoExpirationDate 
     */
    public void setBoletoExpirationDate(Date BoletoExpirationDate) {
        this.BoletoExpirationDate = BoletoExpirationDate;
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

    /**
     * Recupera Identificador do boleto
     * @return 
     */
    public String getNossoNumero() {
        return NossoNumero;
    }

    /**
     * Altera Identificador do boleto
     * @param NossoNumero 
     */
    public void setNossoNumero(String NossoNumero) {
        this.NossoNumero = NossoNumero;
    }
}
