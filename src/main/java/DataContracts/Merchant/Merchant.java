package DataContracts.Merchant;

/**
 * Dados da Loja
 */
public class Merchant {
    
    /**
     * Construtor da Classe
     */
    public Merchant() {}
    
    /**
     * Identificador da loja na plataforma
     */
    private String MerchantReference;

    /**
     * Recupera identificador da loja na plataforma
     * @return 
     */
    public String getMerchantReference() {
        return MerchantReference;
    }

    /**
     * Altera identificador da loja na plataforma
     * @param MerchantReference 
     */
    public void setMerchantReference(String MerchantReference) {
        this.MerchantReference = MerchantReference;
    }
}
