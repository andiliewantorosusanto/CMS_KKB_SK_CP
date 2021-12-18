
package com.CMS.CentralParam.KKBSK.model.response;

import java.util.List;

import com.CMS.CentralParam.KKBSK.model.data.BiayaFidusia;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataBiayaFidusia",
    "biayaFidusia",
    "code"
})
public class ResponBiayaFidusia {

    @JsonProperty("dataBiayaFidusia")
    private List<BiayaFidusia> dataBiayaFidusia = null;
    @JsonProperty("biayaFidusia")
    private BiayaFidusia biayaFidusia = null;
    @JsonProperty("code")
    private String code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponBiayaFidusia() {
    }

    /**
     * 
     * @param dataBiayaFidusia
     * @param code
     */
    public ResponBiayaFidusia(List<BiayaFidusia> dataBiayaFidusia,BiayaFidusia biayaFidusia,String code) {
        super();
        this.dataBiayaFidusia = dataBiayaFidusia;
        this.biayaFidusia = biayaFidusia;
        this.code = code;
    }

    @JsonProperty("dataBiayaFidusia")
    public List<BiayaFidusia> getDataBiayaFidusia() {
        return dataBiayaFidusia;
    }

    @JsonProperty("dataBiayaFidusia")
    public void setDataBiayaFidusia(List<BiayaFidusia> dataBiayaFidusia) {
        this.dataBiayaFidusia = dataBiayaFidusia;
    }

    
    @JsonProperty("biayaFidusia")
    public BiayaFidusia getBiayaFidusia() {
        return biayaFidusia;
    }

    @JsonProperty("biayaFidusia")
    public void setBiayaFidusia(BiayaFidusia biayaFidusia) {
        this.biayaFidusia = biayaFidusia;
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
