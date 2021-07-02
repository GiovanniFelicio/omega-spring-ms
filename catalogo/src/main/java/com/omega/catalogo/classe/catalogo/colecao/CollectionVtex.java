package com.smartbr.vtex.classes.catalogo.colecao;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.smartbr.vtex.classes.PageVtex;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author GiovanniFC
 */
public class CollectionVtex implements Serializable {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private Integer nome;

    @JsonProperty("searchable")
    private Integer paginavel;

    @JsonProperty("highlight")
    private Integer destaque;

    @JsonProperty("dateFrom")
    private Integer dataDe;

    @JsonProperty("dateTo")
    private Integer dataPara;

    @JsonProperty("description")
    private Integer descricao;

    @JsonProperty("paging")
    private PageVtex paging;

    @JsonProperty("items")
    private List<CollectionItemVtex> items;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNome() {
        return nome;
    }

    public void setNome(Integer nome) {
        this.nome = nome;
    }

    public Integer getPaginavel() {
        return paginavel;
    }

    public void setPaginavel(Integer paginavel) {
        this.paginavel = paginavel;
    }

    public Integer getDestaque() {
        return destaque;
    }

    public void setDestaque(Integer destaque) {
        this.destaque = destaque;
    }

    public Integer getDataDe() {
        return dataDe;
    }

    public void setDataDe(Integer dataDe) {
        this.dataDe = dataDe;
    }

    public Integer getDataPara() {
        return dataPara;
    }

    public void setDataPara(Integer dataPara) {
        this.dataPara = dataPara;
    }

    public Integer getDescricao() {
        return descricao;
    }

    public void setDescricao(Integer descricao) {
        this.descricao = descricao;
    }
    
    public PageVtex getPaging() {
        return paging;
    }

    public void setPaging(PageVtex paging) {
        this.paging = paging;
    }

    public List<CollectionItemVtex> getItems() {
        return items;
    }

    public void setItems(List<CollectionItemVtex> items) {
        this.items = items;
    }
}
