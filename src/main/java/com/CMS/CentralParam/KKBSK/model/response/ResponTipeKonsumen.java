
package com.CMS.CentralParam.KKBSK.model.response;

import java.util.List;

import com.CMS.CentralParam.KKBSK.model.data.TipeKonsumen;
import com.CMS.CentralParam.KKBSK.view.vwTipeKonsumen;
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
    private List<vwTipeKonsumen> dataTipeKonsumen = null;
    @JsonProperty("tipeKonsumen")
    private TipeKonsumen tipeKonsumen = null;
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
    public ResponTipeKonsumen(List<vwTipeKonsumen> dataTipeKonsumen,TipeKonsumen tipeKonsumen,String code) {
        super();
        this.dataTipeKonsumen = dataTipeKonsumen;
        this.tipeKonsumen = tipeKonsumen;
        this.code = code;
    }

    @JsonProperty("dataTipeKonsumen")
    public List<vwTipeKonsumen> getDataTipeKonsumen() {
        return dataTipeKonsumen;
    }

    @JsonProperty("dataTipeKonsumen")
    public void setDataTipeKonsumen(List<vwTipeKonsumen> dataTipeKonsumen) {
        this.dataTipeKonsumen = dataTipeKonsumen;
    }

    
    @JsonProperty("tipeKonsumen")
    public TipeKonsumen getTipeKonsumen() {
        return tipeKonsumen;
    }

    @JsonProperty("tipeKonsumen")
    public void setTipeKonsumen(TipeKonsumen tipeKonsumen) {
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
