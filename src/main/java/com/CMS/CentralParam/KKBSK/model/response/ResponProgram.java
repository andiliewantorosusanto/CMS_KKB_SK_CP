
package com.CMS.CentralParam.KKBSK.model.response;

import java.util.List;

import com.CMS.CentralParam.KKBSK.model.data.Program;
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
    private List<Program> dataProgram = null;
    @JsonProperty("program")
    private Program program = null;
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
    public ResponProgram(List<Program> dataProgram,Program program,String code) {
        super();
        this.dataProgram = dataProgram;
        this.program = program;
        this.code = code;
    }

    @JsonProperty("dataProgram")
    public List<Program> getDataProgram() {
        return dataProgram;
    }

    @JsonProperty("dataProgram")
    public void setDataProgram(List<Program> dataProgram) {
        this.dataProgram = dataProgram;
    }

    
    @JsonProperty("program")
    public Program getProgram() {
        return program;
    }

    @JsonProperty("program")
    public void setProgram(Program program) {
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
