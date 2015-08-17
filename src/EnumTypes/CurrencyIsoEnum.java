/*
 * To change this license header), choose License Headers in Project Properties.
 * To change this template file), choose Tools | Templates
 * and open the template in the editor.
 */
package EnumTypes;

/**
 * Enumerador para tipo de moeda
 */
public enum CurrencyIsoEnum {
    
    /**
     * Real
     */
    BRL(986),

    /**
     * Euro
     */
    EUR(978),

    /**
     * Dólar
     */    
    USD(840),

    /**
     * Argentine peso
     */    
    ARS(32),

    /**
     * Boliviano
     */    
    BOB(68),


    /** 
     * Chilean peso
     */    
    CLP(152),

    /**
     * Colombian peso
     */    
    COP(170),

    /**
     * Uruguayan peso
     */    
    UYU(858),

    /**
     * Peso Mexicano
     */    
    MXN(484),

    /**
     * Paraguayan guaraní
     */
    PYG(600);
    
    private final long value;
    
    private CurrencyIsoEnum(long value) {
        this.value = value;
    }

    /**
     * Recupera valor do enumerador
     * @return 
     */
    public long getValue() {
        return this.value;
    }
}
