
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataRateAsuransi",
    "rateAsuransi",
    "code"
})
public class ResponRateAsuransi {

    @JsonProperty("dataRateAsuransi")
    private List<DataRateAsuransi> dataRateAsuransi = null;
    @JsonProperty("rateAsuransi")
    private DataRateAsuransi rateAsuransi = null;
    @JsonProperty("code")
    private String code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponRateAsuransi() {
    }

    /**
     * 
     * @param dataRateAsuransi
     * @param code
     */
    public ResponRateAsuransi(List<DataRateAsuransi> dataRateAsuransi,DataRateAsuransi rateAsuransi,String code) {
        super();
        this.dataRateAsuransi = dataRateAsuransi;
        this.rateAsuransi = rateAsuransi;
        this.code = code;
    }

    @JsonProperty("dataRateAsuransi")
    public List<DataRateAsuransi> getDataRateAsuransi() {
        return dataRateAsuransi;
    }

    @JsonProperty("dataRateAsuransi")
    public void setDataRateAsuransi(List<DataRateAsuransi> dataRateAsuransi) {
        this.dataRateAsuransi = dataRateAsuransi;
    }

    
    @JsonProperty("rateAsuransi")
    public DataRateAsuransi getRateAsuransi() {
        return rateAsuransi;
    }

    @JsonProperty("rateAsuransi")
    public void setRateAsuransi(DataRateAsuransi rateAsuransi) {
        this.rateAsuransi = rateAsuransi;
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
