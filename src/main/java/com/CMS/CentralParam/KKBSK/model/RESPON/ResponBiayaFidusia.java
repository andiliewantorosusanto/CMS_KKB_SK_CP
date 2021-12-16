
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
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
    private List<DataBiayaFidusia> dataBiayaFidusia = null;
    @JsonProperty("biayaFidusia")
    private DataBiayaFidusia biayaFidusia = null;
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
    public ResponBiayaFidusia(List<DataBiayaFidusia> dataBiayaFidusia,DataBiayaFidusia biayaFidusia,String code) {
        super();
        this.dataBiayaFidusia = dataBiayaFidusia;
        this.biayaFidusia = biayaFidusia;
        this.code = code;
    }

    @JsonProperty("dataBiayaFidusia")
    public List<DataBiayaFidusia> getDataBiayaFidusia() {
        return dataBiayaFidusia;
    }

    @JsonProperty("dataBiayaFidusia")
    public void setDataBiayaFidusia(List<DataBiayaFidusia> dataBiayaFidusia) {
        this.dataBiayaFidusia = dataBiayaFidusia;
    }

    
    @JsonProperty("biayaFidusia")
    public DataBiayaFidusia getBiayaFidusia() {
        return biayaFidusia;
    }

    @JsonProperty("biayaFidusia")
    public void setBiayaFidusia(DataBiayaFidusia biayaFidusia) {
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
