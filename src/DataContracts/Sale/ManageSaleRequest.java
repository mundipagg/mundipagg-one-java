package DataContracts.Sale;

import DataContracts.BaseRequest;
import DataContracts.CreditCardTransaction.ManageCreditCardTransaction;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Gerenciar Venda
 */
public final class ManageSaleRequest extends BaseRequest {
    
    /**
     * Construtor da Classe
     */
    public ManageSaleRequest() 
    {
        this.setCreditCardTransactionCollection(new ArrayList());
    }
    
    /**
     * Coleções de transdações de cartão de crédito
     */
    private ArrayList<ManageCreditCardTransaction> CreditCardTransactionCollection;

    /**
     * Chave do pedido. Utilizada para identificar um pedido no gateway
     */
    private UUID OrderKey;

    /**
     * Recupera Coleções de transdações de cartão de crédito
     * @return 
     */
    public ArrayList<ManageCreditCardTransaction> getCreditCardTransactionCollection() {
        return CreditCardTransactionCollection;
    }

    /**
     * Altera Coleções de transdações de cartão de crédito
     * @param CreditCardTransactionCollection 
     */
    public void setCreditCardTransactionCollection(ArrayList<ManageCreditCardTransaction> CreditCardTransactionCollection) {
        this.CreditCardTransactionCollection = CreditCardTransactionCollection;
    }

    /**
     * Recupera Chave do pedido. Utilizada para identificar um pedido no gateway
     * @return 
     */
    public UUID getOrderKey() {
        return OrderKey;
    }

    /**
     * Altera Chave do pedido. Utilizada para identificar um pedido no gateway
     * @param OrderKey 
     */
    public void setOrderKey(UUID OrderKey) {
        this.OrderKey = OrderKey;
    }
}
