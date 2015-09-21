package DataContracts.CreditCardTransaction;

import java.util.UUID;

/**
 * Transação de cartão de crédito a ser retentada
 */
public class RetrySaleCreditCardTransaction {
    
    /**
     * Construtor da Classe
     */
    public RetrySaleCreditCardTransaction() {}
    
    /**
     * Código de segurança do cartão - CVV
     */
    private String SecurityCode;
    
    /**
     * Chave da transação. Utilizada para identificar uma transação de cartão de crédito no gateway
     */
    private UUID TransactionKey;
    
    /**
     * Recupera chave da transação. Utilizada para identificar uma transação de cartão de crédito no gateway
     * @return 
     */
    public UUID getTransactionKey() {
        return TransactionKey;
    }

    /**
     * Altera chave da transação. Utilizada para identificar uma transação de cartão de crédito no gateway
     * @param TransactionKey 
     */
    public void setTransactionKey(UUID TransactionKey) {
        this.TransactionKey = TransactionKey;
    }

    /**
     * Recupera Código de segurança do cartão - CVV
     * @return 
     */
    public String getSecurityCode() {
        return SecurityCode;
    }

    /**
     * Altera Código de segurança do cartão - CVV
     * @param SecurityCode 
     */
    public void setSecurityCode(String SecurityCode) {
        this.SecurityCode = SecurityCode;
    }
}
