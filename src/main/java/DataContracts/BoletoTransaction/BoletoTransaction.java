package DataContracts.BoletoTransaction;

import DataContracts.Address.BillingAddress;
import java.util.Date;

/**
 * Transação de Boleto
 */
public class BoletoTransaction {
    
    /**
     * Construtor da Classe
     */
    public BoletoTransaction() {}
    
    /**
     * Valor do boleto em centavos
     */
    private Long AmountInCents;

    /**
     * Número do banco
     */
    private String BankNumber;

    /**
     * Endereço de cobrança
     */
    private BillingAddress BillingAddress;
    
    /**
     * Número do documento
     */
    private String DocumentNumber;
    
    /**
     * Instruções a serem impressas no boleto
     */
    private String Instructions;   

    /**
     * Opções da transação de boleto.
     */
    private BoletoTransactionOptions Options;
    
    /**
     * Data da criação da transação no sistema da loja
     */
    private Date TransactionDateInMerchant;
    
    /**
     * Identificador da transação no sistema da loja
     */
    private String TransactionReference;

    /**
     * Recupera Valor do boleto em centavos
     * @return 
     */
    public Long getAmountInCents() {
        return AmountInCents;
    }

    /**
     * Altera Valor do boleto em centavos
     * @param AmountInCents 
     */
    public void setAmountInCents(Long AmountInCents) {
        this.AmountInCents = AmountInCents;
    }

    /**
     * Recupera numero do banco
     * @return 
     */
    public String getBankNumber() {
        return BankNumber;
    }

    /**
     * Altera número do banco
     * @param BankNumber 
     */
    public void setBankNumber(String BankNumber) {
        this.BankNumber = BankNumber;
    }

    /**
     * Recupera instruções a serem impressas no boleto
     * @return 
     */
    public String getInstructions() {
        return Instructions;
    }

    /**
     * Altera instruções a serem impressas no boleto
     * @param Instructions 
     */
    public void setInstructions(String Instructions) {
        this.Instructions = Instructions;
    }

    /**
     * Recupera número do documento
     * @return 
     */
    public String getDocumentNumber() {
        return DocumentNumber;
    }

    /**
     * Altera número do documento
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
     * Recupera endereço de cobrança
     * @return 
     */
    public BillingAddress getBillingAddress() {
        return BillingAddress;
    }

    /**
     * Altera endereço de cobrança
     * @param BillingAddress 
     */
    public void setBillingAddress(BillingAddress BillingAddress) {
        this.BillingAddress = BillingAddress;
    }

    /**
     * Recupera Data da criação da transação no sistema da loja
     * @return 
     */
    public Date getTransactionDateInMerchant() {
        return TransactionDateInMerchant;
    }

    /**
     * Altera Data da criação da transação no sistema da loja
     * @param TransactionDateInMerchant 
     */
    public void setTransactionDateInMerchant(Date TransactionDateInMerchant) {
        this.TransactionDateInMerchant = TransactionDateInMerchant;
    }

    /**
     * Recupera opções de transação de boleto
     * @return 
     */
    public BoletoTransactionOptions getOptions() {
        return Options;
    }

    /**
     * Altera opções de transação de boleto
     * @param Options 
     */
    public void setOptions(BoletoTransactionOptions Options) {
        this.Options = Options;
    }
}
