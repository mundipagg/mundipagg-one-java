package Utility;

import org.apache.http.StatusLine;

/** 
 * Resposta de requisição via protocolo HTTP
 * @param <TResponse>
 */
public final class HttpResponseGenericResponse<TResponse> extends HttpResponse {
    
    /**
     * Objeto que representa a resposta do gateway
     */
    private TResponse Response; 
    
    /**
     * Construtor da Classe
     * @param RawResponse
     * @param HttpStatusCode
     * @param Response
     */
    public HttpResponseGenericResponse(String RawResponse, StatusLine HttpStatusCode, TResponse Response) 
    {
        super(RawResponse,HttpStatusCode);
        setResponse(Response);
    }
    /**
     * Recupera resposta recebida pelo gateway
     * @return 
     */
    public TResponse getResponse() {
        return Response;
    }

    /**
     * Altera resposta recebida pelo gateway
     * @param Response 
     */
    protected void setResponse(TResponse Response) {
        this.Response = Response;
    }
}
