
package com.CMS.CentralParam.KKBSK.model.response;

import java.util.List;

import com.CMS.CentralParam.KKBSK.model.data.Produk;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataProduk",
    "produk",
    "code"
})
public class ResponProduk {

    @JsonProperty("dataProduk")
    private List<Produk> dataProduk = null;
    @JsonProperty("produk")
    private Produk produk = null;
    @JsonProperty("code")
    private String code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponProduk() {
    }

    /**
     * 
     * @param dataProduk
     * @param code
     */
    public ResponProduk(List<Produk> dataProduk,Produk produk,String code) {
        super();
        this.dataProduk = dataProduk;
        this.produk = produk;
        this.code = code;
    }

    @JsonProperty("dataProduk")
    public List<Produk> getDataProduk() {
        return dataProduk;
    }

    @JsonProperty("dataProduk")
    public void setDataProduk(List<Produk> dataProduk) {
        this.dataProduk = dataProduk;
    }

    
    @JsonProperty("produk")
    public Produk getProduk() {
        return produk;
    }

    @JsonProperty("produk")
    public void setProduk(Produk produk) {
        this.produk = produk;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

}
