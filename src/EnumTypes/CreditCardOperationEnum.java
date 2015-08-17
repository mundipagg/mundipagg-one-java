package EnumTypes;

/**
 * Enumerador para Operações de Ccartão de Crédito
 */
public enum CreditCardOperationEnum {
    
    /**
     * Somente autorizar
     */
    AuthOnly,
    
    /**
     * Autorizar e capturar
     */
    AuthAndCapture,
    
    /**
     * Autorizar e capturar com atraso
     */
    AuthAndCaptureWithDelay;
    
    private CreditCardOperationEnum() {}
}
