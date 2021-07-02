/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartbr.vtex.classes.catalogo.colecao;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author GiovanniFC
 */
public class CollectionProductDataVtex implements Serializable{
    
    @JsonProperty("productId")
    private Integer idProduto;
    
    @JsonProperty("skuId")
    private Integer idSku;
    
    @JsonProperty("subCollectionId")
    private Integer idSubColecao;
    
    @JsonProperty("position")
    private Integer posicao;
    
    @JsonProperty("productName")
    private String nomeProduto;
    
    @JsonProperty("skuImageUrl")
    private String imageUrlSku;

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Integer getIdSku() {
        return idSku;
    }

    public void setIdSku(Integer idSku) {
        this.idSku = idSku;
    }

    public Integer getIdSubColecao() {
        return idSubColecao;
    }

    public void setIdSubColecao(Integer idSubColecao) {
        this.idSubColecao = idSubColecao;
    }

    public Integer getPosicao() {
        return posicao;
    }

    public void setPosicao(Integer posicao) {
        this.posicao = posicao;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getImageUrlSku() {
        return imageUrlSku;
    }

    public void setImageUrlSku(String imageUrlSku) {
        this.imageUrlSku = imageUrlSku;
    }    
}
