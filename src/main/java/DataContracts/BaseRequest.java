package DataContracts;

import java.util.UUID;

/**
 * Base de requesições HTTP
 */
public abstract class BaseRequest {
    
    /**
     * Construtor da Classe
     */
    protected BaseRequest() {}
    
    /**
     * Chave da requisição. Utilizada para identificar uma requisição específica no gateway.
     */
    private UUID RequestKey;

    /**
     * Recupera chave da requisição
     * @return 
     */
    public UUID getRequestKey() {
        return RequestKey;
    }

    /**
     * Altera chave da requisição
     * @param RequestKey 
     */
    public void setRequestKey(UUID RequestKey) {
        this.RequestKey = RequestKey;
    }
}
