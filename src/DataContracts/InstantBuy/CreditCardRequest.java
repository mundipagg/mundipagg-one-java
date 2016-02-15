/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataContracts.InstantBuy;

import DataContracts.Address.BillingAddress;
import EnumTypes.CreditCardBrandEnum;

/**
 *
 * @author Munir
 */
public class CreditCardRequest {
    /**
     * Objeto de endereço de cobrança
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
     * Mês de expiração
     */
    private Integer ExpMonth;
    
    /**
     * Ano de expiração do cartão
     */
    private Integer ExpYear;
    
    /**
     * Nome no Cartão
     */
    private String HolderName;
    
    /**
     * Autorização de 1 dólar habilitado
     */
    private Boolean IsOneDollarAuthEnabled;
    
    /**
     * Código de segurança no cartão
     */
    private String SecurityCode;

    /**
     * Retorna a bandeira do cartão
     * @return 
     */
    public CreditCardBrandEnum getCreditCardBrand() {
        return CreditCardBrand;
    }

    /**
     * Define a bandeira do cartão
     * @param CreditCardBrand 
     */
    public void setCreditCardBrand(CreditCardBrandEnum CreditCardBrand) {
        this.CreditCardBrand = CreditCardBrand;
    }

    /**
     * Retorna o número do cartão
     * @return 
     */
    public String getCreditCardNumber() {
        return CreditCardNumber;
    }

    /**
     * Define o número do cartão
     * @param CreditCardNumber 
     */
    public void setCreditCardNumber(String CreditCardNumber) {
        this.CreditCardNumber = CreditCardNumber;
    }

    /**
     * Retorna o mês de expiração do cartão
     * @return 
     */
    public Integer getExpMonth() {
        return ExpMonth;
    }

    /**
     * Define o mês de expiração do cartão
     * @param ExpMonth 
     */
    public void setExpMonth(Integer ExpMonth) {
        this.ExpMonth = ExpMonth;
    }

    /**
     * Retorna o ano de expiração do cartão
     * @return 
     */
    public Integer getExpYear() {
        return ExpYear;
    }

    /**
     * Define o ano de expiração do cartão
     * @param ExpYear 
     */
    public void setExpYear(Integer ExpYear) {
        this.ExpYear = ExpYear;
    }

    /**
     * Retorna o nome no cartão
     * @return 
     */
    public String getHolderName() {
        return HolderName;
    }

    /**
     * Define o nome no cartão
     * @param HolderName 
     */
    public void setHolderName(String HolderName) {
        this.HolderName = HolderName;
    }

    /**
     * Retorna se OneDollarAuth está habilitado
     * @return 
     */
    public Boolean getIsOneDollarAuthEnabled() {
        return IsOneDollarAuthEnabled;
    }

    /**
     * Define se OneDollarAuth está habilitado
     * @param IsOneDollarAuthEnabled 
     */
    public void setIsOneDollarAuthEnabled(Boolean IsOneDollarAuthEnabled) {
        this.IsOneDollarAuthEnabled = IsOneDollarAuthEnabled;
    }

    /**
     * Retorna o código de segurança do cartão
     * @return 
     */
    public String getSecurityCode() {
        return SecurityCode;
    }

    /**
     * Define o código de segurança do cartão
     * @param SecurityCode 
     */
    public void setSecurityCode(String SecurityCode) {
        this.SecurityCode = SecurityCode;
    }

    /**
     * Retorna Endereço de cobrança
     * @return 
     */
    public BillingAddress getBillingAddress() {
        return BillingAddress;
    }

    /**
     * Define endereço de cobrança
     * @param BillingAddress 
     */
    public void setBillingAddress(BillingAddress BillingAddress) {
        this.BillingAddress = BillingAddress;
    }
}
