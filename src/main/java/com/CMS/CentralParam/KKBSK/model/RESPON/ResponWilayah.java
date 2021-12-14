
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
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
    private List<DataWilayah> dataWilayah = null;
    @JsonProperty("wilayah")
    private DataWilayah wilayah = null;
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
    public ResponWilayah(List<DataWilayah> dataWilayah,DataWilayah wilayah,String code) {
        super();
        this.dataWilayah = dataWilayah;
        this.wilayah = wilayah;
        this.code = code;
    }

    @JsonProperty("dataWilayah")
    public List<DataWilayah> getDataWilayah() {
        return dataWilayah;
    }

    @JsonProperty("dataWilayah")
    public void setDataWilayah(List<DataWilayah> dataWilayah) {
        this.dataWilayah = dataWilayah;
    }

    
    @JsonProperty("wilayah")
    public DataWilayah getWilayah() {
        return wilayah;
    }

    @JsonProperty("wilayah")
    public void setWilayah(DataWilayah wilayah) {
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
