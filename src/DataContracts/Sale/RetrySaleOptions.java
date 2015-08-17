package DataContracts.Sale;

/**
 * Opções de retentativa de venda
 */
public class RetrySaleOptions {
    
    /**
     * Construtor da Classe
     */
    public RetrySaleOptions() {}
    
    /**
     * Código do limite extendido
     */
    private String ExtendedLimitCode;
    
    /**
     * Indica se o limite extendido está habilitado
     */
    private Boolean ExtendedLimitEnabled;
 
    /**
     * Recupera se o limite extendido está habilitado
     * @return 
     */
    public Boolean getExtendedLimitEnabled() {
        return ExtendedLimitEnabled;
    }

    /**
     * Altera se o limite extendido está habilitado
     * @param ExtendedLimitEnabled 
     */
    public void setExtendedLimitEnabled(Boolean ExtendedLimitEnabled) {
        this.ExtendedLimitEnabled = ExtendedLimitEnabled;
    }

    /**
     * Recupera Código do limite extendido
     * @return 
     */
    public String getExtendedLimitCode() {
        return ExtendedLimitCode;
    }

    /**
     * Altera Código do limite extendido
     * @param ExtendedLimitCode 
     */
    public void setExtendedLimitCode(String ExtendedLimitCode) {
        this.ExtendedLimitCode = ExtendedLimitCode;
    }
}

