
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataPerluasanAsuransi",
    "perluasanAsuransi",
    "code"
})
public class ResponPerluasanAsuransi {

    @JsonProperty("dataPerluasanAsuransi")
    private List<DataPerluasanAsuransi> dataPerluasanAsuransi = null;
    @JsonProperty("perluasanAsuransi")
    private DataPerluasanAsuransi perluasanAsuransi = null;
    @JsonProperty("code")
    private String code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponPerluasanAsuransi() {
    }

    /**
     * 
     * @param dataPerluasanAsuransi
     * @param code
     */
    public ResponPerluasanAsuransi(List<DataPerluasanAsuransi> dataPerluasanAsuransi,DataPerluasanAsuransi perluasanAsuransi,String code) {
        super();
        this.dataPerluasanAsuransi = dataPerluasanAsuransi;
        this.perluasanAsuransi = perluasanAsuransi;
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

    
    @JsonProperty("perluasanAsuransi")
    public DataPerluasanAsuransi getPerluasanAsuransi() {
        return perluasanAsuransi;
    }

    @JsonProperty("perluasanAsuransi")
    public void setPerluasanAsuransi(DataPerluasanAsuransi perluasanAsuransi) {
        this.perluasanAsuransi = perluasanAsuransi;
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
