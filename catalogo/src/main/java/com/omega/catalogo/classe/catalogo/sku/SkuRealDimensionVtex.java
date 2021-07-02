package com.smartbr.vtex.classes.catalogo.sku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author GiovanniFC
 */
public class SkuRealDimensionVtex implements Serializable {

    @JsonProperty("RealCubicWeight")
    private BigDecimal pesoCubicoReal;

    @JsonProperty("RealHeight")
    private BigDecimal alturaReal;

    @JsonProperty("RealLength")
    private BigDecimal comprimentoReal;

    @JsonProperty("RealWeight")
    private BigDecimal pesoReal;

    @JsonProperty("RealWidth")
    private BigDecimal larguraReal;

    public BigDecimal getPesoCubicoReal() {
        return pesoCubicoReal;
    }

    public void setPesoCubicoReal(BigDecimal pesoCubicoReal) {
        this.pesoCubicoReal = pesoCubicoReal;
    }

    public BigDecimal getAlturaReal() {
        return alturaReal;
    }

    public void setAlturaReal(BigDecimal alturaReal) {
        this.alturaReal = alturaReal;
    }

    public BigDecimal getComprimentoReal() {
        return comprimentoReal;
    }

    public void setComprimentoReal(BigDecimal comprimentoReal) {
        this.comprimentoReal = comprimentoReal;
    }

    public BigDecimal getPesoReal() {
        return pesoReal;
    }

    public void setPesoReal(BigDecimal pesoReal) {
        this.pesoReal = pesoReal;
    }

    public BigDecimal getLarguraReal() {
        return larguraReal;
    }

    public void setLarguraReal(BigDecimal larguraReal) {
        this.larguraReal = larguraReal;
    }
}
