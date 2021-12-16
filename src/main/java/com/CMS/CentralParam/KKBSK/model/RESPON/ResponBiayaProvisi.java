
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
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
    private List<DataBiayaProvisi> dataBiayaProvisi = null;
    @JsonProperty("biayaProvisi")
    private DataBiayaProvisi biayaProvisi = null;
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
    public ResponBiayaProvisi(List<DataBiayaProvisi> dataBiayaProvisi,DataBiayaProvisi biayaProvisi,String code) {
        super();
        this.dataBiayaProvisi = dataBiayaProvisi;
        this.biayaProvisi = biayaProvisi;
        this.code = code;
    }

    @JsonProperty("dataBiayaProvisi")
    public List<DataBiayaProvisi> getDataBiayaProvisi() {
        return dataBiayaProvisi;
    }

    @JsonProperty("dataBiayaProvisi")
    public void setDataBiayaProvisi(List<DataBiayaProvisi> dataBiayaProvisi) {
        this.dataBiayaProvisi = dataBiayaProvisi;
    }

    
    @JsonProperty("biayaProvisi")
    public DataBiayaProvisi getBiayaProvisi() {
        return biayaProvisi;
    }

    @JsonProperty("biayaProvisi")
    public void setBiayaProvisi(DataBiayaProvisi biayaProvisi) {
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
