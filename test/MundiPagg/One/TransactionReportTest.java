package MundiPagg.One;

import Client.GatewayServiceClient;
import DataContracts.TransactionReport.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testes para transactionReport
 */
public class TransactionReportTest {
    
    public TransactionReportTest() {
    }
   
    /////////////////////////////////////////
    // TRANSACTION REPORT RESOURCES TESTS  //
    /////////////////////////////////////////
    
    /**
     * Testa a obtenção de um relatório de transação de pela API
     * @throws java.text.ParseException
     */    
    @Test
    public void getTransactionReportFile() throws ParseException {
         // Define loja
        UUID merchantKey = UUID.fromString("F81FFF9B-2EEE-4BA7-ACF8-062BEA39EA67"); // Chave da Loja - MerchantKey
        
        // Cria data para obtenção do relatório
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse("20/02/2015");       
            
        try {
            // Cria o cliente que vai efetuar a requisição
            GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey);
            
            // Efetua o a solicitação do relatório
            String transactionReportFile = serviceClient.getTransactionReport().getTransactionReportFile(date);

            // Testa se conseguiu obter recurso
            assertNotNull(transactionReportFile);
            assertTrue(transactionReportFile.length() > 0);
        }
        catch (Exception ex) { assertTrue(false); }
    }
    
    /**
     * Testa a conversão a partir da obtenção de um relatório de transação de pela API
     * @throws java.text.ParseException
     */    
    @Test
    public void parserTransactionReportFile() throws ParseException {
         // Define loja
        UUID merchantKey = UUID.fromString("41BE3484-9CD4-4332-98B1-145DAEBE7CCB"); // Chave da Loja - MerchantKey
        
        // Cria data para obtenção do relatório
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse("21/03/2015");       
            
        try {
            // Cria o cliente que vai efetuar a requisição
            GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey);
            
            // Efetua o a solicitação do relatório
            String transactionReportFileData = serviceClient.getTransactionReport().getTransactionReportFile(date);
            
            // Efetua conversão
            TransactionReportFile report = serviceClient.getTransactionReport().parserTransactionReportFile(transactionReportFileData);
            
            // Testa se conseguiu obter recurso
            assertNotNull(transactionReportFileData);
            assertTrue(transactionReportFileData.length() > 0);
            assertNotNull(report);
            assertNotNull(report.getHeader());
            assertNotNull(report.getTrailer());
        }
        catch (Exception ex) { assertTrue(false); }
    }
}
