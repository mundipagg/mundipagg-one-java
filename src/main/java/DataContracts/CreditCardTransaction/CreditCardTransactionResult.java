package DataContracts.CreditCardTransaction;

import DataContracts.InstantBuy.CreditCardData;
import EnumTypes.CreditCardOperationEnum;
import EnumTypes.CreditCardTransactionStatusEnum;
import java.util.Date;
import java.util.UUID;

/**
 * Resultado da transação de cartão de crédito
 */
public class CreditCardTransactionResult {
    
    /**
     * Mensagem de retorno da adquirente
     */
    private String AcquirerMessage;

    /**
     * Nome da adquirente
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
     * Valor total da transação em centavos
     */
    private Long AmountInCents;
    
    /**
     * Código de autorização
     */
    private String AuthorizationCode;   
    
    /**
     * Valor autorizado em centavos
     */
    private Long AuthorizedAmountInCents;

    /**
     * Valor capturado em centavos
     */
    private Long CapturedAmountInCents;
    
    /**
     * Data da Captura
     */
    private Date CapturedDate;
    
    /**
     * Dados do cartão de crédito
     */
    private CreditCardData CreditCard;

    /**
     * Operação da transação de cartão de crédito - Indica se deverá ser realizada uma captura automática da transação
     */
    private CreditCardOperationEnum CreditCardOperation;
    
    /**
     * Status da transação
     */
    private CreditCardTransactionStatusEnum CreditCardTransactionStatus;

    /**
     * Data da recorrência (poderá ser futura)
     */
    private Date DueDate;
    
    /**
     * Tempo de processamento da transação na adquirente
     */
    private Long ExternalTime;

    /**
     * Nome do método de pagamento
     */
    private String PaymentMethodName;
    
    /**
     * Valor estornado em centavos
     */
    private Long RefundedAmountInCents;
    
    /**
     * Indica se houve sucesso no processamento
     */
    private Boolean Success;
    
    /**
     * Identificador da transação na adquirente
     */
    private String TransactionIdentifier;
    
    /**
     * Chave da transação. Utilizada para identificar a transação de cartão de crédito no gateway
     */
    private UUID TransactionKey;
    
    /**
     * Chave da transação para adquirente, enviada pelo gateway
     */
    private String TransactionKeyToAcquirer;
    
    /**
     * Referência da transação no sistema da loja
     */
    private String TransactionReference;

    /**
     * Identificador único gerado pela adquirente
     */
    private String UniqueSequentialNumber;

    /**
     * Valor cancelado em centavos
     */
    private Long VoidedAmountInCents;

    /**
     * Recupera Dados do cartão de crédito
     * @return 
     */
    public CreditCardData getCreditCard() {
        return CreditCard;
    }

    /**
     * Altera Dados do cartão de crédito
     * @param CreditCard 
     */
    public void setCreditCard(CreditCardData CreditCard) {
        this.CreditCard = CreditCard;
    }

    /**
     * Recupera Status da transação
     * @return 
     */
    public CreditCardTransactionStatusEnum getCreditCardTransactionStatus() {
        return CreditCardTransactionStatus;
    }

    /**
     * Altera Status da transação
     * @param CreditCardTransactionStatus 
     */
    public void setCreditCardTransactionStatus(CreditCardTransactionStatusEnum CreditCardTransactionStatus) {
        this.CreditCardTransactionStatus = CreditCardTransactionStatus;
    }

    /**
     * Recupera Tempo de processamento da transação na adquirente
     * @return 
     */
    public Long getExternalTime() {
        return ExternalTime;
    }

    /**
     * Altera Tempo de processamento da transação na adquirente
     * @param ExternalTime 
     */
    public void setExternalTime(Long ExternalTime) {
        this.ExternalTime = ExternalTime;
    }

    /**
     * Recupera Chave da transação. Utilizada para identificar a transação de cartão de crédito no gateway
     * @return 
     */
    public UUID getTransactionKey() {
        return TransactionKey;
    }

    /**
     * Altera Chave da transação. Utilizada para identificar a transação de cartão de crédito no gateway
     * @param TransactionKey 
     */
    public void setTransactionKey(UUID TransactionKey) {
        this.TransactionKey = TransactionKey;
    }

    /**
     * Recupera Identificador da transação na adquirente
     * @return 
     */
    public String getTransactionIdentifier() {
        return TransactionIdentifier;
    }

    /**
     * Altera Identificador da transação na adquirente
     * @param TransactionIdentifier 
     */
    public void setTransactionIdentifier(String TransactionIdentifier) {
        this.TransactionIdentifier = TransactionIdentifier;
    }

    /**
     * Recupera Código de autorização
     * @return 
     */
    public String getAuthorizationCode() {
        return AuthorizationCode;
    }

    /**
     * Altera Código de autorização
     * @param AuthorizationCode 
     */
    public void setAuthorizationCode(String AuthorizationCode) {
        this.AuthorizationCode = AuthorizationCode;
    }

    /**
     * Recupera Identificador único gerado pela adquirente
     * @return 
     */
    public String getUniqueSequentialNumber() {
        return UniqueSequentialNumber;
    }

    /**
     * Altera Identificador único gerado pela adquirente
     * @param UniqueSequentialNumber 
     */
    public void setUniqueSequentialNumber(String UniqueSequentialNumber) {
        this.UniqueSequentialNumber = UniqueSequentialNumber;
    }

    /**
     * Recupera Operação da transação de cartão de crédito - Indica se deverá ser realizada uma captura automática da transação
     * @return 
     */
    public CreditCardOperationEnum getCreditCardOperation() {
        return CreditCardOperation;
    }

    /**
     * Altera Operação da transação de cartão de crédito - Indica se deverá ser realizada uma captura automática da transação
     * @param CreditCardOperation 
     */
    public void setCreditCardOperation(CreditCardOperationEnum CreditCardOperation) {
        this.CreditCardOperation = CreditCardOperation;
    }

    /**
     * Recupera Valor total da transação em centavos
     * @return 
     */
    public Long getAmountInCents() {
        return AmountInCents;
    }

    /**
     * Altera Valor total da transação em centavos
     * @param AmountInCents 
     */
    public void setAmountInCents(Long AmountInCents) {
        this.AmountInCents = AmountInCents;
    }

    /**
     * Recupera Valor autorizado em centavos
     * @return 
     */
    public Long getAuthorizedAmountInCents() {
        return AuthorizedAmountInCents;
    }

    /**
     * Altera Valor autorizado em centavos
     * @param AuthorizedAmountInCents 
     */
    public void setAuthorizedAmountInCents(Long AuthorizedAmountInCents) {
        this.AuthorizedAmountInCents = AuthorizedAmountInCents;
    }

    /**
     * Recupera Valor capturado em centavos
     * @return 
     */
    public Long getCapturedAmountInCents() {
        return CapturedAmountInCents;
    }

    /**
     * Altera Valor capturado em centavos
     * @param CapturedAmountInCents 
     */
    public void setCapturedAmountInCents(Long CapturedAmountInCents) {
        this.CapturedAmountInCents = CapturedAmountInCents;
    }

    /**
     * Recupera Valor estornado em centavos
     * @return 
     */
    public Long getRefundedAmountInCents() {
        return RefundedAmountInCents;
    }

    /**
     * Altera Valor estornado em centavos
     * @param RefundedAmountInCents 
     */
    public void setRefundedAmountInCents(Long RefundedAmountInCents) {
        this.RefundedAmountInCents = RefundedAmountInCents;
    }

    /**
     * Recupera Valor cancelado em centavos
     * @return 
     */
    public Long getVoidedAmountInCents() {
        return VoidedAmountInCents;
    }

    /**
     * Altera Valor cancelado em centavos
     * @param VoidedAmountInCents 
     */
    public void setVoidedAmountInCents(Long VoidedAmountInCents) {
        this.VoidedAmountInCents = VoidedAmountInCents;
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
     * Recupera Data da recorrência (poderá ser futura)
     * @return 
     */
    public Date getDueDate() {
        return DueDate;
    }

    /**
     * Altera Data da recorrência (poderá ser futura)
     * @param DueDate 
     */
    public void setDueDate(Date DueDate) {
        this.DueDate = DueDate;
    }

    /**
     * Recupera Referência da transação no sistema da loja
     * @return 
     */
    public String getTransactionReference() {
        return TransactionReference;
    }

    /**
     * Altera Referência da transação no sistema da loja
     * @param TransactionReference 
     */
    public void setTransactionReference(String TransactionReference) {
        this.TransactionReference = TransactionReference;
    }

    /**
     * Recupera Código de retorno da adquirente
     * @return 
     */
    public String getAcquirerReturnCode() {
        return AcquirerReturnCode;
    }

    /**
     * Altera Código de retorno da adquirente
     * @param AcquirerReturnCode 
     */
    public void setAcquirerReturnCode(String AcquirerReturnCode) {
        this.AcquirerReturnCode = AcquirerReturnCode;
    }

    /**
     * Recupera Mensagem de retorno da adquirente
     * @return 
     */
    public String getAcquirerMessage() {
        return AcquirerMessage;
    }

    /**
     * Altera Mensagem de retorno da adquirente
     * @param AcquirerMessage 
     */
    public void setAcquirerMessage(String AcquirerMessage) {
        this.AcquirerMessage = AcquirerMessage;
    }

    /**
     * Recupera se houve sucesso no processamento
     * @return 
     */
    public Boolean getSuccess() {
        return Success;
    }

    /**
     * Altera se houve sucesso no processamento
     * @param Success 
     */
    public void setSuccess(Boolean Success) {
        this.Success = Success;
    }

    /**
     * Recupera Código da filiação da loja na adquirente
     * @return 
     */
    public String getAffiliationCode() {
        return AffiliationCode;
    }

    /**
     * Altera Código da filiação da loja na adquirente
     * @param AffiliationCode 
     */
    public void setAffiliationCode(String AffiliationCode) {
        this.AffiliationCode = AffiliationCode;
    }

    /**
     * Recupera Nome do método de pagamento 
     * @return 
     */
    public String getPaymentMethodName() {
        return PaymentMethodName;
    }

    /**
     * Altera Nome do método de pagamento
     * @param PaymentMethodName 
     */
    public void setPaymentMethodName(String PaymentMethodName) {
        this.PaymentMethodName = PaymentMethodName;
    }

    /**
     * Recupera nome do adquirente
     * @return 
     */
    public String getAcquirerName() {
        return AcquirerName;
    }

    /**
     * Altera Nome do Adquirente
     * @param AcquirerName 
     */
    public void setAcquirerName(String AcquirerName) {
        this.AcquirerName = AcquirerName;
    }

    /**
     * Recupera Chave da transação para adquirente, enviada pelo gateway
     * @return 
     */
    public String getTransactionKeyToAcquirer() {
        return TransactionKeyToAcquirer;
    }

    /**
     * Altera Chave da transação para adquirente, enviada pelo gateway
     * @param TransactionKeyToAcquirer 
     */
    public void setTransactionKeyToAcquirer(String TransactionKeyToAcquirer) {
        this.TransactionKeyToAcquirer = TransactionKeyToAcquirer;
    }
}
