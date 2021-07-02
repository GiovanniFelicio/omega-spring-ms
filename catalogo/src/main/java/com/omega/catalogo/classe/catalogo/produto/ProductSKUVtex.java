package com.smartbr.vtex.classes.catalogo.produto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 *
 * @author GiovanniFC
 */
public class ProductSKUVtex implements Serializable{
   
    @JsonProperty("data")
    private Map<String, List<Integer>> data;

    public Map<String, List<Integer>> getData() {
        return data;
    }

    public void setData(Map<String, List<Integer>> data) {
        this.data = data;
    }
}
