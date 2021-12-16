
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
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
    private List<DataKomponenPH> dataKomponenPH = null;
    @JsonProperty("komponenPH")
    private DataKomponenPH komponenPH = null;
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
    public ResponKomponenPH(List<DataKomponenPH> dataKomponenPH,DataKomponenPH komponenPH,String code) {
        super();
        this.dataKomponenPH = dataKomponenPH;
        this.komponenPH = komponenPH;
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

    
    @JsonProperty("komponenPH")
    public DataKomponenPH getKomponenPH() {
        return komponenPH;
    }

    @JsonProperty("komponenPH")
    public void setKomponenPH(DataKomponenPH komponenPH) {
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
