package DataContracts;

import EnumTypes.SeverityCodeEnum;

/**
 * Item de Erro 
 */
public class ErrorItem {
    
    /**
     * Construtor da classe
     */
    public ErrorItem() {}
    
    /**
     * Descrição do erro
     */
    private String Description;
    
    /**
     * Código do erro
     */    
    private Integer ErrorCode;
    
    /**
     * Campo que originou erro
     */
    private String ErrorField;
    
    /**
     * Tipifica erro (warning ou error)
     */
    private SeverityCodeEnum SeverityCode;

    /**
     * Recupera código do erro
     * @return 
     */
    public Integer getErrorCode() {
        return ErrorCode;
    }

    /**
     * Altera código do erro
     * @param ErrorCode 
     */
    public void setErrorCode(Integer ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Recupera campo que originou erro
     * @return 
     */
    public String getErrorField() {
        return ErrorField;
    }

    /**
     * Altera campo que originou erro
     * @param ErrorField 
     */
    public void setErrorField(String ErrorField) {
        this.ErrorField = ErrorField;
    }

    /**
     * Recupera descrição do erro
     * @return 
     */
    public String getDescription() {
        return Description;
    }

    /**
     * Altera descrição do erro
     * @param Description 
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Recupera tipo do erro (warning ou error)
     * @return 
     */
    public SeverityCodeEnum getSeverityCode() {
        return SeverityCode;
    }

    /**
     * Altera tipo do erro (warning ou error)
     * @param SeverityCode 
     */
    public void setSeverityCode(SeverityCodeEnum SeverityCode) {
        this.SeverityCode = SeverityCode;
    }
}
