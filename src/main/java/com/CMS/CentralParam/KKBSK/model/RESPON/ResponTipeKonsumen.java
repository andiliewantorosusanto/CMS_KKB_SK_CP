
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataTipeKonsumen",
    "tipeKonsumen",
    "code"
})
public class ResponTipeKonsumen {

    @JsonProperty("dataTipeKonsumen")
    private List<DataTipeKonsumen> dataTipeKonsumen = null;
    @JsonProperty("tipeKonsumen")
    private DataTipeKonsumen tipeKonsumen = null;
    @JsonProperty("code")
    private String code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponTipeKonsumen() {
    }

    /**
     * 
     * @param dataTipeKonsumen
     * @param code
     */
    public ResponTipeKonsumen(List<DataTipeKonsumen> dataTipeKonsumen,DataTipeKonsumen tipeKonsumen,String code) {
        super();
        this.dataTipeKonsumen = dataTipeKonsumen;
        this.tipeKonsumen = tipeKonsumen;
        this.code = code;
    }

    @JsonProperty("dataTipeKonsumen")
    public List<DataTipeKonsumen> getDataTipeKonsumen() {
        return dataTipeKonsumen;
    }

    @JsonProperty("dataTipeKonsumen")
    public void setDataTipeKonsumen(List<DataTipeKonsumen> dataTipeKonsumen) {
        this.dataTipeKonsumen = dataTipeKonsumen;
    }

    
    @JsonProperty("tipeKonsumen")
    public DataTipeKonsumen getTipeKonsumen() {
        return tipeKonsumen;
    }

    @JsonProperty("tipeKonsumen")
    public void setTipeKonsumen(DataTipeKonsumen tipeKonsumen) {
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

}
