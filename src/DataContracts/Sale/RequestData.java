package DataContracts.Sale;

import EnumTypes.EcommerceCategoryEnum;

/**
 * Dados da requisição
 */
public class RequestData {
    
    /**
     * Construtor da Classe
     */
    public RequestData() {}
    
    /**
     * Categoria da venda e-commerce. B2B ou B2C
     */
    private EcommerceCategoryEnum EcommerceCategory;
    
    /**
     * Endereço IP do cliente da loja
     */
    private String IpAddress;
    
    /**
     * Identificador da origen do venda na loja
     */
    private String Origin;
    
    /**
     * Identificador da sessão do usuário no sistema da loja (utilizado pelo serviço de anti fraude)
     */
    private String SessionId;   

    /**
     * Recupera Identificador da origen do venda na loja
     * @return 
     */
    public String getOrigin() {
        return Origin;
    }

    /**
     * Altera Identificador da origen do venda na loja
     * @param Origin 
     */
    public void setOrigin(String Origin) {
        this.Origin = Origin;
    }

    /**
     * Recupera Identificador da sessão do usuário no sistema da loja (utilizado pelo serviço de anti fraude)
     * @return 
     */
    public String getSessionId() {
        return SessionId;
    }

    /**
     * Altera Identificador da sessão do usuário no sistema da loja (utilizado pelo serviço de anti fraude)
     * @param SessionId 
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Recupera Endereço IP do cliente da loja
     * @return 
     */
    public String getIpAddress() {
        return IpAddress;
    }

    /**
     * Altera Endereço IP do cliente da loja
     * @param IpAddress 
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Recupera Categoria da venda e-commerce. B2B ou B2C
     * @return 
     */
    public EcommerceCategoryEnum getEcommerceCategory() {
        return EcommerceCategory;
    }

    /**
     * Altera Categoria da venda e-commerce. B2B ou B2C
     * @param EcommerceCategory 
     */
    public void setEcommerceCategory(EcommerceCategoryEnum EcommerceCategory) {
        this.EcommerceCategory = EcommerceCategory;
    }    
}
