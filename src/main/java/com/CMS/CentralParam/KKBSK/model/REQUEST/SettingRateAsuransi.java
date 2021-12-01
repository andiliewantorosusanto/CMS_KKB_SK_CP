package com.CMS.CentralParam.KKBSK.model.REQUEST;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nama_skema",
    "wilayah",
    "start_otr",
    "end_otr",
    "tipe_asuransi",
    "start_berlaku",
    "end_berlaku",
    "created_at",
    "loan_type",
    "jenis_kendaraan",
    "jenis_pembiayaan",
    "start_year",
    "end_year",
    "tenor1",
    "tenor2",
    "tenor3",
    "tenor4",
    "tenor5",
    "tenor6",
    "tenor7",
    "tenor8",
    "tenor9",
    "tenor10"
})
@Generated("jsonschema2pojo")
public class SettingRateAsuransi {

    @JsonProperty("nama_skema")
    private String namaSkema;
    @JsonProperty("wilayah")
    private Integer wilayah;
    @JsonProperty("start_otr")
    private Integer startOtr;
    @JsonProperty("end_otr")
    private Integer endOtr;
    @JsonProperty("tipe_asuransi")
    private Integer tipeAsuransi;
    @JsonProperty("start_berlaku")
    private String startBerlaku;
    @JsonProperty("end_berlaku")
    private String endBerlaku;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("loan_type")
    private Integer loanType;
    @JsonProperty("jenis_kendaraan")
    private Integer jenisKendaraan;
    @JsonProperty("jenis_pembiayaan")
    private Integer jenisPembiayaan;
    @JsonProperty("start_year")
    private Integer startYear;
    @JsonProperty("end_year")
    private Integer endYear;
    @JsonProperty("tenor1")
    private String tenor1;
    @JsonProperty("tenor2")
    private String tenor2;
    @JsonProperty("tenor3")
    private String tenor3;
    @JsonProperty("tenor4")
    private String tenor4;
    @JsonProperty("tenor5")
    private String tenor5;
    @JsonProperty("tenor6")
    private String tenor6;
    @JsonProperty("tenor7")
    private String tenor7;
    @JsonProperty("tenor8")
    private String tenor8;
    @JsonProperty("tenor9")
    private String tenor9;
    @JsonProperty("tenor10")
    private String tenor10;

    /**
     * No args constructor for use in serialization
     * 
     */
    public SettingRateAsuransi() {
    }

    /**
     * 
     * @param tenor5
     * @param tenor4
     * @param tenor7
     * @param tenor6
     * @param endOtr
     * @param loanType
     * @param tenor1
     * @param jenisPembiayaan
     * @param tenor3
     * @param tenor2
     * @param startYear
     * @param wilayah
     * @param tenor9
     * @param endYear
     * @param tenor8
     * @param namaSkema
     * @param createdAt
     * @param tenor10
     * @param startOtr
     * @param endBerlaku
     * @param jenisKendaraan
     * @param tipeAsuransi
     * @param startBerlaku
     */
    public SettingRateAsuransi(String namaSkema, Integer wilayah, Integer startOtr, Integer endOtr, Integer tipeAsuransi, String startBerlaku, String endBerlaku, String createdAt, Integer loanType, Integer jenisKendaraan, Integer jenisPembiayaan, Integer startYear, Integer endYear, String tenor1, String tenor2, String tenor3, String tenor4, String tenor5, String tenor6, String tenor7, String tenor8, String tenor9, String tenor10) {
        super();
        this.namaSkema = namaSkema;
        this.wilayah = wilayah;
        this.startOtr = startOtr;
        this.endOtr = endOtr;
        this.tipeAsuransi = tipeAsuransi;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.createdAt = createdAt;
        this.loanType = loanType;
        this.jenisKendaraan = jenisKendaraan;
        this.jenisPembiayaan = jenisPembiayaan;
        this.startYear = startYear;
        this.endYear = endYear;
        this.tenor1 = tenor1;
        this.tenor2 = tenor2;
        this.tenor3 = tenor3;
        this.tenor4 = tenor4;
        this.tenor5 = tenor5;
        this.tenor6 = tenor6;
        this.tenor7 = tenor7;
        this.tenor8 = tenor8;
        this.tenor9 = tenor9;
        this.tenor10 = tenor10;
    }

    @JsonProperty("nama_skema")
    public String getNamaSkema() {
        return namaSkema;
    }

    @JsonProperty("nama_skema")
    public void setNamaSkema(String namaSkema) {
        this.namaSkema = namaSkema;
    }

    @JsonProperty("wilayah")
    public Integer getWilayah() {
        return wilayah;
    }

    @JsonProperty("wilayah")
    public void setWilayah(Integer wilayah) {
        this.wilayah = wilayah;
    }

    @JsonProperty("start_otr")
    public Integer getStartOtr() {
        return startOtr;
    }

    @JsonProperty("start_otr")
    public void setStartOtr(Integer startOtr) {
        this.startOtr = startOtr;
    }

    @JsonProperty("end_otr")
    public Integer getEndOtr() {
        return endOtr;
    }

    @JsonProperty("end_otr")
    public void setEndOtr(Integer endOtr) {
        this.endOtr = endOtr;
    }

    @JsonProperty("tipe_asuransi")
    public Integer getTipeAsuransi() {
        return tipeAsuransi;
    }

    @JsonProperty("tipe_asuransi")
    public void setTipeAsuransi(Integer tipeAsuransi) {
        this.tipeAsuransi = tipeAsuransi;
    }

    @JsonProperty("start_berlaku")
    public String getStartBerlaku() {
        return startBerlaku;
    }

    @JsonProperty("start_berlaku")
    public void setStartBerlaku(String startBerlaku) {
        this.startBerlaku = startBerlaku;
    }

    @JsonProperty("end_berlaku")
    public String getEndBerlaku() {
        return endBerlaku;
    }

    @JsonProperty("end_berlaku")
    public void setEndBerlaku(String endBerlaku) {
        this.endBerlaku = endBerlaku;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("loan_type")
    public Integer getLoanType() {
        return loanType;
    }

    @JsonProperty("loan_type")
    public void setLoanType(Integer loanType) {
        this.loanType = loanType;
    }

    @JsonProperty("jenis_kendaraan")
    public Integer getJenisKendaraan() {
        return jenisKendaraan;
    }

    @JsonProperty("jenis_kendaraan")
    public void setJenisKendaraan(Integer jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    @JsonProperty("jenis_pembiayaan")
    public Integer getJenisPembiayaan() {
        return jenisPembiayaan;
    }

    @JsonProperty("jenis_pembiayaan")
    public void setJenisPembiayaan(Integer jenisPembiayaan) {
        this.jenisPembiayaan = jenisPembiayaan;
    }

    @JsonProperty("start_year")
    public Integer getStartYear() {
        return startYear;
    }

    @JsonProperty("start_year")
    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    @JsonProperty("end_year")
    public Integer getEndYear() {
        return endYear;
    }

    @JsonProperty("end_year")
    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    @JsonProperty("tenor1")
    public String getTenor1() {
        return tenor1;
    }

    @JsonProperty("tenor1")
    public void setTenor1(String tenor1) {
        this.tenor1 = tenor1;
    }

    @JsonProperty("tenor2")
    public String getTenor2() {
        return tenor2;
    }

    @JsonProperty("tenor2")
    public void setTenor2(String tenor2) {
        this.tenor2 = tenor2;
    }

    @JsonProperty("tenor3")
    public String getTenor3() {
        return tenor3;
    }

    @JsonProperty("tenor3")
    public void setTenor3(String tenor3) {
        this.tenor3 = tenor3;
    }

    @JsonProperty("tenor4")
    public String getTenor4() {
        return tenor4;
    }

    @JsonProperty("tenor4")
    public void setTenor4(String tenor4) {
        this.tenor4 = tenor4;
    }

    @JsonProperty("tenor5")
    public String getTenor5() {
        return tenor5;
    }

    @JsonProperty("tenor5")
    public void setTenor5(String tenor5) {
        this.tenor5 = tenor5;
    }

    @JsonProperty("tenor6")
    public String getTenor6() {
        return tenor6;
    }

    @JsonProperty("tenor6")
    public void setTenor6(String tenor6) {
        this.tenor6 = tenor6;
    }

    @JsonProperty("tenor7")
    public String getTenor7() {
        return tenor7;
    }

    @JsonProperty("tenor7")
    public void setTenor7(String tenor7) {
        this.tenor7 = tenor7;
    }

    @JsonProperty("tenor8")
    public String getTenor8() {
        return tenor8;
    }

    @JsonProperty("tenor8")
    public void setTenor8(String tenor8) {
        this.tenor8 = tenor8;
    }

    @JsonProperty("tenor9")
    public String getTenor9() {
        return tenor9;
    }

    @JsonProperty("tenor9")
    public void setTenor9(String tenor9) {
        this.tenor9 = tenor9;
    }

    @JsonProperty("tenor10")
    public String getTenor10() {
        return tenor10;
    }

    @JsonProperty("tenor10")
    public void setTenor10(String tenor10) {
        this.tenor10 = tenor10;
    }

}
