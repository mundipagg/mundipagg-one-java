package DataContracts;

import EnumTypes.CurrencyIsoEnum;

/**
 * Opções de venda 
 */
public class SaleOptions {
    
    /**
     * Construtor da classe.
     */
    public SaleOptions() {}
    
    /**
     * Define qual serviço de anti fraude será utilizado - Se for nulo ou zero o sistema utilizará as configurações da loja.
     */
    private Integer AntiFraudServiceCode;
    
    /**
     * Tipo da Moeda.
     */
    private CurrencyIsoEnum CurrencyIso; 
    
    /**
     * Habilita ou desabilita o serviço de anti fraude - Se for nulo o sistema utilizará as configurações da loja.
     */
    private Boolean IsAntiFraudEnabled;

    /**
     * Define a quantidade de retentativas automáticas que deverão ser feitas - Se for nulo o sistema utilizará as configurações da loja.
     */
    private Integer Retries;

    /**
     * Recupera se o serviço de anti fraude é habilitado
     * @return 
     */
    public Boolean getIsAntiFraudEnabled() {
        return IsAntiFraudEnabled;
    }

    /**
     * Altera se o serviço de anti fraude é habilitado
     * @param IsAntiFraudEnabled 
     */
    public void setIsAntiFraudEnabled(Boolean IsAntiFraudEnabled) {
        this.IsAntiFraudEnabled = IsAntiFraudEnabled;
    }

    /**
     * Recupera qual serviço de anti fraude será utilizado 
     * @return 
     */
    public Integer getAntiFraudServiceCode() {
        return AntiFraudServiceCode;
    }

    /**
     * Altera qual serviço de anti fraude será utilizado 
     * @param AntiFraudServiceCode 
     */
    public void setAntiFraudServiceCode(Integer AntiFraudServiceCode) {
        this.AntiFraudServiceCode = AntiFraudServiceCode;
    }

    /**
     * Recupera quantidade de retentativas automaticas
     * @return 
     */
    public Integer getRetries() {
        return Retries;
    }

    /**
     * Altera quantidade de retentativas automaticas
     * @param Retries 
     */
    public void setRetries(Integer Retries) {
        this.Retries = Retries;
    }

    /**
     * Recupera tipo da moeda
     * @return 
     */
    public CurrencyIsoEnum getCurrencyIso() {
        return CurrencyIso;
    }
    
    /**
     * Altera tipo da moeda
     * @param CurrencyIso 
     */
    public void setCurrencyIso(CurrencyIsoEnum CurrencyIso) {
        this.CurrencyIso = CurrencyIso;
    }
}
