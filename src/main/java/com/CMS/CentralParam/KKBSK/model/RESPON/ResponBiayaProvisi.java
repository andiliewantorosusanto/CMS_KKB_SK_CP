
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "dataBiayaProvisi"
})
@Generated("jsonschema2pojo")
public class ResponBiayaProvisi {

    @JsonProperty("code")
    private String code;
    @JsonProperty("dataBiayaProvisi")
    private List<DataBiayaProvisi> dataBiayaProvisi = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponBiayaProvisi() {
    }

    /**
     * 
     * @param code
     * @param dataBiayaProvisi
     */
    public ResponBiayaProvisi(String code, List<DataBiayaProvisi> dataBiayaProvisi) {
        super();
        this.code = code;
        this.dataBiayaProvisi = dataBiayaProvisi;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("dataBiayaProvisi")
    public List<DataBiayaProvisi> getDataBiayaProvisi() {
        return dataBiayaProvisi;
    }

    @JsonProperty("dataBiayaProvisi")
    public void setDataBiayaProvisi(List<DataBiayaProvisi> dataBiayaProvisi) {
        this.dataBiayaProvisi = dataBiayaProvisi;
    }

}
