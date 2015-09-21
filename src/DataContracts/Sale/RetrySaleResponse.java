package DataContracts.Sale;

import DataContracts.BaseResponse;
import DataContracts.CreditCardTransaction.CreditCardTransactionResult;
import java.util.ArrayList;
import java.util.List;

/**
 * Resposta da Retentativa de Venda
 */
public class RetrySaleResponse extends BaseResponse {
    
    /**
     * Construtor da Classe
     */
    public RetrySaleResponse() {
        this.setCreditCardTransactionResultCollection(new ArrayList());
    }
    
    /**
     * Lista de transações de cartão de crédito
     */
    private List<CreditCardTransactionResult> CreditCardTransactionResultCollection;

    /**
     * Recupera Lista de transações de cartão de crédito
     * @return 
     */
    public List<CreditCardTransactionResult> getCreditCardTransactionResultCollection() {
        return CreditCardTransactionResultCollection;
    }

    /**
     * Altera Lista de transações de cartão de crédito
     * @param CreditCardTransactionResultCollection 
     */
    public final void setCreditCardTransactionResultCollection(List<CreditCardTransactionResult> CreditCardTransactionResultCollection) {
        this.CreditCardTransactionResultCollection = CreditCardTransactionResultCollection;
    }    
}
