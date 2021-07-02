package com.smartbr.vtex.classes.catalogo.categoria;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.smartbr.ecommerce.model.Categoria;
import com.smartbr.utils.ListUtil;
import com.smartbr.vtex.classes.EnumSKUSelectionMode;
import com.smartbr.vtex.classes.catalogo.categoria.builder.CategoryVtexBuilder;
import com.smartbr.utils.Utils;
import com.smartbr.vtex.classes.AbstractVtex;
import java.util.List;

/**
 *
 * @author GiovanniFC
 */
public class CategoryVtex extends AbstractVtex{

    @JsonIgnore
    private Integer id;

    @JsonProperty("Name")
    private String nome;

    @JsonProperty("FatherCategoryId")
    private Integer idCategoriaPai;

    @JsonProperty("Title")
    private String titulo;

    @JsonProperty("Description")
    private String descricao;

    @JsonProperty("Keywords")
    private String keywords;

    @JsonProperty("IsActive")
    private Boolean ativo;

    @JsonProperty("LomadeeCampaignCode")
    private String numeroCampanhaLomadee;

    @JsonProperty("AdWordsRemarketingCode")
    private String numeroAdWordsRemarketing;

    @JsonProperty("ShowInStoreFront")
    private Boolean mostrarFrenteLoja = false;

    @JsonProperty("ShowBrandFilter")
    private Boolean mostrarFiltroMarca = false;

    @JsonProperty("ActiveStoreFrontLink")
    private Boolean linkFrenteLojaAtivo = false;

    @JsonProperty("GlobalCategoryId")
    private Integer idCategoriaGlobal;

    @JsonProperty("StockKeepingUnitSelectionMode")
    private EnumSKUSelectionMode modoSelecaoUnidadeManutencaoEstoque;

    @JsonProperty("Score")
    private Integer score;

    @JsonProperty("LinkId")
    private String idLink;

    @JsonProperty("HasChildren")
    private Boolean filhos;
    
    private List<CategoryVtex> categoryVtexs;

    public CategoryVtex() {
        
    }

    public Categoria convertCategoriaVtexToCategoria() {
        Categoria categoria = new Categoria();
        
        categoria.setNome(nome);
        categoria.setTitulo(titulo);
        categoria.setDescricao(descricao);
        categoria.setPalavrasChave(keywords);
        categoria.setAtivo(ativo);
        categoria.setPath(idLink);
        
        return categoria;
    }
    
    public static CategoryVtex convertCategoriaToCategoryVtex(Categoria categoria) {
        
        return CategoryVtexBuilder.builder()
                .withNome(categoria.getNome())
                .withIdCategoriaPai(!Utils.isEmpty(categoria.getSuperior()) ? categoria.getSuperior().getId() : null)
                .withTitulo(categoria.getTitulo())
                .withDescricao(categoria.getDescricao())
                .withKeywords(categoria.getPalavrasChave())
                .withAtivo(categoria.isAtivo())
                .withModoSelecaoUnidadeManutencaoEstoque(EnumSKUSelectionMode.SPECIFICATION)
                .withIdLink(categoria.getPath())
                .withFilhos(ListUtil.isNotNullOrEmpty(categoria.getFilhos()))
                .get();
    }
    
    @Override
    @JsonIgnore
    public Integer getId() {
        return id;
    }

    @Override
    @JsonProperty("Id")
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdCategoriaPai() {
        return idCategoriaPai;
    }

    public void setIdCategoriaPai(Integer idCategoriaPai) {
        this.idCategoriaPai = idCategoriaPai;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getNumeroCampanhaLomadee() {
        return numeroCampanhaLomadee;
    }

    public void setNumeroCampanhaLomadee(String numeroCampanhaLomadee) {
        this.numeroCampanhaLomadee = numeroCampanhaLomadee;
    }

    public String getNumeroAdWordsRemarketing() {
        return numeroAdWordsRemarketing;
    }

    public void setNumeroAdWordsRemarketing(String numeroAdWordsRemarketing) {
        this.numeroAdWordsRemarketing = numeroAdWordsRemarketing;
    }

    public Boolean getMostrarFrenteLoja() {
        return mostrarFrenteLoja;
    }

    public void setMostrarFrenteLoja(Boolean mostrarFrenteLoja) {
        this.mostrarFrenteLoja = mostrarFrenteLoja;
    }

    public Boolean getMostrarFiltroMarca() {
        return mostrarFiltroMarca;
    }

    public void setMostrarFiltroMarca(Boolean mostrarFiltroMarca) {
        this.mostrarFiltroMarca = mostrarFiltroMarca;
    }

    public Boolean getLinkFrenteLojaAtivo() {
        return linkFrenteLojaAtivo;
    }

    public void setLinkFrenteLojaAtivo(Boolean linkFrenteLojaAtivo) {
        this.linkFrenteLojaAtivo = linkFrenteLojaAtivo;
    }

    public Integer getIdCategoriaGlobal() {
        return idCategoriaGlobal;
    }

    public void setIdCategoriaGlobal(Integer idCategoriaGlobal) {
        this.idCategoriaGlobal = idCategoriaGlobal;
    }

    public EnumSKUSelectionMode getModoSelecaoUnidadeManutencaoEstoque() {
        return modoSelecaoUnidadeManutencaoEstoque;
    }

    public void setModoSelecaoUnidadeManutencaoEstoque(EnumSKUSelectionMode modoSelecaoUnidadeManutencaoEstoque) {
        this.modoSelecaoUnidadeManutencaoEstoque = modoSelecaoUnidadeManutencaoEstoque;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getIdLink() {
        return idLink;
    }

    public void setIdLink(String idLink) {
        this.idLink = idLink;
    }

    public Boolean isFilhos() {
        return filhos;
    }

    public void setFilhos(Boolean filhos) {
        this.filhos = filhos;
    }

    public List<CategoryVtex> getCategoryVtexs() {
        return categoryVtexs;
    }

    public void setCategoryVtexs(List<CategoryVtex> categoryVtexs) {
        this.categoryVtexs = categoryVtexs;
    }
}
