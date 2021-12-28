
package com.CMS.CentralParam.KKBSK.model.response;

import java.util.List;

import com.CMS.CentralParam.KKBSK.model.data.BiayaProvisi;
import com.CMS.CentralParam.KKBSK.view.vwBiayaProvisi;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataBiayaProvisi",
    "biayaProvisi",
    "code"
})
public class ResponBiayaProvisi {

    @JsonProperty("dataBiayaProvisi")
    private List<vwBiayaProvisi> dataBiayaProvisi = null;
    @JsonProperty("biayaProvisi")
    private BiayaProvisi biayaProvisi = null;
    @JsonProperty("code")
    private String code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponBiayaProvisi() {
    }

    /**
     * 
     * @param dataBiayaProvisi
     * @param code
     */
    public ResponBiayaProvisi(List<vwBiayaProvisi> dataBiayaProvisi,BiayaProvisi biayaProvisi,String code) {
        super();
        this.dataBiayaProvisi = dataBiayaProvisi;
        this.biayaProvisi = biayaProvisi;
        this.code = code;
    }

    @JsonProperty("dataBiayaProvisi")
    public List<vwBiayaProvisi> getDataBiayaProvisi() {
        return dataBiayaProvisi;
    }

    @JsonProperty("dataBiayaProvisi")
    public void setDataBiayaProvisi(List<vwBiayaProvisi> dataBiayaProvisi) {
        this.dataBiayaProvisi = dataBiayaProvisi;
    }

    
    @JsonProperty("biayaProvisi")
    public BiayaProvisi getBiayaProvisi() {
        return biayaProvisi;
    }

    @JsonProperty("biayaProvisi")
    public void setBiayaProvisi(BiayaProvisi biayaProvisi) {
        this.biayaProvisi = biayaProvisi;
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
