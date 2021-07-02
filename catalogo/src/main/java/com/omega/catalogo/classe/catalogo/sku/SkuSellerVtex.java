package com.smartbr.vtex.classes.catalogo.sku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author GiovanniFC
 */
public class SkuSellerVtex implements Serializable {

    @JsonProperty("SellerId")
    private String idVendendor;

    @JsonProperty("StockKeepingUnitId")
    private Integer idUnidadeManutencaoEstoque;

    @JsonProperty("SellerStockKeepingUnitId")
    private String idEstoqueVendendorManutencaoUnidade;

    @JsonProperty("IsActive")
    private Boolean ativo;

    @JsonProperty("FreightCommissionPercentage")
    private BigDecimal porcentagemComissaoFrete;

    @JsonProperty("ProductCommissionPercentage")
    private BigDecimal porcentagemComissaoProduto;
    
    @JsonProperty("UpdateDate")
    private Date dataAtualizacao;
    
    @JsonProperty("RequestUpdateDate")
    private Date dataAtualizacaoSolicitada;
    
    @JsonProperty("IsRemoved")
    private Boolean removido;
    
    @JsonProperty("IsPersisted")
    private Boolean persistido;
    
    @JsonProperty("SkuSellerId")
    private Integer idVendedorSku;

    public String getIdVendendor() {
        return idVendendor;
    }

    public void setIdVendendor(String idVendendor) {
        this.idVendendor = idVendendor;
    }

    public Integer getIdUnidadeManutencaoEstoque() {
        return idUnidadeManutencaoEstoque;
    }

    public void setIdUnidadeManutencaoEstoque(Integer idUnidadeManutencaoEstoque) {
        this.idUnidadeManutencaoEstoque = idUnidadeManutencaoEstoque;
    }

    public String getIdEstoqueVendendorManutencaoUnidade() {
        return idEstoqueVendendorManutencaoUnidade;
    }

    public void setIdEstoqueVendendorManutencaoUnidade(String idEstoqueVendendorManutencaoUnidade) {
        this.idEstoqueVendendorManutencaoUnidade = idEstoqueVendendorManutencaoUnidade;
    }

    public Boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public BigDecimal getPorcentagemComissaoFrete() {
        return porcentagemComissaoFrete;
    }

    public void setPorcentagemComissaoFrete(BigDecimal porcentagemComissaoFrete) {
        this.porcentagemComissaoFrete = porcentagemComissaoFrete;
    }

    public BigDecimal getPorcentagemComissaoProduto() {
        return porcentagemComissaoProduto;
    }

    public void setPorcentagemComissaoProduto(BigDecimal porcentagemComissaoProduto) {
        this.porcentagemComissaoProduto = porcentagemComissaoProduto;
    }

    public Date getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(Date dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public Date getDataAtualizacaoSolicitada() {
        return dataAtualizacaoSolicitada;
    }

    public void setDataAtualizacaoSolicitada(Date dataAtualizacaoSolicitada) {
        this.dataAtualizacaoSolicitada = dataAtualizacaoSolicitada;
    }

    public Boolean getRemovido() {
        return removido;
    }

    public void setRemovido(Boolean removido) {
        this.removido = removido;
    }

    public Boolean getPersistido() {
        return persistido;
    }

    public void setPersistido(Boolean persistido) {
        this.persistido = persistido;
    }

    public Integer getIdVendedorSku() {
        return idVendedorSku;
    }

    public void setIdVendedorSku(Integer idVendedorSku) {
        this.idVendedorSku = idVendedorSku;
    }
}
