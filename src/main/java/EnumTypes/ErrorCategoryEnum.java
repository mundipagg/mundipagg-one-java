package EnumTypes;

/**
 * Enumerador para categoria de erro
 */
public enum ErrorCategoryEnum {
    
    /**
     * Erro de requisição
     */
    RequestError,
    
    /**
     * Erro na adquirente
     */
    ThirdPartyError,
    
    /**
     * Erro do sistema
     */
    SystemError;
    
    private ErrorCategoryEnum() {}    
}
