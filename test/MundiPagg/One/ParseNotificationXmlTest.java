package MundiPagg.One;

import Client.GatewayServiceClient;
import DataContracts.PostNotification.StatusNotification;
import EnumTypes.OrderStatusEnum;
import java.util.UUID;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Teste de conversão de Xml de post de notificação
 */
public class ParseNotificationXmlTest {
    
    public ParseNotificationXmlTest() {}
    
    ////////////////////////////////////////
    // POST NOTIFICATION RESOURCES TESTS  //
    ////////////////////////////////////////
    
    /**
     * Testa o parse de um exemplo de xml de um post de notificação
     */    
    @Test
    public void ParseFromXML() {
        
        // Define loja para inicializar o client
        UUID merchantKey = TestsConfiguration.MerchantKey; // Chave da Loja - MerchantKey
        
        // Cria exemplo de XML de notificação
        String xmlTest = "<StatusNotification xmlns=\"http://schemas.datacontract.org/2004/07/MundiPagg.NotificationService.DataContract\"\n" +
            "                    xmlns:i=\"http://www.w3.org/2001/XMLSchema-instance\"\n" +
            "                    i:schemaLocation=\"http://schemas.datacontract.org/2004/07/MundiPagg.NotificationService.DataContract StatusNotificationXmlSchema.xsd\">\n" +
            "  <AmountInCents>500</AmountInCents>\n" +
            "  <AmountPaidInCents>0</AmountPaidInCents>\n" +
            "  <BoletoTransaction>\n" +
            "    <AmountInCents>500</AmountInCents>\n" +
            "    <AmountPaidInCents>0</AmountPaidInCents>\n" +
            "    <BoletoExpirationDate>2013-02-08T00:00:00</BoletoExpirationDate>\n" +
            "    <NossoNumero>0123456789</NossoNumero>\n" +
            "    <StatusChangedDate>2012-11-06T08:55:49.753</StatusChangedDate>\n" +
            "    <TransactionKey>4111D523-9A83-4BE3-94D2-160F1BC9C4BD</TransactionKey>\n" +
            "    <TransactionReference>B2E32108</TransactionReference>\n" +
            "    <PreviousBoletoTransactionStatus>Generated</PreviousBoletoTransactionStatus>\n" +
            "    <BoletoTransactionStatus>Paid</BoletoTransactionStatus>\n" +
            "  </BoletoTransaction>\n" +
            "  <CreditCardTransaction>\n" +
            "    <Acquirer>Simulator</Acquirer>\n" +
            "    <AmountInCents>2000</AmountInCents>\n" +
            "    <AuthorizedAmountInCents>2000</AuthorizedAmountInCents>\n" +
            "    <CapturedAmountInCents>2000</CapturedAmountInCents>\n" +
            "    <CreditCardBrand>Visa</CreditCardBrand>\n" +
            "    <RefundedAmountInCents i:nil=\"true\"/>\n" +
            "    <StatusChangedDate>2012-11-06T10:52:55.93</StatusChangedDate>\n" +
            "    <TransactionIdentifier>123456</TransactionIdentifier>\n" +
            "    <TransactionKey>351FC96A-7F42-4269-AF3C-1E3C179C1CD0</TransactionKey>\n" +
            "    <TransactionReference>24de0432</TransactionReference>\n" +
            "    <UniqueSequentialNumber>123456</UniqueSequentialNumber>\n" +
            "    <VoidedAmountInCents i:nil=\"true\"/>\n" +
            "    <PreviousCreditCardTransactionStatus>AuthorizedPendingCapture</PreviousCreditCardTransactionStatus>\n" +
            "    <CreditCardTransactionStatus>Captured</CreditCardTransactionStatus>\n" +
            "  </CreditCardTransaction>\n" +
            "  <OnlineDebitTransaction>\n" +
            "    <AmountInCents>100</AmountInCents>\n" +
            "    <AmountPaidInCents>0</AmountPaidInCents>\n" +
            "    <StatusChangedDate>2013-06-27T19:46:46.87</StatusChangedDate>\n" +
            "    <TransactionKey>fb3f158a-0309-4ae3-b8ef-3c5ac2d603d2</TransactionKey>\n" +
            "    <TransactionReference>30bfee13-c908-4e3b-9f70-1f84dbe79fbf</TransactionReference>\n" +
            "    <PreviousOnlineDebitTransactionStatus>OpenedPendingPayment</PreviousOnlineDebitTransactionStatus>\n" +
            "    <OnlineDebitTransactionStatus>NotPaid</OnlineDebitTransactionStatus>\n" +
            "  </OnlineDebitTransaction>\n" +
            "  <MerchantKey>50CB81FB-7164-4E1D-94F3-9B1E6E12C73D</MerchantKey>\n" +
            "  <OrderKey>18471F05-9F6D-4497-9C24-D60D5BBB6BBE</OrderKey>\n" +
            "  <OrderReference>64a85875</OrderReference>\n" +
            "  <OrderStatus>Paid</OrderStatus>\n" +
            "</StatusNotification>";
            
        try {
            // Cria o cliente que vai efetuar o parse a transação
            GatewayServiceClient serviceClient = new GatewayServiceClient(merchantKey);
            
            // Efetua o parse do xml em um objeto de StatusNotification
            StatusNotification statusNotification = serviceClient.getPostNotification().parseFromXML(xmlTest);

            // Testa se conseguiu obter recurso
            assertNotNull(statusNotification);
            assertNotNull(statusNotification.getCreditCardTransaction());
            assertNotNull(statusNotification.getBoletoTransaction());
            assertNotNull(statusNotification.getOnlineDebitTransaction());
            assertEquals(statusNotification.getMerchantKey(), UUID.fromString("50CB81FB-7164-4E1D-94F3-9B1E6E12C73D"));
            assertEquals(statusNotification.getOrderReference(), "64a85875");
            assertEquals(statusNotification.getOrderStatus(), OrderStatusEnum.Paid);
            assertEquals(statusNotification.getAmountInCents().toString(), "500");
            assertEquals(statusNotification.getAmountPaidInCents().toString(), "0");
            assertEquals(statusNotification.getOrderKey(), UUID.fromString("18471F05-9F6D-4497-9C24-D60D5BBB6BBE"));

        }
        catch (Exception ex) { assertTrue(false); }
    }
        
}
