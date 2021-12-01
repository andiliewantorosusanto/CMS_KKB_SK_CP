
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataratebiayaadmin",
    "code"
})
@Generated("jsonschema2pojo")
public class ResponBiayaAdmin {

    @JsonProperty("dataratebiayaadmin")
    private List<Dataratebiayaadmin> dataratebiayaadmin = null;
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
     * @param dataratebiayaadmin
     * @param code
     */
    public ResponBiayaAdmin(List<Dataratebiayaadmin> dataratebiayaadmin, String code) {
        super();
        this.dataratebiayaadmin = dataratebiayaadmin;
        this.code = code;
    }

    @JsonProperty("dataratebiayaadmin")
    public List<Dataratebiayaadmin> getDataratebiayaadmin() {
        return dataratebiayaadmin;
    }

    @JsonProperty("dataratebiayaadmin")
    public void setDataratebiayaadmin(List<Dataratebiayaadmin> dataratebiayaadmin) {
        this.dataratebiayaadmin = dataratebiayaadmin;
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
