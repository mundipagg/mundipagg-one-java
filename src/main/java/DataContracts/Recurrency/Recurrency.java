package DataContracts.Recurrency;

import EnumTypes.FrequencyEnum;
import java.util.Date;

/**
 * Solicitação de recorrência
 */
public class Recurrency {
 
    /**
     * Construtor da Classe
     */
    public Recurrency() {}
    
    /**
     * Data da primeira cobrança
     */
    private Date DateToStartBilling;
    
    /**
     * Frequencia da recorrencia
     */
    private FrequencyEnum Frequency;
    
    /**
     * Intervalo de recorrencia
     */
    private Integer Interval;
    
    /**
     * Informa se será necessário efetuar o procedimento OneDollarAuth antes de registrar a recorrência
     */
    private Boolean OneDollarAuth;
    
    /**
     * Total de recorrencias
     */
    private Integer Recurrences;
    
    /**
     * Recupera Frequencia da recorrencia
     * @return 
     */
    public FrequencyEnum getFrequency() {
        return Frequency;
    }

    /**
     * Altera Frequencia da recorrencia
     * @param Frequency 
     */
    public void setFrequency(FrequencyEnum Frequency) {
        this.Frequency = Frequency;
    }

    /**
     * Recupera Intervalo de recorrencia
     * @return 
     */
    public Integer getInterval() {
        return Interval;
    }

    /**
     * Altera Intervalo de recorrencia
     * @param Interval 
     */
    public void setInterval(Integer Interval) {
        this.Interval = Interval;
    }

    /**
     * Recupera Data da primeira cobrança
     * @return 
     */
    public Date getDateToStartBilling() {
        return DateToStartBilling;
    }

    /**
     * Altera Data da primeira cobrança
     * @param DateToStartBilling 
     */
    public void setDateToStartBilling(Date DateToStartBilling) {
        this.DateToStartBilling = DateToStartBilling;
    }

    /**
     * Recupera Total de recorrencias
     * @return 
     */
    public Integer getRecurrences() {
        return Recurrences;
    }

    /**
     * Altera Total de recorrencias
     * @param Recurrences 
     */
    public void setRecurrences(Integer Recurrences) {
        this.Recurrences = Recurrences;
    }

    /**
     * Recupera se será necessário efetuar o procedimento OneDollarAuth antes de registrar a recorrência
     * @return 
     */
    public Boolean getOneDollarAuth() {
        return OneDollarAuth;
    }

    /**
     * Altera se será necessário efetuar o procedimento OneDollarAuth antes de registrar a recorrência
     * @param OneDollarAuth 
     */
    public void setOneDollarAuth(Boolean OneDollarAuth) {
        this.OneDollarAuth = OneDollarAuth;
    }    
}
