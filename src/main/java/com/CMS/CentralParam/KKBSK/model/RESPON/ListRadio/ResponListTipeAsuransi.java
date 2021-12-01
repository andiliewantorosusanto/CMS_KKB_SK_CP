
package com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio;



import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "tipeAsuransi"
})
@Generated("jsonschema2pojo")
public class ResponListTipeAsuransi {

    @JsonProperty("code")
    private String code;
    @JsonProperty("tipeAsuransi")
    private List<TipeAsuransi> tipeAsuransi = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponListTipeAsuransi() {
    }

    /**
     * 
     * @param code
     * @param tipeAsuransi
     */
    public ResponListTipeAsuransi(String code, List<TipeAsuransi> tipeAsuransi) {
        super();
        this.code = code;
        this.tipeAsuransi = tipeAsuransi;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("tipeAsuransi")
    public List<TipeAsuransi> getTipeAsuransi() {
        return tipeAsuransi;
    }

    @JsonProperty("tipeAsuransi")
    public void setTipeAsuransi(List<TipeAsuransi> tipeAsuransi) {
        this.tipeAsuransi = tipeAsuransi;
    }

}
