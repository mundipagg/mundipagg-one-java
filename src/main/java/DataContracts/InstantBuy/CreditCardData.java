package DataContracts.InstantBuy;

import EnumTypes.CreditCardBrandEnum;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.util.UUID;

/**
 * Dados do cartão de crédito
 */
@XStreamAlias("CreditCard")
public class CreditCardData {
    
    /**
     * Construtor da Classe
     */
    public CreditCardData() {}
    
    /**
     * Bandeira do cartão de crédito
     */
    private CreditCardBrandEnum CreditCardBrand;
    
    /**
     * Chave do cartão de crédito. Utilizada para identificar um cartão de crédito no gateway
     */
    private UUID InstantBuyKey;
    
    /**
     * Informa se o cartão de crédito expirou
     */
    private Boolean IsExpiredCreditCard;
    
    /**
     * Número mascardo do cartão de crédito
     */
    private String MaskedCreditCardNumber;
    
    /**
     * Recupera Número mascardo do cartão de crédito
     * @return 
     */
    public String getMaskedCreditCardNumber() {
        return MaskedCreditCardNumber;
    }

    /**
     * Altera Número mascardo do cartão de crédito
     * @param MaskedCreditCardNumber 
     */
    public void setMaskedCreditCardNumber(String MaskedCreditCardNumber) {
        this.MaskedCreditCardNumber = MaskedCreditCardNumber;
    }

    /**
     * Recupera Bandeira do cartão de crédito
     * @return 
     */
    public CreditCardBrandEnum getCreditCardBrand() {
        return CreditCardBrand;
    }

    /**
     * Altera Bandeira do cartão de crédito
     * @param CreditCardBrand 
     */
    public void setCreditCardBrand(CreditCardBrandEnum CreditCardBrand) {
        this.CreditCardBrand = CreditCardBrand;
    }

    /**
     * Recupera Chave do cartão de crédito. Utilizada para identificar um cartão de crédito no gateway
     * @return 
     */
    public UUID getInstantBuyKey() {
        return InstantBuyKey;
    }

    /**
     * Altera Chave do cartão de crédito. Utilizada para identificar um cartão de crédito no gateway
     * @param InstantBuyKey 
     */
    public void setInstantBuyKey(UUID InstantBuyKey) {
        this.InstantBuyKey = InstantBuyKey;
    }

    /**
     * Recupera se o cartão de crédito expirou
     * @return 
     */
    public Boolean getIsExpiredCreditCard() {
        return IsExpiredCreditCard;
    }

    /**
     * Altera se o cartão de crédito expirou
     * @param IsExpiredCreditCard 
     */
    public void setIsExpiredCreditCard(Boolean IsExpiredCreditCard) {
        this.IsExpiredCreditCard = IsExpiredCreditCard;
    }
}
