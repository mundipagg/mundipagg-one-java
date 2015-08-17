package Utility;

import EnumTypes.HttpVerbEnum;
import org.apache.http.client.methods.HttpPost;

/**
 * Objeto para requisições HTTP
 */
public class HttpRequest extends HttpPost{
    
    /**
     * Método de chamada HTTP
     */
    private final HttpVerbEnum HttpVerb;
    
    /**
     * Construtor da Classe
     * @param Uri
     * @param HttpVerb
     */
    public HttpRequest(String Uri, HttpVerbEnum HttpVerb)
    {
        super(Uri);
        this.HttpVerb = HttpVerb;
    }
    
    /**
     * Recupera Método
     * @return 
     */
    @Override
    public String getMethod() {
        return HttpVerb.toString().toUpperCase();
    } 
}
