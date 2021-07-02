package com.smartbr.vtex.classes.catalogo.attachment;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author GiovanniFC
 */
public class AttachmentVtex implements Serializable{
    
    @JsonProperty("id")
    private Integer id;
    
    @JsonProperty("name")
    private String nome;
    
    @JsonProperty("keys")
    private List<String> chaves;
    
    @JsonProperty("fields")
    private List<AttachmentDomainVtex> campos;
    
    @JsonProperty("isActive")
    private Boolean ativo;
    
    @JsonProperty("isRequired")
    private Boolean obrigatorio;
    
    @JsonProperty("domains")
    private List<Object> domains;
    
    @JsonProperty("fieldName")
    private String nomeCampo;
    
    @JsonProperty("maxCaracters")
    private String caracteresMax;
    
    @JsonProperty("domainValues")
    private String valoresDominio;

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

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Boolean getObrigatorio() {
        return obrigatorio;
    }

    public void setObrigatorio(Boolean obrigatorio) {
        this.obrigatorio = obrigatorio;
    }

    public List<Object> getDomains() {
        return domains;
    }

    public void setDomains(List<Object> domains) {
        this.domains = domains;
    }

    public String getNomeCampo() {
        return nomeCampo;
    }

    public void setNomeCampo(String nomeCampo) {
        this.nomeCampo = nomeCampo;
    }

    public String getCaracteresMax() {
        return caracteresMax;
    }

    public void setCaracteresMax(String caracteresMax) {
        this.caracteresMax = caracteresMax;
    }

    public String getValoresDominio() {
        return valoresDominio;
    }

    public void setValoresDominio(String valoresDominio) {
        this.valoresDominio = valoresDominio;
    }

    public List<String> getChaves() {
        return chaves;
    }

    public void setChaves(List<String> chaves) {
        this.chaves = chaves;
    }

    public List<AttachmentDomainVtex> getCampos() {
        return campos;
    }

    public void setCampos(List<AttachmentDomainVtex> campos) {
        this.campos = campos;
    }    
}
