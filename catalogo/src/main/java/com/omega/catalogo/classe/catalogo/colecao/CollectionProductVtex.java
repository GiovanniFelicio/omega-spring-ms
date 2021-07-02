package com.smartbr.vtex.classes.catalogo.colecao;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author GiovanniFC
 */
public class CollectionProductVtex implements Serializable{
    
    @JsonProperty("page")
    private Integer pagina;
    
    @JsonProperty("size")
    private Integer tamanho;
    
    @JsonProperty("totalRows")
    private Integer totalRegistro;
    
    @JsonProperty("totalPage")
    private Integer totalPagina;
    
    @JsonProperty("data")
    private List<CollectionProductDataVtex> data;

    public Integer getPagina() {
        return pagina;
    }

    public void setPagina(Integer pagina) {
        this.pagina = pagina;
    }

    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public Integer getTotalRegistro() {
        return totalRegistro;
    }

    public void setTotalRegistro(Integer totalRegistro) {
        this.totalRegistro = totalRegistro;
    }

    public Integer getTotalPagina() {
        return totalPagina;
    }

    public void setTotalPagina(Integer totalPagina) {
        this.totalPagina = totalPagina;
    }

    public List<CollectionProductDataVtex> getData() {
        return data;
    }

    public void setData(List<CollectionProductDataVtex> data) {
        this.data = data;
    }
}
