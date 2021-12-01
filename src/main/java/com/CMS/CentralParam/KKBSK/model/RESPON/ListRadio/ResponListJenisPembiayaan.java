
package com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "jenisPembiayaan"
})
@Generated("jsonschema2pojo")
public class ResponListJenisPembiayaan {

    @JsonProperty("code")
    private String code;
    @JsonProperty("jenisPembiayaan")
    private List<JenisPembiayaan> jenisPembiayaan = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponListJenisPembiayaan() {
    }

    /**
     * 
     * @param code
     * @param jenisPembiayaan
     */
    public ResponListJenisPembiayaan(String code, List<JenisPembiayaan> jenisPembiayaan) {
        super();
        this.code = code;
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

    @JsonProperty("jenisPembiayaan")
    public List<JenisPembiayaan> getJenisPembiayaan() {
        return jenisPembiayaan;
    }

    @JsonProperty("jenisPembiayaan")
    public void setJenisPembiayaan(List<JenisPembiayaan> jenisPembiayaan) {
        this.jenisPembiayaan = jenisPembiayaan;
    }

}
