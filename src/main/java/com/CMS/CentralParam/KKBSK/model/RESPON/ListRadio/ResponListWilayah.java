
package com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio;


import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "wilayah"
})
@Generated("jsonschema2pojo")
public class ResponListWilayah {

    @JsonProperty("code")
    private String code;
    @JsonProperty("wilayah")
    private List<Wilayah> wilayah = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponListWilayah() {
    }

    /**
     * 
     * @param code
     * @param wilayah
     */
    public ResponListWilayah(String code, List<Wilayah> wilayah) {
        super();
        this.code = code;
        this.wilayah = wilayah;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("wilayah")
    public List<Wilayah> getWilayah() {
        return wilayah;
    }

    @JsonProperty("wilayah")
    public void setWilayah(List<Wilayah> wilayah) {
        this.wilayah = wilayah;
    }

}
