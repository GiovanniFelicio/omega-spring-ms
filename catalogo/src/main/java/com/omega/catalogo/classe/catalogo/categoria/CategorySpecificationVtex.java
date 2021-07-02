package com.smartbr.vtex.classes.catalogo.categoria;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author GiovanniFC
 */
public class CategorySpecificationVtex implements Serializable{
    
    @JsonProperty("name")
    private String nome;
    
    @JsonProperty("categoryId")
    private Integer idCategoria;
    
    @JsonProperty("fieldId")
    private Integer idCampo;
    
    @JsonProperty("isActive")
    private Boolean ativo;
    
    @JsonProperty("isStockKeepingUnit")
    private Boolean manutencaoUnidadeEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getIdCampo() {
        return idCampo;
    }

    public void setIdCampo(Integer idCampo) {
        this.idCampo = idCampo;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Boolean getManutencaoUnidadeEstoque() {
        return manutencaoUnidadeEstoque;
    }

    public void setManutencaoUnidadeEstoque(Boolean manutencaoUnidadeEstoque) {
        this.manutencaoUnidadeEstoque = manutencaoUnidadeEstoque;
    }
}
