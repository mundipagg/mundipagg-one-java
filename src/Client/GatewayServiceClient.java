package Client;

import EnumTypes.HttpContentTypeEnum;
import EnumTypes.PlatformEnvironmentEnum;
import ResourceClients.CreditCardResource;
import ResourceClients.SaleResource;
import java.util.UUID;

/**
 * Cliente para acesso aos serviços do gateway.
 */
public class GatewayServiceClient {
    
    /**
     * Recursos para vendas
     */
    private SaleResource Sale;
    
    /**
     * Recursos para cartão de crédito
     */
    private CreditCardResource CreditCard;

    /**
     * Recupera recurso de venda
     * @return 
     */
    public SaleResource getSale() {
        return Sale;
    }

    /**
     * Recupera recurso de cartão de crédito
     * @return 
     */
    public CreditCardResource getCreditCard() {
        return CreditCard;
    }   

    // CONSTRUTORES DA CLASSE
    
    /**
     * Cria cliente para acessar serviços do gateway da MundiPagg One
     * O Host base que será usado usado para acessar os recuros é o HostUri informado.
     * @param merchantKey
     * @param environment
     * @param httpContentType
     * @param hostUri 
     */
    public GatewayServiceClient(UUID merchantKey, PlatformEnvironmentEnum environment, HttpContentTypeEnum httpContentType, String hostUri) {
        this.Sale = new SaleResource(merchantKey, environment, httpContentType, hostUri);
        this.CreditCard = new CreditCardResource(merchantKey, environment, httpContentType, hostUri);
    }
    
    /**
     * Cria cliente para acessar serviços do gateway da MundiPagg One usando ambiente de Produção e tipo de conteúdo Json
     * @param merchantKey 
     */
    public GatewayServiceClient(UUID merchantKey) { 
        this(merchantKey, PlatformEnvironmentEnum.Production, HttpContentTypeEnum.Json, ""); 
    }
    
    /**
     * Cria cliente para acessar serviços do gateway da MundiPagg One usando ambiente de Produção e tipo de conteúdo Json
     * O Host base que será usado usado para acessar os recuros é o HostUri informado.
     * @param merchantKey
     * @param hostUri 
     */
    public GatewayServiceClient(UUID merchantKey, String hostUri) { 
        this(merchantKey, PlatformEnvironmentEnum.Production, HttpContentTypeEnum.Json, hostUri);
    }

    /**
     * Cria cliente para acessar serviços do gateway da MundiPagg One usando tipo de conteúdo Json
     * @param merchantKey
     * @param environment 
     */
    public GatewayServiceClient(UUID merchantKey, PlatformEnvironmentEnum environment) { 
        this(merchantKey, environment, HttpContentTypeEnum.Json, "");
    }

    /**
     * Cria cliente para acessar serviços do gateway da MundiPagg One
     * @param merchantKey
     * @param environment
     * @param httpContentType 
     */
    public GatewayServiceClient(UUID merchantKey, PlatformEnvironmentEnum environment, HttpContentTypeEnum httpContentType) { 
        this(merchantKey, environment, httpContentType, null);
    }   
}
