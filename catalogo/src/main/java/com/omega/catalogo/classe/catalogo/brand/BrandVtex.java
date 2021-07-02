package com.smartbr.vtex.classes.catalogo.brand;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.smartbr.srm.model.Marca;
import com.smartbr.vtex.classes.AbstractVtex;

/**
 *
 * @author GiovanniFC
 */
public class BrandVtex extends AbstractVtex{
    
    @JsonProperty("id")
    private Integer id;
    
    @JsonProperty("name")
    private String nome;
    
    @JsonProperty("imageUrl")
    private String imageUrl;
    
    @JsonProperty("isActive")
    private Boolean ativo;
    
    @JsonProperty("title")
    private String titulo;
    
    @JsonProperty("metaTagDescription")
    private String descricaoMetaTag;

    public Marca convertBrandToMarca() {
        
        Marca marca = new Marca();
        
        marca.setDescricao(nome);
        marca.setDescricaoComercial(titulo);
        marca.setDescricaoSobre(descricaoMetaTag);
        
        return marca;
    }
    
    public static BrandVtex convertMarcaToBrandVtex(Marca marca) {
        
        BrandVtex brandVtex = new BrandVtex();
        
        brandVtex.setNome(marca.getDescricao());
        brandVtex.setTitulo(marca.getDescricaoComercial());
        brandVtex.setDescricaoMetaTag(marca.getDescricaoSobre());
        brandVtex.setAtivo(Boolean.TRUE);
        
        return brandVtex;
    }
    
    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricaoMetaTag() {
        return descricaoMetaTag;
    }

    public void setDescricaoMetaTag(String descricaoMetaTag) {
        this.descricaoMetaTag = descricaoMetaTag;
    }
}
