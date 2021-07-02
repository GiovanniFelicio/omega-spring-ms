package com.smartbr.vtex.classes.catalogo.categoria.builder;

import com.smartbr.vtex.classes.EnumSKUSelectionMode;
import com.smartbr.vtex.classes.catalogo.categoria.CategoryVtex;

/**
 *
 * @author GiovanniFC
 */
public class CategoryVtexBuilder {

    private CategoryVtex categoryVtex;

    public CategoryVtexBuilder() {
        this.categoryVtex = new CategoryVtex();
    }

    public static CategoryVtexBuilder builder() {
        return new CategoryVtexBuilder();
    }

    public CategoryVtexBuilder withId(Integer id) {
        this.categoryVtex.setId(id);
        return this;
    }

    public CategoryVtexBuilder withNome(String nome) {
        this.categoryVtex.setNome(nome);
        return this;
    }

    public CategoryVtexBuilder withIdCategoriaPai(Integer idCategoriaPai) {
        this.categoryVtex.setIdCategoriaPai(idCategoriaPai);
        return this;
    }

    public CategoryVtexBuilder withTitulo(String titulo) {
        this.categoryVtex.setTitulo(titulo);
        return this;
    }

    public CategoryVtexBuilder withDescricao(String descricao) {
        this.categoryVtex.setDescricao(descricao);
        return this;
    }

    public CategoryVtexBuilder withKeywords(String keywords) {
        this.categoryVtex.setKeywords(keywords);
        return this;
    }

    public CategoryVtexBuilder withAtivo(Boolean ativo) {
        this.categoryVtex.setAtivo(ativo);
        return this;
    }

    public CategoryVtexBuilder withNumeroCampanhaLomadee(String numeroCampanhaLomadee) {
        this.categoryVtex.setNumeroCampanhaLomadee(numeroCampanhaLomadee);
        return this;
    }

    public CategoryVtexBuilder withNumeroAdWordsRemarketing(String numeroAdWordsRemarketing) {
        this.categoryVtex.setNumeroAdWordsRemarketing(numeroAdWordsRemarketing);
        return this;
    }

    public CategoryVtexBuilder withMostrarFrenteLoja(Boolean mostrarFrenteLoja) {
        this.categoryVtex.setMostrarFrenteLoja(mostrarFrenteLoja);
        return this;
    }

    public CategoryVtexBuilder withMostrarFiltroMarca(Boolean mostrarFiltroMarca) {
        this.categoryVtex.setMostrarFiltroMarca(mostrarFiltroMarca);
        return this;
    }

    public CategoryVtexBuilder withLinkFrenteLojaAtivo(Boolean linkFrenteLojaAtivo) {
        this.categoryVtex.setLinkFrenteLojaAtivo(linkFrenteLojaAtivo);
        return this;
    }

    public CategoryVtexBuilder withIdCategoriaGlobal(Integer idCategoriaGlobal) {
        this.categoryVtex.setIdCategoriaGlobal(idCategoriaGlobal);
        return this;
    }

    public CategoryVtexBuilder withModoSelecaoUnidadeManutencaoEstoque(EnumSKUSelectionMode modoSelecaoUnidadeManutencaoEstoque) {
        this.categoryVtex.setModoSelecaoUnidadeManutencaoEstoque(modoSelecaoUnidadeManutencaoEstoque);
        return this;
    }

    public CategoryVtexBuilder withScore(Integer score) {
        this.categoryVtex.setScore(score);
        return this;
    }

    public CategoryVtexBuilder withIdLink(String idLink) {
        this.categoryVtex.setIdLink(idLink);
        return this;
    }

    public CategoryVtexBuilder withFilhos(Boolean filhos) {
        this.categoryVtex.setFilhos(filhos);
        return this;
    }

    public CategoryVtex get() {
        return this.categoryVtex;
    }
}
