package Client;

import EnumTypes.HttpContentTypeEnum;
import EnumTypes.PlatformEnvironmentEnum;
import ResourceClients.*;
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
     * Recursos para post de notificação
     */
    private PostNotificationResource PostNotification;
    
    /**
     * Recursos para Buyer
     */
    private BuyerResource Buyer;
    
    /**
     * Recursos para relatório de transações
     */
    private TransactionReportResource TransactionReport;

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
    
    /**
     * Recupera recurso do Buyer
     * @return 
     */
    public BuyerResource getBuyer() {
        return Buyer;
    }

    /**
     * Recupera recurso de post de notificação
     * @return 
     */
    public PostNotificationResource getPostNotification() {
        return PostNotification;
    }   
    
    /**
     * Recupera recurso de relatório de transação
     * @return 
     */
    public TransactionReportResource getTransactionReport() {
        return TransactionReport;
    }   
    
    // CONSTRUTORES DA CLASSE
    
    /**
     * Cria cliente para acessar serviços do gateway da MundiPagg One
     * O Host base que será usado usado para acessar os recuros é o HostUri informado.
     * @param merchantKey
     * @param environment
     * @param hostUri 
     */
    public GatewayServiceClient(UUID merchantKey, PlatformEnvironmentEnum environment, String hostUri) {
        this.Sale = new SaleResource(merchantKey, environment, HttpContentTypeEnum.Json, hostUri);
        this.CreditCard = new CreditCardResource(merchantKey, environment, HttpContentTypeEnum.Json, hostUri);
        this.PostNotification = new PostNotificationResource();
        this.TransactionReport = new TransactionReportResource(merchantKey, environment, hostUri);
    }
    
    /**
     * Cria cliente para acessar serviços do gateway da MundiPagg One usando ambiente de Sandbox
     * @param merchantKey 
     */
    public GatewayServiceClient(UUID merchantKey) { 
        this(merchantKey, PlatformEnvironmentEnum.Sandbox, ""); 
    }
    
    /**
     * Cria cliente para acessar serviços do gateway da MundiPagg One 
     * O Host base que será usado usado para acessar os recuros é o HostUri informado.
     * @param merchantKey
     * @param hostUri 
     */
    public GatewayServiceClient(UUID merchantKey, String hostUri) { 
        this(merchantKey, PlatformEnvironmentEnum.Sandbox, hostUri);
    }

    /**
     * Cria cliente para acessar serviços do gateway da MundiPagg One
     * @param merchantKey
     * @param environment 
     */
    public GatewayServiceClient(UUID merchantKey, PlatformEnvironmentEnum environment) { 
        this(merchantKey, environment, "");
    }
}
