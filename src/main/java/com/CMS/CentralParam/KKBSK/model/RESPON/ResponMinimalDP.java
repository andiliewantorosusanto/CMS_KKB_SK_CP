package com.CMS.CentralParam.KKBSK.model.RESPON;


import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataMinimalDP",
    "code"
})
@Generated("jsonschema2pojo")
public class ResponMinimalDP {

    @JsonProperty("dataMinimalDP")
    private List<DataMinimalDP> dataMinimalDP = null;
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
    public ResponMinimalDP(List<DataMinimalDP> dataMinimalDP, String code) {
        super();
        this.dataMinimalDP = dataMinimalDP;
        this.code = code;
    }

    @JsonProperty("dataMinimalDP")
    public List<DataMinimalDP> getDataMinimalDP() {
        return dataMinimalDP;
    }

    @JsonProperty("dataMinimalDP")
    public void setDataMinimalDP(List<DataMinimalDP> dataMinimalDP) {
        this.dataMinimalDP = dataMinimalDP;
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
