package Utility;

import DataContracts.*;
import DataContracts.Address.*;
import DataContracts.AntiFraud.*;
import DataContracts.BoletoTransaction.*;
import DataContracts.CreditCardTransaction.*;
import DataContracts.InstantBuy.*;
import DataContracts.Merchant.*;
import DataContracts.Order.*;
import DataContracts.Person.*;
import DataContracts.Recurrency.*;
import DataContracts.Sale.*;
import DataContracts.ShoppingCart.*;
import DataContracts.ServiceConstants;
import EnumTypes.HttpContentTypeEnum;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.thoughtworks.xstream.XStream;

/**
 * Utilitário para serializar e deserializar
 * @param <TObject>
 */
public class SerializeUtility<TObject> {
       
    /**
     * Construtor da Classe
     */
    public SerializeUtility(){}
    
    /**
     * Serializa objeto para string no formato especificado
     * @param obj
     * @param ContentType 
     * @return  
     */
    public String Serialize(TObject obj, HttpContentTypeEnum ContentType)
    {
        // Cria variavel local
        String serialized = "";
        
        // Se obj nulo, retorna string empty
        if(obj == null) 
        {
            return serialized;
        }
        
        // Verifica e serializa em xml ou json
        if(HttpContentTypeEnum.Json == ContentType) 
        {
            // Converte objeto para string Json
            Gson gson = new GsonBuilder().setDateFormat(ServiceConstants.DATE_TIME_FORMAT).create();
            serialized = gson.toJson(obj);    
        }
        else if(HttpContentTypeEnum.Xml == ContentType)
        {
            // Converte objeto para string Xml
            XStream xstream = InitiXmlConverter();
            serialized = xstream.toXML(obj);
        }
        
        // retorna string serializada
        return serialized;   
    }
    
    /**
     * Deserializa string no formato especificado para objeto 
     * @param TypeOfResponse
     * @param Serialized
     * @param ContentType
     * @return 
     */
    public TObject Deserializer(Class<TObject> TypeOfResponse, String Serialized, HttpContentTypeEnum ContentType) 
    {
        // Cria variavel local
        TObject obj = null;
        
        // Se string a deserializar vazia/nula, retorna null
        if(Serialized == null || Serialized.isEmpty()) 
        {
            return obj;
        }
        
        // Verifica e deserializa em xml ou json
        if(HttpContentTypeEnum.Json == ContentType) 
        {
            // Converte string Json para objeto
            Gson gson = new GsonBuilder().setDateFormat(ServiceConstants.DATE_TIME_FORMAT).create();
            obj = gson.fromJson(Serialized, TypeOfResponse);
        }
        else if(HttpContentTypeEnum.Xml == ContentType)
        {
            // Converte string Xml para objeto
            XStream xstream = InitiXmlConverter();
            obj = TypeOfResponse.cast(xstream.fromXML(Serialized));
        }
        
        // retorna obj deserializado
        return obj;  
    }
    
    /**
     * Inicializa, Configura e retorna objeto responsavel por serializar/deserializar XML
     * @return 
     */
    private XStream InitiXmlConverter()
    {
        XStream xstream = new XStream();
        xstream.registerConverter(new DateConverter());
        
        xstream.alias("AntiFraudAnalysis", AntiFraudAnalysis.class);
        xstream.alias("AntiFraudAnalysisHistory", AntiFraudAnalysisHistory.class);
        xstream.alias("AntiFraudAnalysisResult", AntiFraudAnalysisResult.class);
        xstream.alias("BillingAddress", BillingAddress.class);
        xstream.alias("BuyerAddress", BuyerAddress.class);
        xstream.alias("DeliveryAddress", DeliveryAddress.class);
        xstream.alias("BoletoTransaction", BoletoTransaction.class);
        xstream.alias("BoletoTransactionData", BoletoTransactionData.class);
        xstream.alias("BoletoTransactionOptions", BoletoTransactionOptions.class);
        xstream.alias("BoletoTransactionResult", BoletoTransactionResult.class);
        xstream.alias("CreditCard", CreditCard.class);
        xstream.alias("CreditCardTransaction", CreditCardTransaction.class);
        xstream.alias("CreditCardTransactionData", CreditCardTransactionData.class);
        xstream.alias("CreditCardTransactionOptions", CreditCardTransactionOptions.class);
        xstream.alias("CreditCardTransactionResult", CreditCardTransactionResult.class);
        xstream.alias("ManageCreditCardTransaction", ManageCreditCardTransaction.class);
        xstream.alias("RetrySaleCreditCardTransaction", RetrySaleCreditCardTransaction.class);
        xstream.alias("CreditCardData", CreditCardData.class);
        xstream.alias("GetInstantBuyDataResponse", GetInstantBuyDataResponse.class);        
        xstream.alias("Merchant", Merchant.class);
        xstream.alias("Order", Order.class);
        xstream.alias("OrderData", OrderData.class);
        xstream.alias("OrderResult", OrderResult.class);
        xstream.alias("Buyer", Buyer.class);
        xstream.alias("Person", Person.class);
        xstream.alias("Recurrency", Recurrency.class);
        xstream.alias("SaleData", SaleData.class);
        xstream.alias("SaleOptions", SaleOptions.class);
        xstream.alias("CreateSaleRequest", CreateSaleRequest.class);
        xstream.alias("CreateSaleResponse", CreateSaleResponse.class);
        xstream.alias("ManageSaleRequest", ManageSaleRequest.class);
        xstream.alias("ManageSaleResponse", ManageSaleResponse.class);
        xstream.alias("QuerySaleResponse", QuerySaleResponse.class);
        xstream.alias("RequestData", RequestData.class);
        xstream.alias("RetrySaleOptions", RetrySaleOptions.class);
        xstream.alias("RetrySaleRequest", RetrySaleRequest.class);
        xstream.alias("RetrySaleResponse", RetrySaleResponse.class);
        xstream.alias("ErrorItem", ErrorItem.class);
        xstream.alias("ErrorReport", ErrorReport.class);
        xstream.alias("ShoppingCartItem", ShoppingCartItem.class);
        xstream.alias("ShoppingCart", ShoppingCart.class);
        
        return xstream;
    }
}
