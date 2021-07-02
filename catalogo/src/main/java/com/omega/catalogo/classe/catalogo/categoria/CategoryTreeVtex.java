/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartbr.vtex.classes.catalogo.categoria;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.smartbr.vtex.classes.AbstractVtex;
import java.util.List;

/**
 *
 * @author GiovanniFC
 */
public class CategoryTreeVtex extends AbstractVtex{

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String nome;

    @JsonProperty("hasChildren")
    private Boolean filhos;

    @JsonProperty("url")
    private String url;

    @JsonProperty("children")
    private List<CategoryTreeVtex> categoriaVtexs;

    @JsonProperty("title")
    private String titulos;

    @JsonProperty("metaTagDescription")
    private String descricaoMetaTag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean isFilhos() {
        return filhos;
    }

    public void setFilhos(Boolean filhos) {
        this.filhos = filhos;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<CategoryTreeVtex> getCategoriaVtexs() {
        return categoriaVtexs;
    }

    public void setCategoriaVtexs(List<CategoryTreeVtex> categoriaVtexs) {
        this.categoriaVtexs = categoriaVtexs;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public String getDescricaoMetaTag() {
        return descricaoMetaTag;
    }

    public void setDescricaoMetaTag(String descricaoMetaTag) {
        this.descricaoMetaTag = descricaoMetaTag;
    }
}
