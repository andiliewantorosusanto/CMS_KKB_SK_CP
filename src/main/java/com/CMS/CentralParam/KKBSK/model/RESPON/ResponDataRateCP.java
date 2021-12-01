
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "dataRatecp"
})
@Generated("jsonschema2pojo")
public class ResponDataRateCP {

    @JsonProperty("code")
    private String code;
    @JsonProperty("dataRatecp")
    private List<DataRatecp> dataRatecp = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponDataRateCP() {
    }

    /**
     * 
     * @param code
     * @param dataRatecp
     */
    public ResponDataRateCP(String code, List<DataRatecp> dataRatecp) {
        super();
        this.code = code;
        this.dataRatecp = dataRatecp;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("dataRatecp")
    public List<DataRatecp> getDataRatecp() {
        return dataRatecp;
    }

    @JsonProperty("dataRatecp")
    public void setDataRatecp(List<DataRatecp> dataRatecp) {
        this.dataRatecp = dataRatecp;
    }

}
