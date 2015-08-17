package DataContracts;

import java.util.UUID;

/**
 * Base de respostas HTTP
 */
public abstract class BaseResponse {
    
    /**
     * Construtor da Classe
     */
    protected BaseResponse() {}
    
    /**
     * Relatório de erros.
     */
    private ErrorReport ErrorReport;

    /**
     * Tempo de processamento do gateway. Não inclui tempo da adquirente.
     */
    private Long InternalTime;
    
    /**
     * Chave da loja. Utilizada para identificar a loja no gateway.
     */
    private UUID MerchantKey;

    /**
     * Chave da requisição. Utilizada para identificar uma requisição específica no gateway.
     */
    private UUID RequestKey;

    /**
     * Recupera Relatório de erros
     * @return 
     */
    public ErrorReport getErrorReport() {
        return ErrorReport;
    }

    /**
     * Altera Relatório de erros
     * @param ErrorReport 
     */
    public void setErrorReport(ErrorReport ErrorReport) {
        this.ErrorReport = ErrorReport;
    }

    /**
     * Recupera Chave da loja. Utilizada para identificar a loja no gateway.
     * @return 
     */
    public UUID getMerchantKey() {
        return MerchantKey;
    }

    /**
     * Altera Chave da loja. Utilizada para identificar a loja no gateway.
     * @param MerchantKey 
     */
    public void setMerchantKey(UUID MerchantKey) {
        this.MerchantKey = MerchantKey;
    }

    /**
     * Recupera Chave da requisição. Utilizada para identificar uma requisição específica no gateway.
     * @return 
     */
    public UUID getRequestKey() {
        return RequestKey;
    }

    /**
     * Altera Chave da requisição. Utilizada para identificar uma requisição específica no gateway.
     * @param RequestKey 
     */
    public void setRequestKey(UUID RequestKey) {
        this.RequestKey = RequestKey;
    }

    /**
     * Recupera Tempo de processamento do gateway. Não inclui tempo da adquirente.
     * @return 
     */
    public Long getInternalTime() {
        return InternalTime;
    }

    /**
     * Altera Tempo de processamento do gateway. Não inclui tempo da adquirente.
     * @param InternalTime 
     */
    public void setInternalTime(Long InternalTime) {
        this.InternalTime = InternalTime;
    }
}
