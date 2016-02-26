package DataContracts.BoletoTransaction;

import EnumTypes.BoletoTransactionStatusEnum;
import java.util.UUID;

/**
 * Resultado de transação de boleto
 */
public class BoletoTransactionResult {
    
    /**
     * Construtor da Classe
     */
    public BoletoTransactionResult() {}
        
    /**
     * Valor original do boleto em centavos
     */
    private Long AmountInCents;
    
    /**
     * Código de barras do boleto
     */
    private String Barcode;
    
    /**
     * Status do boleto
     */
    private BoletoTransactionStatusEnum BoletoTransactionStatus;

    /**
     * Url para visualização do boleto
     */
    private String BoletoUrl;
    
    /**
     * Número do documento
     */
    private String DocumentNumber;
    
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
     * Indica se houve sucesso na geração do boleto
     */
    private Boolean Success;

    /**
     * Recupera URL de visualização do boleto
     * @return 
     */
    public String getBoletoUrl() {
        return BoletoUrl;
    }

    /**
     * Altera URL de visualização do boleto
     * @param BoletoUrl 
     */
    public void setBoletoUrl(String BoletoUrl) {
        this.BoletoUrl = BoletoUrl;
    }

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
     * Recupera Status do boleto
     * @return 
     */
    public BoletoTransactionStatusEnum getBoletoTransactionStatus() {
        return BoletoTransactionStatus;
    }

    /**
     * Altera Status do boleto
     * @param BoletoTransactionStatus 
     */
    public void setBoletoTransactionStatus(BoletoTransactionStatusEnum BoletoTransactionStatus) {
        this.BoletoTransactionStatus = BoletoTransactionStatus;
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
     * Recupera numero do documento
     * @return 
     */
    public String getDocumentNumber() {
        return DocumentNumber;
    }

    /**
     * Altera numero do documento
     * @param DocumentNumber 
     */
    public void setDocumentNumber(String DocumentNumber) {
        this.DocumentNumber = DocumentNumber;
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
     * Recupera se houve sucesso na geração do boleto
     * @return 
     */
    public Boolean getSuccess() {
        return Success;
    }

    /**
     * Altera se houve sucesso na geração do boleto
     * @param Success 
     */
    public void setSuccess(Boolean Success) {
        this.Success = Success;
    }
}
