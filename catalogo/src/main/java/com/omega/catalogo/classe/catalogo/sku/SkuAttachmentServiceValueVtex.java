package com.smartbr.vtex.classes.catalogo.sku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author GiovanniFC
 */
public class SkuAttachmentServiceValueVtex implements Serializable {

    @JsonProperty("SkuServiceTypeId")
    private Integer idTipoServicoSku;

    @JsonProperty("Name")
    private String nome;

    @JsonProperty("Value")
    private String valor;

    @JsonProperty("Cost")
    private String custo;

    public Integer getIdTipoServicoSku() {
        return idTipoServicoSku;
    }

    public void setIdTipoServicoSku(Integer idTipoServicoSku) {
        this.idTipoServicoSku = idTipoServicoSku;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getCusto() {
        return custo;
    }

    public void setCusto(String custo) {
        this.custo = custo;
    }
}