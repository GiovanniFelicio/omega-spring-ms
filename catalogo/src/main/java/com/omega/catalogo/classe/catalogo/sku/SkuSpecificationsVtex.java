/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartbr.vtex.classes.catalogo.sku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author GiovanniFC
 */
public class SkuSpecificationsVtex implements Serializable{
    
    @JsonProperty("FieldId")
    private Integer idCampo;
    
    @JsonProperty("FieldName")
    private String nomeCampo;
    
    @JsonProperty("FieldValueIds")
    private List<Integer> idsValorCampo;
    
    @JsonProperty("FieldValues")
    private List<String> valoresCampo;

    public Integer getIdCampo() {
        return idCampo;
    }

    public void setIdCampo(Integer idCampo) {
        this.idCampo = idCampo;
    }

    public String getNomeCampo() {
        return nomeCampo;
    }

    public void setNomeCampo(String nomeCampo) {
        this.nomeCampo = nomeCampo;
    }

    public List<Integer> getIdsValorCampo() {
        return idsValorCampo;
    }

    public void setIdsValorCampo(List<Integer> idsValorCampo) {
        this.idsValorCampo = idsValorCampo;
    }

    public List<String> getValoresCampo() {
        return valoresCampo;
    }

    public void setValoresCampo(List<String> valoresCampo) {
        this.valoresCampo = valoresCampo;
    }

}
