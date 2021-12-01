
package com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio;


import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "jenisKendaraan"
})
@Generated("jsonschema2pojo")
public class ResponListJenisKendaraan {

    @JsonProperty("code")
    private String code;
    @JsonProperty("jenisKendaraan")
    private List<JenisKendaraan> jenisKendaraan = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponListJenisKendaraan() {
    }

    /**
     * 
     * @param code
     * @param jenisKendaraan
     */
    public ResponListJenisKendaraan(String code, List<JenisKendaraan> jenisKendaraan) {
        super();
        this.code = code;
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

    @JsonProperty("jenisKendaraan")
    public List<JenisKendaraan> getJenisKendaraan() {
        return jenisKendaraan;
    }

    @JsonProperty("jenisKendaraan")
    public void setJenisKendaraan(List<JenisKendaraan> jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

}
