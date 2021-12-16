
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
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
    private List<DataRateCP> dataRateCP = null;
    @JsonProperty("rateCP")
    private DataRateCP rateCP = null;
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
    public ResponRateCP(List<DataRateCP> dataRateCP,DataRateCP rateCP,String code) {
        super();
        this.dataRateCP = dataRateCP;
        this.rateCP = rateCP;
        this.code = code;
    }

    @JsonProperty("dataRateCP")
    public List<DataRateCP> getDataRateCP() {
        return dataRateCP;
    }

    @JsonProperty("dataRateCP")
    public void setDataRateCP(List<DataRateCP> dataRateCP) {
        this.dataRateCP = dataRateCP;
    }

    
    @JsonProperty("rateCP")
    public DataRateCP getRateCP() {
        return rateCP;
    }

    @JsonProperty("rateCP")
    public void setRateCP(DataRateCP rateCP) {
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
