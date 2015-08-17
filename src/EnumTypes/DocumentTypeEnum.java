package EnumTypes;

/**
 * Enumerador para Tipo de Documento
 */
public enum DocumentTypeEnum {
    
    /**
     * Documento para Pessoa Física (CPF)
     */
    CPF,
    /**
     * Documento para Pessoa Jurídica (CNPJ)
     */
    CNPJ;
    
    private DocumentTypeEnum(){}  
}