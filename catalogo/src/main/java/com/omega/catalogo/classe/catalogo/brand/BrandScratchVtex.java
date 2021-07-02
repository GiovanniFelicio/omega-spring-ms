package com.smartbr.vtex.classes.catalogo.brand;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author GiovanniFC
 */
public class BrandScratchVtex implements Serializable{
    
    @JsonProperty("id")
    private Integer id;
    
    @JsonProperty("name")
    private String nome;
    
    @JsonProperty("keywords")
    private String palavrasChave;
    
    @JsonProperty("text")
    private String texto;
    
    @JsonProperty("siteTitle")
    private String tituloSite;
    
    @JsonProperty("adWordsRemarketingCode")
    private String numeroAdWordsRemarketing;
    
    @JsonProperty("lomadeeCampaignCode")
    private String numeroCampanhaLomadee;
    
    @JsonProperty("score")
    private String pontuacao;
    
    @JsonProperty("menuHome")
    private String menuHome;
    
    @JsonProperty("active")
    private Boolean ativo;
    
    @JsonProperty("linkId")
    private Integer idLink;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPalavrasChave() {
        return palavrasChave;
    }

    public void setPalavrasChave(String palavrasChave) {
        this.palavrasChave = palavrasChave;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTituloSite() {
        return tituloSite;
    }

    public void setTituloSite(String tituloSite) {
        this.tituloSite = tituloSite;
    }

    public String getNumeroAdWordsRemarketing() {
        return numeroAdWordsRemarketing;
    }

    public void setNumeroAdWordsRemarketing(String numeroAdWordsRemarketing) {
        this.numeroAdWordsRemarketing = numeroAdWordsRemarketing;
    }

    public String getNumeroCampanhaLomadee() {
        return numeroCampanhaLomadee;
    }

    public void setNumeroCampanhaLomadee(String numeroCampanhaLomadee) {
        this.numeroCampanhaLomadee = numeroCampanhaLomadee;
    }

    public String getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(String pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getMenuHome() {
        return menuHome;
    }

    public void setMenuHome(String menuHome) {
        this.menuHome = menuHome;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Integer getIdLink() {
        return idLink;
    }

    public void setIdLink(Integer idLink) {
        this.idLink = idLink;
    }
}
