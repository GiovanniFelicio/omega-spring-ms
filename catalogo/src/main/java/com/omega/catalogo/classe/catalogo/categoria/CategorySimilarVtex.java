package com.smartbr.vtex.classes.catalogo.categoria;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author GiovanniFC
 */
public class CategorySimilarVtex implements Serializable{
    
    @JsonProperty("productId")
    private Integer idProduto;
    
    @JsonProperty("storeId")
    private Integer idLoja;

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(Integer idLoja) {
        this.idLoja = idLoja;
    }
}
