
package com.CMS.CentralParam.KKBSK.model.response;

import java.util.List;

import com.CMS.CentralParam.KKBSK.model.data.JenisKendaraan;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataJenisKendaraan",
    "jenisKendaraan",
    "code"
})
public class ResponJenisKendaraan {

    @JsonProperty("dataJenisKendaraan")
    private List<JenisKendaraan> dataJenisKendaraan = null;
    @JsonProperty("jenisKendaraan")
    private JenisKendaraan jenisKendaraan = null;
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
    public ResponJenisKendaraan(List<JenisKendaraan> dataJenisKendaraan,JenisKendaraan jenisKendaraan,String code) {
        super();
        this.dataJenisKendaraan = dataJenisKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.code = code;
    }

    @JsonProperty("dataJenisKendaraan")
    public List<JenisKendaraan> getDataJenisKendaraan() {
        return dataJenisKendaraan;
    }

    @JsonProperty("dataJenisKendaraan")
    public void setDataJenisKendaraan(List<JenisKendaraan> dataJenisKendaraan) {
        this.dataJenisKendaraan = dataJenisKendaraan;
    }

    
    @JsonProperty("jenisKendaraan")
    public JenisKendaraan getJenisKendaraan() {
        return jenisKendaraan;
    }

    @JsonProperty("jenisKendaraan")
    public void setJenisKendaraan(JenisKendaraan jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
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
