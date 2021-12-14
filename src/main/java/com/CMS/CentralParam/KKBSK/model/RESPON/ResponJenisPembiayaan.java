
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataJenisPembiayaan",
    "code"
})
@Generated("jsonschema2pojo")
public class ResponJenisPembiayaan {

    @JsonProperty("dataJenisPembiayaan")
    private List<DataJenisPembiayaan> dataJenisPembiayaan = null;
    @JsonProperty("code")
    private String code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponJenisPembiayaan() {
    }

    /**
     * 
     * @param dataJenisPembiayaan
     * @param code
     */
    public ResponJenisPembiayaan(List<DataJenisPembiayaan> dataJenisPembiayaan, String code) {
        super();
        this.dataJenisPembiayaan = dataJenisPembiayaan;
        this.code = code;
    }

    @JsonProperty("dataJenisPembiayaan")
    public List<DataJenisPembiayaan> getDataJenisPembiayaan() {
        return dataJenisPembiayaan;
    }

    @JsonProperty("dataJenisPembiayaan")
    public void setDataratebiayaadmin(List<DataJenisPembiayaan> dataJenisPembiayaan) {
        this.dataJenisPembiayaan = dataJenisPembiayaan;
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
