
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataTipeAsuransi",
    "tipeAsuransi",
    "code"
})
public class ResponTipeAsuransi {

    @JsonProperty("dataTipeAsuransi")
    private List<DataTipeAsuransi> dataTipeAsuransi = null;
    @JsonProperty("tipeAsuransi")
    private DataTipeAsuransi tipeAsuransi = null;
    @JsonProperty("code")
    private String code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponTipeAsuransi() {
    }

    /**
     * 
     * @param dataTipeAsuransi
     * @param code
     */
    public ResponTipeAsuransi(List<DataTipeAsuransi> dataTipeAsuransi,DataTipeAsuransi tipeAsuransi,String code) {
        super();
        this.dataTipeAsuransi = dataTipeAsuransi;
        this.tipeAsuransi = tipeAsuransi;
        this.code = code;
    }

    @JsonProperty("dataTipeAsuransi")
    public List<DataTipeAsuransi> getDataTipeAsuransi() {
        return dataTipeAsuransi;
    }

    @JsonProperty("dataTipeAsuransi")
    public void setDataTipeAsuransi(List<DataTipeAsuransi> dataTipeAsuransi) {
        this.dataTipeAsuransi = dataTipeAsuransi;
    }

    
    @JsonProperty("tipeAsuransi")
    public DataTipeAsuransi getTipeAsuransi() {
        return tipeAsuransi;
    }

    @JsonProperty("tipeAsuransi")
    public void setTipeAsuransi(DataTipeAsuransi tipeAsuransi) {
        this.tipeAsuransi = tipeAsuransi;
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
