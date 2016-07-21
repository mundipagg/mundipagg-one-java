package DataContracts;

import EnumTypes.ErrorCategoryEnum;
import java.util.ArrayList;
import java.util.List;

/**
 * Relação de erros 
 */
public final class ErrorReport {

    /**
     * Construtor da classe
     */
    public ErrorReport() {
        this.setErrorItemCollection(new ArrayList());
    }
    
    /**
     * Categoria do erro
     */
    private ErrorCategoryEnum Category;
    
    /**
     * Coleção de Erros
     */
    private List<ErrorItem> ErrorItemCollection;

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
    public List<ErrorItem> getErrorItemCollection() {
        return ErrorItemCollection;
    }

    /**
     * Altera coleção de erros
     * @param ErrorItemCollection 
     */
    public void setErrorItemCollection(List<ErrorItem> ErrorItemCollection) {
        this.ErrorItemCollection = ErrorItemCollection;
    }   
}
