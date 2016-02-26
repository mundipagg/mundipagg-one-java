package DataContracts.Sale;

import DataContracts.AntiFraud.AntiFraudAnalysis;
import DataContracts.BoletoTransaction.BoletoTransactionData;
import DataContracts.CreditCardTransaction.CreditCardTransactionData;
import DataContracts.Order.OrderData;
import java.util.List;
import java.util.UUID;

/**
 * Dados da venda
 */
public class SaleData {

    /**
     * Construtor da Classe
     */
    public SaleData() {}
    
    /**
     * Dados do serviço de antifraude
     */
    private AntiFraudAnalysis AntiFraudAnalysisData;
    
    /**
     * Chave do comprador. Utilizada para identificar um comprador no gateway
     */
    private UUID BuyerKey;
    
    /**
     * Lista de transações de boleto
     */
    private List<BoletoTransactionData> BoletoTransactionDataCollection;
    
    /**
     * Lista de transações de cartão de crédito
     */
    private List<CreditCardTransactionData> CreditCardTransactionDataCollection;

    /**
     * Dados do pedido
     */
    private OrderData OrderData;
    
    /**
     * Recupera Lista de transações de cartão de crédito
     * @return 
     */
    public List<CreditCardTransactionData> getCreditCardTransactionDataCollection() {
        return CreditCardTransactionDataCollection;
    }

    /**
     * Altera Lista de transações de cartão de crédito
     * @param CreditCardTransactionDataCollection 
     */
    public void setCreditCardTransactionDataCollection(List<CreditCardTransactionData> CreditCardTransactionDataCollection) {
        this.CreditCardTransactionDataCollection = CreditCardTransactionDataCollection;
    }

    /**
     * Recupera Lista de transações de boleto
     * @return 
     */
    public List<BoletoTransactionData> getBoletoTransactionDataCollection() {
        return BoletoTransactionDataCollection;
    }

    /**
     * Altera Lista de transações de boleto
     * @param BoletoTransactionDataCollection 
     */
    public void setBoletoTransactionDataCollection(List<BoletoTransactionData> BoletoTransactionDataCollection) {
        this.BoletoTransactionDataCollection = BoletoTransactionDataCollection;
    }

    /**
     * Recupera dados do pedido
     * @return 
     */
    public OrderData getOrderData() {
        return OrderData;
    }

    /**
     * Altera dados do pedido
     * @param OrderData 
     */
    public void setOrderData(OrderData OrderData) {
        this.OrderData = OrderData;
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

    /**
     * Recupera Dados do serviço de antifraude
     * @return 
     */
    public AntiFraudAnalysis getAntiFraudAnalysisData() {
        return AntiFraudAnalysisData;
    }

    /**
     * Altera Dados do serviço de antifraude
     * @param AntiFraudAnalysisData 
     */
    public void setAntiFraudAnalysisData(AntiFraudAnalysis AntiFraudAnalysisData) {
        this.AntiFraudAnalysisData = AntiFraudAnalysisData;
    }
}
