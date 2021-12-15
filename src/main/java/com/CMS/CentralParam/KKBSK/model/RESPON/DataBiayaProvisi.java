package com.CMS.CentralParam.KKBSK.model.RESPON;


import java.util.Date;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import org.springframework.format.annotation.DateTimeFormat;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "startBerlaku",
    "endBerlaku",
    "loanType",
    "productid",
    "jeniskendaraanid",
    "jenis_kendaraan_id",
    "kondisikendaraanid",
    "tipe_konsumen",
    "jenis_pembiayaan",
    "jenis_pembiayaan_id",
    "tujuan_penggunaan",
    "cluster",
    "program",
    "remarks",
    "status",
    "tahun_awal",
    "tahun_akhir",
    "updateddate",
    "createddate",
    "createdby",
    "updatedby",
    "is_login",
    "statusApproved",
    "nama_skema",
    "deskripsi"
})
@Generated("jsonschema2pojo")
public class DataBiayaProvisi {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("nama_skema")
    private String nama_skema;

    @JsonProperty("startBerlaku")
    @NotNull(message = "Start Date Tidak Boleh Kosong")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date startBerlaku;
    @JsonProperty("endBerlaku")
    @NotNull(message = "End Date Tidak Boleh Kosong")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date endBerlaku;


    @JsonProperty("loanType")
    private Integer loanType;

    @JsonProperty("jenis_kendaraanObject")
    private DataJenisKendaraan jenis_kendaraanObject;
    @JsonProperty("jenis_kendaraan")
    private Integer jenis_kendaraan;

    @JsonProperty("jenis_pembiayaanObject")
    private DataJenisPembiayaan jenis_pembiayaanObject;
    @JsonProperty("jenis_pembiayaan")
    private Integer jenis_pembiayaan;

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

    @JsonProperty("tenor1_persen")
    private Float tenor1_persen;
    @JsonProperty("tenor2_persen")
    private Float tenor2_persen;
    @JsonProperty("tenor3_persen")
    private Float tenor3_persen;
    @JsonProperty("tenor4_persen")
    private Float tenor4_persen;
    @JsonProperty("tenor5_persen")
    private Float tenor5_persen;
    @JsonProperty("tenor6_persen")
    private Float tenor6_persen;
    @JsonProperty("tenor7_persen")
    private Float tenor7_persen;
    @JsonProperty("tenor8_persen")
    private Float tenor8_persen;
    @JsonProperty("tenor9_persen")
    private Float tenor9_persen;
    @JsonProperty("tenor1_persen0")
    private Float tenor10_persen;

    @JsonProperty("remarks")
    private String remarks;
    @JsonProperty("status")
    private Object status;

    @JsonProperty("statusApproved")
    private Integer statusApproved;


    public DataBiayaProvisi() {
    }

    public DataBiayaProvisi(Integer id, String nama_skema, Date startBerlaku, Date endBerlaku, Integer loanType, DataJenisKendaraan jenis_kendaraanObject, Integer jenis_kendaraan, DataJenisPembiayaan jenis_pembiayaanObject, Integer jenis_pembiayaan, Float tenor1, Float tenor2, Float tenor3, Float tenor4, Float tenor5, Float tenor6, Float tenor7, Float tenor8, Float tenor9, Float tenor10, Float tenor1_persen, Float tenor2_persen, Float tenor3_persen, Float tenor4_persen, Float tenor5_persen, Float tenor6_persen, Float tenor7_persen, Float tenor8_persen, Float tenor9_persen, Float tenor10_persen, String remarks, Object status, Integer statusApproved) {
        this.id = id;
        this.nama_skema = nama_skema;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.loanType = loanType;
        this.jenis_kendaraanObject = jenis_kendaraanObject;
        this.jenis_kendaraan = jenis_kendaraan;
        this.jenis_pembiayaanObject = jenis_pembiayaanObject;
        this.jenis_pembiayaan = jenis_pembiayaan;
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
        this.tenor1_persen = tenor1_persen;
        this.tenor2_persen = tenor2_persen;
        this.tenor3_persen = tenor3_persen;
        this.tenor4_persen = tenor4_persen;
        this.tenor5_persen = tenor5_persen;
        this.tenor6_persen = tenor6_persen;
        this.tenor7_persen = tenor7_persen;
        this.tenor8_persen = tenor8_persen;
        this.tenor9_persen = tenor9_persen;
        this.tenor10_persen = tenor10_persen;
        this.remarks = remarks;
        this.status = status;
        this.statusApproved = statusApproved;
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

    public Integer getLoanType() {
        return this.loanType;
    }

    public void setLoanType(Integer loanType) {
        this.loanType = loanType;
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

    public DataJenisPembiayaan getJenis_pembiayaanObject() {
        return this.jenis_pembiayaanObject;
    }

    public void setJenis_pembiayaanObject(DataJenisPembiayaan jenis_pembiayaanObject) {
        this.jenis_pembiayaanObject = jenis_pembiayaanObject;
    }

    public Integer getJenis_pembiayaan() {
        return this.jenis_pembiayaan;
    }

    public void setJenis_pembiayaan(Integer jenis_pembiayaan) {
        this.jenis_pembiayaan = jenis_pembiayaan;
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

    public Float getTenor1_persen() {
        return this.tenor1_persen;
    }

    public void setTenor1_persen(Float tenor1_persen) {
        this.tenor1_persen = tenor1_persen;
    }

    public Float getTenor2_persen() {
        return this.tenor2_persen;
    }

    public void setTenor2_persen(Float tenor2_persen) {
        this.tenor2_persen = tenor2_persen;
    }

    public Float getTenor3_persen() {
        return this.tenor3_persen;
    }

    public void setTenor3_persen(Float tenor3_persen) {
        this.tenor3_persen = tenor3_persen;
    }

    public Float getTenor4_persen() {
        return this.tenor4_persen;
    }

    public void setTenor4_persen(Float tenor4_persen) {
        this.tenor4_persen = tenor4_persen;
    }

    public Float getTenor5_persen() {
        return this.tenor5_persen;
    }

    public void setTenor5_persen(Float tenor5_persen) {
        this.tenor5_persen = tenor5_persen;
    }

    public Float getTenor6_persen() {
        return this.tenor6_persen;
    }

    public void setTenor6_persen(Float tenor6_persen) {
        this.tenor6_persen = tenor6_persen;
    }

    public Float getTenor7_persen() {
        return this.tenor7_persen;
    }

    public void setTenor7_persen(Float tenor7_persen) {
        this.tenor7_persen = tenor7_persen;
    }

    public Float getTenor8_persen() {
        return this.tenor8_persen;
    }

    public void setTenor8_persen(Float tenor8_persen) {
        this.tenor8_persen = tenor8_persen;
    }

    public Float getTenor9_persen() {
        return this.tenor9_persen;
    }

    public void setTenor9_persen(Float tenor9_persen) {
        this.tenor9_persen = tenor9_persen;
    }

    public Float getTenor10_persen() {
        return this.tenor10_persen;
    }

    public void setTenor10_persen(Float tenor10_persen) {
        this.tenor10_persen = tenor10_persen;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Object getStatus() {
        return this.status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public Integer getStatusApproved() {
        return this.statusApproved;
    }

    public void setStatusApproved(Integer statusApproved) {
        this.statusApproved = statusApproved;
    }

    public DataBiayaProvisi id(Integer id) {
        setId(id);
        return this;
    }

    public DataBiayaProvisi nama_skema(String nama_skema) {
        setNama_skema(nama_skema);
        return this;
    }

    public DataBiayaProvisi startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public DataBiayaProvisi endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public DataBiayaProvisi loanType(Integer loanType) {
        setLoanType(loanType);
        return this;
    }

    public DataBiayaProvisi jenis_kendaraanObject(DataJenisKendaraan jenis_kendaraanObject) {
        setJenis_kendaraanObject(jenis_kendaraanObject);
        return this;
    }

    public DataBiayaProvisi jenis_kendaraan(Integer jenis_kendaraan) {
        setJenis_kendaraan(jenis_kendaraan);
        return this;
    }

    public DataBiayaProvisi jenis_pembiayaanObject(DataJenisPembiayaan jenis_pembiayaanObject) {
        setJenis_pembiayaanObject(jenis_pembiayaanObject);
        return this;
    }

    public DataBiayaProvisi jenis_pembiayaan(Integer jenis_pembiayaan) {
        setJenis_pembiayaan(jenis_pembiayaan);
        return this;
    }

    public DataBiayaProvisi tenor1(Float tenor1) {
        setTenor1(tenor1);
        return this;
    }

    public DataBiayaProvisi tenor2(Float tenor2) {
        setTenor2(tenor2);
        return this;
    }

    public DataBiayaProvisi tenor3(Float tenor3) {
        setTenor3(tenor3);
        return this;
    }

    public DataBiayaProvisi tenor4(Float tenor4) {
        setTenor4(tenor4);
        return this;
    }

    public DataBiayaProvisi tenor5(Float tenor5) {
        setTenor5(tenor5);
        return this;
    }

    public DataBiayaProvisi tenor6(Float tenor6) {
        setTenor6(tenor6);
        return this;
    }

    public DataBiayaProvisi tenor7(Float tenor7) {
        setTenor7(tenor7);
        return this;
    }

    public DataBiayaProvisi tenor8(Float tenor8) {
        setTenor8(tenor8);
        return this;
    }

    public DataBiayaProvisi tenor9(Float tenor9) {
        setTenor9(tenor9);
        return this;
    }

    public DataBiayaProvisi tenor10(Float tenor10) {
        setTenor10(tenor10);
        return this;
    }

    public DataBiayaProvisi tenor1_persen(Float tenor1_persen) {
        setTenor1_persen(tenor1_persen);
        return this;
    }

    public DataBiayaProvisi tenor2_persen(Float tenor2_persen) {
        setTenor2_persen(tenor2_persen);
        return this;
    }

    public DataBiayaProvisi tenor3_persen(Float tenor3_persen) {
        setTenor3_persen(tenor3_persen);
        return this;
    }

    public DataBiayaProvisi tenor4_persen(Float tenor4_persen) {
        setTenor4_persen(tenor4_persen);
        return this;
    }

    public DataBiayaProvisi tenor5_persen(Float tenor5_persen) {
        setTenor5_persen(tenor5_persen);
        return this;
    }

    public DataBiayaProvisi tenor6_persen(Float tenor6_persen) {
        setTenor6_persen(tenor6_persen);
        return this;
    }

    public DataBiayaProvisi tenor7_persen(Float tenor7_persen) {
        setTenor7_persen(tenor7_persen);
        return this;
    }

    public DataBiayaProvisi tenor8_persen(Float tenor8_persen) {
        setTenor8_persen(tenor8_persen);
        return this;
    }

    public DataBiayaProvisi tenor9_persen(Float tenor9_persen) {
        setTenor9_persen(tenor9_persen);
        return this;
    }

    public DataBiayaProvisi tenor10_persen(Float tenor10_persen) {
        setTenor10_persen(tenor10_persen);
        return this;
    }

    public DataBiayaProvisi remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public DataBiayaProvisi status(Object status) {
        setStatus(status);
        return this;
    }

    public DataBiayaProvisi statusApproved(Integer statusApproved) {
        setStatusApproved(statusApproved);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nama_skema='" + getNama_skema() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", loanType='" + getLoanType() + "'" +
            ", jenis_kendaraanObject='" + getJenis_kendaraanObject() + "'" +
            ", jenis_kendaraan='" + getJenis_kendaraan() + "'" +
            ", jenis_pembiayaanObject='" + getJenis_pembiayaanObject() + "'" +
            ", jenis_pembiayaan='" + getJenis_pembiayaan() + "'" +
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
            ", tenor1_persen='" + getTenor1_persen() + "'" +
            ", tenor2_persen='" + getTenor2_persen() + "'" +
            ", tenor3_persen='" + getTenor3_persen() + "'" +
            ", tenor4_persen='" + getTenor4_persen() + "'" +
            ", tenor5_persen='" + getTenor5_persen() + "'" +
            ", tenor6_persen='" + getTenor6_persen() + "'" +
            ", tenor7_persen='" + getTenor7_persen() + "'" +
            ", tenor8_persen='" + getTenor8_persen() + "'" +
            ", tenor9_persen='" + getTenor9_persen() + "'" +
            ", tenor10_persen='" + getTenor10_persen() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", status='" + getStatus() + "'" +
            ", statusApproved='" + getStatusApproved() + "'" +
            "}";
    }

}
