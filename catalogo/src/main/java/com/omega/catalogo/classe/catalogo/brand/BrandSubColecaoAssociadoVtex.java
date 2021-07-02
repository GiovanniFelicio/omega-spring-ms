package com.smartbr.vtex.classes.catalogo.brand;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author GiovanniFC
 */
public class BrandSubColecaoAssociadoVtex implements Serializable{
    
    @JsonProperty("brandId")
    private Integer idMarca;
    
    @JsonProperty("subCollectionId")
    private Integer idSubColecao;

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public Integer getIdSubColecao() {
        return idSubColecao;
    }

    public void setIdSubColecao(Integer idSubColecao) {
        this.idSubColecao = idSubColecao;
    }
}
