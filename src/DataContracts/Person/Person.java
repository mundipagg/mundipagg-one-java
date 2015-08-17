package DataContracts.Person;

import EnumTypes.DocumentTypeEnum;
import EnumTypes.EmailTypeEnum;
import EnumTypes.GenderEnum;
import EnumTypes.PersonTypeEnum;
import java.util.Date;

/**
 * Dados da pessoa
 */
public class Person {
    
    /**
      * Construtor da Classe
      */
    public Person() {} 
    
    /**
     * Data de nascimento
     */
    private Date Birthdate;
    
    /**
     * Número do documento
     */
    private String DocumentNumber;

    /**
     * Tipo de documento
     */
    private DocumentTypeEnum DocumentType;   
    
    /**
     * E-mail
     */
    private String Email;

    /**
     * Tipo de e-mail. Pessoal ou comercial
     */
    private EmailTypeEnum EmailType;
    
    /**
     * Código identificador do cadsastro do Facebook
     */
    private String FacebookId;
    
    /**
     * Sexo da pessoa
     */
    private GenderEnum Gender;
    
    /**
     * Telefone residencial
     */
    private String HomePhone;
    
    /**
     * Telefone celular
     */
    private String MobilePhone;
    
    /**
      * Nome da pessoa
      */
    private String Name;

    /**
     * Define se é pessoa física ou jurídica
     */
    private PersonTypeEnum PersonType;

    /**
     * Código identificador do cadastro do Twitter
     */
    private String TwitterId;

    /**
     * Telefone comercial
     */
    private String WorkPhone;

    /**
     * Recupera Nome da pessoa
     * @return 
     */
    public String getName() {
        return Name;
    }

    /**
     * Altera Nome da pessoa
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Recupera Tipo da pessoa
     * @return 
     */
    public PersonTypeEnum getPersonType() {
        return PersonType;
    }

    /**
     * Altera Tipo da pessoa
     * @param PersonType 
     */
    public void setPersonType(PersonTypeEnum PersonType) {
        this.PersonType = PersonType;
    }

    /**
     * Recupera número do documento
     * @return 
     */
    public String getDocumentNumber() {
        return DocumentNumber;
    }

    /**
     * Altera número do documento
     * @param DocumentNumber 
     */
    public void setDocumentNumber(String DocumentNumber) {
        this.DocumentNumber = DocumentNumber;
    }

    /**
     * Recupera tipo do documento
     * @return 
     */
    public DocumentTypeEnum getDocumentType() {
        return DocumentType;
    }

    /**
     * Altera tipo do documento
     * @param DocumentType 
     */
    public void setDocumentType(DocumentTypeEnum DocumentType) {
        this.DocumentType = DocumentType;
    }

    /**
     * Recupera gênero da pessoa
     * @return 
     */
    public GenderEnum getGender() {
        return Gender;
    }

    /**
     * Altera gênero da pessoa
     * @param Gender 
     */
    public void setGender(GenderEnum Gender) {
        this.Gender = Gender;
    }

    /**
     * Recupera data de nascimento
     * @return 
     */
    public Date getBirthdate() {
        return Birthdate;
    }

    /**
     * Altera data de nascimento
     * @param Birthdate 
     */
    public void setBirthdate(Date Birthdate) {
        this.Birthdate = Birthdate;
    }

    /**
     * Recupera endereço de email
     * @return 
     */
    public String getEmail() {
        return Email;
    }

    /**
     * Altera endereço de email
     * @param Email 
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * Recupera Tipo de email
     * @return 
     */
    public EmailTypeEnum getEmailType() {
        return EmailType;
    }

    /**
     * Altera Tipo de email
     * @param EmailType 
     */
    public void setEmailType(EmailTypeEnum EmailType) {
        this.EmailType = EmailType;
    }

    /**
     * Recupera ID do facebook
     * @return 
     */
    public String getFacebookId() {
        return FacebookId;
    }

    /**
     * Altera ID do facebook
     * @param FacebookId 
     */
    public void setFacebookId(String FacebookId) {
        this.FacebookId = FacebookId;
    }

    /**
     * Recupera ID do Twitter
     * @return 
     */
    public String getTwitterId() {
        return TwitterId;
    }

    /**
     * Altera ID do twitter
     * @param TwitterId 
     */
    public void setTwitterId(String TwitterId) {
        this.TwitterId = TwitterId;
    }

    /**
     * Recupera telefone celular
     * @return 
     */
    public String getMobilePhone() {
        return MobilePhone;
    }

    /**
     * Altera telefone celular
     * @param MobilePhone 
     */
    public void setMobilePhone(String MobilePhone) {
        this.MobilePhone = MobilePhone;
    }

    /**
     * Recupera telefone residencial
     * @return 
     */
    public String getHomePhone() {
        return HomePhone;
    }

    /**
     * Altera telefone residencial
     * @param HomePhone 
     */
    public void setHomePhone(String HomePhone) {
        this.HomePhone = HomePhone;
    }

    /**
     * Recupera telefone comercial
     * @return 
     */
    public String getWorkPhone() {
        return WorkPhone;
    }

    /**
     * Altera telefone comercial
     * @param WorkPhone 
     */
    public void setWorkPhone(String WorkPhone) {
        this.WorkPhone = WorkPhone;
    }
}
