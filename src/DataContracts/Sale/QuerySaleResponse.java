package DataContracts.Sale;

import DataContracts.BaseResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Resposta da consulta de pedidos
 */
public final class QuerySaleResponse extends BaseResponse {
    
    /**
     * Construtor da Classe
     */
    public QuerySaleResponse() 
    {
        this.setSaleDataCollection(new ArrayList());
    }
    
    /**
     * Lista de vendas
     */
    private List<SaleData> SaleDataCollection;

    /**
     * Indicador Total de Vendas
     */
    private Integer SaleDataCount;

    /**
     * Recupera Lista de vendas
     * @return 
     */
    public List<SaleData> getSaleDataCollection() {
        return SaleDataCollection;
    }

    /**
     * Altera Lista de vendas
     * @param SaleDataCollection 
     */
    public void setSaleDataCollection(List<SaleData> SaleDataCollection) {
        this.SaleDataCollection = SaleDataCollection;
    }

    /**
     * Recupera Indicador do total de vendas
     * @return 
     */
    public Integer getSaleDataCount() {
        return SaleDataCount;
    }

    /**
     * Altera Indicador do total de vendas
     * @param SaleDataCount 
     */
    public void setSaleDataCount(Integer SaleDataCount) {
        this.SaleDataCount = SaleDataCount;
    }
}
