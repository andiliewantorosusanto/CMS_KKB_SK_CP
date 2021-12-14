
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "dataPerluasanAsuransi"
})
@Generated("jsonschema2pojo")
public class ResponPerluasanAsuransi {

    @JsonProperty("code")
    private String code;
    @JsonProperty("dataPerluasanAsuransi")
    private List<DataPerluasanAsuransi> dataPerluasanAsuransi = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponPerluasanAsuransi() {
    }

    /**
     * 
     * @param code
     * @param dataPerluasanAsuransi
     */
    public ResponPerluasanAsuransi(String code, List<DataPerluasanAsuransi> dataPerluasanAsuransi) {
        super();
        this.code = code;
        this.dataPerluasanAsuransi = dataPerluasanAsuransi;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("dataPerluasanAsuransi")
    public List<DataPerluasanAsuransi> getDataPerluasanAsuransi() {
        return dataPerluasanAsuransi;
    }

    @JsonProperty("dataPerluasanAsuransi")
    public void setDataPerluasanAsuransi(List<DataPerluasanAsuransi> dataPerluasanAsuransi) {
        this.dataPerluasanAsuransi = dataPerluasanAsuransi;
    }

}
