package com.smartbr.vtex.classes.catalogo.sku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author GiovanniFC
 */
public class SkuKitVtex implements Serializable{
    
    @JsonProperty("Id")
    private Integer id;
    
    @JsonProperty("StockKeepingUnitParent")
    private Integer unidadeManutencaoEstoquePai;
    
    @JsonProperty("StockKeepingUnitId")
    private Integer idUnidadeManutencaoEstoque;
    
    @JsonProperty("Quantity")
    private Integer quantidade;
    
    @JsonProperty("UnitPrice")
    private Integer precoUnidade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUnidadeManutencaoEstoquePai() {
        return unidadeManutencaoEstoquePai;
    }

    public void setUnidadeManutencaoEstoquePai(Integer unidadeManutencaoEstoquePai) {
        this.unidadeManutencaoEstoquePai = unidadeManutencaoEstoquePai;
    }

    public Integer getIdUnidadeManutencaoEstoque() {
        return idUnidadeManutencaoEstoque;
    }

    public void setIdUnidadeManutencaoEstoque(Integer idUnidadeManutencaoEstoque) {
        this.idUnidadeManutencaoEstoque = idUnidadeManutencaoEstoque;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getPrecoUnidade() {
        return precoUnidade;
    }

    public void setPrecoUnidade(Integer precoUnidade) {
        this.precoUnidade = precoUnidade;
    }
}
