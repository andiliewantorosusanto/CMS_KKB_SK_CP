
package com.CMS.CentralParam.KKBSK.model.RESPON;


import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "datarateBiayaFidusia"
})
@Generated("jsonschema2pojo")
public class ResponBiayaFidusia {

    @JsonProperty("code")
    private String code;
    @JsonProperty("datarateBiayaFidusia")
    private List<DatarateBiayaFidusium> datarateBiayaFidusia = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponBiayaFidusia() {
    }

    /**
     * 
     * @param code
     * @param datarateBiayaFidusia
     */
    public ResponBiayaFidusia(String code, List<DatarateBiayaFidusium> datarateBiayaFidusia) {
        super();
        this.code = code;
        this.datarateBiayaFidusia = datarateBiayaFidusia;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("datarateBiayaFidusia")
    public List<DatarateBiayaFidusium> getDatarateBiayaFidusia() {
        return datarateBiayaFidusia;
    }

    @JsonProperty("datarateBiayaFidusia")
    public void setDatarateBiayaFidusia(List<DatarateBiayaFidusium> datarateBiayaFidusia) {
        this.datarateBiayaFidusia = datarateBiayaFidusia;
    }

}
