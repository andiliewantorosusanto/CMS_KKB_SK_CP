
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataJenisKendaraan",
    "code"
})
@Generated("jsonschema2pojo")
public class ResponJenisKendaraan {

    @JsonProperty("dataJenisKendaraan")
    private List<DataJenisKendaraan> dataJenisKendaraan = null;
    @JsonProperty("code")
    private String code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponJenisKendaraan() {
    }

    /**
     * 
     * @param dataJenisKendaraan
     * @param code
     */
    public ResponJenisKendaraan(List<DataJenisKendaraan> dataJenisKendaraan, String code) {
        super();
        this.dataJenisKendaraan = dataJenisKendaraan;
        this.code = code;
    }

    @JsonProperty("dataJenisKendaraan")
    public List<DataJenisKendaraan> getDataJenisKendaraan() {
        return dataJenisKendaraan;
    }

    @JsonProperty("dataJenisKendaraan")
    public void setDataratebiayaadmin(List<DataJenisKendaraan> dataJenisKendaraan) {
        this.dataJenisKendaraan = dataJenisKendaraan;
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
