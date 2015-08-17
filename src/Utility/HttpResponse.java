package Utility;

import org.apache.http.StatusLine;

/**
 * Resposta de requisição via protocolo HTTP
 */
public class HttpResponse {
        
    /**
     * Mensagem recebida do gateway (XML ou JSON)
     */
    private String RawResponse;
    
    /**
     * Código de Status HTTP retornado pelo gateway
     */
    private StatusLine HttpStatusCode;
        
    /**
     * Construtor da Classe
     * @param RawResponse
     * @param HttpStatusCode
     */
    public HttpResponse(String RawResponse, StatusLine HttpStatusCode) 
    {
        setRawResponse(RawResponse);
        setHttpStatusCode(HttpStatusCode);
    }
    
    /**
     * Recupera mensagem recebida do gateway (XML ou JSON)
     * @return 
     */
    public String getRawResponse() {
        return RawResponse;
    }

    /**
     * Altera mensagem recebida do gateway (XML ou JSON)
     * @param RawResponse 
     */
    protected final void setRawResponse(String RawResponse) {
        this.RawResponse = RawResponse;
    }
    
    /**
     * Recupera código de Status HTTP retornado pelo gateway
     * @return 
     */
    public StatusLine getHttpStatusCode() {
        return HttpStatusCode;
    }

    /**
     * Altera código de Status HTTP retornado pelo gateway
     * @param HttpStatusCode 
     */
    protected final void setHttpStatusCode(StatusLine HttpStatusCode) {
        this.HttpStatusCode = HttpStatusCode;
    }
}
