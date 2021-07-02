package com.smartbr.vtex.classes.catalogo.sku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author GiovanniFC
 */
public class SkuImageVtex implements Serializable{
    
    @JsonProperty("ImageUrl")
    private String imageUrl;
    
    @JsonProperty("ImageName")
    private String imageNome;
    
    @JsonProperty("IdField")
    private Integer idCampo;

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageNome() {
        return imageNome;
    }

    public void setImageNome(String imageNome) {
        this.imageNome = imageNome;
    }

    public Integer getIdCampo() {
        return idCampo;
    }

    public void setIdCampo(Integer idCampo) {
        this.idCampo = idCampo;
    }
    
    
}
