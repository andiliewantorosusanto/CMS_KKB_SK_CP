
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "dataRateCP"
})
@Generated("jsonschema2pojo")
public class ResponRateCP {

    @JsonProperty("code")
    private String code;
    @JsonProperty("dataRateCP")
    private List<DataRateCP> dataRateCP = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponRateCP() {
    }

    /**
     * 
     * @param code
     * @param dataRateCP
     */
    public ResponRateCP(String code, List<DataRateCP> dataRateCP) {
        super();
        this.code = code;
        this.dataRateCP = dataRateCP;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
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

}
