/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omega.catalogo.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author ENGCARVALHO
 */
@Data
@Entity
@Table(name = "OMG_CATEGORIA")
public class Categoria implements Serializable{

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "KEYWORDS")
    private String keywords;

    @Column(name = "TITULO")
    private String titulo;

    @Column(name = "DESCRICAO")
    private String descricao;
    
    @Column(name = "PATH")
    private String path;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CATEGORIA_SUPERIOR", referencedColumnName = "ID")
    private Categoria categoriaSuperior;
    
    @OneToMany(mappedBy = "categoriaSuperior", fetch = FetchType.LAZY)
    private List<Categoria> children;
    
    @Column(name = "ATIVO")
    private Boolean ativo;

}
