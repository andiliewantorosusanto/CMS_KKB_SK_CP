
package com.CMS.CentralParam.KKBSK.model.response;

import java.util.List;

import com.CMS.CentralParam.KKBSK.model.data.Wilayah;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataWilayah",
    "wilayah",
    "code"
})
public class ResponWilayah {

    @JsonProperty("dataWilayah")
    private List<Wilayah> dataWilayah = null;
    @JsonProperty("wilayah")
    private Wilayah wilayah = null;
    @JsonProperty("code")
    private String code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponWilayah() {
    }

    /**
     * 
     * @param dataWilayah
     * @param code
     */
    public ResponWilayah(List<Wilayah> dataWilayah,Wilayah wilayah,String code) {
        super();
        this.dataWilayah = dataWilayah;
        this.wilayah = wilayah;
        this.code = code;
    }

    @JsonProperty("dataWilayah")
    public List<Wilayah> getDataWilayah() {
        return dataWilayah;
    }

    @JsonProperty("dataWilayah")
    public void setDataWilayah(List<Wilayah> dataWilayah) {
        this.dataWilayah = dataWilayah;
    }

    
    @JsonProperty("wilayah")
    public Wilayah getWilayah() {
        return wilayah;
    }

    @JsonProperty("wilayah")
    public void setWilayah(Wilayah wilayah) {
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

}
