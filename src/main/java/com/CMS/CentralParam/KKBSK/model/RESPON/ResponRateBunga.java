
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
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
    private List<DataRateBunga> dataRateBunga = null;
    @JsonProperty("rateBunga")
    private DataRateBunga rateBunga = null;
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
    public ResponRateBunga(List<DataRateBunga> dataRateBunga,DataRateBunga rateBunga,String code) {
        super();
        this.dataRateBunga = dataRateBunga;
        this.rateBunga = rateBunga;
        this.code = code;
    }

    @JsonProperty("dataRateBunga")
    public List<DataRateBunga> getDataRateBunga() {
        return dataRateBunga;
    }

    @JsonProperty("dataRateBunga")
    public void setDataRateBunga(List<DataRateBunga> dataRateBunga) {
        this.dataRateBunga = dataRateBunga;
    }

    
    @JsonProperty("rateBunga")
    public DataRateBunga getRateBunga() {
        return rateBunga;
    }

    @JsonProperty("rateBunga")
    public void setRateBunga(DataRateBunga rateBunga) {
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
