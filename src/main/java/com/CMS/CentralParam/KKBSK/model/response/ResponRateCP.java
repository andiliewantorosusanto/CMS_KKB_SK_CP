
package com.CMS.CentralParam.KKBSK.model.response;

import java.util.List;

import com.CMS.CentralParam.KKBSK.model.data.RateCP;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataRateCP",
    "rateCP",
    "code"
})
public class ResponRateCP {

    @JsonProperty("dataRateCP")
    private List<RateCP> dataRateCP = null;
    @JsonProperty("rateCP")
    private RateCP rateCP = null;
    @JsonProperty("code")
    private String code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponRateCP() {
    }

    /**
     * 
     * @param dataRateCP
     * @param code
     */
    public ResponRateCP(List<RateCP> dataRateCP,RateCP rateCP,String code) {
        super();
        this.dataRateCP = dataRateCP;
        this.rateCP = rateCP;
        this.code = code;
    }

    @JsonProperty("dataRateCP")
    public List<RateCP> getDataRateCP() {
        return dataRateCP;
    }

    @JsonProperty("dataRateCP")
    public void setDataRateCP(List<RateCP> dataRateCP) {
        this.dataRateCP = dataRateCP;
    }

    
    @JsonProperty("rateCP")
    public RateCP getRateCP() {
        return rateCP;
    }

    @JsonProperty("rateCP")
    public void setRateCP(RateCP rateCP) {
        this.rateCP = rateCP;
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
