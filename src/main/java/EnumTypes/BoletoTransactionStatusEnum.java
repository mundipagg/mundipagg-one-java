package EnumTypes;

/**
 * Enumerador para Status de transação de Boleto
 */
public enum BoletoTransactionStatusEnum {
    
    /**
     * Gerado
     */
    Generated,
    
    /**
     * Visualizado
     */
    Viewed,
    
    /**
     * Pago com valor abaixo 
     */
    Underpaid,
    
    /**
     * Pago com valor maior
     */
    Overpaid,
    
    /**
     * Pago
     */
    Paid,
    
    /**
     * Cancelado
     */
    Voided,
    
    /**
     * Com erro
     */
    WithError;
    
    private BoletoTransactionStatusEnum() {}
}
