package DataContracts.AntiFraud;

import EnumTypes.AntiFraudAnalysisStatusEnum;

/**
 * Resultado de Análise do Antifraude
 */
public class AntiFraudAnalysisResult {
    
    /**
     * Construtor da Classe
     */
    public AntiFraudAnalysisResult() {}
    
    /**
     * Status da análise do serviço de antifraude
     */
    private AntiFraudAnalysisStatusEnum AntiFraudAnalysisStatus;

    /**
     * Nome do serviço de antifraude
     */
    private String AntiFraudServiceName; 
    
    /**
     * Mensagem de retorno do antifraude
     */
    private String Message;
    
    /**
     * Código de retorno do antifraude
     */
    private String ReturnCode;

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
    public String getMessage() {
        return Message;
    }

    /**
     * Altera mensagem de retorno do antifraude
     * @param Message 
     */
    public void setMessage(String Message) {
        this.Message = Message;
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
}
