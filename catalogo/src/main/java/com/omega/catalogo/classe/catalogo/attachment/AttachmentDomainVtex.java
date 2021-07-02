package com.smartbr.vtex.classes.catalogo.attachment;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author GiovanniFC
 */
public class AttachmentDomainVtex implements Serializable{
    
    @JsonProperty("fieldName")
    private String nomeCampo;
    
    @JsonProperty("maxCaracters")
    private String caracteresMax;
    
    @JsonProperty("domainValues")
    private String valoresDominio;

    public String getNomeCampo() {
        return nomeCampo;
    }

    public void setNomeCampo(String nomeCampo) {
        this.nomeCampo = nomeCampo;
    }

    public String getCaracteresMax() {
        return caracteresMax;
    }

    public void setCaracteresMax(String caracteresMax) {
        this.caracteresMax = caracteresMax;
    }

    public String getValoresDominio() {
        return valoresDominio;
    }

    public void setValoresDominio(String valoresDominio) {
        this.valoresDominio = valoresDominio;
    }
}
