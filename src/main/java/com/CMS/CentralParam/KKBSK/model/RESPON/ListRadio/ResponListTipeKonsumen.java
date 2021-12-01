
package com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "tipeKonsumen"
})
@Generated("jsonschema2pojo")
public class ResponListTipeKonsumen {

    @JsonProperty("code")
    private String code;
    @JsonProperty("tipeKonsumen")
    private List<TipeKonsuman> tipeKonsumen = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponListTipeKonsumen() {
    }

    /**
     * 
     * @param code
     * @param tipeKonsumen
     */
    public ResponListTipeKonsumen(String code, List<TipeKonsuman> tipeKonsumen) {
        super();
        this.code = code;
        this.tipeKonsumen = tipeKonsumen;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("tipeKonsumen")
    public List<TipeKonsuman> getTipeKonsumen() {
        return tipeKonsumen;
    }

    @JsonProperty("tipeKonsumen")
    public void setTipeKonsumen(List<TipeKonsuman> tipeKonsumen) {
        this.tipeKonsumen = tipeKonsumen;
    }

}
