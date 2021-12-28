
package com.CMS.CentralParam.KKBSK.model.response;

import java.util.List;

import com.CMS.CentralParam.KKBSK.model.data.MinimalDP;
import com.CMS.CentralParam.KKBSK.view.vwMinimalDP;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataMinimalDP",
    "minimalDP",
    "code"
})
public class ResponMinimalDP {

    @JsonProperty("dataMinimalDP")
    private List<vwMinimalDP> dataMinimalDP = null;
    @JsonProperty("minimalDP")
    private MinimalDP minimalDP = null;
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
     * @param dataMinimalDP
     * @param code
     */
    public ResponMinimalDP(List<vwMinimalDP> dataMinimalDP,MinimalDP minimalDP,String code) {
        super();
        this.dataMinimalDP = dataMinimalDP;
        this.minimalDP = minimalDP;
        this.code = code;
    }

    @JsonProperty("dataMinimalDP")
    public List<vwMinimalDP> getDataMinimalDP() {
        return dataMinimalDP;
    }

    @JsonProperty("dataMinimalDP")
    public void setDataMinimalDP(List<vwMinimalDP> dataMinimalDP) {
        this.dataMinimalDP = dataMinimalDP;
    }

    
    @JsonProperty("minimalDP")
    public MinimalDP getMinimalDP() {
        return minimalDP;
    }

    @JsonProperty("minimalDP")
    public void setMinimalDP(MinimalDP minimalDP) {
        this.minimalDP = minimalDP;
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
