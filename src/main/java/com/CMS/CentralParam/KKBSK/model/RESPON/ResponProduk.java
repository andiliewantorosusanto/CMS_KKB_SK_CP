
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
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
    private List<DataProduk> dataProduk = null;
    @JsonProperty("produk")
    private DataProduk produk = null;
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
    public ResponProduk(List<DataProduk> dataProduk,DataProduk produk,String code) {
        super();
        this.dataProduk = dataProduk;
        this.produk = produk;
        this.code = code;
    }

    @JsonProperty("dataProduk")
    public List<DataProduk> getDataProduk() {
        return dataProduk;
    }

    @JsonProperty("dataProduk")
    public void setDataProduk(List<DataProduk> dataProduk) {
        this.dataProduk = dataProduk;
    }

    
    @JsonProperty("produk")
    public DataProduk getProduk() {
        return produk;
    }

    @JsonProperty("produk")
    public void setProduk(DataProduk produk) {
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
