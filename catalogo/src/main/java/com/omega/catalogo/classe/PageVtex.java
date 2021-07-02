package com.smartbr.vtex.classes;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author GiovanniFC
 */
public class PageVtex implements Serializable{

    @JsonProperty("page")
    private Integer page;

    @JsonProperty("perPage")
    private Integer perPage;

    @JsonProperty("total")
    private Integer total;

    @JsonProperty("pages")
    private Integer pages;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPerPage() {
        return perPage;
    }

    public void setPerPage(Integer perPage) {
        this.perPage = perPage;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }
}