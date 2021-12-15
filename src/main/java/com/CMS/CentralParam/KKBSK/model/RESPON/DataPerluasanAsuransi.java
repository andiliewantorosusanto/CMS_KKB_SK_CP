
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
public class DataPerluasanAsuransi {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("nama_skema")
    private String nama_skema;

    @JsonProperty("wilayahObject")
    private DataWilayah wilayahObject;
    @JsonProperty("wilayah")
    private Integer wilayah;

    @JsonProperty("jenis_kendaraan")
    private Integer jenis_kendaraan;
    @JsonProperty("jenis_kendaraanObject")
    private DataJenisKendaraan jenis_kendaraanObject;

    @JsonProperty("tipe_asuransiObject")
    private DataTipeAsuransi tipe_asuransiObject;
    @JsonProperty("tipe_asuransi")
    private Integer tipe_asuransi;

    @JsonProperty("jenis_perluasanObject")
    private DataJenisPerluasan jenis_perluasanObject;
    @JsonProperty("jenis_perluasan")
    private Integer jenis_perluasan;

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


    public DataPerluasanAsuransi() {
    }

    public DataPerluasanAsuransi(Integer id, String nama_skema, DataWilayah wilayahObject, Integer wilayah, Integer jenis_kendaraan, DataJenisKendaraan jenis_kendaraanObject, DataTipeAsuransi tipe_asuransiObject, Integer tipe_asuransi, DataJenisPerluasan jenis_perluasanObject, Integer jenis_perluasan, Integer startOTR, Integer endOTR, Integer startYear, Integer endYear, Date startBerlaku, Date endBerlaku, Integer statusApproved, String remarks, Integer is_approved, Integer is_rejected, Float tenor1, Float tenor2, Float tenor3, Float tenor4, Float tenor5, Float tenor6, Float tenor7, Float tenor8, Float tenor9, Float tenor10) {
        this.id = id;
        this.nama_skema = nama_skema;
        this.wilayahObject = wilayahObject;
        this.wilayah = wilayah;
        this.jenis_kendaraan = jenis_kendaraan;
        this.jenis_kendaraanObject = jenis_kendaraanObject;
        this.tipe_asuransiObject = tipe_asuransiObject;
        this.tipe_asuransi = tipe_asuransi;
        this.jenis_perluasanObject = jenis_perluasanObject;
        this.jenis_perluasan = jenis_perluasan;
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

    public Integer getJenis_kendaraan() {
        return this.jenis_kendaraan;
    }

    public void setJenis_kendaraan(Integer jenis_kendaraan) {
        this.jenis_kendaraan = jenis_kendaraan;
    }

    public DataJenisKendaraan getJenis_kendaraanObject() {
        return this.jenis_kendaraanObject;
    }

    public void setJenis_kendaraanObject(DataJenisKendaraan jenis_kendaraanObject) {
        this.jenis_kendaraanObject = jenis_kendaraanObject;
    }

    public DataTipeAsuransi getTipe_asuransiObject() {
        return this.tipe_asuransiObject;
    }

    public void setTipe_asuransiObject(DataTipeAsuransi tipe_asuransiObject) {
        this.tipe_asuransiObject = tipe_asuransiObject;
    }

    public Integer getTipe_asuransi() {
        return this.tipe_asuransi;
    }

    public void setTipe_asuransi(Integer tipe_asuransi) {
        this.tipe_asuransi = tipe_asuransi;
    }

    public DataJenisPerluasan getJenis_perluasanObject() {
        return this.jenis_perluasanObject;
    }

    public void setJenis_perluasanObject(DataJenisPerluasan jenis_perluasanObject) {
        this.jenis_perluasanObject = jenis_perluasanObject;
    }

    public Integer getJenis_perluasan() {
        return this.jenis_perluasan;
    }

    public void setJenis_perluasan(Integer jenis_perluasan) {
        this.jenis_perluasan = jenis_perluasan;
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

    public DataPerluasanAsuransi id(Integer id) {
        setId(id);
        return this;
    }

    public DataPerluasanAsuransi nama_skema(String nama_skema) {
        setNama_skema(nama_skema);
        return this;
    }

    public DataPerluasanAsuransi wilayahObject(DataWilayah wilayahObject) {
        setWilayahObject(wilayahObject);
        return this;
    }

    public DataPerluasanAsuransi wilayah(Integer wilayah) {
        setWilayah(wilayah);
        return this;
    }

    public DataPerluasanAsuransi jenis_kendaraan(Integer jenis_kendaraan) {
        setJenis_kendaraan(jenis_kendaraan);
        return this;
    }

    public DataPerluasanAsuransi jenis_kendaraanObject(DataJenisKendaraan jenis_kendaraanObject) {
        setJenis_kendaraanObject(jenis_kendaraanObject);
        return this;
    }

    public DataPerluasanAsuransi tipe_asuransiObject(DataTipeAsuransi tipe_asuransiObject) {
        setTipe_asuransiObject(tipe_asuransiObject);
        return this;
    }

    public DataPerluasanAsuransi tipe_asuransi(Integer tipe_asuransi) {
        setTipe_asuransi(tipe_asuransi);
        return this;
    }

    public DataPerluasanAsuransi jenis_perluasanObject(DataJenisPerluasan jenis_perluasanObject) {
        setJenis_perluasanObject(jenis_perluasanObject);
        return this;
    }

    public DataPerluasanAsuransi jenis_perluasan(Integer jenis_perluasan) {
        setJenis_perluasan(jenis_perluasan);
        return this;
    }

    public DataPerluasanAsuransi startOTR(Integer startOTR) {
        setStartOTR(startOTR);
        return this;
    }

    public DataPerluasanAsuransi endOTR(Integer endOTR) {
        setEndOTR(endOTR);
        return this;
    }

    public DataPerluasanAsuransi startYear(Integer startYear) {
        setStartYear(startYear);
        return this;
    }

    public DataPerluasanAsuransi endYear(Integer endYear) {
        setEndYear(endYear);
        return this;
    }

    public DataPerluasanAsuransi startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public DataPerluasanAsuransi endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public DataPerluasanAsuransi statusApproved(Integer statusApproved) {
        setStatusApproved(statusApproved);
        return this;
    }

    public DataPerluasanAsuransi remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public DataPerluasanAsuransi is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    public DataPerluasanAsuransi is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public DataPerluasanAsuransi tenor1(Float tenor1) {
        setTenor1(tenor1);
        return this;
    }

    public DataPerluasanAsuransi tenor2(Float tenor2) {
        setTenor2(tenor2);
        return this;
    }

    public DataPerluasanAsuransi tenor3(Float tenor3) {
        setTenor3(tenor3);
        return this;
    }

    public DataPerluasanAsuransi tenor4(Float tenor4) {
        setTenor4(tenor4);
        return this;
    }

    public DataPerluasanAsuransi tenor5(Float tenor5) {
        setTenor5(tenor5);
        return this;
    }

    public DataPerluasanAsuransi tenor6(Float tenor6) {
        setTenor6(tenor6);
        return this;
    }

    public DataPerluasanAsuransi tenor7(Float tenor7) {
        setTenor7(tenor7);
        return this;
    }

    public DataPerluasanAsuransi tenor8(Float tenor8) {
        setTenor8(tenor8);
        return this;
    }

    public DataPerluasanAsuransi tenor9(Float tenor9) {
        setTenor9(tenor9);
        return this;
    }

    public DataPerluasanAsuransi tenor10(Float tenor10) {
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
            ", jenis_kendaraan='" + getJenis_kendaraan() + "'" +
            ", jenis_kendaraanObject='" + getJenis_kendaraanObject() + "'" +
            ", tipe_asuransiObject='" + getTipe_asuransiObject() + "'" +
            ", tipe_asuransi='" + getTipe_asuransi() + "'" +
            ", jenis_perluasanObject='" + getJenis_perluasanObject() + "'" +
            ", jenis_perluasan='" + getJenis_perluasan() + "'" +
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
