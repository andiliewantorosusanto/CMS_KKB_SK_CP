package com.CMS.CentralParam.KKBSK.model.RESPON;


import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataRateMinimalDP",
    "code"
})
@Generated("jsonschema2pojo")
public class ResponMinimalDP {

    @JsonProperty("dataRateMinimalDP")
    private List<DataRateMinimalDP> dataRateMinimalDP = null;
    @JsonProperty("code")
    private String code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponMinimalDP() {
    }

    /**
     * 
     * @param dataRateMinimalDP
     * @param code
     */
    public ResponMinimalDP(List<DataRateMinimalDP> dataRateMinimalDP, String code) {
        super();
        this.dataRateMinimalDP = dataRateMinimalDP;
        this.code = code;
    }

    @JsonProperty("dataRateMinimalDP")
    public List<DataRateMinimalDP> getDataRateMinimalDP() {
        return dataRateMinimalDP;
    }

    @JsonProperty("dataRateMinimalDP")
    public void setDataRateMinimalDP(List<DataRateMinimalDP> dataRateMinimalDP) {
        this.dataRateMinimalDP = dataRateMinimalDP;
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
