package DataContracts.Sale;

import DataContracts.BaseRequest;
import DataContracts.BoletoTransaction.BoletoTransaction;
import DataContracts.CreditCardTransaction.CreditCardTransaction;
import DataContracts.Merchant.Merchant;
import DataContracts.Order.Order;
import DataContracts.Person.Buyer;
import DataContracts.SaleOptions;
import DataContracts.ShoppingCart.ShoppingCart;
import java.util.ArrayList;

/**
 * Criação de uma nova Venda
 */
public final class CreateSaleRequest extends BaseRequest {
    
    /**
     * Construtor da Classe
     */
    public CreateSaleRequest() 
    {
        this.setOptions(new SaleOptions());
        this.setBoletoTransactionCollection(new ArrayList());
        this.setCreditCardTransactionCollection(new ArrayList());
        this.setShoppingCartCollection(new ArrayList());
    }
    
    /**
     * Dados do comprador
     */
    private Buyer Buyer;
    
    /**
     * Lista de transações de boleto
     */
    private ArrayList<BoletoTransaction> BoletoTransactionCollection;

    /**
     * Lista de transações de cartão de crédito
     */
    private ArrayList<CreditCardTransaction> CreditCardTransactionCollection;
    
    /**
     * Informações opcionais para a criação da venda
     */
    private SaleOptions Options;
    
    /**
     * Dados do pedido
     */
    private Order Order;

    /**
     * Dados da loja
     */
    private Merchant Merchant;

    /**
     * Informações complementares da requisição
     */
    private RequestData RequestData;
    
    /**
     * Lista de carrinhos de compra
     */
    private ArrayList<ShoppingCart> ShoppingCartCollection;

    /**
     * Recupera coleção de transação de cartão de crédito
     * @return 
     */
    public ArrayList<CreditCardTransaction> getCreditCardTransactionCollection() {
        return CreditCardTransactionCollection;
    }

    /**
     * Altera coleção de transação de cartão de crédito
     * @param CreditCardTransactionCollection 
     */
    public void setCreditCardTransactionCollection(ArrayList<CreditCardTransaction> CreditCardTransactionCollection) {
        this.CreditCardTransactionCollection = CreditCardTransactionCollection;
    }

    /**
     * Recupera coleção de transação de boleto
     * @return 
     */
    public ArrayList<BoletoTransaction> getBoletoTransactionCollection() {
        return BoletoTransactionCollection;
    }

    /**
     * Altera coleção de transação de boleto
     * @param BoletoTransactionCollection 
     */
    public void setBoletoTransactionCollection(ArrayList<BoletoTransaction> BoletoTransactionCollection) {
        this.BoletoTransactionCollection = BoletoTransactionCollection;
    }

    /**
     * Recupera pedido
     * @return 
     */
    public Order getOrder() {
        return Order;
    }

    /**
     * Altera pedido
     * @param Order 
     */
    public void setOrder(Order Order) {
        this.Order = Order;
    }

    /**
     * Recupera comprador
     * @return 
     */
    public Buyer getBuyer() {
        return Buyer;
    }

    /**
     * Altera comprador
     * @param Buyer 
     */
    public void setBuyer(Buyer Buyer) {
        this.Buyer = Buyer;
    }

    /**
     * Recupera Lista de carrinhos de compra
     * @return 
     */
    public ArrayList<ShoppingCart> getShoppingCartCollection() {
        return ShoppingCartCollection;
    }

    /**
     * Altera Lista de carrinhos de compra
     * @param ShoppingCartCollection 
     */
    public void setShoppingCartCollection(ArrayList<ShoppingCart> ShoppingCartCollection) {
        this.ShoppingCartCollection = ShoppingCartCollection;
    }

    /**
     * Recupera opções adcionais para criação da venda
     * @return 
     */
    public SaleOptions getOptions() {
        return Options;
    }

    /**
     * Altera opções adcionais para criação da venda
     * @param Options 
     */
    public void setOptions(SaleOptions Options) {
        this.Options = Options;
    }

    /**
     * Recupera dados da loja
     * @return 
     */
    public Merchant getMerchant() {
        return Merchant;
    }

    /**
     * Altera dados da loja
     * @param Merchant 
     */
    public void setMerchant(Merchant Merchant) {
        this.Merchant = Merchant;
    }

    /**
     * Recupera Informações complementares da requisição
     * @return 
     */
    public RequestData getRequestData() {
        return RequestData;
    }

    /**
     * Altera Informações complementares da requisição
     * @param RequestData 
     */
    public void setRequestData(RequestData RequestData) {
        this.RequestData = RequestData;
    }
}
