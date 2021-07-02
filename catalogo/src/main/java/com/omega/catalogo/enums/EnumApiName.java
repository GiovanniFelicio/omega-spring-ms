package com.omega.catalogo.enums;

/**
 *
 * @author ENGCARVALHO
 */
public enum EnumApiName {
    
    ANALYTICS_API("ANALYTICS_API", 1),
    OCEAN_API("OCEAN_API", 2),
    OCEAN_API_DESENV("OCEAN_API_DESENV", 3),
    VTEX_API("VTEX_API", 4);

    private final String descricao;
    private final Integer chave;

    private EnumApiName(String descricao, Integer chave) {
        this.descricao = descricao;
        this.chave = chave;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getChave() {
        return chave;
    }    
}
