
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataProgram",
    "program",
    "code"
})
public class ResponProgram {

    @JsonProperty("dataProgram")
    private List<DataProgram> dataProgram = null;
    @JsonProperty("program")
    private DataProgram program = null;
    @JsonProperty("code")
    private String code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponProgram() {
    }

    /**
     * 
     * @param dataProgram
     * @param code
     */
    public ResponProgram(List<DataProgram> dataProgram,DataProgram program,String code) {
        super();
        this.dataProgram = dataProgram;
        this.program = program;
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

    
    @JsonProperty("program")
    public DataProgram getProgram() {
        return program;
    }

    @JsonProperty("program")
    public void setProgram(DataProgram program) {
        this.program = program;
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
