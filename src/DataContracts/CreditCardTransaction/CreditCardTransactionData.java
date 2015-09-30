package DataContracts.CreditCardTransaction;

import DataContracts.InstantBuy.CreditCardData;
import EnumTypes.CreditCardTransactionStatusEnum;
import java.util.Date;
import java.util.UUID;

/**
 *  Dados da transação de cartão de crédito
 */
public class CreditCardTransactionData {
 
    /**
     * Construtor da Classe
     */
    public CreditCardTransactionData() {}
    
    /**
     * Código de autorização retornado pela adquirente
     */
    private String AcquirerAuthorizationCode;
    
    /**
     * Nome da adquirente que processou a transação
     */
    private String AcquirerName;
    
    /**
     * Código de retorno da adquirente
     */
    private String AcquirerReturnCode;
    
    /**
     * Código da filiação da loja na adquirente
     */
    private String AffiliationCode;
    
    /**
     * Valor original da transação em centavos
     */
    private Long AmountInCents;
    
    /**
     * Valor autorizado em centavos
     */
    private Long AuthorizedAmountInCents;

    /**
     * Data limite para a captura da transação na adquirente
     */
    private Date CaptureExpirationDate;
    
    /**
     * Valor capturado em centavos
     */
    private Long CapturedAmountInCents;
    
    /**
     * Data da Captura
     */
    private Date CapturedDate;
    
    /**
     * Data de criação da transação no gateway
     */
    private Date CreateDate;
    
    /**
     * Dados do cartão de crédito
     */
    private CreditCardData CreditCard;

    /**
     * Status da transação de cartão de crédito
     */
    private CreditCardTransactionStatusEnum CreditCardTransactionStatus;

    /**
     * Data da recorrência (poderá ser futura)
     */
    private Date DueDate;
    
    /**
     * Total de parcelas da transação
     */
    private Integer InstallmentCount;

    /**
     * Indica se é uma recorrência
     */
    private Boolean IsReccurency;
    
    /**
     * Código do método de pagamento
     */
    private String PaymentMethodName;
    
    /**
     * Valor estornado em centavos
     */
    private Long RefundedAmountInCents;
    
    /**
     * Identificador da transação gerado pela loja.
     */
    private String TransactionIdentifier;
    
    /**
     * Chave da transação. Utilizada para identificar a transação de cartão de crédito no gateway
     */
    private UUID TransactionKey;

    /**
     * Chave da transação na adquirente, enviada pelo gateway
     */
    private String TransactionKeyToAcquirer;
    
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
     * Recupera dados do cartão de crédito
     * @return 
     */
    public CreditCardData getCreditCard() {
        return CreditCard;
    }

    /**
     * Altera dados do cartão de crédito
     * @param CreditCard 
     */
    public void setCreditCard(CreditCardData CreditCard) {
        this.CreditCard = CreditCard;
    }

    /**
     * Recupera status da transação de cartão de crédito
     * @return 
     */
    public CreditCardTransactionStatusEnum getCreditCardTransactionStatus() {
        return CreditCardTransactionStatus;
    }

    /**
     * Altera status da transação de cartão de crédito
     * @param CreditCardTransactionStatus 
     */
    public void setCreditCardTransactionStatus(CreditCardTransactionStatusEnum CreditCardTransactionStatus) {
        this.CreditCardTransactionStatus = CreditCardTransactionStatus;
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
     * Recupera codigo de autorização na adquirente
     * @return 
     */
    public String getAcquirerAuthorizationCode() {
        return AcquirerAuthorizationCode;
    }

    /**
     * Altera codigo de autorização na adquirente
     * @param AcquirerAuthorizationCode 
     */
    public void setAcquirerAuthorizationCode(String AcquirerAuthorizationCode) {
        this.AcquirerAuthorizationCode = AcquirerAuthorizationCode;
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
     * Recupera Data da captura
     * @return 
     */
    public Date getCapturedDate() {
        return CapturedDate;
    }

    /**
     * Altera Data da captura
     * @param CapturedDate 
     */
    public void setCapturedDate(Date CapturedDate) {
        this.CapturedDate = CapturedDate;
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
     * Recupera data da recorrencia
     * @return 
     */
    public Date getDueDate() {
        return DueDate;
    }

    /**
     * Altera data da recorrencia
     * @param DueDate 
     */
    public void setDueDate(Date DueDate) {
        this.DueDate = DueDate;
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
     * Recupera data de criação
     * @return 
     */
    public Date getCreateDate() {
        return CreateDate;
    }

    /**
     * Altera data de criação
     * @param CreateDate 
     */
    public void setCreateDate(Date CreateDate) {
        this.CreateDate = CreateDate;
    }

    /**
     * Recupera código de retorno da adquirente
     * @return 
     */
    public String getAcquirerReturnCode() {
        return AcquirerReturnCode;
    }

    /**
     * Altera código de retorno da adquirente
     * @param AcquirerReturnCode 
     */
    public void setAcquirerReturnCode(String AcquirerReturnCode) {
        this.AcquirerReturnCode = AcquirerReturnCode;
    }
    
    /**
     * Recupera nome da adquirente
     * @return 
     */
    public String getAcquirerName() {
        return AcquirerName;
    }

    /**
     * Altera nome da Adquirente
     * @param AcquirerName 
     */
    public void setAcquirerName(String AcquirerName) {
        this.AcquirerName = AcquirerName;
    }

    /**
     * Recupera se é recorrente
     * @return 
     */
    public Boolean getIsReccurency() {
        return IsReccurency;
    }

    /**
     * Altera se é recorrente
     * @param IsReccurency 
     */
    public void setIsReccurency(Boolean IsReccurency) {
        this.IsReccurency = IsReccurency;
    }

    /**
     * Recupera numero de parcelas
     * @return 
     */
    public Integer getInstallmentCount() {
        return InstallmentCount;
    }

    /**
     * Altera numero de parcelas
     * @param InstallmentCount 
     */
    public void setInstallmentCount(Integer InstallmentCount) {
        this.InstallmentCount = InstallmentCount;
    }

    /**
     * Recupera codigo da afiliação
     * @return 
     */
    public String getAffiliationCode() {
        return AffiliationCode;
    }

    /**
     * Altera código da afiliação
     * @param AffiliationCode 
     */
    public void setAffiliationCode(String AffiliationCode) {
        this.AffiliationCode = AffiliationCode;
    }

    /**
     * Recupera nome do método de pagamento
     * @return 
     */
    public String getPaymentMethodName() {
        return PaymentMethodName;
    }

    /**
     * Altera nome do método de pagamento
     * @param PaymentMethodName 
     */
    public void setPaymentMethodName(String PaymentMethodName) {
        this.PaymentMethodName = PaymentMethodName;
    }

    /**
     * Recupera Chave da transação para adquirente
     * @return 
     */
    public String getTransactionKeyToAcquirer() {
        return TransactionKeyToAcquirer;
    }

    /**
     * Altera Chave da transação paraa adquirente
     * @param TransactionKeyToAcquirer 
     */
    public void setTransactionKeyToAcquirer(String TransactionKeyToAcquirer) {
        this.TransactionKeyToAcquirer = TransactionKeyToAcquirer;
    }

    /**
     * Recupera Data limite para a captura da transação na adquirente
     * @return 
     */
    public Date getCaptureExpirationDate() {
        return CaptureExpirationDate;
    }

    /**
     * Altera Data limite para a captura da transação na adquirente
     * @param CaptureExpirationDate 
     */
    public void setCaptureExpirationDate(Date CaptureExpirationDate) {
        this.CaptureExpirationDate = CaptureExpirationDate;
    }
}
