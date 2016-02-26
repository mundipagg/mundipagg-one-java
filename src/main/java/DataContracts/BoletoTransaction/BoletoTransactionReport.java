package DataContracts.BoletoTransaction;

import DataContracts.Order.OrderReport;
import EnumTypes.BoletoTransactionStatusEnum;
import java.util.Date;
import java.util.UUID;

/**
 * Resultado de transação de boleto
 */
public class BoletoTransactionReport {
    
    /**
     * Construtor da Classe
     */
    public BoletoTransactionReport() {
        this.Order = new OrderReport();
    }
    
    /**
     * Pedido
     */
    private OrderReport Order;
    
    /**
     * Valor original do boleto em centavos
     */
    private Long AmountInCents;
    
    /**
     * Valor total pago em centavos
     */
    private Long AmountPaidInCents;
    
    /**
     * Código de barras do boleto
     */
    private String Barcode;
    
    /**
     * Status do boleto
     */
    private BoletoTransactionStatusEnum Status;
    
    /**
     * Identificador do boleto
     */
    private String NossoNumero;
    
    /**
     * Chave da transação. Utilizada para identificar a transação de boleto no gateway
     */
    private UUID TransactionKey;

    /**
     * Identificador da transação no sistema da loja
     */
    private String TransactionReference;
    
    /**
     * Número do banco
     */
    private String BankNumber;
    
    /**
     * Número da agência
     */
    private String Agency;
    
    /**
     * Número da conta
     */
    private String Account;

    /**
     * Data de crédito
     */
    private Date CreditDate;
    
    /**
     * Data de Pagamento
     */
    private Date PaymentDate;
    
    /**
     * Data de expiração do boleto
     */
    private Date ExpirationDate;
    
    /**
     * Recupera código de barras do boleto
     * @return 
     */
    public String getBarcode() {
        return Barcode;
    }

    /**
     * Altera código de barras do boleto
     * @param Barcode 
     */
    public void setBarcode(String Barcode) {
        this.Barcode = Barcode;
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
     * Recupera data de pagamento
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
    public Date getExpirationDate() {
        return ExpirationDate;
    }

    /**
     * Altera data de vencimento
     * @param ExpirationDate 
     */
    public void setExpirationDate(Date ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    /**
     * Recupera numero do banco
     * @return 
     */
    public String getBankNumber() {
        return BankNumber;
    }

    /**
     * Altera numero do banco
     * @param BankNumber 
     */
    public void setBankNumber(String BankNumber) {
        this.BankNumber = BankNumber;
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
     * Recupera data de crédito
     * @return 
     */
    public Date getCreditDate() {
        return CreditDate;
    }

    /**
     * Altera data de crédito
     * @param CreditDate 
     */
    public void setCreditDate(Date CreditDate) {
        this.CreditDate = CreditDate;
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

    /**
     * Recupera Status do boleto
     * @return 
     */
    public BoletoTransactionStatusEnum getStatus() {
        return Status;
    }

    /**
     * Altera Status do boleto
     * @param BoletoTransactionStatus 
     */
    public void setStatus(BoletoTransactionStatusEnum BoletoTransactionStatus) {
        this.Status = BoletoTransactionStatus;
    }

    /**
     * Recupera número da agência
     * @return 
     */
    public String getAgency() {
        return Agency;
    }

    /**
     * Altera número da agência
     * @param Agency 
     */
    public void setAgency(String Agency) {
        this.Agency = Agency;
    }

    /**
     * Recupera número da conta
     * @return 
     */
    public String getAccount() {
        return Account;
    }

    /**
     * Altera número da conta
     * @param Account 
     */
    public void setAccount(String Account) {
        this.Account = Account;
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
}
