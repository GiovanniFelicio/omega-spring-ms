/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omega.catalogo.classe.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.omega.catalogo.classe.vo.builder.CategoryVtexBuilder;
import com.omega.catalogo.entity.Categoria;
import com.omega.catalogo.enums.EnumSKUSelectionMode;
import java.util.List;
import lombok.Data;

/**
 *
 * @author ENGCARVALHO
 */
@Data
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
        categoria.setKeywords(keywords);
        categoria.setAtivo(ativo);
        categoria.setPath(idLink);
        
        return categoria;
    }
    
    public static CategoryVtex convertCategoriaToCategoryVtex(Categoria categoria) {
        
        return CategoryVtexBuilder.builder()
                .withNome(categoria.getNome())
                .withIdCategoriaPai(categoria.getCategoriaSuperior() != null ? categoria.getCategoriaSuperior().getId() : null)
                .withTitulo(categoria.getTitulo())
                .withDescricao(categoria.getDescricao())
                .withKeywords(categoria.getKeywords())
                .withAtivo(categoria.getAtivo())
                .withModoSelecaoUnidadeManutencaoEstoque(EnumSKUSelectionMode.SPECIFICATION)
                .withIdLink(categoria.getPath())
                .withFilhos(categoria.getChildren() != null ? categoria.getChildren().size() > 0 : null)
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
    
}
