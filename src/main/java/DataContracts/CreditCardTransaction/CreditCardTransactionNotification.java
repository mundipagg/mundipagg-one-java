package DataContracts.CreditCardTransaction;

import EnumTypes.CreditCardBrandEnum;
import EnumTypes.CreditCardTransactionStatusEnum;
import java.util.Date;
import java.util.UUID;

/**
 * Dados de notificação de transação de cartão de crédito
 */
public class CreditCardTransactionNotification {
 
    /**
     * Construtor da Classe
     */
    public CreditCardTransactionNotification() {}
       
    /**
     * Nome da adquirente que processou a transação
     */
    private String Acquirer;
    
    /**
     * Valor original da transação em centavos
     */
    private Long AmountInCents;
    
    /**
     * Valor autorizado em centavos
     */
    private Long AuthorizedAmountInCents;
    
    /**
     * Valor capturado em centavos
     */
    private Long CapturedAmountInCents;
    
    /**
     * Bandeira do cartão de crédito
     */
    private CreditCardBrandEnum CreditCardBrand;
    
    /**
     * Valor estornado em centavos
     */
    private Long RefundedAmountInCents;
    
    /**
     * data da modificação do status
     */
    private Date StatusChangedDate;
    
    /**
     * Identificador da transação gerado pela loja.
     */
    private String TransactionIdentifier;
    
    /**
     * Chave da transação. Utilizada para identificar a transação de cartão de crédito no gateway
     */
    private UUID TransactionKey;
    
    /**
     * Identificador da transação no sistema da loja
     */
    private String TransactionReference;
    
    /**
     * Identificador único retornado pela adquirente
     */
    private String UniqueSequentialNumber;    

    /**
     * Valor cancelado em centavos
     */
    private Long VoidedAmountInCents;

    /**
     * Status anterior da transação de cartão de crédito
     */
    private CreditCardTransactionStatusEnum PreviousCreditCardTransactionStatus;
    
    /**
     * Status atual da transação de cartão de crédito
     */
    private CreditCardTransactionStatusEnum CreditCardTransactionStatus;
    
    /**
     * Recupera status atual da transação de cartão de crédito
     * @return 
     */
    public CreditCardTransactionStatusEnum getCreditCardTransactionStatus() {
        return CreditCardTransactionStatus;
    }

    /**
     * Altera status atual da transação de cartão de crédito
     * @param CreditCardTransactionStatus 
     */
    public void setCreditCardTransactionStatus(CreditCardTransactionStatusEnum CreditCardTransactionStatus) {
        this.CreditCardTransactionStatus = CreditCardTransactionStatus;
    }

    /**
     * Recupera status anterior da transação de cartão de crédito
     * @return 
     */
    public CreditCardTransactionStatusEnum getPreviousCreditCardTransactionStatuss() {
        return PreviousCreditCardTransactionStatus;
    }

    /**
     * Altera status anterior da transação de cartão de crédito
     * @param PreviousCreditCardTransactionStatus 
     */
    public void setPreviousCreditCardTransactionStatus(CreditCardTransactionStatusEnum PreviousCreditCardTransactionStatus) {
        this.PreviousCreditCardTransactionStatus = PreviousCreditCardTransactionStatus;
    }
    
    /**
     * Recupera chave da Transação
     * @return 
     */
    public UUID getTransactionKey() {
        return TransactionKey;
    }

    /**
     * Altera chave da Transação
     * @param TransactionKey 
     */
    public void setTransactionKey(UUID TransactionKey) {
        this.TransactionKey = TransactionKey;
    }

    /**
     * Recupera TID (identificador da transação)
     * @return 
     */
    public String getTransactionIdentifier() {
        return TransactionIdentifier;
    }

    /**
     * Altera TID (identificador da transação)
     * @param TransactionIdentifier 
     */
    public void setTransactionIdentifier(String TransactionIdentifier) {
        this.TransactionIdentifier = TransactionIdentifier;
    }

    /**
     * Recupera NSU - Numero unico sequencial
     * @return 
     */
    public String getUniqueSequentialNumber() {
        return UniqueSequentialNumber;
    }

    /**
     * Altera NSU - Numero unico sequencial
     * @param UniqueSequentialNumber 
     */
    public void setUniqueSequentialNumber(String UniqueSequentialNumber) {
        this.UniqueSequentialNumber = UniqueSequentialNumber;
    }

    /**
     * Recupera valor da transação em centavos
     * @return 
     */
    public Long getAmountInCents() {
        return AmountInCents;
    }

    /**
     * Altera valor da transação em centavos
     * @param AmountInCents 
     */
    public void setAmountInCents(Long AmountInCents) {
        this.AmountInCents = AmountInCents;
    }

    /**
     * Recupera valor autorizado da transação em centavos
     * @return 
     */
    public Long getAuthorizedAmountInCents() {
        return AuthorizedAmountInCents;
    }

    /**
     * Altera valor autorizado da transação em centavos
     * @param AuthorizedAmountInCents 
     */
    public void setAuthorizedAmountInCents(Long AuthorizedAmountInCents) {
        this.AuthorizedAmountInCents = AuthorizedAmountInCents;
    }

    /**
     * Recupera valor capturado da transação em centavos
     * @return 
     */
    public Long getCapturedAmountInCents() {
        return CapturedAmountInCents;
    }

    /**
     * Altera valor capturado da transação em centavos
     * @param CapturedAmountInCents 
     */
    public void setCapturedAmountInCents(Long CapturedAmountInCents) {
        this.CapturedAmountInCents = CapturedAmountInCents;
    }

    /**
     * Recupera valor estornado da transação em centavos
     * @return 
     */
    public Long getRefundedAmountInCents() {
        return RefundedAmountInCents;
    }

    /**
     * Altera valor estornado da transação em centavos
     * @param RefundedAmountInCents 
     */
    public void setRefundedAmountInCents(Long RefundedAmountInCents) {
        this.RefundedAmountInCents = RefundedAmountInCents;
    }

    /**
     * Recupera valor cancelado da transação em centavos
     * @return 
     */
    public Long getVoidedAmountInCents() {
        return VoidedAmountInCents;
    }

    /**
     * Altera valor cancelado da transação em centavos
     * @param VoidedAmountInCents 
     */
    public void setVoidedAmountInCents(Long VoidedAmountInCents) {
        this.VoidedAmountInCents = VoidedAmountInCents;
    }

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
     * Recupera referencia da transação
     * @return 
     */
    public String getTransactionReference() {
        return TransactionReference;
    }

    /**
     * Altera referencia da transação
     * @param TransactionReference 
     */
    public void setTransactionReference(String TransactionReference) {
        this.TransactionReference = TransactionReference;
    }

    /**
     * Recupera bandeira do cartão de crédito
     * @return 
     */
    public CreditCardBrandEnum getCreditCardBrand() {
        return CreditCardBrand;
    }

    /**
     * Altera bandeira do cartão de crédito
     * @param CreditCardBrand 
     */
    public void setCreditCardBrand(CreditCardBrandEnum CreditCardBrand) {
        this.CreditCardBrand = CreditCardBrand;
    }
    
    /**
     * Recupera nome da adquirente
     * @return 
     */
    public String getAcquirer() {
        return Acquirer;
    }

    /**
     * Altera nome da Adquirente
     * @param Acquirer 
     */
    public void setAcquirer(String Acquirer) {
        this.Acquirer = Acquirer;
    }
}
