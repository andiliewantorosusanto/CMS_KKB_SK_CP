
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


    public ResponBiayaAdmin() {
    }

    public ResponBiayaAdmin(List<vwBiayaAdmin> dataBiayaAdmin, BiayaAdmin biayaAdmin, String code) {
        this.dataBiayaAdmin = dataBiayaAdmin;
        this.biayaAdmin = biayaAdmin;
        this.code = code;
    }

    public List<vwBiayaAdmin> getDataBiayaAdmin() {
        return this.dataBiayaAdmin;
    }

    public void setDataBiayaAdmin(List<vwBiayaAdmin> dataBiayaAdmin) {
        this.dataBiayaAdmin = dataBiayaAdmin;
    }

    public BiayaAdmin getBiayaAdmin() {
        return this.biayaAdmin;
    }

    public void setBiayaAdmin(BiayaAdmin biayaAdmin) {
        this.biayaAdmin = biayaAdmin;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ResponBiayaAdmin dataBiayaAdmin(List<vwBiayaAdmin> dataBiayaAdmin) {
        setDataBiayaAdmin(dataBiayaAdmin);
        return this;
    }

    public ResponBiayaAdmin biayaAdmin(BiayaAdmin biayaAdmin) {
        setBiayaAdmin(biayaAdmin);
        return this;
    }

    public ResponBiayaAdmin code(String code) {
        setCode(code);
        return this;
    }

}
