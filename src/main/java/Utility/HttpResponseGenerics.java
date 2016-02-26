package Utility;

import org.apache.http.StatusLine;

/**
 * Resposta de requisição via protocolo HTTP
 * @param <TResponse>
 * @param <TRequest>
 */
public final class HttpResponseGenerics<TResponse, TRequest> extends HttpResponse {
    
    /**
     * Resposta recebida do gateway
     */
    private TResponse Response;
    
    /**
     * Requisição enviada ao gateway
     */
    private TRequest Request;
    
    /**
     * Requisição enviada ao gateway serializada
     */
    private String RawRequest;
    
    /**
     * Construtor da Classe
     * @param RawRequest
     * @param RawResponse
     * @param HttpStatusCode
     * @param Response
     * @param Request
     */
    public HttpResponseGenerics(String RawRequest, String RawResponse, StatusLine HttpStatusCode, TResponse Response, TRequest Request) 
    {
        super(RawResponse, HttpStatusCode);
        setResponse(Response);
        setRequest(Request);
        setRawRequest(RawRequest);
    }
    
    /**
     * Recupera requisição enviada ao gateway serializada
     * @return 
     */
    public String getRawRequest() {
        return RawRequest;
    }
    
    /**
     * Altera requisição enviada ao gateway serializada
     * @param RawRequest 
     */
    protected void setRawRequest(String RawRequest) {
        this.RawRequest = RawRequest;
    }
    
    /**
     * Recupera requisição enviada ao gateway
     * @return 
     */
    public TRequest getRequest() {
        return Request;
    }
    
    /**
     * Altera requisição enviada ao gateway
     * @param Request 
     */
    protected void setRequest(TRequest Request) {
        this.Request = Request;
    }
    
    /**
     * Recupera resposta recebida do gateway
     * @return 
     */
    public TResponse getResponse() {
        return Response;
    }
    
    /**
     * Altera resposta recebida do gateway
     * @param Response 
     */
    protected void setResponse(TResponse Response) {
        this.Response = Response;
    }
}
