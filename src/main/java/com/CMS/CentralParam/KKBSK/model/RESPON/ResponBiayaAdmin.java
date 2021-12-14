
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataBiayaAdmin",
    "code"
})
@Generated("jsonschema2pojo")
public class ResponBiayaAdmin {

    @JsonProperty("dataBiayaAdmin")
    private List<DataBiayaAdmin> dataBiayaAdmin = null;
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
    public ResponBiayaAdmin(List<DataBiayaAdmin> dataBiayaAdmin, String code) {
        super();
        this.dataBiayaAdmin = dataBiayaAdmin;
        this.code = code;
    }

    @JsonProperty("dataBiayaAdmin")
    public List<DataBiayaAdmin> getDataBiayaAdmin() {
        return dataBiayaAdmin;
    }

    @JsonProperty("dataBiayaAdmin")
    public void setDataratebiayaadmin(List<DataBiayaAdmin> dataBiayaAdmin) {
        this.dataBiayaAdmin = dataBiayaAdmin;
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
