/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omega.catalogo.enums;

/**
 *
 * @author operadoror
 */
public enum EnumSKUSelectionMode {

    LIST("LIST","Lista"),
    COMBO("COMBO","Combo Box"),
    RADIO("RADIO","Radio Box"),
    SPECIFICATION("SPECIFICATION","Especificação"),
    ;

    private final String key, value;
    
    EnumSKUSelectionMode(String key, String value) {
        this.key = key;
        this.value = value;
    }
    
    public Object getKey() {
        return key;
    }
    
    public String getValue() {
        return value;
    }
}
