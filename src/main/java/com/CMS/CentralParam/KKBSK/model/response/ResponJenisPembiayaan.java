
package com.CMS.CentralParam.KKBSK.model.response;

import java.util.List;

import com.CMS.CentralParam.KKBSK.model.data.JenisPembiayaan;
import com.CMS.CentralParam.KKBSK.view.vwJenisPembiayaan;
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
    private List<vwJenisPembiayaan> dataJenisPembiayaan = null;
    @JsonProperty("jenisPembiayaan")
    private JenisPembiayaan jenisPembiayaan = null;
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
    public ResponJenisPembiayaan(List<vwJenisPembiayaan> dataJenisPembiayaan,JenisPembiayaan jenisPembiayaan,String code) {
        super();
        this.dataJenisPembiayaan = dataJenisPembiayaan;
        this.jenisPembiayaan = jenisPembiayaan;
        this.code = code;
    }

    @JsonProperty("dataJenisPembiayaan")
    public List<vwJenisPembiayaan> getDataJenisPembiayaan() {
        return dataJenisPembiayaan;
    }

    @JsonProperty("dataJenisPembiayaan")
    public void setDataJenisPembiayaan(List<vwJenisPembiayaan> dataJenisPembiayaan) {
        this.dataJenisPembiayaan = dataJenisPembiayaan;
    }

    
    @JsonProperty("jenisPembiayaan")
    public JenisPembiayaan getJenisPembiayaan() {
        return jenisPembiayaan;
    }

    @JsonProperty("jenisPembiayaan")
    public void setJenisPembiayaan(JenisPembiayaan jenisPembiayaan) {
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
