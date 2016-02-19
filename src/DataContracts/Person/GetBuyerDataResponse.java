/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataContracts.Person;

import DataContracts.Address.BuyerAddress;
import DataContracts.BaseResponse;
import EnumTypes.BuyerCategoryEnum;
import EnumTypes.DocumentTypeEnum;
import EnumTypes.EmailTypeEnum;
import EnumTypes.GenderEnum;
import EnumTypes.PersonTypeEnum;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

/**
 *
 * @author Munir
 */
public class GetBuyerDataResponse extends BaseResponse {

    public GetBuyerDataResponse() {
        this.setAddressCollection(new ArrayList());
    }
    
    /**
     * Lista de endereços do comprador
     */
    private ArrayList<BuyerAddress> AddressCollection;

    /**
     * Data de nascimento
     */
    private Date Birthdate;
    
    /**
     * Categoria do comprador
     */
    private BuyerCategoryEnum BuyerCategory;
    
    /**
     * Chave do Comprador
     */
    private UUID BuyerKey;
    
    /**
     * Referência do comprador
     */
    private String BuyerReference;
    
    /**
     * Data de criação do comprador no sistema da loja
     */
    private Date CreateDateInMerchant;
    
    /**
     * Número do documento
     */
    private String DocumentNumber;
    
    /**
     * Tipo de documento
     */
    private DocumentTypeEnum DocumentType;
    
    /**
     * Email
     */
    private String Email;
    
    /**
     * Tipo do email
     */
    private EmailTypeEnum EmailType;
    
    /**
     * Id do Facebook
     */
    private String FacebookId;
    
    /**
     * Sexo
     */
    private GenderEnum Gender;
    
    /**
     * Telefone de casa
     */
    private String HomePhone;
    
    /**
     * Endereço de Ip
     */
    private String IpAddress;
    
    /**
     * Último update do Buyer na loja
     */
    private Date LastBuyerUpdateInMerchant;
    
    /**
     * Telefone celular
     */
    private String MobilePhone;
    
    /**
     * Nome
     */
    private String Name;
    
    /**
     * Tipo de pessoa, CPF ou CNPJ
     */
    private PersonTypeEnum PersonType;
    
    /**
     * Booleano indicando sucesso
     */
    private Boolean Success;
  
    /**
     * Id do Twitter
     */
    private String TwitterId;
    
    /**
     * Telefone do trabalho
     */
    private String WorkPhone;

    /**
     * Retorna lista de endereços
     * @return 
     */
    public ArrayList<BuyerAddress> getAddressCollection() {
        return AddressCollection;
    }

    /**
     * Altera a coleção de endereços
     * @param AddressCollection 
     */
    public void setAddressCollection(ArrayList<BuyerAddress> AddressCollection) {
        this.AddressCollection = AddressCollection;
    }

    /**
     * Retorna a data de aniversário
     * @return 
     */
    public Date getBirthdate() {
        return Birthdate;
    }

    /**
     * Altera a data de aniversário
     * @param Birthdate 
     */
    public void setBirthdate(Date Birthdate) {
        this.Birthdate = Birthdate;
    }

    /**
     * Retorna a categoria do comprador
     * @return 
     */
    public BuyerCategoryEnum getBuyerCategory() {
        return BuyerCategory;
    }

    /**
     * Altera a categoria do buyer
     * @param BuyerCategory 
     */
    public void setBuyerCategory(BuyerCategoryEnum BuyerCategory) {
        this.BuyerCategory = BuyerCategory;
    }

    /**
     * Retorna a chave do comprador
     * @return 
     */
    public UUID getBuyerKey() {
        return BuyerKey;
    }

    /**
     * Define a chave do comprador
     * @param BuyerKey 
     */
    public void setBuyerKey(UUID BuyerKey) {
        this.BuyerKey = BuyerKey;
    }
    
    /**
     * Retorna a referência do Buyer
     * @return 
     */
    public String getBuyerReference() {
        return BuyerReference;
    }

    /**
     * Altera a referência do Buyer
     * @param BuyerReference 
     */
    public void setBuyerReference(String BuyerReference) {
        this.BuyerReference = BuyerReference;
    }

    /**
     * Retorna a data de criação na loja
     * @return 
     */
    public Date getCreateDateInMerchant() {
        return CreateDateInMerchant;
    }

    /**
     * Altera a data de criação na loja
     * @param CreateDateInMerchant 
     */
    public void setCreateDateInMerchant(Date CreateDateInMerchant) {
        this.CreateDateInMerchant = CreateDateInMerchant;
    }

    /**
     * Retorna o número do documento
     * @return 
     */
    public String getDocumentNumber() {
        return DocumentNumber;
    }

    /**
     * Altera o número do documento
     * @param DocumentNumber 
     */
    public void setDocumentNumber(String DocumentNumber) {
        this.DocumentNumber = DocumentNumber;
    }

    /**
     * Retorna o tipo de documento
     * @return 
     */
    public DocumentTypeEnum getDocumentType() {
        return DocumentType;
    }

    /**
     * Altera o tipo de documento
     * @param DocumentType 
     */
    public void setDocumentType(DocumentTypeEnum DocumentType) {
        this.DocumentType = DocumentType;
    }

    /**
     * Retorna o email
     * @return 
     */
    public String getEmail() {
        return Email;
    }

    /**
     * Altera o email
     * @param Email 
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Retorna o tipo de email
     * @return 
     */
    public EmailTypeEnum getEmailType() {
        return EmailType;
    }

    /**
     * Altera o tipo de email
     * @param EmailType 
     */
    public void setEmailType(EmailTypeEnum EmailType) {
        this.EmailType = EmailType;
    }

    /**
     * Retorna o Id do Facebook
     * @return 
     */
    public String getFacebookId() {
        return FacebookId;
    }

    /**
     * Altera o Id do Facebook
     * @param FacebookId 
     */
    public void setFacebookId(String FacebookId) {
        this.FacebookId = FacebookId;
    }

    /**
     * Retorna o gênero
     * @return 
     */
    public GenderEnum getGender() {
        return Gender;
    }

    /**
     * Altera o gênero
     * @param Gender 
     */
    public void setGender(GenderEnum Gender) {
        this.Gender = Gender;
    }

    /**
     * Retorna o telefone
     * @return 
     */
    public String getHomePhone() {
        return HomePhone;
    }

    /**
     * Altera o telefone
     * @param HomePhone 
     */
    public void setHomePhone(String HomePhone) {
        this.HomePhone = HomePhone;
    }

    /**
     * Retorna o endereço de Ip
     * @return 
     */
    public String getIpAddress() {
        return IpAddress;
    }

    /**
     * Altera o endereço de Ip
     * @param IpAddress 
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Retorna a data do último update na loja
     * @return 
     */
    public Date getLastBuyerUpdateInMerchant() {
        return LastBuyerUpdateInMerchant;
    }

    /**
     * Altera a data do último update na loja
     * @param LastBuyerUpdateInMerchant 
     */
    public void setLastBuyerUpdateInMerchant(Date LastBuyerUpdateInMerchant) {
        this.LastBuyerUpdateInMerchant = LastBuyerUpdateInMerchant;
    }

    /**
     * Retorna o telefone
     * @return 
     */
    public String getMobilePhone() {
        return MobilePhone;
    }

    /**
     * Altera o telefone
     * @param MobilePhone 
     */
    public void setMobilePhone(String MobilePhone) {
        this.MobilePhone = MobilePhone;
    }

    /**
     * Retorna o Nome
     * @return 
     */
    public String getName() {
        return Name;
    }

    /**
     * Altera o Nome
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Retorna o tipo de pessoa
     * @return 
     */
    public PersonTypeEnum getPersonType() {
        return PersonType;
    }

    /**
     * Altera o tipo de pessoa
     * @param PersonType 
     */
    public void setPersonType(PersonTypeEnum PersonType) {
        this.PersonType = PersonType;
    }

     /**
     * Retorna sucesso
     * @return 
     */
    public Boolean getSuccess() {
        return Success;
    }

    /**
     * Define sucesso
     * @param Success 
     */
    public void setSuccess(Boolean Success) {
        this.Success = Success;
    }
    
    /**
     * Retorna o Id do Twitter
     * @return 
     */
    public String getTwitterId() {
        return TwitterId;
    }

    /**
     * Altera o Id do Twitter
     * @param TwitterId 
     */
    public void setTwitterId(String TwitterId) {
        this.TwitterId = TwitterId;
    }

    /**
     * Retorna o telefone
     * @return 
     */
    public String getWorkPhone() {
        return WorkPhone;
    }

    /**
     * Altera o telefone
     * @param WorkPhone 
     */
    public void setWorkPhone(String WorkPhone) {
        this.WorkPhone = WorkPhone;
    }
}
