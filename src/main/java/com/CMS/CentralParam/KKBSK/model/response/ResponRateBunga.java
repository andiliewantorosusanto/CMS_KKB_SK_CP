
package com.CMS.CentralParam.KKBSK.model.response;

import java.util.List;

import com.CMS.CentralParam.KKBSK.model.data.RateBunga;
import com.CMS.CentralParam.KKBSK.view.vwRateBunga;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataRateBunga",
    "rateBunga",
    "code"
})
public class ResponRateBunga {

    @JsonProperty("dataRateBunga")
    private List<vwRateBunga> dataRateBunga = null;
    @JsonProperty("rateBunga")
    private RateBunga rateBunga = null;
    @JsonProperty("code")
    private String code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponRateBunga() {
    }

    /**
     * 
     * @param dataRateBunga
     * @param code
     */
    public ResponRateBunga(List<vwRateBunga> dataRateBunga,RateBunga rateBunga,String code) {
        super();
        this.dataRateBunga = dataRateBunga;
        this.rateBunga = rateBunga;
        this.code = code;
    }

    @JsonProperty("dataRateBunga")
    public List<vwRateBunga> getDataRateBunga() {
        return dataRateBunga;
    }

    @JsonProperty("dataRateBunga")
    public void setDataRateBunga(List<vwRateBunga> dataRateBunga) {
        this.dataRateBunga = dataRateBunga;
    }

    
    @JsonProperty("rateBunga")
    public RateBunga getRateBunga() {
        return rateBunga;
    }

    @JsonProperty("rateBunga")
    public void setRateBunga(RateBunga rateBunga) {
        this.rateBunga = rateBunga;
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
