package DataContracts.Sale;

import DataContracts.BaseResponse;
import DataContracts.BoletoTransaction.BoletoTransactionResult;
import DataContracts.CreditCardTransaction.CreditCardTransactionResult;
import DataContracts.Order.OrderResult;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Resposta da criação de uma nova venda
 */
public class CreateSaleResponse extends BaseResponse {
    
    /**
     * Construtor da Classe
     */
    public CreateSaleResponse() {}
    
    /**
     * Lista de transações de boleto
     */
    private ArrayList<BoletoTransactionResult> BoletoTransactionResultCollection;
    
    /**
     * Chave do comprador. Utilizada para identificar um comprador no gateway
     */
    private UUID BuyerKey;
    
    /**
     * Lista de transações de cartão de crédito
     */
    private ArrayList<CreditCardTransactionResult> CreditCardTransactionResultCollection;

    /**
    * Dados de retorno do pedido
    */
    private OrderResult OrderResult;

    /**
     * Recupera Lista de transações de cartão de crédito
     * @return 
     */
    public ArrayList<CreditCardTransactionResult> getCreditCardTransactionResultCollection() {
        return CreditCardTransactionResultCollection;
    }

    /**
     * Recupera Lista de transações de cartão de crédito
     * @param CreditCardTransactionResultCollection 
     */
    public void setCreditCardTransactionResultCollection(ArrayList<CreditCardTransactionResult> CreditCardTransactionResultCollection) {
        this.CreditCardTransactionResultCollection = CreditCardTransactionResultCollection;
    }

    /**
     * Recupera Lista de transações de boleto
     * @return 
     */
    public ArrayList<BoletoTransactionResult> getBoletoTransactionResultCollection() {
        return BoletoTransactionResultCollection;
    }

    /**
     * Altera Lista de transações de boleto
     * @param BoletoTransactionResultCollection 
     */
    public void setBoletoTransactionResultCollection(ArrayList<BoletoTransactionResult> BoletoTransactionResultCollection) {
        this.BoletoTransactionResultCollection = BoletoTransactionResultCollection;
    }

    /**
     * Recupera dados de retorno do pedido
     * @return 
     */
    public OrderResult getOrderResult() {
        return OrderResult;
    }

    /**
     * Altera dados de retorno do pedido
     * @param OrderResult 
     */
    public void setOrderResult(OrderResult OrderResult) {
        this.OrderResult = OrderResult;
    }

    /**
     * Recupera Chave do comprador. Utilizada para identificar um comprador no gateway
     * @return 
     */
    public UUID getBuyerKey() {
        return BuyerKey;
    }

    /**
     * Altera Chave do comprador. Utilizada para identificar um comprador no gateway
     * @param BuyerKey 
     */
    public void setBuyerKey(UUID BuyerKey) {
        this.BuyerKey = BuyerKey;
    }    
}
