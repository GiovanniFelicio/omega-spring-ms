package com.omega.faturamento.enums;

/**
 *
 * @author ENGCARVALHO
 */
public enum EnumStatusNotaFiscal {

    AU("AU", "Autorizada"),
    DN("DN", "Denegada"),
    CN("CN", "Cancelada"),
    XX("XX", "Erro Transmissão"),
    ;

    private final String key, value;
    
    private EnumStatusNotaFiscal(String key, String value) {
        this.key = key;
        this.value = value;
    }
    
    public String getKey() {
        return key;
    }
    
    public String getValue() {
        return value;
    }
}
