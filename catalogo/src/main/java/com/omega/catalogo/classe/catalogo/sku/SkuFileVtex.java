package com.smartbr.vtex.classes.catalogo.sku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author GiovanniFC
 */
public class SkuFileVtex implements Serializable {

    @JsonProperty("Id")
    private Integer id;

    @JsonProperty("ArchiveId")
    private Integer idArquivo;

    @JsonProperty("SkuId")
    private Integer idSku;

    @JsonProperty("Name")
    private String nome;

    @JsonProperty("IsMain")
    private Boolean main;

    @JsonProperty("Label")
    private Integer label;

    @JsonProperty("Url")
    private String url;

    @JsonProperty("Text")
    private String text;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdArquivo() {
        return idArquivo;
    }

    public void setIdArquivo(Integer idArquivo) {
        this.idArquivo = idArquivo;
    }

    public Integer getIdSku() {
        return idSku;
    }

    public void setIdSku(Integer idSku) {
        this.idSku = idSku;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean isMain() {
        return main;
    }

    public void setMain(Boolean main) {
        this.main = main;
    }

    public Integer getLabel() {
        return label;
    }

    public void setLabel(Integer label) {
        this.label = label;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}