package MundiPagg.One;

import EnumTypes.PlatformEnvironmentEnum;
import java.util.UUID;

/**
 * Define escopo (MerchantKey / Ambiente) para os testes
 */
public class TestsConfiguration {
    
    /**
     * Chave da loja
     */
    public static UUID MerchantKey = UUID.fromString("85328786-8BA6-420F-9948-5352F5A183EB"); // Define merchantKey para os testes
    
    /**
     * Ambiente de integração
     */
    public static PlatformEnvironmentEnum Environment = PlatformEnvironmentEnum.Sandbox; // Ambiente de Sandbox
}
