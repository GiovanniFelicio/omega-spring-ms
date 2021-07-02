package com.smartbr.vtex.classes.catalogo.colecao;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author GiovanniFC
 */
public class CollectionItemVtex implements Serializable {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String nome;

    @JsonProperty("searchable")
    private Boolean pesquisavel;

    @JsonProperty("highlight")
    private Boolean destaque;

    @JsonProperty("dateFrom")
    private String dataDe;

    @JsonProperty("dateTo")
    private String dataPara;

    @JsonProperty("totalSku")
    private Integer totalSku;

    @JsonProperty("totalProducts")
    private Integer totalProdutos;

    @JsonProperty("type")
    private String tipo;

    @JsonProperty("lastModifiedBy")
    private String modificadoUltimoPor;

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

    public Boolean getPesquisavel() {
        return pesquisavel;
    }

    public void setPesquisavel(Boolean pesquisavel) {
        this.pesquisavel = pesquisavel;
    }

    public Boolean getDestaque() {
        return destaque;
    }

    public void setDestaque(Boolean destaque) {
        this.destaque = destaque;
    }

    public String getDataDe() {
        return dataDe;
    }

    public void setDataDe(String dataDe) {
        this.dataDe = dataDe;
    }

    public String getDataPara() {
        return dataPara;
    }

    public void setDataPara(String dataPara) {
        this.dataPara = dataPara;
    }

    public Integer getTotalSku() {
        return totalSku;
    }

    public void setTotalSku(Integer totalSku) {
        this.totalSku = totalSku;
    }

    public Integer getTotalProdutos() {
        return totalProdutos;
    }

    public void setTotalProdutos(Integer totalProdutos) {
        this.totalProdutos = totalProdutos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModificadoUltimoPor() {
        return modificadoUltimoPor;
    }

    public void setModificadoUltimoPor(String modificadoUltimoPor) {
        this.modificadoUltimoPor = modificadoUltimoPor;
    }
}