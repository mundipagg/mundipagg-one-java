package DataContracts.CreditCardTransaction;

import java.util.UUID;

/**
 * Pedido de cancelamento/captura da transação de cartão de crédito
 */
public class ManageCreditCardTransaction {
    
    /**
     * Construtor da Classe
     */
    public ManageCreditCardTransaction() {}
    
    /**
     * Valor da transação em centavos
     */
    private Long AmountInCents;
    
    /**
     * Chave da Transação. Utilizada para identificar uma transação de cartão de crédito no gateway
     */
    private UUID TransactionKey;
    
    /**
     * Identificador da transação no sistema da loja
     */
    private String TransactionReference;
    
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
     * Recupera identificador da transação no sistema da loja
     * @return 
     */
    public String getTransactionReference() {
        return TransactionReference;
    }

    /**
     * Altera identificador da transação no sistema da loja
     * @param TransactionReference 
     */
    public void setTransactionReference(String TransactionReference) {
        this.TransactionReference = TransactionReference;
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
}
