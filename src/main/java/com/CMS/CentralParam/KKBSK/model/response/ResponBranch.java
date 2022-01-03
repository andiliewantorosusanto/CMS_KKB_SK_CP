
package com.CMS.CentralParam.KKBSK.model.response;

import java.util.List;

import com.CMS.CentralParam.KKBSK.model.data.Branch;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataBranch",
    "produk",
    "code"
})
public class ResponBranch {

    @JsonProperty("dataBranch")
    private List<Branch> dataBranch = null;
    @JsonProperty("produk")
    private Branch produk = null;
    @JsonProperty("code")
    private String code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponBranch() {
    }

    /**
     * 
     * @param dataBranch
     * @param code
     */
    public ResponBranch(List<Branch> dataBranch,Branch produk,String code) {
        super();
        this.dataBranch = dataBranch;
        this.produk = produk;
        this.code = code;
    }

    @JsonProperty("dataBranch")
    public List<Branch> getDataBranch() {
        return dataBranch;
    }

    @JsonProperty("dataBranch")
    public void setDataBranch(List<Branch> dataBranch) {
        this.dataBranch = dataBranch;
    }

    
    @JsonProperty("produk")
    public Branch getBranch() {
        return produk;
    }

    @JsonProperty("produk")
    public void setBranch(Branch produk) {
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
