package DataContracts.AntiFraud;

import EnumTypes.AntiFraudAnalysisStatusEnum;
import java.util.ArrayList;
import java.util.List;

/**
 * Análise de Antifraude
 */
public final class AntiFraudAnalysis {
    
    /**
     * Construtor da Classe
     */
    public AntiFraudAnalysis() 
    {
        this.setHistoryCollection(new ArrayList());
    }
    
    /**
     * Status da análise do serviço de antifraude
     */
    private AntiFraudAnalysisStatusEnum AntiFraudAnalysisStatus;
    
    /**
     * Código do serviço de antifraude
     */
    private String AntiFraudServiceCode;
    
    /**
     * Nome do serviço de antifraude
     */
    private String AntiFraudServiceName;
    
    /**
     * Coleção de histórico de análise antifraude
     */
    private List<AntiFraudAnalysisHistory> HistoryCollection;
    
    /**
     * Indica se o serviço de antifraude está habilitado
     */
    private Boolean IsAntiFraudEnabled;
    
    /**
     * Código de retorno do antifraude
     */
    private String ReturnCode;
    
    /**
     * Mensagem de retorno do antifraude
     */
    private String ReturnMessage;
    
    /**
     * Status de retorno do antifraude
     */
    private String ReturnStatus;

    /**
     * Pontuação do pedido
     */
    private Double Score;
    
    /**
     * Recupera status da análise do serviço de antifraude.
     * @return 
     */
    public AntiFraudAnalysisStatusEnum getAntiFraudAnalysisStatus() {
        return AntiFraudAnalysisStatus;
    }

    /**
     * Altera status da análise do serviço de antifraude
     * @param AntiFraudAnalysisStatus 
     */
    public void setAntiFraudAnalysisStatus(AntiFraudAnalysisStatusEnum AntiFraudAnalysisStatus) {
        this.AntiFraudAnalysisStatus = AntiFraudAnalysisStatus;
    }

    /**
     * Recupera código de retorno do antifraude
     * @return 
     */
    public String getReturnCode() {
        return ReturnCode;
    }

    /**
     * Altera código de retorno do antifraude
     * @param ReturnCode 
     */
    public void setReturnCode(String ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    /**
     * Recupera status de retorno do antifraude
     * @return 
     */
    public String getReturnStatus() {
        return ReturnStatus;
    }

    /**
     * Altera status de retorno do antifraude
     * @param ReturnStatus 
     */
    public void setReturnStatus(String ReturnStatus) {
        this.ReturnStatus = ReturnStatus;
    }

    /**
     * Recupera mensagem de retorno do antifraude
     * @return 
     */
    public String getReturnMessage() {
        return ReturnMessage;
    }

    /**
     * Altera mensagem de retorno do antifraude
     * @param ReturnMessage 
     */
    public void setReturnMessage(String ReturnMessage) {
        this.ReturnMessage = ReturnMessage;
    }

    /**
     * Recupera pontuação do pedido
     * @return 
     */
    public Double getScore() {
        return Score;
    }

    /**
     * Altera pontuação do pedido
     * @param Score 
     */
    public void setScore(Double Score) {
        this.Score = Score;
    }

    /**
     * Recupera nome do serviço de antifraude
     * @return 
     */
    public String getAntiFraudServiceName() {
        return AntiFraudServiceName;
    }

    /**
     * Altera nome do serviço de antifraude
     * @param AntiFraudServiceName 
     */
    public void setAntiFraudServiceName(String AntiFraudServiceName) {
        this.AntiFraudServiceName = AntiFraudServiceName;
    }

    /**
     * Recupera se o serviço de antifraude está habilitado
     * @return 
     */
    public Boolean getIsAntiFraudEnabled() {
        return IsAntiFraudEnabled;
    }

    /**
     * Altera se o serviço de antifraude está habilitado
     * @param IsAntiFraudEnabled 
     */
    public void setIsAntiFraudEnabled(Boolean IsAntiFraudEnabled) {
        this.IsAntiFraudEnabled = IsAntiFraudEnabled;
    }

    /**
     * Recupera código do serviço de antifraude
     * @return 
     */
    public String getAntiFraudServiceCode() {
        return AntiFraudServiceCode;
    }

    /**
     * Altera código do serviço de antifraude
     * @param AntiFraudServiceCode 
     */
    public void setAntiFraudServiceCode(String AntiFraudServiceCode) {
        this.AntiFraudServiceCode = AntiFraudServiceCode;
    }

    /**
     * Recupera coleção de histórico de análise de antifraude
     * @return 
     */
    public List<AntiFraudAnalysisHistory> getHistoryCollection() {
        return HistoryCollection;
    }

    /**
     * Altera coleção de histórico de análise de antifraude
     * @param HistoryCollection 
     */
    public void setHistoryCollection(List<AntiFraudAnalysisHistory> HistoryCollection) {
        this.HistoryCollection = HistoryCollection;
    }
}
