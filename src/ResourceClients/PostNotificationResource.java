package ResourceClients;

import DataContracts.PostNotification.StatusNotification;
import EnumTypes.HttpContentTypeEnum;
import Utility.SerializeUtility;

/**
 * Recurso para post de notificação
 */
public class PostNotificationResource {
    
    /**
     * Construtor da Classe
     */
    public PostNotificationResource() {}
    
    /**
     * Converte XML de Post de Notificação em Objeto 
     * @param xml
     * @return 
     */
    public StatusNotification ParseFromXML(String xml)
    {
        // Inicia objeto de serialização e deserialização para efetuar parse
        SerializeUtility<StatusNotification> serializerResponse = new SerializeUtility();
        StatusNotification statusNotification = serializerResponse.Deserializer(StatusNotification.class, xml, HttpContentTypeEnum.Xml);
        return statusNotification;
    }
}
