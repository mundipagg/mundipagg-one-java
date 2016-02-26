package DataContracts.CreditCardTransaction;

import EnumTypes.CurrencyIsoEnum;

/**
 * Opções de transação de cartão de rédito
 */
public class CreditCardTransactionOptions {

    /**
     * Construtor da Classe
     */
    public CreditCardTransactionOptions() {}
    
    /**
     * Tempo que a transação deverá esperar até ser capturada (contando a partir da data de criação)
     */
    private Integer CaptureDelayInMinutes;
    
    /**
     * Tipo da Moeda.
     */
    private CurrencyIsoEnum CurrencyIso;
    
    /**
     * Código do limite extendido
     */
    private String ExtendedLimitCode;
    
    /**
     * Indica se limit extendido está habilitado
     */
    private Boolean ExtendedLimitEnabled;
    
    /**
     * Taxa para a companhia aérea
     */    
    private Long IataAmountInCents;
    
    /**
     * Taxa de Juros
     */
    private Float InterestRate;
    
    /**
     * Categoria da loja - MCC
     */
    private Long MerchantCategoryCode;
 
    /**
     * Código do método de pagamento.
     */
    private Integer PaymentMethodCode;
    
    /**
     * Nome que aparecerá na fatura do comprador (caso não informado, o texto configurado no gateway será utilizado)
     */
    private String SoftDescriptorText;

    /**
     * Recupera Código do método de pagamento.
     * @return 
     */
    public Integer getPaymentMethodCode() {
        return PaymentMethodCode;
    }

    /** 
     * Altera Código do método de pagamento.
     * @param PaymentMethodCode 
     */
    public void setPaymentMethodCode(Integer PaymentMethodCode) {
        this.PaymentMethodCode = PaymentMethodCode;
    }

    /**
     * Recupera Tipo da Moeda
     * @return 
     */
    public CurrencyIsoEnum getCurrencyIso() {
        return CurrencyIso;
    }

    /**
     * Altera Tipo da Moeda
     * @param CurrencyIso 
     */
    public void setCurrencyIso(CurrencyIsoEnum CurrencyIso) {
        this.CurrencyIso = CurrencyIso;
    }

    /**
     * Recupera taxa para a companhia aérea
     * @return 
     */
    public Long getIataAmountInCents() {
        return IataAmountInCents;
    }

    /**
     * Altera taxa para a companhia aérea
     * @param IataAmountInCents 
     */
    public void setIataAmountInCents(Long IataAmountInCents) {
        this.IataAmountInCents = IataAmountInCents;
    }

    /**
     * Recupera Tempo que a transação deverá esperar até ser capturada (contando a partir da data de criação)
     * @return 
     */
    public Integer getCaptureDelayInMinutes() {
        return CaptureDelayInMinutes;
    }

    /**
     * Altera Tempo que a transação deverá esperar até ser capturada (contando a partir da data de criação)
     * @param CaptureDelayInMinutes 
     */
    public void setCaptureDelayInMinutes(Integer CaptureDelayInMinutes) {
        this.CaptureDelayInMinutes = CaptureDelayInMinutes;
    }

    /**
     * Recupera Categoria da loja - MCC
     * @return 
     */
    public Long getMerchantCategoryCode() {
        return MerchantCategoryCode;
    }

    /**
     * Altera Categoria da loja - MCC
     * @param MerchantCategoryCode 
     */
    public void setMerchantCategoryCode(Long MerchantCategoryCode) {
        this.MerchantCategoryCode = MerchantCategoryCode;
    }

    /**
     * Recupera Nome que aparecerá na fatura do comprador (caso não informado, o texto configurado no gateway será utilizado)   
     * @return 
     */
    public String getSoftDescriptorText() {
        return SoftDescriptorText;
    }

    /**
     * Altera Nome que aparecerá na fatura do comprador (caso não informado, o texto configurado no gateway será utilizado)
     * @param SoftDescriptorText 
     */
    public void setSoftDescriptorText(String SoftDescriptorText) {
        this.SoftDescriptorText = SoftDescriptorText;
    }

    /**
     * Recupera Taxa de Juros
     * @return 
     */
    public Float getInterestRate() {
        return InterestRate;
    }

    /**
     * Altera Taxa de Juros
     * @param InterestRate 
     */
    public void setInterestRate(Float InterestRate) {
        this.InterestRate = InterestRate;
    }

    /**
     * Recupera se limite extendido está habilitado
     * @return 
     */
    public Boolean getExtendedLimitEnabled() {
        return ExtendedLimitEnabled;
    }

    /**
     * Altera se limite extendido está habilitado
     * @param ExtendedLimitEnabled 
     */
    public void setExtendedLimitEnabled(Boolean ExtendedLimitEnabled) {
        this.ExtendedLimitEnabled = ExtendedLimitEnabled;
    }

    /**
     * Recupera código do limite extendido 
     * @return 
     */
    public String getExtendedLimitCode() {
        return ExtendedLimitCode;
    }

    /**
     * Altera código do limite extendido 
     * @param ExtendedLimitCode 
     */
    public void setExtendedLimitCode(String ExtendedLimitCode) {
        this.ExtendedLimitCode = ExtendedLimitCode;
    }    
}
