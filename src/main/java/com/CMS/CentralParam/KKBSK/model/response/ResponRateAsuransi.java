
package com.CMS.CentralParam.KKBSK.model.response;

import java.util.List;

import com.CMS.CentralParam.KKBSK.model.data.RateAsuransi;
import com.CMS.CentralParam.KKBSK.view.vwRateAsuransi;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataRateAsuransi",
    "rateAsuransi",
    "code"
})
public class ResponRateAsuransi {

    @JsonProperty("dataRateAsuransi")
    private List<vwRateAsuransi> dataRateAsuransi = null;
    @JsonProperty("rateAsuransi")
    private RateAsuransi rateAsuransi = null;
    @JsonProperty("code")
    private String code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponRateAsuransi() {
    }

    /**
     * 
     * @param dataRateAsuransi
     * @param code
     */
    public ResponRateAsuransi(List<vwRateAsuransi> dataRateAsuransi,RateAsuransi rateAsuransi,String code) {
        super();
        this.dataRateAsuransi = dataRateAsuransi;
        this.rateAsuransi = rateAsuransi;
        this.code = code;
    }

    @JsonProperty("dataRateAsuransi")
    public List<vwRateAsuransi> getDataRateAsuransi() {
        return dataRateAsuransi;
    }

    @JsonProperty("dataRateAsuransi")
    public void setDataRateAsuransi(List<vwRateAsuransi> dataRateAsuransi) {
        this.dataRateAsuransi = dataRateAsuransi;
    }

    
    @JsonProperty("rateAsuransi")
    public RateAsuransi getRateAsuransi() {
        return rateAsuransi;
    }

    @JsonProperty("rateAsuransi")
    public void setRateAsuransi(RateAsuransi rateAsuransi) {
        this.rateAsuransi = rateAsuransi;
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
