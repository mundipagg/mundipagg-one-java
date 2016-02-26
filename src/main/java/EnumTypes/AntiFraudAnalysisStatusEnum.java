package EnumTypes;

/**
 * Enumerador para Status da análise do Antifraude
 */
public enum AntiFraudAnalysisStatusEnum {
    
    /**
     * Pendente de análise de antifraude
     */
    PendingFraudAnalysisRequirement,

    /**
     * Pedido enviado para análise de antifraude
     */
    FraudAnalysisRequirementSent,
     
    /**
     * Aprovado
     */
    Approved, 

    /**
     * Reprovado
     */
    Reproved,

    /**
     * Pendente de análise manual
     */
    PendingManualAnalysis,

    /**
     * Sem transação para análise
     */
    NoTransactionToAnalyse,

    /**
     * Erro na análise de antifraude
     */
    FraudAnalysisWithError;
    
    private AntiFraudAnalysisStatusEnum() {}
}
