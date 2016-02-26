package DataContracts.Sale;

import DataContracts.BaseResponse;
import DataContracts.CreditCardTransaction.CreditCardTransactionResult;
import java.util.List;

/**
 * Responsta de gerenciar venda
 */
public class ManageSaleResponse extends BaseResponse {
    
    /**
     * Construtor da Classe
     */
    public ManageSaleResponse() {}
 
    /**
     * Coleção de transações de cartão de crédito
     */
    private List<CreditCardTransactionResult> CreditCardTransactionResultCollection;

    /**
     * Recupera Coleção de transações de cartão de crédito
     * @return 
     */
    public List<CreditCardTransactionResult> getCreditCardTransactionResultCollection() {
        return CreditCardTransactionResultCollection;
    }

    /**
     * Altera Coleção de transações de cartão de crédito
     * @param CreditCardTransactionResultCollection 
     */
    public void setCreditCardTransactionResultCollection(List<CreditCardTransactionResult> CreditCardTransactionResultCollection) {
        this.CreditCardTransactionResultCollection = CreditCardTransactionResultCollection;
    }    
}
