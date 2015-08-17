package DataContracts.Sale;

import DataContracts.BaseResponse;
import DataContracts.CreditCardTransaction.CreditCardTransactionResult;
import java.util.ArrayList;

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
    private ArrayList<CreditCardTransactionResult> CreditCardTransactionResultCollection;

    /**
     * Recupera Coleção de transações de cartão de crédito
     * @return 
     */
    public ArrayList<CreditCardTransactionResult> getCreditCardTransactionResultCollection() {
        return CreditCardTransactionResultCollection;
    }

    /**
     * Altera Coleção de transações de cartão de crédito
     * @param CreditCardTransactionResultCollection 
     */
    public void setCreditCardTransactionResultCollection(ArrayList<CreditCardTransactionResult> CreditCardTransactionResultCollection) {
        this.CreditCardTransactionResultCollection = CreditCardTransactionResultCollection;
    }    
}
