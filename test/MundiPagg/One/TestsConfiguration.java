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
    public static UUID MerchantKey = UUID.fromString("Sua merchant key aqui"); // Define merchantKey para os testes
    
    /**
     * Ambiente de integração
     */
    public static PlatformEnvironmentEnum Environment = PlatformEnvironmentEnum.Production; // Ambiente de Staging
}
