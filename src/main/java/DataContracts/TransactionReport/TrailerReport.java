package DataContracts.TransactionReport;

/**
 * Cabeçalho do relatório
 */
public class TrailerReport {
   
    /**
     * Construtor da Classe
     */
    public TrailerReport() {}
    
    /**
     * Total de pedidos
     */
    private Long OrderDataCount;
    
    /**
     * Total de transações de boleto
     */
    private Long BoletoTransactionDataCount;
    
    /**
     * Total de transações de debito online
     */
    private Long OnlineDebitTransactionDataCount;
    
    /**
     * Total de transações de cartão de crédito
     */
    private Long CreditCardTransactionDataCount;

    /**
     * Recupera total de pedidos
     * @return 
     */
    public Long getOrderDataCount() {
        return OrderDataCount;
    }

    /**
     * Altera total de pedidos
     * @param OrderDataCount 
     */
    public void setOrderDataCount(Long OrderDataCount) {
        this.OrderDataCount = OrderDataCount;
    }

    /**
     * Recupera total de transações de boleto
     * @return 
     */
    public Long getBoletoTransactionDataCount() {
        return BoletoTransactionDataCount;
    }

    /**
     * Altera total de transações de boleto
     * @param BoletoTransactionDataCount 
     */
    public void setBoletoTransactionDataCount(Long BoletoTransactionDataCount) {
        this.BoletoTransactionDataCount = BoletoTransactionDataCount;
    }

    /**
     * Recupera total de transações de débito online
     * @return 
     */
    public Long getOnlineDebitTransactionDataCount() {
        return OnlineDebitTransactionDataCount;
    }

    /**
     * Altera total de transações de débito online
     * @param OnlineDebitTransactionDataCount
     */
    public void setOnlineDebitTransactionDataCount(Long OnlineDebitTransactionDataCount) {
        this.OnlineDebitTransactionDataCount = OnlineDebitTransactionDataCount;
    }

    /**
     * Recupera total de transações de cartão de crédito
     * @return 
     */
    public Long getCreditCardTransactionDataCount() {
        return CreditCardTransactionDataCount;
    }

    /**
     * Altera total de transações de cartão de crédito
     * @param CreditCardTransactionDataCount 
     */
    public void setCreditCardTransactionDataCount(Long CreditCardTransactionDataCount) {
        this.CreditCardTransactionDataCount = CreditCardTransactionDataCount;
    }
}
