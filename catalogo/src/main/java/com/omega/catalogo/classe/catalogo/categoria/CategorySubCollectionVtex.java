package com.smartbr.vtex.classes.catalogo.categoria;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author GiovanniFC
 */
public class CategorySubCollectionVtex implements Serializable{

    @JsonProperty("categoryId")    
    private Integer idCategoria;

    @JsonProperty("subCollectionId")    
    private Integer idSubCollection;

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getIdSubCollection() {
        return idSubCollection;
    }

    public void setIdSubCollection(Integer idSubCollection) {
        this.idSubCollection = idSubCollection;
    }
}
