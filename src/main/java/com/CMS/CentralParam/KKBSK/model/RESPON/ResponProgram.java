
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "dataProgram"
})
@Generated("jsonschema2pojo")
public class ResponProgram {

    @JsonProperty("code")
    private String code;
    @JsonProperty("dataProgram")
    private List<DataProgram> dataProgram = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponProgram() {
    }

    /**
     * 
     * @param code
     * @param dataProgram
     */
    public ResponProgram(String code, List<DataProgram> dataProgram) {
        super();
        this.code = code;
        this.dataProgram = dataProgram;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("dataProgram")
    public List<DataProgram> getDataProgram() {
        return dataProgram;
    }

    @JsonProperty("dataProgram")
    public void setDataProgram(List<DataProgram> dataProgram) {
        this.dataProgram = dataProgram;
    }

}
