package EnumTypes;

/**
 * Enumerador para formato das mensagens de requisição e resposta para o gateway
 */
public enum HttpContentTypeEnum {

    /**
     * JSON
     */
    Json,
    
    /**
     * XML
     */
    Xml;
    
    private HttpContentTypeEnum() {}
}
