package com.CMS.CentralParam.KKBSK.model.response;

import java.util.List;

import com.CMS.CentralParam.KKBSK.view.vwSkema;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "skemaRateAsuransi",
    "skemaPerluasanAsuransi",
    "skemaRateCP",
    "skemaRateBunga",
    "skemaBiayaAdmin",
    "skemaBiayaProvisi",
    "skemaMinimalDP",
    "skemaBiayaFidusia",
    "skemaKomponenPH",
    "skemaUsiaKendaraanLunas",
    "code"
})
public class ResponSkemaProgram {
    @JsonProperty("skemaRateAsuransi")
    private List<vwSkema> skemaRateAsuransi = null;
    @JsonProperty("skemaPerluasanAsuransi")
    private List<vwSkema> skemaPerluasanAsuransi = null;
    @JsonProperty("skemaRateCP")
    private List<vwSkema> skemaRateCP = null;
    @JsonProperty("skemaRateBunga")
    private List<vwSkema> skemaRateBunga = null;
    @JsonProperty("skemaBiayaAdmin")
    private List<vwSkema> skemaBiayaAdmin = null;
    @JsonProperty("skemaBiayaProvisi")
    private List<vwSkema> skemaBiayaProvisi = null;
    @JsonProperty("skemaMinimalDP")
    private List<vwSkema> skemaMinimalDP = null;
    @JsonProperty("skemaBiayaFidusia")
    private List<vwSkema> skemaBiayaFidusia = null;
    @JsonProperty("skemaKomponenPH")
    private List<vwSkema> skemaKomponenPH = null;
    @JsonProperty("skemaUsiaKendaraanLunas")
    private List<vwSkema> skemaUsiaKendaraanLunas = null;
    @JsonProperty("code")
    private String code;


    public ResponSkemaProgram() {
    }

    public ResponSkemaProgram(List<vwSkema> skemaRateAsuransi, List<vwSkema> skemaPerluasanAsuransi, List<vwSkema> skemaRateCP, List<vwSkema> skemaRateBunga, List<vwSkema> skemaBiayaAdmin, List<vwSkema> skemaBiayaProvisi, List<vwSkema> skemaMinimalDP, List<vwSkema> skemaBiayaFidusia, List<vwSkema> skemaKomponenPH, List<vwSkema> skemaUsiaKendaraanLunas, String code) {
        this.skemaRateAsuransi = skemaRateAsuransi;
        this.skemaPerluasanAsuransi = skemaPerluasanAsuransi;
        this.skemaRateCP = skemaRateCP;
        this.skemaRateBunga = skemaRateBunga;
        this.skemaBiayaAdmin = skemaBiayaAdmin;
        this.skemaBiayaProvisi = skemaBiayaProvisi;
        this.skemaMinimalDP = skemaMinimalDP;
        this.skemaBiayaFidusia = skemaBiayaFidusia;
        this.skemaKomponenPH = skemaKomponenPH;
        this.skemaUsiaKendaraanLunas = skemaUsiaKendaraanLunas;
        this.code = code;
    }

    public List<vwSkema> getSkemaRateAsuransi() {
        return this.skemaRateAsuransi;
    }

    public void setSkemaRateAsuransi(List<vwSkema> skemaRateAsuransi) {
        this.skemaRateAsuransi = skemaRateAsuransi;
    }

    public List<vwSkema> getSkemaPerluasanAsuransi() {
        return this.skemaPerluasanAsuransi;
    }

    public void setSkemaPerluasanAsuransi(List<vwSkema> skemaPerluasanAsuransi) {
        this.skemaPerluasanAsuransi = skemaPerluasanAsuransi;
    }

    public List<vwSkema> getSkemaRateCP() {
        return this.skemaRateCP;
    }

    public void setSkemaRateCP(List<vwSkema> skemaRateCP) {
        this.skemaRateCP = skemaRateCP;
    }

    public List<vwSkema> getSkemaRateBunga() {
        return this.skemaRateBunga;
    }

    public void setSkemaRateBunga(List<vwSkema> skemaRateBunga) {
        this.skemaRateBunga = skemaRateBunga;
    }

    public List<vwSkema> getSkemaBiayaAdmin() {
        return this.skemaBiayaAdmin;
    }

    public void setSkemaBiayaAdmin(List<vwSkema> skemaBiayaAdmin) {
        this.skemaBiayaAdmin = skemaBiayaAdmin;
    }

    public List<vwSkema> getSkemaBiayaProvisi() {
        return this.skemaBiayaProvisi;
    }

    public void setSkemaBiayaProvisi(List<vwSkema> skemaBiayaProvisi) {
        this.skemaBiayaProvisi = skemaBiayaProvisi;
    }

    public List<vwSkema> getSkemaMinimalDP() {
        return this.skemaMinimalDP;
    }

    public void setSkemaMinimalDP(List<vwSkema> skemaMinimalDP) {
        this.skemaMinimalDP = skemaMinimalDP;
    }

    public List<vwSkema> getSkemaBiayaFidusia() {
        return this.skemaBiayaFidusia;
    }

    public void setSkemaBiayaFidusia(List<vwSkema> skemaBiayaFidusia) {
        this.skemaBiayaFidusia = skemaBiayaFidusia;
    }

    public List<vwSkema> getSkemaKomponenPH() {
        return this.skemaKomponenPH;
    }

    public void setSkemaKomponenPH(List<vwSkema> skemaKomponenPH) {
        this.skemaKomponenPH = skemaKomponenPH;
    }

    public List<vwSkema> getSkemaUsiaKendaraanLunas() {
        return this.skemaUsiaKendaraanLunas;
    }

    public void setSkemaUsiaKendaraanLunas(List<vwSkema> skemaUsiaKendaraanLunas) {
        this.skemaUsiaKendaraanLunas = skemaUsiaKendaraanLunas;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ResponSkemaProgram skemaRateAsuransi(List<vwSkema> skemaRateAsuransi) {
        setSkemaRateAsuransi(skemaRateAsuransi);
        return this;
    }

    public ResponSkemaProgram skemaPerluasanAsuransi(List<vwSkema> skemaPerluasanAsuransi) {
        setSkemaPerluasanAsuransi(skemaPerluasanAsuransi);
        return this;
    }

    public ResponSkemaProgram skemaRateCP(List<vwSkema> skemaRateCP) {
        setSkemaRateCP(skemaRateCP);
        return this;
    }

    public ResponSkemaProgram skemaRateBunga(List<vwSkema> skemaRateBunga) {
        setSkemaRateBunga(skemaRateBunga);
        return this;
    }

    public ResponSkemaProgram skemaBiayaAdmin(List<vwSkema> skemaBiayaAdmin) {
        setSkemaBiayaAdmin(skemaBiayaAdmin);
        return this;
    }

    public ResponSkemaProgram skemaBiayaProvisi(List<vwSkema> skemaBiayaProvisi) {
        setSkemaBiayaProvisi(skemaBiayaProvisi);
        return this;
    }

    public ResponSkemaProgram skemaMinimalDP(List<vwSkema> skemaMinimalDP) {
        setSkemaMinimalDP(skemaMinimalDP);
        return this;
    }

    public ResponSkemaProgram skemaBiayaFidusia(List<vwSkema> skemaBiayaFidusia) {
        setSkemaBiayaFidusia(skemaBiayaFidusia);
        return this;
    }

    public ResponSkemaProgram skemaKomponenPH(List<vwSkema> skemaKomponenPH) {
        setSkemaKomponenPH(skemaKomponenPH);
        return this;
    }

    public ResponSkemaProgram skemaUsiaKendaraanLunas(List<vwSkema> skemaUsiaKendaraanLunas) {
        setSkemaUsiaKendaraanLunas(skemaUsiaKendaraanLunas);
        return this;
    }

    public ResponSkemaProgram code(String code) {
        setCode(code);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " skemaRateAsuransi='" + getSkemaRateAsuransi() + "'" +
            ", skemaPerluasanAsuransi='" + getSkemaPerluasanAsuransi() + "'" +
            ", skemaRateCP='" + getSkemaRateCP() + "'" +
            ", skemaRateBunga='" + getSkemaRateBunga() + "'" +
            ", skemaBiayaAdmin='" + getSkemaBiayaAdmin() + "'" +
            ", skemaBiayaProvisi='" + getSkemaBiayaProvisi() + "'" +
            ", skemaMinimalDP='" + getSkemaMinimalDP() + "'" +
            ", skemaBiayaFidusia='" + getSkemaBiayaFidusia() + "'" +
            ", skemaKomponenPH='" + getSkemaKomponenPH() + "'" +
            ", skemaUsiaKendaraanLunas='" + getSkemaUsiaKendaraanLunas() + "'" +
            ", code='" + getCode() + "'" +
            "}";
    }

}
