package com.smartbr.vtex.classes.catalogo.sku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author GiovanniFC
 */
public class SkuServiceVtex implements Serializable {

    @JsonProperty("Id")
    private Integer id;

    @JsonProperty("Name")
    private String nome;

    @JsonProperty("Text")
    private String texto;

    @JsonProperty("IsActive")
    private Boolean ativo;

    @JsonProperty("SkuServiceTypeId")
    private Integer idTipoServicoSku;

    @JsonProperty("SkuServiceValueId")
    private Integer idValorServicoSku;

    @JsonProperty("SkuId")
    private Integer idSku;

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

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Integer getIdTipoServicoSku() {
        return idTipoServicoSku;
    }

    public void setIdTipoServicoSku(Integer idTipoServicoSku) {
        this.idTipoServicoSku = idTipoServicoSku;
    }

    public Integer getIdValorServicoSku() {
        return idValorServicoSku;
    }

    public void setIdValorServicoSku(Integer idValorServicoSku) {
        this.idValorServicoSku = idValorServicoSku;
    }

    public Integer getIdSku() {
        return idSku;
    }

    public void setIdSku(Integer idSku) {
        this.idSku = idSku;
    }
}
