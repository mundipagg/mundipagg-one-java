package DataContracts.CreditCardTransaction;

import java.util.UUID;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import DataContracts.Address.BillingAddress;
import EnumTypes.CreditCardBrandEnum;

/**
 * Cartão de Crédito
 */
@XStreamAlias("CreditCard")
public class CreditCard {
    
    /**
     * Construtor da Classe
     */
    public CreditCard() {}
    
    /**
	 * Construtor da Classe com inicializacao das propriedades
	 */
	public CreditCard(CreditCardBrandEnum CreditCardBrand, String CreditCardNumber, String SecurityCode,
			String HolderName,
			Integer ExpMonth, Integer ExpYear) {
		this.CreditCardBrand = CreditCardBrand;
		this.CreditCardNumber = CreditCardNumber;
		this.ExpMonth = ExpMonth;
		this.ExpYear = ExpYear;
		this.HolderName = HolderName;
		this.SecurityCode = SecurityCode;
	}

	/**
	 * Endereço de cobrança
	 */
    private BillingAddress BillingAddress;
    
    /**
     * Bandeira do cartão de crédito
     */
    private CreditCardBrandEnum CreditCardBrand;
    
    /**
     * Número do cartão de crédito
     */
    private String CreditCardNumber;
    
    /**
     * Mês de expiração do cartão de crédito
     */
    private Integer ExpMonth;
    
    /**
     * Ano de expiração do cartão de crédito
     */
    private Integer ExpYear;
    
    /**
     * Titular do Cartão
     */
    private String HolderName;
    
    /**
     * Chave do cartão de crédito. Utilizado para identificar um cartão de crédito no gateway
     */
    private UUID InstantBuyKey;
    
    /**
     * Código de segurança - CVV
     */
    private String SecurityCode;
    
    /** 
     * Recupera chave do cartão de crédito. Utilizado para identificar um cartão de crédito no gateway
     * @return 
     */
    public UUID getInstantBuyKey() {
        return InstantBuyKey;
    }

    /**
     * Altera chave do cartão de crédito. Utilizado para identificar um cartão de crédito no gateway
     * @param InstantBuyKey 
     */
    public void setInstantBuyKey(UUID InstantBuyKey) {
        this.InstantBuyKey = InstantBuyKey;
    }

    /**
     * Recupera Número do cartão de crédito
     * @return 
     */
    public String getCreditCardNumber() {
        return CreditCardNumber;
    }

    /** 
     * Altera Número do cartão de crédito
     * @param CreditCardNumber 
     */
    public void setCreditCardNumber(String CreditCardNumber) {
        this.CreditCardNumber = CreditCardNumber;
    }

    /**
     * Recupera Titular do Cartão
     * @return 
     */
    public String getHolderName() {
        return HolderName;
    }

    /**
     * Altera Titular do Cartão
     * @param HolderName 
     */
    public void setHolderName(String HolderName) {
        this.HolderName = HolderName;
    }

    /**
     * Recupera Código de segurança - CVV
     * @return 
     */
    public String getSecurityCode() {
        return SecurityCode;
    }

    /**
     * Altera Código de segurança - CVV
     * @param SecurityCode 
     */
    public void setSecurityCode(String SecurityCode) {
        this.SecurityCode = SecurityCode;
    }

    /**
     * Recupera Mês de expiração do cartão de crédito
     * @return 
     */
    public Integer getExpMonth() {
        return ExpMonth;
    }

    /**
     * Altera Mês de expiração do cartão de crédito
     * @param ExpMonth 
     */
    public void setExpMonth(Integer ExpMonth) {
        this.ExpMonth = ExpMonth;
    }

    /**
     * Recupera Ano de expiração do cartão de crédito
     * @return 
     */
    public Integer getExpYear() {
        return ExpYear;
    }

    /**
     * Altera Ano de expiração do cartão de crédito
     * @param ExpYear 
     */
    public void setExpYear(Integer ExpYear) {
        this.ExpYear = ExpYear;
    }

    /**
     * Recupera bandeira do cartão de crédito
     * @return 
     */
    public CreditCardBrandEnum getCreditCardBrand() {
        return CreditCardBrand;
    }

    /**
     * Altera bandeira do cartão de crédito
     * @param CreditCardBrand 
     */
    public void setCreditCardBrand(CreditCardBrandEnum CreditCardBrand) {
        this.CreditCardBrand = CreditCardBrand;
    }

    /**
     * Recupera endereço de cobrança
     * @return 
     */
    public BillingAddress getBillingAddress() {
        return BillingAddress;
    }

    /**
     * Altera endereço de cobrança
     * @param BillingAddress 
     */
    public void setBillingAddress(BillingAddress BillingAddress) {
        this.BillingAddress = BillingAddress;
    }
}
