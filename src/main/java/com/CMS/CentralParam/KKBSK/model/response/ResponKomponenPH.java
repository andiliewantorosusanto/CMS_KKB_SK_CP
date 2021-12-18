
package com.CMS.CentralParam.KKBSK.model.response;

import java.util.List;

import com.CMS.CentralParam.KKBSK.model.data.KomponenPH;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataKomponenPH",
    "komponenPH",
    "code"
})
public class ResponKomponenPH {

    @JsonProperty("dataKomponenPH")
    private List<KomponenPH> dataKomponenPH = null;
    @JsonProperty("komponenPH")
    private KomponenPH komponenPH = null;
    @JsonProperty("code")
    private String code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponKomponenPH() {
    }

    /**
     * 
     * @param dataKomponenPH
     * @param code
     */
    public ResponKomponenPH(List<KomponenPH> dataKomponenPH,KomponenPH komponenPH,String code) {
        super();
        this.dataKomponenPH = dataKomponenPH;
        this.komponenPH = komponenPH;
        this.code = code;
    }

    @JsonProperty("dataKomponenPH")
    public List<KomponenPH> getDataKomponenPH() {
        return dataKomponenPH;
    }

    @JsonProperty("dataKomponenPH")
    public void setDataKomponenPH(List<KomponenPH> dataKomponenPH) {
        this.dataKomponenPH = dataKomponenPH;
    }

    
    @JsonProperty("komponenPH")
    public KomponenPH getKomponenPH() {
        return komponenPH;
    }

    @JsonProperty("komponenPH")
    public void setKomponenPH(KomponenPH komponenPH) {
        this.komponenPH = komponenPH;
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
