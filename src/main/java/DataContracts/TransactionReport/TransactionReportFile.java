package DataContracts.TransactionReport;

import DataContracts.BoletoTransaction.BoletoTransactionReport;
import DataContracts.CreditCardTransaction.CreditCardTransactionReport;
import DataContracts.OnlineDebitTransaction.OnlineDebitTransactionReport;
import java.util.ArrayList;
import java.util.List;

/**
 * Relatório de Transações 
 */
public class TransactionReportFile {

    /**
     * Construtor da Classe
     */
    public TransactionReportFile() 
    {
        this.BoletoTransactionCollection = new ArrayList<>();
        this.CreditCardTransactionCollection = new ArrayList<>();
        this.OnlineDebitTransactionCollection = new ArrayList<>();
    }
    
    /**
     * Cabeçalho do relatório
     */
    private HeaderReport Header;
    
    /**
     * Coleção de transações de boleto
     */
    private List<BoletoTransactionReport> BoletoTransactionCollection;
    
    /**
     * Coleção de transações de cartão de crédito
     */
    private List<CreditCardTransactionReport> CreditCardTransactionCollection;
    
    /**
     * Coleção de transações de débito online
     */
    private List<OnlineDebitTransactionReport> OnlineDebitTransactionCollection;
    
    /**
     * Rodapé do relatório
     */
    private TrailerReport Trailer;

    /**
     * Recupera cabeçalho do relatório
     * @return 
     */
    public HeaderReport getHeader() {
        return Header;
    }

    /**
     * Altera cabeçalho do relatório
     * @param Header 
     */
    public void setHeader(HeaderReport Header) {
        this.Header = Header;
    }

    /**
     * Recupera coleção de transações de boleto
     * @return 
     */
    public List<BoletoTransactionReport> getBoletoTransactionCollection() {
        return BoletoTransactionCollection;
    }

    /**
     * Altera coleção de transações de boleto
     * @param BoletoTransactionCollection 
     */
    public void setBoletoTransactionCollection(List<BoletoTransactionReport> BoletoTransactionCollection) {
        this.BoletoTransactionCollection = BoletoTransactionCollection;
    }

    /**
     * Recupera coleção de transações de cartão de crédito
     * @return 
     */
    public List<CreditCardTransactionReport> getCreditCardTransactionCollection() {
        return CreditCardTransactionCollection;
    }

    /**
     * Altera coleção de transações de cartão de crédito
     * @param CreditCardTransactionCollection 
     */
    public void setCreditCardTransactionCollection(List<CreditCardTransactionReport> CreditCardTransactionCollection) {
        this.CreditCardTransactionCollection = CreditCardTransactionCollection;
    }

    /**
     * Recupera coleção de transações de débito online
     * @return 
     */
    public List<OnlineDebitTransactionReport> getOnlineDebitTransactionCollection() {
        return OnlineDebitTransactionCollection;
    }

    /**
     * Altera coleção de transações de débito online
     * @param OnlineDebitTransactionCollection 
     */
    public void setOnlineDebitTransactionCollection(List<OnlineDebitTransactionReport> OnlineDebitTransactionCollection) {
        this.OnlineDebitTransactionCollection = OnlineDebitTransactionCollection;
    }

    /**
     * Recupera rodapé do relatório
     * @return 
     */
    public TrailerReport getTrailer() {
        return Trailer;
    }

    /**
     * Altera rodapé do relatório
     * @param Trailer 
     */
    public void setTrailer(TrailerReport Trailer) {
        this.Trailer = Trailer;
    }
}
