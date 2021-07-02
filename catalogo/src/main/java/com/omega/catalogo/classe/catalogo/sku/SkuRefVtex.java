/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smartbr.vtex.classes.catalogo.sku;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author GiovanniFC
 */
public class SkuRefVtex implements Serializable{

    @JsonProperty("Id")
    private Integer id;

    @JsonProperty("ProductId")
    private Integer idProduto;

    @JsonProperty("IsActive")
    private Boolean ativo;

    @JsonProperty("Name")
    private String nome;

    @JsonProperty("RefId")
    private String idRef;

    @JsonProperty("PackagedHeight")
    private Integer alturaEmbalada;

    @JsonProperty("PackagedLength")
    private Integer comprimentoEmbalado;

    @JsonProperty("PackagedWidth")
    private Integer larguraEmbalada;

    @JsonProperty("PackagedWeightKg")
    private Integer pesoKgEmbalado;

    @JsonProperty("Height")
    private Integer altura;

    @JsonProperty("Length")
    private Integer comprimento;

    @JsonProperty("Width")
    private Integer largura;

    @JsonProperty("WeightKg")
    private Integer pesoKg;

    @JsonProperty("CubicWeight")
    private Integer pesoCubico;

    @JsonProperty("IsKit")
    private Boolean kit;

    @JsonProperty("CreationDate")
    private String dateCriacao;

    @JsonProperty("RewardValue")
    private Integer valorRecompensa;

    @JsonProperty("EstimatedDateArrival")
    private String dataEstimadaChegada;

    @JsonProperty("ManufacturerCode")
    private String codigoFabricante;

    @JsonProperty("CommercialConditionId")
    private Integer idCondicaoComercial;

    @JsonProperty("MeasurementUnit")
    private String unidadeMedida;

    @JsonProperty("UnitMultiplier")
    private Integer multiplicadorUnidade;

    @JsonProperty("ModalType")
    private String tipoModal;

    @JsonProperty("KitItensSellApart")
    private Boolean itensKitVendaParte;

    @JsonProperty("Videos")
    private String videos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdRef() {
        return idRef;
    }

    public void setIdRef(String idRef) {
        this.idRef = idRef;
    }

    public Integer getAlturaEmbalada() {
        return alturaEmbalada;
    }

    public void setAlturaEmbalada(Integer alturaEmbalada) {
        this.alturaEmbalada = alturaEmbalada;
    }

    public Integer getComprimentoEmbalado() {
        return comprimentoEmbalado;
    }

    public void setComprimentoEmbalado(Integer comprimentoEmbalado) {
        this.comprimentoEmbalado = comprimentoEmbalado;
    }

    public Integer getLarguraEmbalada() {
        return larguraEmbalada;
    }

    public void setLarguraEmbalada(Integer larguraEmbalada) {
        this.larguraEmbalada = larguraEmbalada;
    }

    public Integer getPesoKgEmbalado() {
        return pesoKgEmbalado;
    }

    public void setPesoKgEmbalado(Integer pesoKgEmbalado) {
        this.pesoKgEmbalado = pesoKgEmbalado;
    }

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
    }

    public Integer getComprimento() {
        return comprimento;
    }

    public void setComprimento(Integer comprimento) {
        this.comprimento = comprimento;
    }

    public Integer getLargura() {
        return largura;
    }

    public void setLargura(Integer largura) {
        this.largura = largura;
    }

    public Integer getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(Integer pesoKg) {
        this.pesoKg = pesoKg;
    }

    public Integer getPesoCubico() {
        return pesoCubico;
    }

    public void setPesoCubico(Integer pesoCubico) {
        this.pesoCubico = pesoCubico;
    }

    public Boolean isKit() {
        return kit;
    }

    public void setKit(Boolean kit) {
        this.kit = kit;
    }

    public String getDateCriacao() {
        return dateCriacao;
    }

    public void setDateCriacao(String dateCriacao) {
        this.dateCriacao = dateCriacao;
    }

    public Integer getValorRecompensa() {
        return valorRecompensa;
    }

    public void setValorRecompensa(Integer valorRecompensa) {
        this.valorRecompensa = valorRecompensa;
    }

    public String getDataEstimadaChegada() {
        return dataEstimadaChegada;
    }

    public void setDataEstimadaChegada(String dataEstimadaChegada) {
        this.dataEstimadaChegada = dataEstimadaChegada;
    }

    public String getCodigoFabricante() {
        return codigoFabricante;
    }

    public void setCodigoFabricante(String codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }

    public Integer getIdCondicaoComercial() {
        return idCondicaoComercial;
    }

    public void setIdCondicaoComercial(Integer idCondicaoComercial) {
        this.idCondicaoComercial = idCondicaoComercial;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public Integer getMultiplicadorUnidade() {
        return multiplicadorUnidade;
    }

    public void setMultiplicadorUnidade(Integer multiplicadorUnidade) {
        this.multiplicadorUnidade = multiplicadorUnidade;
    }

    public String getTipoModal() {
        return tipoModal;
    }

    public void setTipoModal(String tipoModal) {
        this.tipoModal = tipoModal;
    }

    public Boolean isItensKitVendaParte() {
        return itensKitVendaParte;
    }

    public void setItensKitVendaParte(Boolean itensKitVendaParte) {
        this.itensKitVendaParte = itensKitVendaParte;
    }

    public String getVideos() {
        return videos;
    }

    public void setVideos(String videos) {
        this.videos = videos;
    }
}
