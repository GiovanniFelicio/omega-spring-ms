package com.smartbr.vtex.classes.catalogo.produto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
*
* @author GiovanniFC
*/
public class AssociateProductSpecificationVtex implements Serializable{
    
    @JsonProperty("fieldId")
    private Integer numeroCampo;
        
    @JsonProperty("fieldValueId")
    private Integer valorNumeroCampo;
    
    @JsonProperty("text")
    private String texto;

    public Integer getNumeroCampo() {
        return numeroCampo;
    }

    public void setNumeroCampo(Integer numeroCampo) {
        this.numeroCampo = numeroCampo;
    }

    public Integer getValorNumeroCampo() {
        return valorNumeroCampo;
    }

    public void setValorNumeroCampo(Integer valorNumeroCampo) {
        this.valorNumeroCampo = valorNumeroCampo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
}
