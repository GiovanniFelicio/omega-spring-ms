/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omega.catalogo.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.MappedSuperclass;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
/**
 *
 * @author operadoror
 */
@MappedSuperclass
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public abstract class Entidade implements Serializable, Cloneable{

    @Transient
    @JsonIgnore
    @XmlTransient
    protected Map<String, Object> attrs = new HashMap();

    public abstract void setId(Integer id);

    public abstract Integer getId();

    @Transient
    @XmlTransient
    protected boolean visited = false;

    @Transient
    @XmlTransient
    protected boolean selected = false;

    @Transient
    @XmlTransient
    protected boolean lazy = false;

    @Transient
    @XmlTransient
    protected boolean entidadeNova = false;

    @Transient
    @XmlTransient
    protected Date creation = new Date();

    @Transient
    @XmlTransient
    protected String agrupadorEntidade;

    @Transient
    @XmlTransient
    protected String entidadeErro;

    public boolean isEntidadeNova() {
        return entidadeNova;
    }

    public void setEntidadeNova(boolean entidadeNova) {
        this.entidadeNova = entidadeNova;
    }

    public String getAgrupadorEntidade() {
        return agrupadorEntidade;
    }

    public void setAgrupadorEntidade(String agrupadorEntidade) {
        this.agrupadorEntidade = agrupadorEntidade;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public <T> T get(String key, Class<T> clzz) {
        return (T) attrs.get(key);
    }

    public Entidade() {
        super();
    }

    @JsonIgnore
    public String getTitle() {
        return getId() + "";
    }

    public Map<String, Object> getAttrs() {
        return attrs;
    }

    public void setAttrs(Map<String, Object> attrs) {
        this.attrs = attrs;
    }

    public Object containsAttrs(String key) {
        if (this.attrs.containsKey(key)) {
            return this.attrs.get(key);
        }
        return null;
    }

    public boolean containsKey(String key) {
        if (this.attrs == null) {
            this.attrs = new LinkedHashMap<>();
        }
        if (this.attrs.containsKey(key)) {
            return true;
        }
        return false;
    }

    public void put(String key, Object value) {

        if (this.attrs == null) {
            this.attrs = new LinkedHashMap<>();
        }
        this.attrs.put(key, value);
    }
    
    public boolean isLazy() {
        return lazy;
    }

    public void setLazy(boolean lazy) {
        this.lazy = lazy;
    }

    public String getEntidadeErro() {
        return entidadeErro;
    }

    public void setEntidadeErro(String entidadeErro) {
        this.entidadeErro = entidadeErro;
    }

    public boolean isRecent(long millis) {
        if (creation != null) {
            long diff = System.currentTimeMillis() - creation.getTime();

            if (diff > millis) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return getId() + "";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (getClass() != obj.getClass()) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        final Entidade other = (Entidade) obj;
        if (this.getId() != null && other.getId() == null) {
            return false;
        }

        if (other.getId() != null && this.getId() == null) {
            return false;
        }

        if (this.getId() == null && other.getId() == null) {
            return false;
        }

        return this.getId().equals(other.getId());
    }

    public Date getCreation() {
        return creation;
    }

    public void setCreation(Date creation) {
        this.creation = creation;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + (this.getId() != null ? this.getId().hashCode() : 0);
        return hash;
    }

    public boolean hasId() {
        return this.getId() != null;
    }

}
