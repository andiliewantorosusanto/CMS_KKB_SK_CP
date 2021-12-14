package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "datarateKomponenPH"
})
@Generated("jsonschema2pojo")
public class ResponKomponenPH {

    @JsonProperty("code")
    private String code;
    @JsonProperty("datarateKomponenPH")
    private List<DataKomponenPH> datarateKomponenPH = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponKomponenPH() {
    }

    /**
     * 
     * @param code
     * @param datarateKomponenPH
     */
    public ResponKomponenPH(String code, List<DataKomponenPH> datarateKomponenPH) {
        super();
        this.code = code;
        this.datarateKomponenPH = datarateKomponenPH;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("datarateKomponenPH")
    public List<DataKomponenPH> getDatarateKomponenPH() {
        return datarateKomponenPH;
    }

    @JsonProperty("datarateKomponenPH")
    public void setDatarateKomponenPH(List<DataKomponenPH> datarateKomponenPH) {
        this.datarateKomponenPH = datarateKomponenPH;
    }

}
