package com.smartbr.vtex.classes.catalogo.produto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.smartbr.pattern.enums.EnumTipoProduto;
import com.smartbr.produto.model.ProdutoBase;
import com.smartbr.vtex.classes.AbstractVtex;
import com.smartbr.vtex.classes.catalogo.produto.builder.ProductVtexBuilder;

/**
 *
 * @author GiovanniFC
 */
public class ProductVtex extends AbstractVtex {

    @JsonProperty("Name")
    private String nome;

    @JsonProperty("DepartmentId")
    private Integer idDepartamento;

    @JsonProperty("CategoryId")
    private Integer idCategoria;

    @JsonProperty("BrandId")
    private Integer idMarca;

    @JsonProperty("LinkId")
    private String idLink;

    @JsonProperty("RefId")
    private String idRef;

    @JsonProperty("IsVisible")
    private Boolean visivel;

    @JsonProperty("Description")
    private String descricao;

    @JsonProperty("DescriptionShort")
    private String descricaoCurta;

    @JsonProperty("ReleaseDate")
    private String dataLancamento;

    @JsonProperty("KeyWords")
    private String palavrasChave;

    @JsonProperty("Title")
    private String titulo;

    @JsonProperty("IsActive")
    private Boolean ativo;

    @JsonProperty("TaxCode")
    private String codigoFiscal;

    @JsonProperty("MetaTagDescription")
    private String metaTagDescription;

    @JsonProperty("SupplierId")
    private Integer idFornecedor;

    @JsonProperty("ShowWithoutStock")
    private Boolean mostrarSemEstoque;

    @JsonProperty("AdWordsRemarketingCode")
    private String numeroAdwordsRemarketing;

    @JsonProperty("LomadeeCampaignCode")
    private String numeroCampanhaLomadee;

    @JsonProperty("Score")
    private Integer score;

    public ProductVtex() {
    }
    
    public static ProductVtex convertProdutoBaseToProductVtex(ProdutoBase produtoBase) {
        return ProductVtexBuilder.builder()
                .withNome(produtoBase.getDescricao())
                .withAtivo(Boolean.TRUE)
                .withDescricao(produtoBase.getInfoComercial().getDetalhamento())
                .withDescricaoCurta(produtoBase.getDescricaoComercial())
                .withCodigoFiscal(produtoBase.getNcm())
                .withPalavrasChaves(produtoBase.getInfoComercial().getPalavrasChaves())
                .get();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(Integer idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
    }

    public String getIdLink() {
        return idLink;
    }

    public void setIdLink(String idLink) {
        this.idLink = idLink;
    }

    public String getIdRef() {
        return idRef;
    }

    public void setIdRef(String idRef) {
        this.idRef = idRef;
    }

    public Boolean getVisivel() {
        return visivel;
    }

    public void setVisivel(Boolean visivel) {
        this.visivel = visivel;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricaoCurta() {
        return descricaoCurta;
    }

    public void setDescricaoCurta(String descricaoCurta) {
        this.descricaoCurta = descricaoCurta;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getPalavrasChave() {
        return palavrasChave;
    }

    public void setPalavrasChave(String palavrasChave) {
        this.palavrasChave = palavrasChave;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getCodigoFiscal() {
        return codigoFiscal;
    }

    public void setCodigoFiscal(String codigoFiscal) {
        this.codigoFiscal = codigoFiscal;
    }

    public String getMetaTagDescription() {
        return metaTagDescription;
    }

    public void setMetaTagDescription(String metaTagDescription) {
        this.metaTagDescription = metaTagDescription;
    }

    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public Boolean getMostrarSemEstoque() {
        return mostrarSemEstoque;
    }

    public void setMostrarSemEstoque(Boolean mostrarSemEstoque) {
        this.mostrarSemEstoque = mostrarSemEstoque;
    }

    public String getNumeroAdwordsRemarketing() {
        return numeroAdwordsRemarketing;
    }

    public void setNumeroAdwordsRemarketing(String numeroAdwordsRemarketing) {
        this.numeroAdwordsRemarketing = numeroAdwordsRemarketing;
    }

    public String getNumeroCampanhaLomadee() {
        return numeroCampanhaLomadee;
    }

    public void setNumeroCampanhaLomadee(String numeroCampanhaLomadee) {
        this.numeroCampanhaLomadee = numeroCampanhaLomadee;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}