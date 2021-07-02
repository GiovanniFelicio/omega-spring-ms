package com.omega.catalogo.classe.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author ENGCARVALHO
 */
public class CategoryTreeVtex extends AbstractVtex {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("name")
    private String nome;

    @JsonProperty("hasChildren")
    private Boolean filhos;

    @JsonProperty("url")
    private String url;

    @JsonProperty("children")
    private List<CategoryTreeVtex> categoriaVtexs;

    @JsonProperty("title")
    private String titulos;

    @JsonProperty("metaTagDescription")
    private String descricaoMetaTag;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }
}
