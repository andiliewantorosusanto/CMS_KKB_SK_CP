
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
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
    private List<DataJenisKendaraan> dataJenisKendaraan = null;
    @JsonProperty("jenisKendaraan")
    private DataJenisKendaraan jenisKendaraan = null;
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
    public ResponJenisKendaraan(List<DataJenisKendaraan> dataJenisKendaraan,DataJenisKendaraan jenisKendaraan,String code) {
        super();
        this.dataJenisKendaraan = dataJenisKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.code = code;
    }

    @JsonProperty("dataJenisKendaraan")
    public List<DataJenisKendaraan> getDataJenisKendaraan() {
        return dataJenisKendaraan;
    }

    @JsonProperty("dataJenisKendaraan")
    public void setDataJenisKendaraan(List<DataJenisKendaraan> dataJenisKendaraan) {
        this.dataJenisKendaraan = dataJenisKendaraan;
    }

    
    @JsonProperty("jenisKendaraan")
    public DataJenisKendaraan getJenisKendaraan() {
        return jenisKendaraan;
    }

    @JsonProperty("jenisKendaraan")
    public void setJenisKendaraan(DataJenisKendaraan jenisKendaraan) {
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
