
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import org.springframework.format.annotation.DateTimeFormat;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "namaSkema",
    "wilayah",
    "namaWilayah",
    "startOTR",
    "endOTR",
    "startyear",
    "endyear",
    "tipeAsuransi",
    "namaAsuransi",
    "startBerlaku",
    "endBerlaku",
    "loan_type",
    "produk",
    "jenis_kendaraan",
    "jenis_kendaraan_id",
    "jenis_pembiayaan",
    "jenis_pembiayaan_id",
    "statusApproved",
    "remarks",
    "program"
})
public class DataRateAsuransi {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("nama_skema")
    private String nama_skema;

    @JsonProperty("wilayahObject")
    private DataWilayah wilayahObject;
    @JsonProperty("wilayah")
    private Integer wilayah;

    @JsonProperty("jenis_kendaraanObject")
    private DataJenisKendaraan jenis_kendaraanObject;
    @JsonProperty("jenis_kendaraan")
    private Integer jenis_kendaraan;

    @JsonProperty("jenis_pembiayaan")
    private Integer jenis_pembiayaan;
    @JsonProperty("jenis_pembiayaanObject")
    private DataJenisPembiayaan jenis_pembiayaanObject;

    @JsonProperty("tipeAsuransiObject")
    private DataTipeAsuransi tipeAsuransiObject;
    @JsonProperty("tipeAsuransi")
    private Integer tipeAsuransi;

    @JsonProperty("startOTR")
    private Integer startOTR;
    @JsonProperty("endOTR")
    private Integer endOTR;

    @JsonProperty("startYear")
    private Integer startYear;
    @JsonProperty("endYear")
    private Integer endYear;

    @JsonProperty("startBerlaku")
    @NotNull(message = "Start Date Tidak Boleh Kosong")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date startBerlaku;
    @JsonProperty("endBerlaku")
    @NotNull(message = "End Date Tidak Boleh Kosong")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date endBerlaku;

    @JsonProperty("statusApproved")
    private Integer statusApproved;
    @JsonProperty("remarks")
    private String remarks;
    @JsonProperty("is_approved")
    private Integer is_approved;
    @JsonProperty("is_rejected")
    private Integer is_rejected;

    @JsonProperty("tenor1")
    private Float tenor1;
    @JsonProperty("tenor2")
    private Float tenor2;
    @JsonProperty("tenor3")
    private Float tenor3;
    @JsonProperty("tenor4")
    private Float tenor4;
    @JsonProperty("tenor5")
    private Float tenor5;
    @JsonProperty("tenor6")
    private Float tenor6;
    @JsonProperty("tenor7")
    private Float tenor7;
    @JsonProperty("tenor8")
    private Float tenor8;
    @JsonProperty("tenor9")
    private Float tenor9;
    @JsonProperty("tenor10")
    private Float tenor10;


    public DataRateAsuransi() {
    }

    public DataRateAsuransi(Integer id, String nama_skema, DataWilayah wilayahObject, Integer wilayah, DataJenisKendaraan jenis_kendaraanObject, Integer jenis_kendaraan, Integer jenis_pembiayaan, DataJenisPembiayaan jenis_pembiayaanObject, DataTipeAsuransi tipeAsuransiObject, Integer tipeAsuransi, Integer startOTR, Integer endOTR, Integer startYear, Integer endYear, Date startBerlaku, Date endBerlaku, Integer statusApproved, String remarks, Integer is_approved, Integer is_rejected, Float tenor1, Float tenor2, Float tenor3, Float tenor4, Float tenor5, Float tenor6, Float tenor7, Float tenor8, Float tenor9, Float tenor10) {
        this.id = id;
        this.nama_skema = nama_skema;
        this.wilayahObject = wilayahObject;
        this.wilayah = wilayah;
        this.jenis_kendaraanObject = jenis_kendaraanObject;
        this.jenis_kendaraan = jenis_kendaraan;
        this.jenis_pembiayaan = jenis_pembiayaan;
        this.jenis_pembiayaanObject = jenis_pembiayaanObject;
        this.tipeAsuransiObject = tipeAsuransiObject;
        this.tipeAsuransi = tipeAsuransi;
        this.startOTR = startOTR;
        this.endOTR = endOTR;
        this.startYear = startYear;
        this.endYear = endYear;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.statusApproved = statusApproved;
        this.remarks = remarks;
        this.is_approved = is_approved;
        this.is_rejected = is_rejected;
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

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama_skema() {
        return this.nama_skema;
    }

    public void setNama_skema(String nama_skema) {
        this.nama_skema = nama_skema;
    }

    public DataWilayah getWilayahObject() {
        return this.wilayahObject;
    }

    public void setWilayahObject(DataWilayah wilayahObject) {
        this.wilayahObject = wilayahObject;
    }

    public Integer getWilayah() {
        return this.wilayah;
    }

    public void setWilayah(Integer wilayah) {
        this.wilayah = wilayah;
    }

    public DataJenisKendaraan getJenis_kendaraanObject() {
        return this.jenis_kendaraanObject;
    }

    public void setJenis_kendaraanObject(DataJenisKendaraan jenis_kendaraanObject) {
        this.jenis_kendaraanObject = jenis_kendaraanObject;
    }

    public Integer getJenis_kendaraan() {
        return this.jenis_kendaraan;
    }

    public void setJenis_kendaraan(Integer jenis_kendaraan) {
        this.jenis_kendaraan = jenis_kendaraan;
    }

    public Integer getJenis_pembiayaan() {
        return this.jenis_pembiayaan;
    }

    public void setJenis_pembiayaan(Integer jenis_pembiayaan) {
        this.jenis_pembiayaan = jenis_pembiayaan;
    }

    public DataJenisPembiayaan getJenis_pembiayaanObject() {
        return this.jenis_pembiayaanObject;
    }

    public void setJenis_pembiayaanObject(DataJenisPembiayaan jenis_pembiayaanObject) {
        this.jenis_pembiayaanObject = jenis_pembiayaanObject;
    }

    public DataTipeAsuransi getTipeAsuransiObject() {
        return this.tipeAsuransiObject;
    }

    public void setTipeAsuransiObject(DataTipeAsuransi tipeAsuransiObject) {
        this.tipeAsuransiObject = tipeAsuransiObject;
    }

    public Integer getTipeAsuransi() {
        return this.tipeAsuransi;
    }

    public void setTipeAsuransi(Integer tipeAsuransi) {
        this.tipeAsuransi = tipeAsuransi;
    }

    public Integer getStartOTR() {
        return this.startOTR;
    }

    public void setStartOTR(Integer startOTR) {
        this.startOTR = startOTR;
    }

    public Integer getEndOTR() {
        return this.endOTR;
    }

    public void setEndOTR(Integer endOTR) {
        this.endOTR = endOTR;
    }

    public Integer getStartYear() {
        return this.startYear;
    }

    public void setStartYear(Integer startYear) {
        this.startYear = startYear;
    }

    public Integer getEndYear() {
        return this.endYear;
    }

    public void setEndYear(Integer endYear) {
        this.endYear = endYear;
    }

    public Date getStartBerlaku() {
        return this.startBerlaku;
    }

    public void setStartBerlaku(Date startBerlaku) {
        this.startBerlaku = startBerlaku;
    }

    public Date getEndBerlaku() {
        return this.endBerlaku;
    }

    public void setEndBerlaku(Date endBerlaku) {
        this.endBerlaku = endBerlaku;
    }

    public Integer getStatusApproved() {
        return this.statusApproved;
    }

    public void setStatusApproved(Integer statusApproved) {
        this.statusApproved = statusApproved;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getIs_approved() {
        return this.is_approved;
    }

    public void setIs_approved(Integer is_approved) {
        this.is_approved = is_approved;
    }

    public Integer getIs_rejected() {
        return this.is_rejected;
    }

    public void setIs_rejected(Integer is_rejected) {
        this.is_rejected = is_rejected;
    }

    public Float getTenor1() {
        return this.tenor1;
    }

    public void setTenor1(Float tenor1) {
        this.tenor1 = tenor1;
    }

    public Float getTenor2() {
        return this.tenor2;
    }

    public void setTenor2(Float tenor2) {
        this.tenor2 = tenor2;
    }

    public Float getTenor3() {
        return this.tenor3;
    }

    public void setTenor3(Float tenor3) {
        this.tenor3 = tenor3;
    }

    public Float getTenor4() {
        return this.tenor4;
    }

    public void setTenor4(Float tenor4) {
        this.tenor4 = tenor4;
    }

    public Float getTenor5() {
        return this.tenor5;
    }

    public void setTenor5(Float tenor5) {
        this.tenor5 = tenor5;
    }

    public Float getTenor6() {
        return this.tenor6;
    }

    public void setTenor6(Float tenor6) {
        this.tenor6 = tenor6;
    }

    public Float getTenor7() {
        return this.tenor7;
    }

    public void setTenor7(Float tenor7) {
        this.tenor7 = tenor7;
    }

    public Float getTenor8() {
        return this.tenor8;
    }

    public void setTenor8(Float tenor8) {
        this.tenor8 = tenor8;
    }

    public Float getTenor9() {
        return this.tenor9;
    }

    public void setTenor9(Float tenor9) {
        this.tenor9 = tenor9;
    }

    public Float getTenor10() {
        return this.tenor10;
    }

    public void setTenor10(Float tenor10) {
        this.tenor10 = tenor10;
    }

    public DataRateAsuransi id(Integer id) {
        setId(id);
        return this;
    }

    public DataRateAsuransi nama_skema(String nama_skema) {
        setNama_skema(nama_skema);
        return this;
    }

    public DataRateAsuransi wilayahObject(DataWilayah wilayahObject) {
        setWilayahObject(wilayahObject);
        return this;
    }

    public DataRateAsuransi wilayah(Integer wilayah) {
        setWilayah(wilayah);
        return this;
    }

    public DataRateAsuransi jenis_kendaraanObject(DataJenisKendaraan jenis_kendaraanObject) {
        setJenis_kendaraanObject(jenis_kendaraanObject);
        return this;
    }

    public DataRateAsuransi jenis_kendaraan(Integer jenis_kendaraan) {
        setJenis_kendaraan(jenis_kendaraan);
        return this;
    }

    public DataRateAsuransi jenis_pembiayaan(Integer jenis_pembiayaan) {
        setJenis_pembiayaan(jenis_pembiayaan);
        return this;
    }

    public DataRateAsuransi jenis_pembiayaanObject(DataJenisPembiayaan jenis_pembiayaanObject) {
        setJenis_pembiayaanObject(jenis_pembiayaanObject);
        return this;
    }

    public DataRateAsuransi tipeAsuransiObject(DataTipeAsuransi tipeAsuransiObject) {
        setTipeAsuransiObject(tipeAsuransiObject);
        return this;
    }

    public DataRateAsuransi tipeAsuransi(Integer tipeAsuransi) {
        setTipeAsuransi(tipeAsuransi);
        return this;
    }

    public DataRateAsuransi startOTR(Integer startOTR) {
        setStartOTR(startOTR);
        return this;
    }

    public DataRateAsuransi endOTR(Integer endOTR) {
        setEndOTR(endOTR);
        return this;
    }

    public DataRateAsuransi startYear(Integer startYear) {
        setStartYear(startYear);
        return this;
    }

    public DataRateAsuransi endYear(Integer endYear) {
        setEndYear(endYear);
        return this;
    }

    public DataRateAsuransi startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public DataRateAsuransi endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public DataRateAsuransi statusApproved(Integer statusApproved) {
        setStatusApproved(statusApproved);
        return this;
    }

    public DataRateAsuransi remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public DataRateAsuransi is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    public DataRateAsuransi is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public DataRateAsuransi tenor1(Float tenor1) {
        setTenor1(tenor1);
        return this;
    }

    public DataRateAsuransi tenor2(Float tenor2) {
        setTenor2(tenor2);
        return this;
    }

    public DataRateAsuransi tenor3(Float tenor3) {
        setTenor3(tenor3);
        return this;
    }

    public DataRateAsuransi tenor4(Float tenor4) {
        setTenor4(tenor4);
        return this;
    }

    public DataRateAsuransi tenor5(Float tenor5) {
        setTenor5(tenor5);
        return this;
    }

    public DataRateAsuransi tenor6(Float tenor6) {
        setTenor6(tenor6);
        return this;
    }

    public DataRateAsuransi tenor7(Float tenor7) {
        setTenor7(tenor7);
        return this;
    }

    public DataRateAsuransi tenor8(Float tenor8) {
        setTenor8(tenor8);
        return this;
    }

    public DataRateAsuransi tenor9(Float tenor9) {
        setTenor9(tenor9);
        return this;
    }

    public DataRateAsuransi tenor10(Float tenor10) {
        setTenor10(tenor10);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nama_skema='" + getNama_skema() + "'" +
            ", wilayahObject='" + getWilayahObject() + "'" +
            ", wilayah='" + getWilayah() + "'" +
            ", jenis_kendaraanObject='" + getJenis_kendaraanObject() + "'" +
            ", jenis_kendaraan='" + getJenis_kendaraan() + "'" +
            ", jenis_pembiayaan='" + getJenis_pembiayaan() + "'" +
            ", jenis_pembiayaanObject='" + getJenis_pembiayaanObject() + "'" +
            ", tipeAsuransiObject='" + getTipeAsuransiObject() + "'" +
            ", tipeAsuransi='" + getTipeAsuransi() + "'" +
            ", startOTR='" + getStartOTR() + "'" +
            ", endOTR='" + getEndOTR() + "'" +
            ", startYear='" + getStartYear() + "'" +
            ", endYear='" + getEndYear() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", statusApproved='" + getStatusApproved() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", is_approved='" + getIs_approved() + "'" +
            ", is_rejected='" + getIs_rejected() + "'" +
            ", tenor1='" + getTenor1() + "'" +
            ", tenor2='" + getTenor2() + "'" +
            ", tenor3='" + getTenor3() + "'" +
            ", tenor4='" + getTenor4() + "'" +
            ", tenor5='" + getTenor5() + "'" +
            ", tenor6='" + getTenor6() + "'" +
            ", tenor7='" + getTenor7() + "'" +
            ", tenor8='" + getTenor8() + "'" +
            ", tenor9='" + getTenor9() + "'" +
            ", tenor10='" + getTenor10() + "'" +
            "}";
    }


}
