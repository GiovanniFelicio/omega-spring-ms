package com.smartbr.vtex.classes.catalogo.produto.builder;

import com.smartbr.vtex.classes.catalogo.produto.ProductVtex;

/**
 *
 * @author GiovanniFC
 */
public class ProductVtexBuilder {
    
    private ProductVtex productVtex;

    public ProductVtexBuilder() {
        this.productVtex = new ProductVtex();
    }

    public static ProductVtexBuilder builder() {
        return new ProductVtexBuilder();
    }

    public ProductVtexBuilder withId(Integer id) {
        this.productVtex.setId(id);
        return this;
    }

    public ProductVtexBuilder withNome(String nome) {
        this.productVtex.setNome(nome);
        return this;
    }

    public ProductVtexBuilder withIdDepartamento(Integer idDepartamento) {
        this.productVtex.setIdDepartamento(idDepartamento);
        return this;
    }

    public ProductVtexBuilder withIdCategoria(Integer idCategoria) {
        this.productVtex.setIdCategoria(idCategoria);
        return this;
    }

    public ProductVtexBuilder withIdMarca(Integer idMarca) {
        this.productVtex.setIdMarca(idMarca);
        return this;
    }

    public ProductVtexBuilder withIdLink(String idLink) {
        this.productVtex.setIdLink(idLink);
        return this;
    }

    public ProductVtexBuilder withIdRef(String idRef) {
        this.productVtex.setIdRef(idRef);
        return this;
    }

    public ProductVtexBuilder withVisivel(Boolean visivel) {
        this.productVtex.setVisivel(visivel);
        return this;
    }

    public ProductVtexBuilder withDescricao(String descricao) {
        this.productVtex.setDescricao(descricao);
        return this;
    }

    public ProductVtexBuilder withDescricaoCurta(String descricaoCurta) {
        this.productVtex.setDescricaoCurta(descricaoCurta);
        return this;
    }

    public ProductVtexBuilder withDataLancamento(String dataLancamento) {
        this.productVtex.setDataLancamento(dataLancamento);
        return this;
    }

    public ProductVtexBuilder withPalavrasChaves(String palavrasChaves) {
        this.productVtex.setPalavrasChave(palavrasChaves);
        return this;
    }

    public ProductVtexBuilder withTitulo(String titulo) {
        this.productVtex.setTitulo(titulo);
        return this;
    }

    public ProductVtexBuilder withAtivo(Boolean ativo) {
        this.productVtex.setAtivo(ativo);
        return this;
    }

    public ProductVtexBuilder withCodigoFiscal(String codigoFiscal) {
        this.productVtex.setCodigoFiscal(codigoFiscal);
        return this;
    }

    public ProductVtexBuilder withMetaTagDescription(String metaTagDescription) {
        this.productVtex.setMetaTagDescription(metaTagDescription);
        return this;
    }

    public ProductVtexBuilder withIdFornecedor(Integer idFornecedor) {
        this.productVtex.setIdFornecedor(idFornecedor);
        return this;
    }

    public ProductVtexBuilder withMostrarSemEstoque(Boolean mostrarSemEstoque) {
        this.productVtex.setMostrarSemEstoque(mostrarSemEstoque);
        return this;
    }

    public ProductVtexBuilder withNumeroAdwordsRemarketing(String numeroAdwordsRemarketing) {
        this.productVtex.setNumeroAdwordsRemarketing(numeroAdwordsRemarketing);
        return this;
    }

    public ProductVtexBuilder withNumeroCampanhaLomadee(String numeroCampanhaLomadee) {
        this.productVtex.setNumeroCampanhaLomadee(numeroCampanhaLomadee);
        return this;
    }

    public ProductVtexBuilder withPontuacao(Integer pontuacao) {
        this.productVtex.setScore(pontuacao);
        return this;
    }

    public ProductVtex get() {
        return this.productVtex;
    }
    
}
