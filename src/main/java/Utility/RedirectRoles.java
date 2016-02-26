package Utility;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.impl.client.DefaultRedirectStrategy;
import org.apache.http.protocol.HttpContext;

/**
 * Permitir redirecionamento 
 */
public class RedirectRoles extends DefaultRedirectStrategy {

    @Override
    public boolean isRedirected(HttpRequest hr, HttpResponse hr1, HttpContext hc) throws ProtocolException {
        return (hr1.getStatusLine().getStatusCode() >= 300 && hr1.getStatusLine().getStatusCode() <= 300);
    }    
}
