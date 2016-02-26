package DataContracts.ShoppingCart;

import DataContracts.Address.DeliveryAddress;
import java.util.ArrayList;
import java.util.Date;

/**
 * Carrinho de Compras
 */
public final class ShoppingCart {
    
    /**
     * Construtor da Classe
     */
    public ShoppingCart() 
    {
        this.setShoppingCartItemCollection(new ArrayList());
    }
    
    /**
     * Endereço de entrega
     */
    private DeliveryAddress DeliveryAddress;
    
    /**
     * Data limite para entrega
     */
    private Date DeliveryDeadline;
    
    /**
     * Data estimada para a entrega
     */
    private Date EstimatedDeliveryDate;

    /**
     * Preço do frete em centavos
     */
    private Integer FreightCostInCents;
    
    /**
     * Transportadora responsável pela entrega
     */
    private String ShippingCompany;

    /**
     * Itens do carrinho de compra
     */
    private ArrayList<ShoppingCartItem> ShoppingCartItemCollection;

    /**
     * Recupera preço do frete em centavos
     * @return 
     */
    public Integer getFreightCostInCents() {
        return FreightCostInCents;
    }

    /**
     * Altera preço do frete em centavos
     * @param FreightCostInCents 
     */
    public void setFreightCostInCents(Integer FreightCostInCents) {
        this.FreightCostInCents = FreightCostInCents;
    }

    /**
     * Recupera Data estimada para a entrega
     * @return 
     */
    public Date getEstimatedDeliveryDate() {
        return EstimatedDeliveryDate;
    }

    /**
     * Altera Data estimada para a entrega
     * @param EstimatedDeliveryDate 
     */
    public void setEstimatedDeliveryDate(Date EstimatedDeliveryDate) {
        this.EstimatedDeliveryDate = EstimatedDeliveryDate;
    }

    /**
     * Recupera Data limite para entrega
     * @return 
     */
    public Date getDeliveryDeadline() {
        return DeliveryDeadline;
    }

    /**
     * Altera Data limite para entrega
     * @param DeliveryDeadline 
     */
    public void setDeliveryDeadline(Date DeliveryDeadline) {
        this.DeliveryDeadline = DeliveryDeadline;
    }

    /**
     * Recupera transportadora responsável pela entrega
     * @return 
     */
    public String getShippingCompany() {
        return ShippingCompany;
    }

    /**
     * Altera transportadora responsável pela entrega
     * @param ShippingCompany 
     */
    public void setShippingCompany(String ShippingCompany) {
        this.ShippingCompany = ShippingCompany;
    }

    /**
     * Recupera endereço de entrega
     * @return 
     */
    public DeliveryAddress getDeliveryAddress() {
        return DeliveryAddress;
    }

    /**
     * Altera endereço de entrega
     * @param DeliveryAddress 
     */
    public void setDeliveryAddress(DeliveryAddress DeliveryAddress) {
        this.DeliveryAddress = DeliveryAddress;
    }

    /**
     * Recupera coleção de itens do carrinho de compra
     * @return 
     */
    public ArrayList<ShoppingCartItem> getShoppingCartItemCollection() {
        return ShoppingCartItemCollection;
    }

    /**
     * Altera coleção de itens do carrinho de compra
     * @param ShoppingCartItemCollection 
     */
    public void setShoppingCartItemCollection(ArrayList<ShoppingCartItem> ShoppingCartItemCollection) {
        this.ShoppingCartItemCollection = ShoppingCartItemCollection;
    }
}
