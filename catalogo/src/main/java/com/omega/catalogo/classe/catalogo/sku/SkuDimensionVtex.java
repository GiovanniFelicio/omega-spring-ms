package com.smartbr.vtex.classes.catalogo.sku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author GiovanniFC
 */
public class SkuDimensionVtex implements Serializable{

    @JsonProperty("Cubicweight")
    private BigDecimal pesoCubico;

    @JsonProperty("Height")
    private BigDecimal altura;

    @JsonProperty("Length")
    private BigDecimal comprimento;

    @JsonProperty("Width")
    private BigDecimal largura;

    public BigDecimal getPesoCubico() {
        return pesoCubico;
    }

    public void setPesoCubico(BigDecimal pesoCubico) {
        this.pesoCubico = pesoCubico;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public BigDecimal getComprimento() {
        return comprimento;
    }

    public void setComprimento(BigDecimal comprimento) {
        this.comprimento = comprimento;
    }

    public BigDecimal getLargura() {
        return largura;
    }

    public void setLargura(BigDecimal largura) {
        this.largura = largura;
    }
}
