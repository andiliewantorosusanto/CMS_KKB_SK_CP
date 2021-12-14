
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
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
    private List<DataTujuanPenggunaan> dataTujuanPenggunaan = null;
    @JsonProperty("tujuanPenggunaan")
    private DataTujuanPenggunaan tujuanPenggunaan = null;
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
    public ResponTujuanPenggunaan(List<DataTujuanPenggunaan> dataTujuanPenggunaan,DataTujuanPenggunaan tujuanPenggunaan,String code) {
        super();
        this.dataTujuanPenggunaan = dataTujuanPenggunaan;
        this.tujuanPenggunaan = tujuanPenggunaan;
        this.code = code;
    }

    @JsonProperty("dataTujuanPenggunaan")
    public List<DataTujuanPenggunaan> getDataTujuanPenggunaan() {
        return dataTujuanPenggunaan;
    }

    @JsonProperty("dataTujuanPenggunaan")
    public void setDataTujuanPenggunaan(List<DataTujuanPenggunaan> dataTujuanPenggunaan) {
        this.dataTujuanPenggunaan = dataTujuanPenggunaan;
    }

    
    @JsonProperty("tujuanPenggunaan")
    public DataTujuanPenggunaan getTujuanPenggunaan() {
        return tujuanPenggunaan;
    }

    @JsonProperty("tujuanPenggunaan")
    public void setTujuanPenggunaan(DataTujuanPenggunaan tujuanPenggunaan) {
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
