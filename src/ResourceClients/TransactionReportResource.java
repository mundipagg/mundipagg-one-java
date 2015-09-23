package ResourceClients;
import DataContracts.TransactionReport.TransactionReportFile;
import EnumTypes.HttpContentTypeEnum;
import EnumTypes.HttpVerbEnum;
import Parsers.TransactionReportParser;
import Utility.HttpResponse;
import Utility.HttpUtility;
import java.io.IOException;
import java.nio.file.*;
import java.security.InvalidParameterException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import org.apache.http.message.BasicHeader;

/**
 * Recurso para relatório de transações
 */
public class TransactionReportResource {
    
    /**
     * Construtor da Classe
     * @param merchantKey
     */
    public TransactionReportResource(UUID merchantKey)
    {
        this.MerchantKey = merchantKey;
        this.HttpUtility = new HttpUtility();
    }
    
    /**
     * Chave da Loja. Utilizada para identificar a loja no gateway.
     */
    private UUID MerchantKey;
    
    /**
     * Utilitário de requisições HTTP
     */
    private final HttpUtility HttpUtility;
    
    /**
     * Retorna chave da loja
     * @return 
     */
    public UUID getMerchantKey() {
        return MerchantKey;
    }

    /**
     * Altera chave da loja
     * @param MerchantKey 
     */
    public void setMerchantKey(UUID MerchantKey) {
        this.MerchantKey = MerchantKey;
    }
    
    /**
     * Recupera URL de acordo com o ambiente
     * @return 
     */
    private String getServiceUri() {
        return "https://api.mundipaggone.com/TransactionReportFile";
    }
    
    /**
     * Recupera utilitário de requisição HTTP
     * @return 
     */
    private HttpUtility getHttpUtility() {
        return HttpUtility;
    }
    
    /**
     * Retorna em texto pleno o conteúdo do relatório de transações referente ao dia da data informada 
     * @param date
     * @return 
     * @throws java.lang.Exception 
     */
    public String getTransactionReportFile(Date date) throws Exception
    {
        // Verifica se data é nula e retorn empty
        if(date == null)
        {
            throw new InvalidParameterException("Date should be not null.");
        }
        
        // Recupera data no formato necessário para a API
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");        
        
        // Monta nome da ação
        String actionName = "/GetStream?fileDate=" + simpleDateFormat.format(date);

        // Define verbo get
        HttpVerbEnum httpVerb = HttpVerbEnum.Get;

        // Adiciona merchantKey no header
        BasicHeader[] header = new BasicHeader[1];
        header[0] = new BasicHeader("MerchantKey", this.getMerchantKey().toString());

        // Define url completa para obter o relatório
        String serviceUri = this.getServiceUri()+ actionName;
        
        // Solicita relatório e retorna
        HttpResponse response = this.getHttpUtility().SendHttpWebRequest("", httpVerb, HttpContentTypeEnum.Json, serviceUri, header);
        return response.getRawResponse();
    }
    
    /**
     * Retorna em texto pleno o conteúdo do relatório de transações referente ao dia da data informada 
     * @param transactionReportFile
     * @return 
     * @throws java.text.ParseException 
     */
    public TransactionReportFile parserTransactionReportFile(String transactionReportFile) throws ParseException
    {
        // Instancia obj responsavel pelo parser detalhado
        TransactionReportParser transactionReportParser = new TransactionReportParser();
        
        // Efetua o parse
        TransactionReportFile report = transactionReportParser.parser(transactionReportFile);
        
        return report;
    }
    
    /**
     * Salva um relatório de transação em arquivo txt no path informado e nome recebido para arquivo
     * @param transactionReportFile Dados do relatório
     * @param path Caminho que será salvo o arquivo.   Ex.   C:/Reports/  
     * @param fileName Nome do arquivo sem a extensão. Ex.   MyReport
     * @throws java.io.IOException  
     */
    public void saveTransactionReportFile(String transactionReportFile, String path, String fileName) throws IOException
    {
        // Verifica path
        if(path == null || path.trim().length() == 0)
        {
            throw new InvalidParameterException("Path should be not null.");
        }
        
        // Verifica se possui limitação de diretório ou não
        if(path.charAt(path.length()-1) != '/')
        {
            path += "/";
        }

        // Define extensão padrão
        String extension = ".txt";
        
        // Verifica nome do arquivo
        if(fileName == null || fileName.trim().length() == 0)
        {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
            Date currentDate = new Date();
            fileName = "TransactionReportFile_" + df.format(currentDate);
        }
        
        // Adiciona extensão
        fileName = fileName + extension;
        
        // Tenta salvar
        Path resultSave = Files.write(Paths.get(path + fileName), transactionReportFile.getBytes(), StandardOpenOption.CREATE);
    }
    
}
