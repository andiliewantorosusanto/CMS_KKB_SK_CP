
package com.CMS.CentralParam.KKBSK.model.response;

import java.util.List;

import com.CMS.CentralParam.KKBSK.model.data.TujuanPenggunaan;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataTujuanPenggunaan",
    "tujuanPenggunaan",
    "code"
})
public class ResponTujuanPenggunaan {

    @JsonProperty("dataTujuanPenggunaan")
    private List<TujuanPenggunaan> dataTujuanPenggunaan = null;
    @JsonProperty("tujuanPenggunaan")
    private TujuanPenggunaan tujuanPenggunaan = null;
    @JsonProperty("code")
    private String code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponTujuanPenggunaan() {
    }

    /**
     * 
     * @param dataTujuanPenggunaan
     * @param code
     */
    public ResponTujuanPenggunaan(List<TujuanPenggunaan> dataTujuanPenggunaan,TujuanPenggunaan tujuanPenggunaan,String code) {
        super();
        this.dataTujuanPenggunaan = dataTujuanPenggunaan;
        this.tujuanPenggunaan = tujuanPenggunaan;
        this.code = code;
    }

    @JsonProperty("dataTujuanPenggunaan")
    public List<TujuanPenggunaan> getDataTujuanPenggunaan() {
        return dataTujuanPenggunaan;
    }

    @JsonProperty("dataTujuanPenggunaan")
    public void setDataTujuanPenggunaan(List<TujuanPenggunaan> dataTujuanPenggunaan) {
        this.dataTujuanPenggunaan = dataTujuanPenggunaan;
    }

    
    @JsonProperty("tujuanPenggunaan")
    public TujuanPenggunaan getTujuanPenggunaan() {
        return tujuanPenggunaan;
    }

    @JsonProperty("tujuanPenggunaan")
    public void setTujuanPenggunaan(TujuanPenggunaan tujuanPenggunaan) {
        this.tujuanPenggunaan = tujuanPenggunaan;
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
