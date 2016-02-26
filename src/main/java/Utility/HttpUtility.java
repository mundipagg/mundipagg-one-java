package Utility;

import DataContracts.ServiceConstants;
import EnumTypes.HttpContentTypeEnum;
import EnumTypes.HttpVerbEnum;
import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

/**
 * Utilitário de suporte para protocolo HTTP
 */
public class HttpUtility {
    
    /**
     * Construtor da Classe
     */
    public HttpUtility() {}
    
    /**
     * Envia uma requisição para o gateway
     * @param <TResponse> Tipo da resposta
     * @param TypeOfResponse
     * @param ServiceUri Url do serviço
     * @param HttpVerb Método de chamada do serviço
     * @param HttpContentType Formato do conteúdo da resposta
     * @param HeaderData Cabeçalho da requisição
     * @return 
     * @throws java.lang.Exception 
     */
    public <TResponse> HttpResponseGenericResponse SubmitRequest(Class<TResponse> TypeOfResponse, String ServiceUri, HttpVerbEnum HttpVerb, HttpContentTypeEnum HttpContentType, BasicHeader[] HeaderData) throws Exception 
    {          
        // Submete dados e retorna resposta
        HttpResponseGenericResponse<TResponse> response = this.<TResponse>SendHttpWebRequest(TypeOfResponse, HttpVerb, HttpContentType, ServiceUri, HeaderData);     
        return response;
    }
     
    /**
     * Envia uma requisição para o gateway
     * @param <TResponse> Tipo da resposta
     * @param <TRequest> Tipo da requisição
     * @param TypeOfResponse
     * @param Request Objeto de requisição
     * @param ServiceUri Url do serviço
     * @param HttpVerb Método de chamada do serviço
     * @param HttpContentType Formato do conteúdo da resposta
     * @param HeaderData Cabeçalho da requisição
     * @return 
     * @throws java.lang.Exception 
     */
    public <TResponse, TRequest> HttpResponseGenerics SubmitRequest(Class<TResponse> TypeOfResponse, TRequest Request, String ServiceUri, HttpVerbEnum HttpVerb, HttpContentTypeEnum HttpContentType, BasicHeader[] HeaderData) throws Exception 
    {          
        // Submete dados e retorna resposta
        HttpResponseGenerics<TResponse, TRequest> response = this.<TResponse,TRequest>SendHttpWebRequest(TypeOfResponse,Request, HttpVerb, HttpContentType, ServiceUri, HeaderData);     
        return response;
    }
    
    /**
     * Cria uma requisição HTTP e retorna um objeto do tipo especificado em TResponse.
     * @param <TResponse> Tipo da resposta
     * @param ServiceEndpoint Url do serviço
     * @param HttpVerb Método de chamada do serviço
     * @param HttpContentType Formato do conteúdo da resposta
     * @param HeaderData Cabeçalho da requisição
     * @return 
     */
    private <TResponse> HttpResponseGenericResponse<TResponse> SendHttpWebRequest(Class<TResponse> TypeOfResponse, HttpVerbEnum HttpVerb, HttpContentTypeEnum HttpContentType, String ServiceEndpoint, BasicHeader[] HeaderData) throws Exception 
    {              
        // Efetua requisição
        HttpResponse httpResponse = this.SendHttpWebRequest("", HttpVerb, HttpContentType, ServiceEndpoint, HeaderData);
        
        // Deserializa resposta
        SerializeUtility<TResponse> serializer = new SerializeUtility();
        TResponse responseObj = serializer.Deserializer(TypeOfResponse, httpResponse.getRawResponse(), HttpContentType);
        
        // Monta e retorna obj
        HttpResponseGenericResponse<TResponse> result = new HttpResponseGenericResponse(httpResponse.getRawResponse(), httpResponse.getHttpStatusCode(), responseObj);
        return result;
    }
    
    /**
     * Cria uma requisição HTTP com um objeto do especificado em TRequest e retorna um objeto do tipo especificado em TResponse.
     * @param <TResponse> Tipo da resposta
     * @param <TRequest> Tipo da requisição
     * @param Request Objeto de requisição
     * @param ServiceEndpoint Url do serviço
     * @param HttpVerb Método de chamada do serviço
     * @param HttpContentType Formato do conteúdo da resposta
     * @param HeaderData Cabeçalho da requisição
     * @return 
     */
    private <TResponse,TRequest> HttpResponseGenerics<TResponse,TRequest> SendHttpWebRequest(Class<TResponse> TypeOfResponse, TRequest Request, HttpVerbEnum HttpVerb, HttpContentTypeEnum HttpContentType, String ServiceEndpoint, BasicHeader[] HeaderData) throws Exception 
    {           
        // Serializa requisição
        SerializeUtility<TRequest> serializerRequest = new SerializeUtility();
        String RawRequest = serializerRequest.Serialize(Request, HttpContentType);
        
        // Efetua requisição
        HttpResponse httpResponse = this.SendHttpWebRequest(RawRequest, HttpVerb, HttpContentType, ServiceEndpoint, HeaderData);
        
        // Deserializa resposta
        SerializeUtility<TResponse> serializerResponse = new SerializeUtility();
        TResponse responseObj = serializerResponse.Deserializer(TypeOfResponse, httpResponse.getRawResponse(), HttpContentType);
        
        // Monta e retorna obj
        HttpResponseGenerics<TResponse, TRequest> result = new HttpResponseGenerics(RawRequest, httpResponse.getRawResponse(), httpResponse.getHttpStatusCode(), responseObj, Request);
        return result;
    }
    
    /**
     * Envia requisição HTTP e obtém resposta.
     * @param DataToSend Conteúdo a ser submetido
     * @param ServiceEndpoint Url do serviço
     * @param HttpVerb Método de chamada do serviço
     * @param HttpContentType Formato do conteúdo da resposta
     * @param HeaderData Cabeçalho da requisição
     * @return 
     * @throws java.lang.Exception 
     */
    public HttpResponse SendHttpWebRequest(String DataToSend, HttpVerbEnum HttpVerb, HttpContentTypeEnum HttpContentType, String ServiceEndpoint, BasicHeader[] HeaderData) throws Exception
    {
        // Define codificação
        String encoding = ServiceConstants.CHARSET;
        
        // Cria Client e Request
        HttpClient httpClient = HttpClientBuilder.create().setRedirectStrategy(new RedirectRoles()).build();        
        HttpRequest httpRequest = new HttpRequest(ServiceEndpoint, HttpVerb);
    
        // Verifica formato dos dados
        String DataFormat = 
                (HttpContentType == HttpContentTypeEnum.Xml) 
                ? "text/xml" : "application/json" ;
        
        // Adiciona itens ao Header do Request
        httpRequest.setHeader("Accept", DataFormat); //Define o tipo do conteúdo aceitado
        httpRequest.setHeader("Content-Type", DataFormat + "; charset=" + encoding); //Define o tipo do conteúdo retornado
        
        // Adiciona headers recebidos
        for(BasicHeader header : HeaderData)
        {
            httpRequest.addHeader(header);
        }
        
        // Adiciona dados na requisição
        if(DataToSend != null && !DataToSend.isEmpty())
        {        
            StringEntity se = new StringEntity(DataToSend, encoding);
            httpRequest.setEntity(se);      
        }

        // Executa e recupera resposta
        org.apache.http.HttpResponse httpResponse = httpClient.execute(httpRequest);        
        
        // Monta uma string com a resposta
        String responseData;
        try
        {
            HttpEntity entityResponse = httpResponse.getEntity();
            responseData = EntityUtils.toString(entityResponse, encoding);
        }
        catch(IOException e)
        {
            responseData = e.toString();
        }

        // Define a variavel de retorno com a resposta da requisição
        HttpResponse response = new HttpResponse(responseData, httpResponse.getStatusLine());
        return response;
    }       
}

