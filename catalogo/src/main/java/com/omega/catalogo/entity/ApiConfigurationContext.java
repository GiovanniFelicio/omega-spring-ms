/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omega.catalogo.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author ENGCARVALHO
 */
@Entity
@Table(name = "ESB_API_CONFIG_CONTEXT")
public class ApiConfigurationContext extends Entidade{
    
    @Id
    @SequenceGenerator(name = "ID_ESB_API_CONFIG_CONTEXT", sequenceName = "GEN_ESB_API_CONFIG_CONTEXT", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_ESB_API_CONFIG_CONTEXT")
    private Integer id;
    
    @Column(name = "IDENTIFICADOR")
    private String identificador;
    
    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "ID_API_CONFIGURATION", referencedColumnName = "ID")
    private ApiConfiguration apiConfiguration;
    
    @Column(name = "ATIVO")
    private Boolean ativo = Boolean.TRUE;
    
    @JoinTable(name = "ESB_API_CONFIG_CONT_HEAD", joinColumns = {
        @JoinColumn(name = "ID_API_CONFIGURATION_CONTEXT", referencedColumnName = "ID", nullable = false)}, inverseJoinColumns = {
        @JoinColumn(name = "ID_API_CONFIGURATION_HEADER", referencedColumnName = "ID", nullable = false)})
    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<ApiConfigurationHeader> apiConfigurationHeaders;
    
    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public ApiConfiguration getApiConfiguration() {
        return apiConfiguration;
    }

    public void setApiConfiguration(ApiConfiguration apiConfiguration) {
        this.apiConfiguration = apiConfiguration;
    }

    public Boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public List<ApiConfigurationHeader> getApiConfigurationHeaders() {
        return apiConfigurationHeaders;
    }

    public void setApiConfigurationHeaders(List<ApiConfigurationHeader> apiConfigurationHeaders) {
        this.apiConfigurationHeaders = apiConfigurationHeaders;
    }
}