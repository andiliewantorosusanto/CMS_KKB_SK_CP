
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "datarateperluasanasuransi"
})
@Generated("jsonschema2pojo")
public class ResponRatePerluasanAsuransi {

    @JsonProperty("code")
    private String code;
    @JsonProperty("datarateperluasanasuransi")
    private List<Datarateperluasanasuransi> datarateperluasanasuransi = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponRatePerluasanAsuransi() {
    }

    /**
     * 
     * @param code
     * @param datarateperluasanasuransi
     */
    public ResponRatePerluasanAsuransi(String code, List<Datarateperluasanasuransi> datarateperluasanasuransi) {
        super();
        this.code = code;
        this.datarateperluasanasuransi = datarateperluasanasuransi;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("datarateperluasanasuransi")
    public List<Datarateperluasanasuransi> getDatarateperluasanasuransi() {
        return datarateperluasanasuransi;
    }

    @JsonProperty("datarateperluasanasuransi")
    public void setDatarateperluasanasuransi(List<Datarateperluasanasuransi> datarateperluasanasuransi) {
        this.datarateperluasanasuransi = datarateperluasanasuransi;
    }

}
