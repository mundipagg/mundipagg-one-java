package DataContracts.Sale;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import DataContracts.BaseRequest;
import DataContracts.SaleOptions;
import DataContracts.BoletoTransaction.BoletoTransaction;
import DataContracts.CreditCardTransaction.CreditCardTransaction;
import DataContracts.Merchant.Merchant;
import DataContracts.Order.Order;
import DataContracts.Person.Buyer;
import DataContracts.ShoppingCart.ShoppingCart;

/**
 * Criação de uma nova Venda
 */
public final class CreateSaleRequest extends BaseRequest {
    
    /**
     * Construtor da Classe
     */
	public CreateSaleRequest() {
        this.setOptions(new SaleOptions());
        this.setBoletoTransactionCollection(new ArrayList());
        this.setCreditCardTransactionCollection(new ArrayList());
        this.setShoppingCartCollection(new ArrayList());
    }
    
    /**
	 * Construtor da Classe com inicializacao das propriedades
	 */
	public CreateSaleRequest(Order Order, CreditCardTransaction... creditCardTransactions) {
		this();
		this.Order = Order;
		this.CreditCardTransactionCollection.addAll(Arrays.asList(creditCardTransactions));
	}

	/**
	 * Lista de transações de boleto
	 */
    private List<BoletoTransaction> BoletoTransactionCollection;
    
    /**
     * Dados do comprador
     */
    private Buyer Buyer;

    /**
     * Lista de transações de cartão de crédito
     */
    private List<CreditCardTransaction> CreditCardTransactionCollection;
    
    /**
     * Dados da loja
     */
    private Merchant Merchant;
    
    /**
     * Informações opcionais para a criação da venda
     */
    private SaleOptions Options;
    
    /**
     * Dados do pedido
     */
    private Order Order;

    /**
     * Informações complementares da requisição
     */
    private RequestData RequestData;
    
    /**
     * Lista de carrinhos de compra
     */
    private List<ShoppingCart> ShoppingCartCollection;

    /**
     * Recupera coleção de transação de cartão de crédito
     * @return 
     */
    public List<CreditCardTransaction> getCreditCardTransactionCollection() {
        return CreditCardTransactionCollection;
    }

    /**
     * Altera coleção de transação de cartão de crédito
     * @param CreditCardTransactionCollection 
     */
    public void setCreditCardTransactionCollection(List<CreditCardTransaction> CreditCardTransactionCollection) {
        this.CreditCardTransactionCollection = CreditCardTransactionCollection;
    }

    /**
     * Recupera coleção de transação de boleto
     * @return 
     */
    public List<BoletoTransaction> getBoletoTransactionCollection() {
        return BoletoTransactionCollection;
    }

    /**
     * Altera coleção de transação de boleto
     * @param BoletoTransactionCollection 
     */
    public void setBoletoTransactionCollection(List<BoletoTransaction> BoletoTransactionCollection) {
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
    public List<ShoppingCart> getShoppingCartCollection() {
        return ShoppingCartCollection;
    }

    /**
     * Altera Lista de carrinhos de compra
     * @param ShoppingCartCollection 
     */
    public void setShoppingCartCollection(List<ShoppingCart> ShoppingCartCollection) {
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
