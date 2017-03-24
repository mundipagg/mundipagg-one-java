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
     * Url de notificação da transação
     */
    private String NotificationUrl;
    
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
	 * Altera Código do método de pagamento.
	 * @param PaymentMethodCode
	 */
    public CreditCardTransactionOptions withPaymentMethodCode(Integer PaymentMethodCode) {
		this.PaymentMethodCode = PaymentMethodCode;
		return this;
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
	 * Altera Tipo da Moeda
	 * @param CurrencyIso
	 */
    public CreditCardTransactionOptions withCurrencyIso(CurrencyIsoEnum CurrencyIso) {
		this.CurrencyIso = CurrencyIso;
		return this;
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
     * Altera taxa para a companhia aérea
     * @param IataAmountInCents 
     * @return 
     */
    public CreditCardTransactionOptions withIataAmountInCents(Long IataAmountInCents) {
        this.IataAmountInCents = IataAmountInCents;
        return this;
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
     * Altera Tempo que a transação deverá esperar até ser capturada (contando a partir da data de criação)
     * @param CaptureDelayInMinutes 
     * @return 
     */
    public CreditCardTransactionOptions withCaptureDelayInMinutes(Integer CaptureDelayInMinutes) {
        this.CaptureDelayInMinutes = CaptureDelayInMinutes;
        return this;
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
     * Altera Categoria da loja - MCC
     * @param MerchantCategoryCode 
     * @return 
     */
    public CreditCardTransactionOptions withMerchantCategoryCode(Long MerchantCategoryCode) {
        this.MerchantCategoryCode = MerchantCategoryCode;
        return this;
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
     * Altera Nome que aparecerá na fatura do comprador (caso não informado, o texto configurado no gateway será utilizado)
     * @param SoftDescriptorText 
     * @return 
     */
    public CreditCardTransactionOptions withSoftDescriptorText(String SoftDescriptorText) {
        this.SoftDescriptorText = SoftDescriptorText;
        return this;
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
     * Altera Taxa de Juros
     * @param InterestRate 
     * @return 
     */
    public CreditCardTransactionOptions withInterestRate(Float InterestRate) {
        this.InterestRate = InterestRate;
        return this;
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
     * Altera se limite extendido está habilitado
     * @param ExtendedLimitEnabled 
     * @return 
     */
    public CreditCardTransactionOptions withExtendedLimitEnabled(Boolean ExtendedLimitEnabled) {
        this.ExtendedLimitEnabled = ExtendedLimitEnabled;
        return this;
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
    
    /**
     * Altera código do limite extendido 
     * @param ExtendedLimitCode 
     * @return 
     */
    public CreditCardTransactionOptions withExtendedLimitCode(String ExtendedLimitCode) {
        this.ExtendedLimitCode = ExtendedLimitCode;
        return this;
    }    

    /**
     * @return the NotificationUrl
     */
    public String getNotificationUrl() {
        return NotificationUrl;
    }

    /**
     * @param NotificationUrl the NotificationUrl to set
     */
    public void setNotificationUrl(String NotificationUrl) {
        this.NotificationUrl = NotificationUrl;
    }
}
