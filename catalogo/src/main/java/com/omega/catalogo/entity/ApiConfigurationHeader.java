/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omega.catalogo.entity;

import com.omega.catalogo.enums.EnumApiConfigHeader;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author operadoror
 */
@Entity
@Table(name = "ESB_API_CONFIG_HEADER")
public class ApiConfigurationHeader extends Entidade{
    
    @Id
    @SequenceGenerator(name = "ID_ESB_API_CONFIG_HEADER", sequenceName = "GEN_ESB_API_CONFIG_HEADER", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_ESB_API_CONFIG_HEADER")
    private Integer id;

    @Column(name = "CHAVE")
    private String chave;

    @Column(name = "VALOR")
    private String valor;

    @Column(name = "ATIVO")
    private Boolean ativo;

    @Enumerated(EnumType.STRING)
    @Column(name = "API_CONFIG_HEADER")
    private EnumApiConfigHeader apiConfigContextHeader;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public EnumApiConfigHeader getApiConfigContextHeader() {
        return apiConfigContextHeader;
    }

    public void setApiConfigContextHeader(EnumApiConfigHeader apiConfigContextHeader) {
        this.apiConfigContextHeader = apiConfigContextHeader;
    }
}
