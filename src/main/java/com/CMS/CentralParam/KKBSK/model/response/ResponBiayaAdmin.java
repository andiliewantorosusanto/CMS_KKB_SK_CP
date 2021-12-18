
package com.CMS.CentralParam.KKBSK.model.response;

import java.util.List;

import com.CMS.CentralParam.KKBSK.model.data.BiayaAdmin;
import com.CMS.CentralParam.KKBSK.view.vwBiayaAdmin;
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
    private List<vwBiayaAdmin> dataBiayaAdmin = null;
    @JsonProperty("biayaAdmin")
    private BiayaAdmin biayaAdmin = null;
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
    public ResponBiayaAdmin(List<vwBiayaAdmin> dataBiayaAdmin,BiayaAdmin biayaAdmin,String code) {
        super();
        this.dataBiayaAdmin = dataBiayaAdmin;
        this.biayaAdmin = biayaAdmin;
        this.code = code;
    }

    @JsonProperty("dataBiayaAdmin")
    public List<vwBiayaAdmin> getDataBiayaAdmin() {
        return dataBiayaAdmin;
    }

    @JsonProperty("dataBiayaAdmin")
    public void setDataBiayaAdmin(List<vwBiayaAdmin> dataBiayaAdmin) {
        this.dataBiayaAdmin = dataBiayaAdmin;
    }

    
    @JsonProperty("biayaAdmin")
    public BiayaAdmin getBiayaAdmin() {
        return biayaAdmin;
    }

    @JsonProperty("biayaAdmin")
    public void setBiayaAdmin(BiayaAdmin biayaAdmin) {
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
