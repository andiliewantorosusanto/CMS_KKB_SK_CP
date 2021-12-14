
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataJenisPembiayaan",
    "jenisPembiayaan",
    "code"
})
public class ResponJenisPembiayaan {

    @JsonProperty("dataJenisPembiayaan")
    private List<DataJenisPembiayaan> dataJenisPembiayaan = null;
    @JsonProperty("jenisPembiayaan")
    private DataJenisPembiayaan jenisPembiayaan = null;
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
    public ResponJenisPembiayaan(List<DataJenisPembiayaan> dataJenisPembiayaan,DataJenisPembiayaan jenisPembiayaan,String code) {
        super();
        this.dataJenisPembiayaan = dataJenisPembiayaan;
        this.jenisPembiayaan = jenisPembiayaan;
        this.code = code;
    }

    @JsonProperty("dataJenisPembiayaan")
    public List<DataJenisPembiayaan> getDataJenisPembiayaan() {
        return dataJenisPembiayaan;
    }

    @JsonProperty("dataJenisPembiayaan")
    public void setDataJenisPembiayaan(List<DataJenisPembiayaan> dataJenisPembiayaan) {
        this.dataJenisPembiayaan = dataJenisPembiayaan;
    }

    
    @JsonProperty("jenisPembiayaan")
    public DataJenisPembiayaan getJenisPembiayaan() {
        return jenisPembiayaan;
    }

    @JsonProperty("jenisPembiayaan")
    public void setJenisPembiayaan(DataJenisPembiayaan jenisPembiayaan) {
        this.jenisPembiayaan = jenisPembiayaan;
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
