
package com.CMS.CentralParam.KKBSK.model.response;

import java.util.List;

import com.CMS.CentralParam.KKBSK.model.data.PerluasanAsuransi;
import com.CMS.CentralParam.KKBSK.view.vwPerluasanAsuransi;
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
    private List<vwPerluasanAsuransi> dataPerluasanAsuransi = null;
    @JsonProperty("perluasanAsuransi")
    private PerluasanAsuransi perluasanAsuransi = null;
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
    public ResponPerluasanAsuransi(List<vwPerluasanAsuransi> dataPerluasanAsuransi,PerluasanAsuransi perluasanAsuransi,String code) {
        super();
        this.dataPerluasanAsuransi = dataPerluasanAsuransi;
        this.perluasanAsuransi = perluasanAsuransi;
        this.code = code;
    }

    @JsonProperty("dataPerluasanAsuransi")
    public List<vwPerluasanAsuransi> getDataPerluasanAsuransi() {
        return dataPerluasanAsuransi;
    }

    @JsonProperty("dataPerluasanAsuransi")
    public void setDataPerluasanAsuransi(List<vwPerluasanAsuransi> dataPerluasanAsuransi) {
        this.dataPerluasanAsuransi = dataPerluasanAsuransi;
    }

    
    @JsonProperty("perluasanAsuransi")
    public PerluasanAsuransi getPerluasanAsuransi() {
        return perluasanAsuransi;
    }

    @JsonProperty("perluasanAsuransi")
    public void setPerluasanAsuransi(PerluasanAsuransi perluasanAsuransi) {
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
