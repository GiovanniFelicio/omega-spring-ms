/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omega.catalogo.entity;

import java.util.List;
import javax.persistence.*;

/**
 *
 * @author operadoror
 */
@Entity
@Table(name = "ECM_SITE")
public class Site extends Entidade{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_ECM_SITE")
    @Column(name = "ID")
    private Integer id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "URL")
    private String url;

    @Column(name = "URL_LOGO")
    private String urlLogo;

    @Column(name = "SIGLA")
    private String sigla;

    @Column(name = "IDENTIFICADOR")
    private String identificador;

    @Column(name = "HINT")
    private String hint;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "COR")
    private String cor;

    @Column(name = "URL_PATH_BANNER")
    private String urlBanner;

    @Column(name = "URL_PATH_IMAGEM")
    private String urlImagem;

    @Column(name = "URL_FACEBOOK")
    private String urlFacebook;

    @Column(name = "URL_TWITTER")
    private String urlTwitter;

    @Column(name = "URL_YOUTUBE")
    private String urlYoutube;

    @Column(name = "URL_LINKEDIN")
    private String urlLinkedin;

    @Column(name = "URL_SCRIPT_EBIT")
    private String urlEbit;

    @Column(name = "GOOGLE_ANALYTICS_ACCOUNT")
    private String googleAnalyticsAccount;

    @Column(name = "ATIVO")
    private Boolean ativo;

    @Column(name = "GERAR_XML")
    private Boolean gerarXml;

    @Column(name = "ID_FILIAL", insertable = false, updatable = false)
    private Integer idFilial;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FILIAL", referencedColumnName = "ID")
    private Filial filialOrigem;

    @Column(name = "ID_MARCA", insertable = false, updatable = false)
    private Integer idMarca;

    @JoinColumn(name = "ID_MARCA", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private MarcaFilial marca;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID")
    private Usuario usuario;

    @Column(name = "TIPO_DATA_CALCULO_FRETE")
    private String tipoDataCalculoFrete;

    @Column(name = "DOMAIN")
    private String domain;

    @Column(name = "ROBOTS")
    private String robots;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FILIAL_PEDIDO", referencedColumnName = "ID")
    private Filial filialPedido;

    @JoinTable(name = "ESB_SITE_FILIAL", joinColumns = {
        @JoinColumn(name = "ID_SITE", referencedColumnName = "ID")}, inverseJoinColumns = {
        @JoinColumn(name = "ID_FILIAL", referencedColumnName = "ID")})
    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Filial> filiaisParceiras;

    @OneToOne(mappedBy = "site", fetch = FetchType.LAZY)
    private PublicacaoEstatica publicacaoEstatica;

    @OneToMany(mappedBy = "site", fetch = FetchType.LAZY)
    private List<Email> emails;

    @OneToMany(mappedBy = "site", fetch = FetchType.LAZY)
    private List<SiteScript> scripts;
    
    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

}
