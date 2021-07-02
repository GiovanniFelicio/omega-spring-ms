package com.smartbr.vtex.classes.catalogo.sku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author GiovanniFC
 */
public class SkuComplementVtex implements Serializable {

    @JsonProperty("Id")
    private Integer id;

    @JsonProperty("ParentSkuId")
    private Integer idSkuPai;

    @JsonProperty("SkuId")
    private Integer idSku;

    @JsonProperty("ComplementTypeId")
    private Integer idTipoComplemento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdSkuPai() {
        return idSkuPai;
    }

    public void setIdSkuPai(Integer idSkuPai) {
        this.idSkuPai = idSkuPai;
    }

    public Integer getIdSku() {
        return idSku;
    }

    public void setIdSku(Integer idSku) {
        this.idSku = idSku;
    }

    public Integer getIdTipoComplemento() {
        return idTipoComplemento;
    }

    public void setIdTipoComplemento(Integer idTipoComplemento) {
        this.idTipoComplemento = idTipoComplemento;
    }
}
