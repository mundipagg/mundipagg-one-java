package ResourceClients;

import EnumTypes.HttpContentTypeEnum;
import EnumTypes.PlatformEnvironmentEnum;
import Utility.HttpUtility;
import java.util.UUID;

/**
 * Classe básica para recursos
 */
public abstract class BaseResource {
    
    /**
     * Relatório de erros.
     */
    private String ResourceName;
    
    /**
     * Chave da Loja. Utilizada para identificar a loja no gateway.
     */
    private UUID MerchantKey;
    
    /**
     * Tipo de ambiente
     */
    private PlatformEnvironmentEnum PlatformEnvironment;
    
    /**
     * Tipo do conteudo http
     */
    private HttpContentTypeEnum HttpContentType;
    
    /**
     * Url do host
     */
    private String HostUri;
    
    /**
     * utilitário de requisições Http
     */
    private HttpUtility HttpUtility;
    
    /**
     * Constutor da Classe
     * @param merchantKey
     * @param platformEnvironment
     * @param httpContentType
     * @param resourceName 
     */
    protected BaseResource(UUID merchantKey, PlatformEnvironmentEnum platformEnvironment, HttpContentTypeEnum httpContentType, String resourceName)
    {
        this(merchantKey, platformEnvironment, httpContentType, resourceName, null);
    }
    
    /**
     * Cosntrutor da Classe
     * @param merchantKey
     * @param platformEnvironment
     * @param httpContentType
     * @param resourceName
     * @param hostUri 
     */
    protected BaseResource(UUID merchantKey, PlatformEnvironmentEnum platformEnvironment, HttpContentTypeEnum httpContentType, String resourceName, String hostUri)
    {
        this.HttpUtility = new HttpUtility();
        this.MerchantKey = merchantKey;
        this.PlatformEnvironment = platformEnvironment;
        this.HttpContentType = httpContentType;
        this.HostUri = (hostUri == null || hostUri.trim().length() == 0) ? this.GetServiceUri(platformEnvironment) : hostUri;
        this.ResourceName = resourceName;
    }

    /**
     * Recupera URL de acordo com o ambiente
     * @param platformEnvironment
     * @return 
     */
    private String GetServiceUri(PlatformEnvironmentEnum platformEnvironment) {
        switch (platformEnvironment) {
            case Production:
                return "https://transactionv2.mundipaggone.com";
            case Sandbox:
                return "https://stagingv2.mundipaggone.com";
            default:
                return null;
        }
    }

    /**
     * Retorna nome do recurso
     * @return 
     */
    public String getResourceName() {
        return ResourceName;
    }

    /**
     * Retorna chave da loja
     * @return 
     */
    public UUID getMerchantKey() {
        return MerchantKey;
    }

    /**
     * Altera chave da loja
     * @param MerchantKey 
     */
    public void setMerchantKey(UUID MerchantKey) {
        this.MerchantKey = MerchantKey;
    }
    
    /**
     * Retorna o ambiente de operação
     * @return 
     */
    public PlatformEnvironmentEnum getPlatformEnvironment() {
        return PlatformEnvironment;
    }

    /**
     * Altera ambiente de operação
     * @param PlatformEnvironment 
     */
    public void setPlatformEnvironment(PlatformEnvironmentEnum PlatformEnvironment) {
        this.PlatformEnvironment = PlatformEnvironment;
    }    

    /**
     * Recupera formato do conteúdo da requisição/resposta
     * @return 
     */
    protected HttpContentTypeEnum getHttpContentType() {
        return HttpContentType;
    }

    /**
     * Recupera utilitário de requisição http
     * @return 
     */
    protected HttpUtility getHttpUtility() {
        return HttpUtility;
    }    
    
    /**
     * Recupera url do host
     * @return 
     */
    protected String getHostUri() {
        return HostUri;
    }    
}
