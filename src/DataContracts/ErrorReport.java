package DataContracts;

import EnumTypes.ErrorCategoryEnum;
import java.util.ArrayList;

/**
 * Relação de erros 
 */
public class ErrorReport {

    /**
     * Construtor da classe
     */
    public ErrorReport() {}
    
    /**
     * Categoria do erro
     */
    public ErrorCategoryEnum Category;
    
    /**
     * Coleção de Erros
     */
    public ArrayList<ErrorItem> ErrorItemCollection;

    /**
     * Recupera categoria do erro
     * @return 
     */
    public ErrorCategoryEnum getCategory() {
        return Category;
    }

    /**
     * Altera categoria do erro
     * @param Category 
     */
    public void setCategory(ErrorCategoryEnum Category) {
        this.Category = Category;
    }

    /**
     * Recupera coleção de erros
     * @return 
     */
    public ArrayList<ErrorItem> getErrorItemCollection() {
        return ErrorItemCollection;
    }

    /**
     * Altera coleção de erros
     * @param ErrorItemCollection 
     */
    public void setErrorItemCollection(ArrayList<ErrorItem> ErrorItemCollection) {
        this.ErrorItemCollection = ErrorItemCollection;
    }   
}
