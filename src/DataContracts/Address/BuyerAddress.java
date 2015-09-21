package DataContracts.Address;

import EnumTypes.AddressTypeEnum;
import EnumTypes.CountryEnum;

/**
 * Endereço do Comprador
 */
public class BuyerAddress {
    
    /**
     * Construtor da Classe
     */
    public BuyerAddress() {}
    
    /**
     * Tipo do Endereço
     */
    private AddressTypeEnum AddressType; 

    /**
     * Cidade
     */
    private String City;
    
    /**
     * Complemento
     */
    private String Complement;
    
    /**
     * País
     */
    private CountryEnum Country;
    
    /**
     * Distrito/Bairro
     */
    private String District;
    
    /**
     * Número
     */
    private String Number;
    
    /**
     * Estado
     */
    private String State;
       
    /**
     * Logradouro
     */
    private String Street;
    
    /**
     * CEP
     */
    private String ZipCode;

    /**
     * Recupera País
     * @return 
     */
    public CountryEnum getCountry() {
        return Country;
    }

    /**
     * Altera País
     * @param Country 
     */
    public void setCountry(CountryEnum Country) {
        this.Country = Country;
    }

    /**
     * Recupera Estado
     * @return 
     */
    public String getState() {
        return State;
    }

    /**
     * Altera Estado
     * @param State 
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Recupera Cidade
     * @return 
     */
    public String getCity() {
        return City;
    }

    /**
     * Altera Cidade
     * @param City 
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Recupera Distrito
     * @return 
     */
    public String getDistrict() {
        return District;
    }

    /**
     * Altera Distrito
     * @param District 
     */
    public void setDistrict(String District) {
        this.District = District;
    }

    /**
     * Recupera Logradouro
     * @return 
     */
    public String getStreet() {
        return Street;
    }

    /**
     * Altera Logradouro
     * @param Street 
     */
    public void setStreet(String Street) {
        this.Street = Street;
    }

    /**
     * Recupera Número
     * @return 
     */
    public String getNumber() {
        return Number;
    }

    /**
     * Altera Número
     * @param Number 
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Recupera Complemento
     * @return 
     */
    public String getComplement() {
        return Complement;
    }
    
    /**
     * Altera Complemento
     * @param Complement
     */
    public void setComplement(String Complement) {
        this.Complement = Complement;
    }

    /**
     * Recupera CEP
     * @return 
     */
    public String getZipCode() {
        return ZipCode;
    }

    /**
     * Altera CEP
     * @param ZipCode 
     */
    public void setZipCode(String ZipCode) {
        this.ZipCode = ZipCode;
    }
    
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
