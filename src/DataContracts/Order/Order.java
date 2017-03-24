package DataContracts.Order;

/**
 * Dados do Pedido
 */
public class Order {
    
    /**
     * Construtor da Classe
     */
    public Order() {}
    
    /**
	 * Construtor da Classe com inicializacao das propriedades
	 */
	public Order(String OrderReference) {
		this.OrderReference = OrderReference;
	}

	/**
	 * Identificador do pedido na loja
	 */
    private String OrderReference;

    /**
     * Recupera identificador da loja na plataforma
     * @return 
     */
    public String getOrderReference() {
        return OrderReference;
    }

    /**
     * Altera identificador da loja na plataforma
     * @param OrderReference 
     */
    public void setOrderReference(String OrderReference) {
        this.OrderReference = OrderReference;
    }
}
