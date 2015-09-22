package DataContracts.OnlineDebitTransaction;

import DataContracts.Order.OrderReport;
import EnumTypes.OnlineDebitTransactionStatusEnum;
import java.util.Date;
import java.util.UUID;

/**
 * Dados do relatorio de transação de débito online
 */
public class OnlineDebitTransactionReport {
    
    /**
     * Construtor da classe
     */
    public OnlineDebitTransactionReport() {    
        this.Order = new OrderReport();
    }
    
    /**
     * Pedido
     */
    private OrderReport Order;
    
    /**
     * Valor original em centavos
     */
    private Long AmountInCents;
    
    /**
     * Valor total pago em centavos
     */
    private Long AmountPaidInCents;
    
    /**
     * Data de pagamento
     */
    private Date PaymentDate;
    
    /**
     * Chave da transação. Utilizada para identificar a transação de débito online no gateway
     */
    private UUID TransactionKey;   

    /**
     * Identificador da transação no sistema da loja
     */
    private String TransactionReference;
    
    /**
     * Código de retorno do banco
     */
    private String BankReturnCode;
    
    /**
     * Data de pagamento no banco
     */
    private String BankPaymentDate;
    
    /**
     * Assinatura
     */
    private String Signature;
    
    /**
     * Nome do banco
     */
    private String Bank;
    
    /**
     * Chave da transação para o banco
     */
    private String TransactionKeyToBank;
                
    /**
     * Status atual da transação de débito online
     */
    private OnlineDebitTransactionStatusEnum Status;
    
    /**
     * Recupera data pagamento
     * @return 
     */
    public Date getPaymentDate() {
        return PaymentDate;
    }

    /**
     * Altera data de pagamento
     * @param PaymentDate 
     */
    public void setPaymentDate(Date PaymentDate) {
        this.PaymentDate = PaymentDate;
    }

    /**
     * Recupera status atual da transação
     * @return 
     */
    public OnlineDebitTransactionStatusEnum getStatus() {
        return Status;
    }

    /**
     * Altera status atual da transação
     * @param Status 
     */
    public void setStatus(OnlineDebitTransactionStatusEnum Status) {
        this.Status = Status;
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

    /**
     * Recupera pedido
     * @return 
     */
    public OrderReport getOrder() {
        return Order;
    }

    /**
     * Altera pedido
     * @param Order 
     */
    public void setOrder(OrderReport Order) {
        this.Order = Order;
    }

    /**
     * Recupera código de retorno do banco
     * @return 
     */
    public String getBankReturnCode() {
        return BankReturnCode;
    }

    /**
     * Altera código de retorno do banco
     * @param BankReturnCode 
     */
    public void setBankReturnCode(String BankReturnCode) {
        this.BankReturnCode = BankReturnCode;
    }

    /**
     * Recupera data de pagamento no banco
     * @return 
     */
    public String getBankPaymentDate() {
        return BankPaymentDate;
    }

    /**
     * Altera data de pagamento no banco
     * @param BankPaymentDate 
     */
    public void setBankPaymentDate(String BankPaymentDate) {
        this.BankPaymentDate = BankPaymentDate;
    }

    /**
     * Recupera assinatura
     * @return 
     */
    public String getSignature() {
        return Signature;
    }

    /**
     * Altera assinatura
     * @param Signature 
     */
    public void setSignature(String Signature) {
        this.Signature = Signature;
    }

    /**
     * Recupera chave da transação para banco
     * @return 
     */
    public String getTransactionKeyToBank() {
        return TransactionKeyToBank;
    }

    /**
     * Altera
     * @param TransactionKeyToBank 
     */
    public void setTransactionKeyToBank(String TransactionKeyToBank) {
        this.TransactionKeyToBank = TransactionKeyToBank;
    }
    
    /**
     * Recupera nome do banco
     * @return 
     */
    public String getBank() {
        return Bank;
    }

    /**
     * Altera nome do banco
     * @param Bank 
     */
    public void setBank(String Bank) {
        this.Bank = Bank;
    }
}
