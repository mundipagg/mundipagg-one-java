package DataContracts.CreditCardTransaction;

import java.util.Date;

import DataContracts.Recurrency.Recurrency;
import EnumTypes.CreditCardOperationEnum;

/**
 * Transação de cartão de crédito
 */
public class CreditCardTransaction {
    
    /**
     * Construtor da Classe
     */
    public CreditCardTransaction() {}
    
    /**
	 * Construtor da Classe com inicializacao das propriedades
	 */
	public CreditCardTransaction(Long AmountInCents, CreditCard CreditCard,
			CreditCardOperationEnum CreditCardOperation) {
		this.AmountInCents = AmountInCents;
		this.CreditCard = CreditCard;
		this.CreditCardOperation = CreditCardOperation;
	}

	/**
	 * Valor original da transação em centavos
	 */
    private Long AmountInCents;
    
    /**
     * Cartão de Crédito
     */
	private CreditCard CreditCard;
    
    /**
     * Tipo de operação de cartão de crédito
     */
    private CreditCardOperationEnum CreditCardOperation;
    
    /**
     * Números de parcelas da transação
     */
	private Integer InstallmentCount = 1;
    
    /**
     * Opções da transação
     */
    private CreditCardTransactionOptions Options;
    
    /**
     * Dados de recorrência
     */
    private Recurrency Recurrency;
    
    /**
     * Data de criação da transação no sistema da loja
     */
    private Date TransactionDateInMerchant;
    
    /**
     * Referência da transação no sistema da loja
     */
    private String TransactionReference;

    /**
     * Recupera Cartão de Crédito
     * @return 
     */
    public CreditCard getCreditCard() {
		return CreditCard;
    }

    /**
     * Altera cartão de crédito
     * @param CreditCard 
     */
    public void setCreditCard(CreditCard CreditCard) {
		this.CreditCard = CreditCard;
    }

    /**
     * Recupera opções da transação
     * @return 
     */
    public CreditCardTransactionOptions getOptions() {
        return Options;
    }

    /**
     * Altera opções da transação
     * @param Options 
     */
    public void setOptions(CreditCardTransactionOptions Options) {
        this.Options = Options;
    }

	/**
	 * Altera opções da transação
	 * @param Options
	 */
	public void addOptions() {
		this.Options = new CreditCardTransactionOptions();
	}

    /**
     * Recupera recorrência
     * @return 
     */
    public Recurrency getRecurrency() {
        return Recurrency;
    }

    /**
     * Altera recorrência
     * @param Recurrency 
     */
    public void setRecurrency(Recurrency Recurrency) {
        this.Recurrency = Recurrency;
    }

    /**
     * Recupera Valor original da transação em centavos
     * @return 
     */
    public Long getAmountInCents() {
        return AmountInCents;
    }

    /**
     * Altera Valor original da transação em centavos
     * @param AmountInCents 
     */
    public void setAmountInCents(Long AmountInCents) {
        this.AmountInCents = AmountInCents;
    }

    /**
     * Recupera Números de parcelas da transação
     * @return 
     */
    public Integer getInstallmentCount() {
        return InstallmentCount;
    }

    /**
     * Altera Números de parcelas da transação
     * @param InstallmentCount 
     */
    public void setInstallmentCount(Integer InstallmentCount) {
        this.InstallmentCount = InstallmentCount;
    }

    /**
     * Recupera tipo de operação de cartão de crédito
     * @return 
     */
    public CreditCardOperationEnum getCreditCardOperation() {
        return CreditCardOperation;
    }

    /**
     * Altera tipo de operação de cartão de crédito
     * @param CreditCardOperation 
     */
    public void setCreditCardOperation(CreditCardOperationEnum CreditCardOperation) {
        this.CreditCardOperation = CreditCardOperation;
    }

    /**
     * Recupera Referência da transação no sistema da loja
     * @return 
     */
    public String getTransactionReference() {
        return TransactionReference;
    }

    /**
     * Altera Referência da transação no sistema da loja
     * @param TransactionReference 
     */
    public void setTransactionReference(String TransactionReference) {
        this.TransactionReference = TransactionReference;
    }

    /**
     * Recupera Data de criação da transação no sistema da loja
     * @return 
     */
    public Date getTransactionDateInMerchant() {
        return TransactionDateInMerchant;
    }

    /**
     * Altera Data de criação da transação no sistema da loja
     * @param TransactionDateInMerchant 
     */
    public void setTransactionDateInMerchant(Date TransactionDateInMerchant) {
        this.TransactionDateInMerchant = TransactionDateInMerchant;
    }
}
