package com.CMS.CentralParam.KKBSK.model.REQUEST;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nama_skema",
    "biaya_fidusia",
    "start_ph",
    "end_ph"
})
@Generated("jsonschema2pojo")
public class RequestInputRateBiayaFidusia {

    @JsonProperty("nama_skema")
    private String namaSkema;
    @JsonProperty("biaya_fidusia")
    private Integer biayaFidusia;
    @JsonProperty("start_ph")
    private Integer startPh;
    @JsonProperty("end_ph")
    private Integer endPh;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequestInputRateBiayaFidusia() {
    }

    /**
     * 
     * @param namaSkema
     * @param startPh
     * @param endPh
     * @param biayaFidusia
     */
    public RequestInputRateBiayaFidusia(String namaSkema, Integer biayaFidusia, Integer startPh, Integer endPh) {
        super();
        this.namaSkema = namaSkema;
        this.biayaFidusia = biayaFidusia;
        this.startPh = startPh;
        this.endPh = endPh;
    }

    @JsonProperty("nama_skema")
    public String getNamaSkema() {
        return namaSkema;
    }

    @JsonProperty("nama_skema")
    public void setNamaSkema(String namaSkema) {
        this.namaSkema = namaSkema;
    }

    @JsonProperty("biaya_fidusia")
    public Integer getBiayaFidusia() {
        return biayaFidusia;
    }

    @JsonProperty("biaya_fidusia")
    public void setBiayaFidusia(Integer biayaFidusia) {
        this.biayaFidusia = biayaFidusia;
    }

    @JsonProperty("start_ph")
    public Integer getStartPh() {
        return startPh;
    }

    @JsonProperty("start_ph")
    public void setStartPh(Integer startPh) {
        this.startPh = startPh;
    }

    @JsonProperty("end_ph")
    public Integer getEndPh() {
        return endPh;
    }

    @JsonProperty("end_ph")
    public void setEndPh(Integer endPh) {
        this.endPh = endPh;
    }

}
