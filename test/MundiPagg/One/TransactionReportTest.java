package MundiPagg.One;

import Client.GatewayServiceClient;
import DataContracts.TransactionReport.*;
import java.io.File;
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
     */    
    @Test
    public void getTransactionReportFile()  {
         // Define loja
        UUID merchantKey = UUID.fromString("8A2DD57F-1ED9-4153-B4CE-69683EFADAD5"); // Chave da Loja - MerchantKey
        
        try {
        
            // Cria data para obtenção do relatório
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse("17/09/2015");          
        
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
     * Testa a conversão de um relatório de transação
     */    
    @Test
    public void parserTransactionReportFile()  {
         // Define loja
        UUID merchantKey = UUID.fromString("8A2DD57F-1ED9-4153-B4CE-69683EFADAD5"); // Chave da Loja - MerchantKey
        
        try {
        
            // Cria data para obtenção do relatório
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse("17/09/2015");       
        
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
    
    /**
     * Testa o método de salvar em disco um relatório relatório de transação 
     */    
    @Test
    public void saveTransactionReportFile() {
        
        // Define loja
        UUID merchantKey = UUID.fromString("8A2DD57F-1ED9-4153-B4CE-69683EFADAD5"); // Chave da Loja - MerchantKey
        
        try {
            // Cria data para obtenção do relatório
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse("17/09/2015");    
        
            // Define path que será salvo
            String path = System.getProperty("user.dir") + "\\dist";
        
            // Cria o cliente que vai efetuar a requisição
            GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey);
            
            // Efetua o a solicitação do relatório
            String transactionReportFileData = serviceClient.getTransactionReport().getTransactionReportFile(date);
            
            // Salva o arquivo em C:/TransactionReportTest.txt
            serviceClient.getTransactionReport().saveTransactionReportFile(transactionReportFileData, path, "TransactionReportTest");
            
            // Testa se conseguiu obter recurso
            assertNotNull(transactionReportFileData);
            assertTrue(transactionReportFileData.length() > 0);
            boolean exist = new File(path + "\\TransactionReportTest.txt").isFile();
            new File(path + "\\TransactionReportTest.txt").delete();
            assertTrue(exist);
        }
        catch (Exception ex) { assertTrue(false); }
    }
}
