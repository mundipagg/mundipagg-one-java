package EnumTypes;

/**
 * Enumerador que especifica a operação que será realizada no gerenciamento da transação.
 */
public enum ManageOperationEnum {
    
    /**
     * Autorizar
     */
    Authorize,
    
    /**
     * Captura
     */
    Capture,
    
    /**
     * Cancelamento
     */
    Cancel;
    
    private ManageOperationEnum() {}
}
