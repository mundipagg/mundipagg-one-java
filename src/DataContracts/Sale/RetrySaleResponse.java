package DataContracts.Sale;

import DataContracts.BaseResponse;
import DataContracts.CreditCardTransaction.CreditCardTransactionResult;
import java.util.ArrayList;

/**
 * Resposta da Retentativa de Venda
 */
public class RetrySaleResponse extends BaseResponse {
    
    /**
     * Construtor da Classe
     */
    public RetrySaleResponse() {
        this.setCreditCardTransactionResultCollection(new ArrayList<>());
    }
    
    /**
     * Lista de transações de cartão de crédito
     */
    private ArrayList<CreditCardTransactionResult> CreditCardTransactionResultCollection;

    /**
     * Recupera Lista de transações de cartão de crédito
     * @return 
     */
    public ArrayList<CreditCardTransactionResult> getCreditCardTransactionResultCollection() {
        return CreditCardTransactionResultCollection;
    }

    /**
     * Altera Lista de transações de cartão de crédito
     * @param CreditCardTransactionResultCollection 
     */
    public final void setCreditCardTransactionResultCollection(ArrayList<CreditCardTransactionResult> CreditCardTransactionResultCollection) {
        this.CreditCardTransactionResultCollection = CreditCardTransactionResultCollection;
    }    
}
