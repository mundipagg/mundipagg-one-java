package DataContracts.CreditCardTransaction;

import DataContracts.Order.OrderReport;
import EnumTypes.CreditCardBrandEnum;
import EnumTypes.CreditCardTransactionStatusEnum;
import java.util.Date;
import java.util.UUID;

/**
 * Dados de relatório de transação de cartão de crédito
 */
public class CreditCardTransactionReport {
    
    /**
     * Construtor da classe
     */
    public CreditCardTransactionReport() {
             this.Order = new OrderReport();
    }
    
    /**
     * Pedido
     */
    private OrderReport Order;
    
    /**
     * Código de autorização retornado pela adquirente
     */
    private String AcquirerAuthorizationReturnCode;
    
    /**
     * Nome da adquirente que processou a transação
     */
    private String AcquirerName;
        
    /**
     * Valor original da transação em centavos
     */
    private Long AmountInCents;
    
    /**
     * Bandeira do cartão de crédito
     */
    private CreditCardBrandEnum CreditCardBrand;
    
    /**
     * Número do cartão de crédito
     */
    private String CreditCardNumber;
    
    /**
     * Total de parcelas da transação
     */
    private Integer InstallmentCount;
    
    /**
     * Valor autorizado em centavos
     */
    private Long AuthorizedAmountInCents;
    
    /**
     * Valor capturado em centavos
     */
    private Long CapturedAmountInCents;
    
        /**
     * Valor cancelado em centavos
     */
    private Long VoidedAmountInCents;
    
    /**
     * Valor estornado em centavos
     */
    private Long RefundedAmountInCents;
    
    /**
     * Iata - Valor em centavos
     */
    private Long IataAmountInCents;

    /**
     * Status da transação de cartão de crédito
     */
    private CreditCardTransactionStatusEnum Status;

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
     * Código de autorização
     */
    private String AuthorizationCode;   
    
    /**
     * Identificador único retornado pela adquirente
     */
    private String UniqueSequentialNumber; 
    
    /**
     * Chave da transação na adquirente, enviada pelo gateway
     */
    private String TransactionKeyToAcquirer;   
    
    /**
     * Data da autorização
     */
    private Date AuthorizedDate;
    
    /**
     * Data da ultima sonda
     */
    private Date LastProbeDate;
    
    /**
     * Data da captura
     */
    private Date CapturedDate;
    
    /**
     * Data de cancelamento
     */
    private Date VoidedDate;   

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
     * Recupera dados do número do cartão de crédito
     * @return 
     */
    public String getCreditCardNumber() {
        return CreditCardNumber;
    }

    /**
     * Altera dados do número do cartão de crédito
     * @param CreditCardNumber 
     */
    public void setCreditCardNumber(String CreditCardNumber) {
        this.CreditCardNumber = CreditCardNumber;
    }

    /**
     * Recupera status da transação de cartão de crédito
     * @return 
     */
    public CreditCardTransactionStatusEnum getStatus() {
        return Status;
    }

    /**
     * Altera status da transação de cartão de crédito
     * @param Status 
     */
    public void setStatus(CreditCardTransactionStatusEnum Status) {
        this.Status = Status;
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
    public String getAcquirerAuthorizationReturnCode() {
        return AcquirerAuthorizationReturnCode;
    }

    /**
     * Altera codigo de autorização na adquirente
     * @param AcquirerAuthorizationReturnCode 
     */
    public void setAcquirerAuthorizationReturnCode(String AcquirerAuthorizationReturnCode) {
        this.AcquirerAuthorizationReturnCode = AcquirerAuthorizationReturnCode;
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
     * Recupera data da captura
     * @return 
     */
    public Date getCapturedDate() {
        return CapturedDate;
    }

    /**
     * Altera data de captura
     * @param CapturedDate
     */
    public void setCapturedDate(Date CapturedDate) {
        this.CapturedDate = CapturedDate;
    }
    
    /**
     * Recupera data de cancelamento
     * @return 
     */
    public Date getVoidedDate() {
        return VoidedDate;
    }

    /**
     * Altera data de cancelamento
     * @param VoidedDate
     */
    public void setVoidedDate(Date VoidedDate) {
        this.VoidedDate = VoidedDate;
    }
    
    /**
     * Recupera data da autorização
     * @return 
     */
    public Date getAuthorizedDate() {
        return AuthorizedDate;
    }

    /**
     * Altera data da autorização
     * @param AuthorizedDate 
     */
    public void setAuthorizedDate(Date AuthorizedDate) {
        this.AuthorizedDate = AuthorizedDate;
    }
    
    /**
     * Recupera data da ultima sonda
     * @return 
     */
    public Date getLastProbeDate() {
        return LastProbeDate;
    }

    /**
     * Altera data da ultima sonda
     * @param LastProbeDate 
     */
    public void setLastProbeDate(Date LastProbeDate) {
        this.LastProbeDate = LastProbeDate;
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
     * Recupera Iata - Valor em centavos
     * @return 
     */
    public Long getIataAmountInCents() {
        return IataAmountInCents;
    }

    /**
     * Altera Iata - Valor em centavos
     * @param IataAmountInCents 
     */
    public void setIataAmountInCents(Long IataAmountInCents) {
        this.IataAmountInCents = IataAmountInCents;
    }   
}
