package DataContracts.Person;

import DataContracts.Address.BuyerAddress;
import EnumTypes.BuyerCategoryEnum;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

/**
 * Comprador
 */
public final class Buyer extends Person {
    
    /**
     * Construtor da Classe
     */
    public Buyer() {
        this.setAddressCollection(new ArrayList());
    }
    
    /**
     * Categoria do comprador
     */
    private BuyerCategoryEnum BuyerCategory;
    
    /**
     * Chave do comprador. Utilizada para identificar um comprador no gateway
     */
    private UUID BuyerKey;
    
    /**
     * Referência do comprador no sistema da loja
     */
    private String BuyerReference;

    /**
     * Lista de endereços do comprador
     */
    private ArrayList<BuyerAddress> AddressCollection;

    /**
     * Data de criação do comprador no sistema da loja
     */
    private Date CreateDateInMerchant;

    /**
     * Data da última atualização do cadastro do comprador no sistema da loja
     */
    private Date LastBuyerUpdateInMerchant;

    /**
     * Recupera Chave do comprador. Utilizada para identificar um comprador no gateway
     * @return 
     */
    public UUID getBuyerKey() {
        return BuyerKey;
    }

    /**
     * Altera Chave do comprador. Utilizada para identificar um comprador no gateway
     * @param BuyerKey 
     */
    public void setBuyerKey(UUID BuyerKey) {
        this.BuyerKey = BuyerKey;
    }

    /**
     * Recupera Referência do comprador no sistema da loja
     * @return 
     */
    public String getBuyerReference() {
        return BuyerReference;
    }

    /**
     * Altera Referência do comprador no sistema da loja
     * @param BuyerReference 
     */
    public void setBuyerReference(String BuyerReference) {
        this.BuyerReference = BuyerReference;
    }

    /**
     * Recupera coleção de endereços do comprador
     * @return 
     */
    public ArrayList<BuyerAddress> getAddressCollection() {
        return AddressCollection;
    }

    /**
     * Altera coleção de endereços do comprador
     * @param AddressCollection 
     */
    public void setAddressCollection(ArrayList<BuyerAddress> AddressCollection) {
        this.AddressCollection = AddressCollection;
    }

    /**
     * Recupera Data de criação do comprador no sistema da loja
     * @return 
     */
    public Date getCreateDateInMerchant() {
        return CreateDateInMerchant;
    }

    /**
     * Altera Data de criação do comprador no sistema da loja
     * @param CreateDateInMerchant 
     */
    public void setCreateDateInMerchant(Date CreateDateInMerchant) {
        this.CreateDateInMerchant = CreateDateInMerchant;
    }

    /**
     * Recupera Data da última atualização do cadastro do comprador no sistema da loja
     * @return 
     */
    public Date getLastBuyerUpdateInMerchant() {
        return LastBuyerUpdateInMerchant;
    }

    /**
     * Altera Data da última atualização do cadastro do comprador no sistema da loja
     * @param LastBuyerUpdateInMerchant 
     */
    public void setLastBuyerUpdateInMerchant(Date LastBuyerUpdateInMerchant) {
        this.LastBuyerUpdateInMerchant = LastBuyerUpdateInMerchant;
    }

    /**
     * Recupera categoria do comprador
     * @return 
     */
    public BuyerCategoryEnum getBuyerCategory() {
        return BuyerCategory;
    }

    /**
     * Altera categoria do comprador
     * @param BuyerCategory 
     */
    public void setBuyerCategory(BuyerCategoryEnum BuyerCategory) {
        this.BuyerCategory = BuyerCategory;
    }
}
