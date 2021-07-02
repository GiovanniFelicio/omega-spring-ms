/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omega.catalogo.entity;

import com.omega.catalogo.enums.EnumApiName;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author operadoror
 */
@Entity
@Table(name = "ESB_API_CONFIGURATION")
public class ApiConfiguration extends Entidade{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "ID_ESB_API_CONFIGURATION")
    private Integer id;

    @Column(name = "API_NAME")
    @Enumerated(EnumType.STRING)
    private EnumApiName apiName;

    @Column(name = "API_KEY")
    private String apiKey;

    @Column(name = "HOST")
    private String host;

    @Column(name = "DEFAULT_SCHEMA")
    private String defaultSchema;

    @Column(name = "DEFAULT_PORT")
    private String defaultPort;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SITE")
    private Site site;

    @OneToMany(mappedBy = "apiConfiguration", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ApiConfigurationContext> apiConfigurationContexts;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }
}
