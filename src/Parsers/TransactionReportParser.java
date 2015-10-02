package Parsers;

import DataContracts.BoletoTransaction.BoletoTransactionReport;
import DataContracts.CreditCardTransaction.CreditCardTransactionReport;
import DataContracts.OnlineDebitTransaction.OnlineDebitTransactionReport;
import DataContracts.TransactionReport.*;
import EnumTypes.BoletoTransactionStatusEnum;
import EnumTypes.CreditCardBrandEnum;
import EnumTypes.CreditCardTransactionStatusEnum;
import EnumTypes.OnlineDebitTransactionStatusEnum;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.UUID;

/**
 * Converte relatório de transações (texto plano) em objeto
 */
public class TransactionReportParser {
        
    /**
     * Construtor da classe
     */
    public TransactionReportParser() {}
    
    /**
     * Efetua a conversão de relatório a partir dos dados em texto plano
     * @param data
     * @return 
     * @throws java.text.ParseException 
     */
    public TransactionReportFile parser(String data) throws ParseException
    {
        // Inicializa objeto de retorno
        TransactionReportFile report = new TransactionReportFile();

        // Obtem as linhas
        String[] lines = data.split("\r\n");
        
        // Varre linhas
        for(String line : lines)
        {
            // Separa as colunas
            String[] itemToParse = line.split(",", -1);
            
            if (null != itemToParse[0])
            {
                switch (itemToParse[0]) {
                    // Verifica se linha é tipo Header e converte
                    case "01":
                        report.setHeader(this.parserHeader(itemToParse));
                        break;
                    // Verifica se linha é tipo CreditCardTransaction e converte
                    case "20":
                        report.getCreditCardTransactionCollection().add(this.parserCreditCardTransaction(itemToParse));
                        break;
                    // Verifica se linha é tipo OnlineDebitTransaction e converte
                    case "40":
                        report.getOnlineDebitTransactionCollection().add(this.parserOnlineDebitTransaction(itemToParse));
                        break;
                    // Verifica se linha é tipo BoletoTransaction e converte
                    case "30":
                        report.getBoletoTransactionCollection().add(this.parserBoletoTransaction(itemToParse));
                        break;
                    // Verifica se linha é tipo Trailer e converte
                    case "99":
                        report.setTrailer(this.parserTrailer(itemToParse));
                        break;
                }
            }       
        }
        
        return report;        
    }   
    
    /**
     * Converte linha de cabeçalho em objeto
     * @param row
     * @return 
     */
    private HeaderReport parserHeader(String[] row) throws ParseException
    {
        if(row.length != 4)
        {
            throw new ParseException("The expected parameter count for Header parser is 4", row.length);
        }
        
        HeaderReport header = new HeaderReport();
        header.setTransactionProcessedDate(new SimpleDateFormat("yyyyMMdd").parse(row[1]));
        header.setReportFileCreateDate( new SimpleDateFormat("yyyyMMdd HH:mm:ss").parse(row[2]));
        header.setVersion(row[3]);        
        return header;
    }
    
    /**
     * Converte linha em dados de transação de cartão de crédito
     * @param row
     * @return 
     */
    private CreditCardTransactionReport parserCreditCardTransaction(String[] row) throws ParseException
    {
        if(row.length != 27)
        {
            throw new ParseException("The expected parameter count for CreditCardTransaction parser is 27", row.length);
        }
        
        CreditCardTransactionReport transaction = new CreditCardTransactionReport();
        transaction.getOrder().setOrderKey(UUID.fromString(row[1]));
        transaction.getOrder().setOrderReference(row[2]);
        transaction.getOrder().setMerchantKey(UUID.fromString(row[3]));
        transaction.getOrder().setMerchantName(row[4]);
        transaction.setTransactionKey(UUID.fromString(row[5]));
        transaction.setTransactionKeyToAcquirer(row[6]);
        transaction.setTransactionReference(row[7]);
        transaction.setCreditCardBrand(CreditCardBrandEnum.valueOf(row[8]));
        transaction.setCreditCardNumber(row[9]);
        transaction.setInstallmentCount( (row[10].trim().length() > 0) ? Integer.valueOf(row[10]) : 0 );
        transaction.setAcquirerName(row[11]);
        transaction.setStatus(CreditCardTransactionStatusEnum.valueOf(row[12]));
        transaction.setAmountInCents( (row[13].trim().length() > 0) ? Long.valueOf(row[13]) : 0L );
        transaction.setIataAmountInCents( (row[14].trim().length() > 0) ? Long.valueOf(row[14]) : 0L );
        transaction.setAuthorizationCode(row[15]);
        transaction.setTransactionIdentifier(row[16]);
        transaction.setUniqueSequentialNumber(row[17]);
        transaction.setAuthorizedAmountInCents( (row[18].trim().length() > 0) ? Long.valueOf(row[18]) : 0L );
        transaction.setCapturedAmountInCents( (row[19].trim().length() > 0) ? Long.valueOf(row[19]) : 0L );
        transaction.setVoidedAmountInCents( (row[20].trim().length() > 0) ? Long.valueOf(row[20]) : 0L );
        transaction.setRefundedAmountInCents( (row[21].trim().length() > 0) ? Long.valueOf(row[21]) : 0L );
        transaction.setAcquirerAuthorizationReturnCode(row[22]);
        transaction.setAuthorizedDate( (row[23].trim().length() > 0) ? new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(row[23]) : null);
        transaction.setCapturedDate( (row[24].trim().length() > 0) ? new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(row[24]) : null);
        transaction.setVoidedDate( (row[25].trim().length() > 0) ? new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(row[25]) : null);
        transaction.setLastProbeDate( (row[26].trim().length() > 0) ? new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(row[26]) : null);
        
        return transaction;
    }
    
    /**
     * Converte linha em dados de transação de boleto
     * @param row
     * @return 
     */
    private BoletoTransactionReport parserBoletoTransaction(String[] row) throws ParseException
    {
        if(row.length != 18)
        {
            throw new ParseException("The expected parameter count for BoletoTransaction parser is 18", row.length);
        }
        
        BoletoTransactionReport transaction = new BoletoTransactionReport();
        transaction.getOrder().setOrderKey(UUID.fromString(row[1]));
        transaction.getOrder().setOrderReference(row[2]);
        transaction.getOrder().setMerchantKey(UUID.fromString(row[3]));
        transaction.getOrder().setMerchantName(row[4]);
        transaction.setTransactionKey(UUID.fromString(row[5]));
        transaction.setTransactionReference(row[6]);
        transaction.setStatus(BoletoTransactionStatusEnum.valueOf(row[7]));
        transaction.setNossoNumero(row[8]);
        transaction.setBankNumber(row[9]);
        transaction.setAgency(row[10]);
        transaction.setAccount(row[11]);
        transaction.setBarcode(row[12]);
        transaction.setExpirationDate(new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse(row[13]));
        transaction.setAmountInCents(Long.valueOf(row[14]));
        transaction.setAmountPaidInCents( (row[15].trim().length() > 0) ? Long.valueOf(row[15]) : 0L );
        transaction.setPaymentDate((row[16].trim().length() > 0) ? new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse(row[16]) : null );
        transaction.setCreditDate((row[17].trim().length() > 0) ? new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse(row[17]) : null );
        return transaction;
    }
    
    /**
     * Converte linha em dados de transação de débito online
     * @param row
     * @return 
     */
    private OnlineDebitTransactionReport parserOnlineDebitTransaction(String[] row) throws ParseException
    {
        if(row.length != 16)
        {
            throw new ParseException("The expected parameter count for OnlineDebitTransaction parser is 16", row.length);
        }
        
        OnlineDebitTransactionReport transaction = new OnlineDebitTransactionReport();
        transaction.getOrder().setOrderKey(UUID.fromString(row[1]));
        transaction.getOrder().setOrderReference(row[2]);
        transaction.getOrder().setMerchantKey(UUID.fromString(row[3]));
        transaction.getOrder().setMerchantName(row[4]);
        transaction.setTransactionKey(UUID.fromString(row[5]));
        transaction.setTransactionReference(row[6]);
        transaction.setBank(row[7]);
        transaction.setStatus(OnlineDebitTransactionStatusEnum.valueOf(row[8]));
        transaction.setAmountInCents(Long.valueOf(row[9]));
        transaction.setAmountPaidInCents( (row[10].trim().length() > 0) ? Long.valueOf(row[10]) : 0L );
        transaction.setPaymentDate((row[11].trim().length() > 0) ? new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse(row[11]) : null );
        transaction.setBankReturnCode(row[12]);
        transaction.setBankPaymentDate(row[13]);
        transaction.setSignature(row[14]);
        transaction.setTransactionKeyToBank(row[15]);

        return transaction;
    }
    
    /**
     * Converte linha de rodapé em objeto
     * @param row
     * @return 
     */
    private TrailerReport parserTrailer(String[] row) throws ParseException
    {        
        if(row.length != 5)
        {
            throw new ParseException("The expected parameter count for Trailer parser is 5", row.length);
        }
        
        TrailerReport trailer = new TrailerReport();
        trailer.setOrderDataCount(Long.valueOf(row[1]));
        trailer.setCreditCardTransactionDataCount(Long.valueOf(row[2]));
        trailer.setBoletoTransactionDataCount(Long.valueOf(row[3]));
        trailer.setOnlineDebitTransactionDataCount(Long.valueOf(row[4]));
        return trailer;
    }
}
