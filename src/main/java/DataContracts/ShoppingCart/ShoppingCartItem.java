package DataContracts.ShoppingCart;

/**
 * Item do carrinho de compra
 */
public class ShoppingCartItem {

    /**
     * Construtor da Classe
     */
    public ShoppingCartItem() {}
    
    /**
     * Descrição do produto
     */
    private String Description;

    /**
     * Total de desconto em centavos
     */
    private Long DiscountAmountInCents;
    
    /**
     * Referência do item na loja
     */
    private String ItemReference;

    /**
     * Nome do produto
     */
    private String Name;
    
    /**
     * Quantidade de itens
     */
    private Integer Quantity;

    /**
     * Custo total em centavos
     */
    private Integer TotalCostInCents;
    
    /**
     * Custo unitártio
     */
    private Integer UnitCostInCents;

    /**
     * Recupera Referência do item na loja
     * @return 
     */
    public String getItemReference() {
        return ItemReference;
    }

    /**
     * Altera Referência do item na loja
     * @param ItemReference 
     */
    public void setItemReference(String ItemReference) {
        this.ItemReference = ItemReference;
    }

    /**
     * Recupera quantidade de itens
     * @return 
     */
    public Integer getQuantity() {
        return Quantity;
    }

    /**
     * Altera quantidade de itens
     * @param Quantity 
     */
    public void setQuantity(Integer Quantity) {
        this.Quantity = Quantity;
    }

    /**
     * Recupera valor unitário em centavos
     * @return 
     */
    public Integer getUnitCostInCents() {
        return UnitCostInCents;
    }

    /**
     * Altera valor unitário em centavos
     * @param UnitCostInCents 
     */
    public void setUnitCostInCents(Integer UnitCostInCents) {
        this.UnitCostInCents = UnitCostInCents;
    }

    /**
     * Recupera valor total em centavos
     * @return 
     */
    public Integer getTotalCostInCents() {
        return TotalCostInCents;
    }

    /**
     * Altera valor total em centavos
     * @param TotalCostInCents 
     */
    public void setTotalCostInCents(Integer TotalCostInCents) {
        this.TotalCostInCents = TotalCostInCents;
    }

    /**
     * Recupera nome do produto
     * @return 
     */
    public String getName() {
        return Name;
    }

    /**
     * Altera nome do produto
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Recupera descrição do produto
     * @return 
     */
    public String getDescription() {
        return Description;
    }

    /**
     * Altera descrição do produto
     * @param Description 
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Recupera valor total de desconto em centavos
     * @return 
     */
    public Long getDiscountAmountInCents() {
        return DiscountAmountInCents;
    }

    /**
     * Altera valor total de desconto em centavos
     * @param DiscountAmountInCents 
     */
    public void setDiscountAmountInCents(Long DiscountAmountInCents) {
        this.DiscountAmountInCents = DiscountAmountInCents;
    }
}
