package com.smartbr.vtex.classes.catalogo.sku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author GiovanniFC
 */
public class SkuAttachmentServiceTypeVtex implements Serializable {

    @JsonProperty("Id")
    private Integer id;

    @JsonProperty("AttachmentId")
    private Integer idAttachment;

    @JsonProperty("SkuServiceTypeId")
    private Integer idTipoServicoSku;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdAttachment() {
        return idAttachment;
    }

    public void setIdAttachment(Integer idAttachment) {
        this.idAttachment = idAttachment;
    }

    public Integer getIdTipoServicoSku() {
        return idTipoServicoSku;
    }

    public void setIdTipoServicoSku(Integer idTipoServicoSku) {
        this.idTipoServicoSku = idTipoServicoSku;
    }
}