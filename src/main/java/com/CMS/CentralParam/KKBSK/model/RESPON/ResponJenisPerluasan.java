
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataJenisPerluasan",
    "code"
})
@Generated("jsonschema2pojo")
public class ResponJenisPerluasan {

    @JsonProperty("dataJenisPerluasan")
    private List<DataJenisPerluasan> dataJenisPerluasan = null;
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
    public ResponJenisPerluasan(List<DataJenisPerluasan> dataJenisPerluasan, String code) {
        super();
        this.dataJenisPerluasan = dataJenisPerluasan;
        this.code = code;
    }

    @JsonProperty("dataJenisPerluasan")
    public List<DataJenisPerluasan> getDataJenisPerluasan() {
        return dataJenisPerluasan;
    }

    @JsonProperty("dataJenisPerluasan")
    public void setDataratebiayaadmin(List<DataJenisPerluasan> dataJenisPerluasan) {
        this.dataJenisPerluasan = dataJenisPerluasan;
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
