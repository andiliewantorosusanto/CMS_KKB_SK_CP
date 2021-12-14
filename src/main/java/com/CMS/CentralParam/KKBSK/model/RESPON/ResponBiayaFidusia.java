
package com.CMS.CentralParam.KKBSK.model.RESPON;


import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "dataBiayaFidusia"
})
@Generated("jsonschema2pojo")
public class ResponBiayaFidusia {

    @JsonProperty("code")
    private String code;
    @JsonProperty("dataBiayaFidusia")
    private List<DataBiayaFidusia> dataBiayaFidusia = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponBiayaFidusia() {
    }

    /**
     * 
     * @param code
     * @param dataBiayaFidusia
     */
    public ResponBiayaFidusia(String code, List<DataBiayaFidusia> dataBiayaFidusia) {
        super();
        this.code = code;
        this.dataBiayaFidusia = dataBiayaFidusia;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("dataBiayaFidusia")
    public List<DataBiayaFidusia> getDataBiayaFidusia() {
        return dataBiayaFidusia;
    }

    @JsonProperty("dataBiayaFidusia")
    public void setDataBiayaFidusia(List<DataBiayaFidusia> dataBiayaFidusia) {
        this.dataBiayaFidusia = dataBiayaFidusia;
    }

}
