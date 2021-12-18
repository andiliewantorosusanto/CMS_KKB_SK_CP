
package com.CMS.CentralParam.KKBSK.model.response;

import java.util.List;

import com.CMS.CentralParam.KKBSK.model.data.TipeAsuransi;
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
    private List<TipeAsuransi> dataTipeAsuransi = null;
    @JsonProperty("tipeAsuransi")
    private TipeAsuransi tipeAsuransi = null;
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
    public ResponTipeAsuransi(List<TipeAsuransi> dataTipeAsuransi,TipeAsuransi tipeAsuransi,String code) {
        super();
        this.dataTipeAsuransi = dataTipeAsuransi;
        this.tipeAsuransi = tipeAsuransi;
        this.code = code;
    }

    @JsonProperty("dataTipeAsuransi")
    public List<TipeAsuransi> getDataTipeAsuransi() {
        return dataTipeAsuransi;
    }

    @JsonProperty("dataTipeAsuransi")
    public void setDataTipeAsuransi(List<TipeAsuransi> dataTipeAsuransi) {
        this.dataTipeAsuransi = dataTipeAsuransi;
    }

    
    @JsonProperty("tipeAsuransi")
    public TipeAsuransi getTipeAsuransi() {
        return tipeAsuransi;
    }

    @JsonProperty("tipeAsuransi")
    public void setTipeAsuransi(TipeAsuransi tipeAsuransi) {
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
