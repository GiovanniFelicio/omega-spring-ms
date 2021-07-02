package com.smartbr.vtex.classes.catalogo.sku;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author GiovanniFC
 */
public class SkuAttachmentVtex {

    @JsonProperty("Id")
    private Integer id;
    
    @JsonProperty("AttachmentId")
    private Integer idAttachment;

    @JsonProperty("SkuId")
    private Integer idSku;

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

    public Integer getIdSku() {
        return idSku;
    }

    public void setIdSku(Integer idSku) {
        this.idSku = idSku;
    }
}
