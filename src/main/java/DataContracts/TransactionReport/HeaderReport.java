package DataContracts.TransactionReport;

import java.util.Date;

/**
 * Cabeçalho do relatório
 */
public class HeaderReport {
   
    /**
     * Construtor da Classe
     */
    public HeaderReport() {}
    
    /**
     * Data de processamento do relatório de transação
     */
    private Date TransactionProcessedDate;
    
    /**
     * Data da criação do relatório
     */
    private Date ReportFileCreateDate;
    
    /**
     * Versão do relatório
     */
    private String Version;

    /**
     * Recupera data de processamento do relatório de transação
     * @return 
     */
    public Date getTransactionProcessedDate() {
        return TransactionProcessedDate;
    }

    /**
     * Altera data de processamento do relatório de transação
     * @param TransactionProcessedDate 
     */
    public void setTransactionProcessedDate(Date TransactionProcessedDate) {
        this.TransactionProcessedDate = TransactionProcessedDate;
    }

    /**
     * Recupera data da criação do relatório
     * @return 
     */
    public Date getReportFileCreateDate() {
        return ReportFileCreateDate;
    }

    /**
     * Altera data da criação do relatório
     * @param ReportFileCreateDate 
     */
    public void setReportFileCreateDate(Date ReportFileCreateDate) {
        this.ReportFileCreateDate = ReportFileCreateDate;
    }

    /**
     * Recupera versão do relatório
     * @return 
     */
    public String getVersion() {
        return Version;
    }

    /**
     * Altera versão do relatório
     * @param Version 
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }
}
