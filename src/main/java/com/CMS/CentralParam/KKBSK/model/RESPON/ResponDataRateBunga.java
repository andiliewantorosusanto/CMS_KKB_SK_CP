package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "dataRateBunga"
})
public class ResponDataRateBunga {

    @JsonProperty("code")
    private String code;
    @JsonProperty("dataRateBunga")
    private List<DataRateBunga> dataRateBunga = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponDataRateBunga() {
    }

    /**
     * 
     * @param code
     * @param dataRateBunga
     */
    public ResponDataRateBunga(String code, List<DataRateBunga> dataRateBunga) {
        super();
        this.code = code;
        this.dataRateBunga = dataRateBunga;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
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

}
