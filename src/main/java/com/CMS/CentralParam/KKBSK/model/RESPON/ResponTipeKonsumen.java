
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataTipeKonsumen",
    "code"
})
public class ResponTipeKonsumen {

    @JsonProperty("dataTipeKonsumen")
    private List<DataTipeKonsumen> dataTipeKonsumen = null;
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
    public ResponTipeKonsumen(List<DataTipeKonsumen> dataTipeKonsumen, String code) {
        super();
        this.dataTipeKonsumen = dataTipeKonsumen;
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

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

}
