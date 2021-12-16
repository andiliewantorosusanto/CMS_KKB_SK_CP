
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataBiayaAdmin",
    "biayaAdmin",
    "code"
})
public class ResponBiayaAdmin {

    @JsonProperty("dataBiayaAdmin")
    private List<DataBiayaAdmin> dataBiayaAdmin = null;
    @JsonProperty("biayaAdmin")
    private DataBiayaAdmin biayaAdmin = null;
    @JsonProperty("code")
    private String code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponBiayaAdmin() {
    }

    /**
     * 
     * @param dataBiayaAdmin
     * @param code
     */
    public ResponBiayaAdmin(List<DataBiayaAdmin> dataBiayaAdmin,DataBiayaAdmin biayaAdmin,String code) {
        super();
        this.dataBiayaAdmin = dataBiayaAdmin;
        this.biayaAdmin = biayaAdmin;
        this.code = code;
    }

    @JsonProperty("dataBiayaAdmin")
    public List<DataBiayaAdmin> getDataBiayaAdmin() {
        return dataBiayaAdmin;
    }

    @JsonProperty("dataBiayaAdmin")
    public void setDataBiayaAdmin(List<DataBiayaAdmin> dataBiayaAdmin) {
        this.dataBiayaAdmin = dataBiayaAdmin;
    }

    
    @JsonProperty("biayaAdmin")
    public DataBiayaAdmin getBiayaAdmin() {
        return biayaAdmin;
    }

    @JsonProperty("biayaAdmin")
    public void setBiayaAdmin(DataBiayaAdmin biayaAdmin) {
        this.biayaAdmin = biayaAdmin;
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
