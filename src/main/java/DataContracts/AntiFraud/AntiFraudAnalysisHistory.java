package DataContracts.AntiFraud;

import EnumTypes.AntiFraudAnalysisStatusEnum;
import java.util.Date;

/**
 * Histórico de antifraude
 */
public class AntiFraudAnalysisHistory {
    
    /**
     * Construtor da Classe
     */
    public AntiFraudAnalysisHistory() {}
    
    /**
     * Status da análise do serviço de antifraude
     */
    private AntiFraudAnalysisStatusEnum AntiFraudAnalysisStatus;
       
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
     * Data de alteração de estatus
     */
    private Date StatusChangedDate;
    
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
        return ReturnMessage;
    }

    /**
     * Altera mensagem de retorno do antifraude
     * @param ReturnMessage 
     */
    public void setMessage(String ReturnMessage) {
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
     * Recupera data de alteração de status
     * @return 
     */
    public Date getStatusChangedDate() {
        return StatusChangedDate;
    }

    /**
     * Altera data de alteração de status
     * @param StatusChangedDate 
     */
    public void setStatusChangedDate(Date StatusChangedDate) {
        this.StatusChangedDate = StatusChangedDate;
    }
}
