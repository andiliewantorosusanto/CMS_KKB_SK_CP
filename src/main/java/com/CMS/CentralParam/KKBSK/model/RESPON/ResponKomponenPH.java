package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "dataKomponenPH"
})
@Generated("jsonschema2pojo")
public class ResponKomponenPH {

    @JsonProperty("code")
    private String code;
    @JsonProperty("dataKomponenPH")
    private List<DataKomponenPH> dataKomponenPH = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponKomponenPH() {
    }

    /**
     * 
     * @param code
     * @param dataKomponenPH
     */
    public ResponKomponenPH(String code, List<DataKomponenPH> dataKomponenPH) {
        super();
        this.code = code;
        this.dataKomponenPH = dataKomponenPH;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("dataKomponenPH")
    public List<DataKomponenPH> getDataKomponenPH() {
        return dataKomponenPH;
    }

    @JsonProperty("dataKomponenPH")
    public void setDataKomponenPH(List<DataKomponenPH> dataKomponenPH) {
        this.dataKomponenPH = dataKomponenPH;
    }

}
