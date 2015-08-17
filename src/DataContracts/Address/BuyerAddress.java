package DataContracts.Address;

import EnumTypes.AddressTypeEnum;

/**
 * Endereço do Comprador
 */
public class BuyerAddress extends BaseAddress {
    
    /**
     * Construtor da Classe
     */
    public BuyerAddress() {}
    
    /**
     * Tipo do Endereço
     */
    private AddressTypeEnum AddressType; 

    /**
     * Recupera Tipo do Endereço
     * @return 
     */
    public AddressTypeEnum getAddressType() {
        return AddressType;
    }

    /**
     * Altera Tipo do Endereço
     * @param AddressType 
     */
    public void setAddressType(AddressTypeEnum AddressType) {
        this.AddressType = AddressType;
    }   
}
