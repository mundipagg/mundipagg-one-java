package DataContracts.BoletoTransaction;

import EnumTypes.CurrencyIsoEnum;

/**
 * Opções de Transação de Boleto
 */
public class BoletoTransactionOptions {
    
    /**
     * Construtor da Classe
     */
    public BoletoTransactionOptions() {}
    
    /**
     * Tipo da Moeda
     */
    private CurrencyIsoEnum CurrencyIso;
    
    /**
     * Total de dias para expirar o boleto
     */
    private Integer DaysToAddInBoletoExpirationDate;

    /**
     * Recupera Total de dias para expirar o boleto
     * @return 
     */
    public Integer getDaysToAddInBoletoExpirationDate() {
        return DaysToAddInBoletoExpirationDate;
    }

    /**
     * Altera Total de dias para expirar o boleto
     * @param DaysToAddInBoletoExpirationDate 
     */
    public void setDaysToAddInBoletoExpirationDate(Integer DaysToAddInBoletoExpirationDate) {
        this.DaysToAddInBoletoExpirationDate = DaysToAddInBoletoExpirationDate;
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
