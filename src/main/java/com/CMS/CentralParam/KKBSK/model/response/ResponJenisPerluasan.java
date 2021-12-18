
package com.CMS.CentralParam.KKBSK.model.response;

import java.util.List;

import com.CMS.CentralParam.KKBSK.model.data.JenisPerluasan;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataJenisPerluasan",
    "jenisPerluasan",
    "code"
})
public class ResponJenisPerluasan {

    @JsonProperty("dataJenisPerluasan")
    private List<JenisPerluasan> dataJenisPerluasan = null;
    @JsonProperty("jenisPerluasan")
    private JenisPerluasan jenisPerluasan = null;
    @JsonProperty("code")
    private String code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponJenisPerluasan() {
    }

    /**
     * 
     * @param dataJenisPerluasan
     * @param code
     */
    public ResponJenisPerluasan(List<JenisPerluasan> dataJenisPerluasan,JenisPerluasan jenisPerluasan,String code) {
        super();
        this.dataJenisPerluasan = dataJenisPerluasan;
        this.jenisPerluasan = jenisPerluasan;
        this.code = code;
    }

    @JsonProperty("dataJenisPerluasan")
    public List<JenisPerluasan> getDataJenisPerluasan() {
        return dataJenisPerluasan;
    }

    @JsonProperty("dataJenisPerluasan")
    public void setDataJenisPerluasan(List<JenisPerluasan> dataJenisPerluasan) {
        this.dataJenisPerluasan = dataJenisPerluasan;
    }

    
    @JsonProperty("jenisPerluasan")
    public JenisPerluasan getJenisPerluasan() {
        return jenisPerluasan;
    }

    @JsonProperty("jenisPerluasan")
    public void setJenisPerluasan(JenisPerluasan jenisPerluasan) {
        this.jenisPerluasan = jenisPerluasan;
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
