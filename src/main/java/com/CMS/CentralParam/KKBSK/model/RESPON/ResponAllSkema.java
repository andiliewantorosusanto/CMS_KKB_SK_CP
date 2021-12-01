
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataSkemaRateBunga",
    "dataSkemaMinimalDP",
    "dataSkemaBiayaFidusia",
    "code",
    "dataSkemaBiayaAdmin",
    "dataSkemaRateCP",
    "dataSkemaBiayaProvisi",
    "dataSkemaKomponenPH",
    "dataSkemaUsiaKendaraanLunas",
    "dataSkemaRateAsuransi",
    "dataSkemaRatePerluasan"
})
public class ResponAllSkema {

    @JsonProperty("dataSkemaRateBunga")
    private List<DataSkemaRateBunga> dataSkemaRateBunga = null;
    @JsonProperty("dataSkemaMinimalDP")
    private List<DataSkemaMinimalDP> dataSkemaMinimalDP = null;
    @JsonProperty("dataSkemaBiayaFidusia")
    private List<DataSkemaBiayaFidusium> dataSkemaBiayaFidusia = null;
    @JsonProperty("code")
    private String code;
    @JsonProperty("dataSkemaBiayaAdmin")
    private List<DataSkemaBiayaAdmin> dataSkemaBiayaAdmin = null;
    @JsonProperty("dataSkemaRateCP")
    private List<DataSkemaRateCP> dataSkemaRateCP = null;
    @JsonProperty("dataSkemaBiayaProvisi")
    private List<DataSkemaBiayaProvisi> dataSkemaBiayaProvisi = null;
    @JsonProperty("dataSkemaKomponenPH")
    private List<DataSkemaKomponenPH> dataSkemaKomponenPH = null;
    @JsonProperty("dataSkemaUsiaKendaraanLunas")
    private List<DataSkemaUsiaKendaraanLuna> dataSkemaUsiaKendaraanLunas = null;
    @JsonProperty("dataSkemaRateAsuransi")
    private List<DataSkemaRateAsuransi> dataSkemaRateAsuransi = null;
    @JsonProperty("dataSkemaRatePerluasan")
    private List<DataSkemaRatePerluasan> dataSkemaRatePerluasan = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponAllSkema() {
    }

    /**
     * 
     * @param dataSkemaRateBunga
     * @param dataSkemaMinimalDP
     * @param dataSkemaBiayaFidusia
     * @param code
     * @param dataSkemaBiayaAdmin
     * @param dataSkemaRateCP
     * @param dataSkemaBiayaProvisi
     * @param dataSkemaKomponenPH
     * @param dataSkemaUsiaKendaraanLunas
     * @param dataSkemaRateAsuransi
     * @param dataSkemaRatePerluasan
     */
    public ResponAllSkema(List<DataSkemaRateBunga> dataSkemaRateBunga, List<DataSkemaMinimalDP> dataSkemaMinimalDP, List<DataSkemaBiayaFidusium> dataSkemaBiayaFidusia, String code, List<DataSkemaBiayaAdmin> dataSkemaBiayaAdmin, List<DataSkemaRateCP> dataSkemaRateCP, List<DataSkemaBiayaProvisi> dataSkemaBiayaProvisi, List<DataSkemaKomponenPH> dataSkemaKomponenPH, List<DataSkemaUsiaKendaraanLuna> dataSkemaUsiaKendaraanLunas, List<DataSkemaRateAsuransi> dataSkemaRateAsuransi, List<DataSkemaRatePerluasan> dataSkemaRatePerluasan) {
        super();
        this.dataSkemaRateBunga = dataSkemaRateBunga;
        this.dataSkemaMinimalDP = dataSkemaMinimalDP;
        this.dataSkemaBiayaFidusia = dataSkemaBiayaFidusia;
        this.code = code;
        this.dataSkemaBiayaAdmin = dataSkemaBiayaAdmin;
        this.dataSkemaRateCP = dataSkemaRateCP;
        this.dataSkemaBiayaProvisi = dataSkemaBiayaProvisi;
        this.dataSkemaKomponenPH = dataSkemaKomponenPH;
        this.dataSkemaUsiaKendaraanLunas = dataSkemaUsiaKendaraanLunas;
        this.dataSkemaRateAsuransi = dataSkemaRateAsuransi;
        this.dataSkemaRatePerluasan = dataSkemaRatePerluasan;
    }

    @JsonProperty("dataSkemaRateBunga")
    public List<DataSkemaRateBunga> getDataSkemaRateBunga() {
        return dataSkemaRateBunga;
    }

    @JsonProperty("dataSkemaRateBunga")
    public void setDataSkemaRateBunga(List<DataSkemaRateBunga> dataSkemaRateBunga) {
        this.dataSkemaRateBunga = dataSkemaRateBunga;
    }

    @JsonProperty("dataSkemaMinimalDP")
    public List<DataSkemaMinimalDP> getDataSkemaMinimalDP() {
        return dataSkemaMinimalDP;
    }

    @JsonProperty("dataSkemaMinimalDP")
    public void setDataSkemaMinimalDP(List<DataSkemaMinimalDP> dataSkemaMinimalDP) {
        this.dataSkemaMinimalDP = dataSkemaMinimalDP;
    }

    @JsonProperty("dataSkemaBiayaFidusia")
    public List<DataSkemaBiayaFidusium> getDataSkemaBiayaFidusia() {
        return dataSkemaBiayaFidusia;
    }

    @JsonProperty("dataSkemaBiayaFidusia")
    public void setDataSkemaBiayaFidusia(List<DataSkemaBiayaFidusium> dataSkemaBiayaFidusia) {
        this.dataSkemaBiayaFidusia = dataSkemaBiayaFidusia;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("dataSkemaBiayaAdmin")
    public List<DataSkemaBiayaAdmin> getDataSkemaBiayaAdmin() {
        return dataSkemaBiayaAdmin;
    }

    @JsonProperty("dataSkemaBiayaAdmin")
    public void setDataSkemaBiayaAdmin(List<DataSkemaBiayaAdmin> dataSkemaBiayaAdmin) {
        this.dataSkemaBiayaAdmin = dataSkemaBiayaAdmin;
    }

    @JsonProperty("dataSkemaRateCP")
    public List<DataSkemaRateCP> getDataSkemaRateCP() {
        return dataSkemaRateCP;
    }

    @JsonProperty("dataSkemaRateCP")
    public void setDataSkemaRateCP(List<DataSkemaRateCP> dataSkemaRateCP) {
        this.dataSkemaRateCP = dataSkemaRateCP;
    }

    @JsonProperty("dataSkemaBiayaProvisi")
    public List<DataSkemaBiayaProvisi> getDataSkemaBiayaProvisi() {
        return dataSkemaBiayaProvisi;
    }

    @JsonProperty("dataSkemaBiayaProvisi")
    public void setDataSkemaBiayaProvisi(List<DataSkemaBiayaProvisi> dataSkemaBiayaProvisi) {
        this.dataSkemaBiayaProvisi = dataSkemaBiayaProvisi;
    }

    @JsonProperty("dataSkemaKomponenPH")
    public List<DataSkemaKomponenPH> getDataSkemaKomponenPH() {
        return dataSkemaKomponenPH;
    }

    @JsonProperty("dataSkemaKomponenPH")
    public void setDataSkemaKomponenPH(List<DataSkemaKomponenPH> dataSkemaKomponenPH) {
        this.dataSkemaKomponenPH = dataSkemaKomponenPH;
    }

    @JsonProperty("dataSkemaUsiaKendaraanLunas")
    public List<DataSkemaUsiaKendaraanLuna> getDataSkemaUsiaKendaraanLunas() {
        return dataSkemaUsiaKendaraanLunas;
    }

    @JsonProperty("dataSkemaUsiaKendaraanLunas")
    public void setDataSkemaUsiaKendaraanLunas(List<DataSkemaUsiaKendaraanLuna> dataSkemaUsiaKendaraanLunas) {
        this.dataSkemaUsiaKendaraanLunas = dataSkemaUsiaKendaraanLunas;
    }

    @JsonProperty("dataSkemaRateAsuransi")
    public List<DataSkemaRateAsuransi> getDataSkemaRateAsuransi() {
        return dataSkemaRateAsuransi;
    }

    @JsonProperty("dataSkemaRateAsuransi")
    public void setDataSkemaRateAsuransi(List<DataSkemaRateAsuransi> dataSkemaRateAsuransi) {
        this.dataSkemaRateAsuransi = dataSkemaRateAsuransi;
    }

    @JsonProperty("dataSkemaRatePerluasan")
    public List<DataSkemaRatePerluasan> getDataSkemaRatePerluasan() {
        return dataSkemaRatePerluasan;
    }

    @JsonProperty("dataSkemaRatePerluasan")
    public void setDataSkemaRatePerluasan(List<DataSkemaRatePerluasan> dataSkemaRatePerluasan) {
        this.dataSkemaRatePerluasan = dataSkemaRatePerluasan;
    }

}
