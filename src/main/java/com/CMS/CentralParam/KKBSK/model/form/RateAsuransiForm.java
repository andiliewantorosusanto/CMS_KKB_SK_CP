
package com.CMS.CentralParam.KKBSK.model.form;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;


public class RateAsuransiForm {


    private Integer id;

    private String namaSkema;
    private Integer wilayah;

    private Integer jenisKendaraan;

    private ArrayList<Integer> jenisPembiayaan;

    private Integer tipeAsuransi;

    private Integer startOtr;
    private Integer endOtr;

    private Integer startYear;
    private Integer endYear;

    @NotNull(message = "Start Date Tidak Boleh Kosong")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date startBerlaku;
    @NotNull(message = "End Date Tidak Boleh Kosong")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date endBerlaku;

    private Integer statusApproval;
    private String remarks;
    private Integer isRejected;
    private Integer isApproved;

    private Long createdBy;
    private Date createdDate;
    private Long updatedBy;
    private Date updatedDate;

    private Float tenor1;
    private Float tenor2;
    private Float tenor3;
    private Float tenor4;
    private Float tenor5;
    private Float tenor6;
    private Float tenor7;
    private Float tenor8;
    private Float tenor9;
    private Float tenor10;


    public RateAsuransiForm() {
    }

    public RateAsuransiForm(Integer id, String namaSkema, Integer wilayah, Integer jenisKendaraan, ArrayList<Integer> jenisPembiayaan, Integer tipeAsuransi, Integer startOtr, Integer endOtr, Integer startYear, Integer endYear, Date startBerlaku, Date endBerlaku, Integer statusApproval, String remarks, Integer isRejected, Integer isApproved, Long createdBy, Date createdDate, Long updatedBy, Date updatedDate, Float tenor1, Float tenor2, Float tenor3, Float tenor4, Float tenor5, Float tenor6, Float tenor7, Float tenor8, Float tenor9, Float tenor10) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.wilayah = wilayah;
        this.jenisKendaraan = jenisKendaraan;
        this.jenisPembiayaan = jenisPembiayaan;
        this.tipeAsuransi = tipeAsuransi;
        this.startOtr = startOtr;
        this.endOtr = endOtr;
        this.startYear = startYear;
        this.endYear = endYear;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.statusApproval = statusApproval;
        this.remarks = remarks;
        this.isRejected = isRejected;
        this.isApproved = isApproved;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
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

    public String getNamaSkema() {
        return this.namaSkema;
    }

    public void setNamaSkema(String namaSkema) {
        this.namaSkema = namaSkema;
    }

    public Integer getWilayah() {
        return this.wilayah;
    }

    public void setWilayah(Integer wilayah) {
        this.wilayah = wilayah;
    }

    public Integer getJenisKendaraan() {
        return this.jenisKendaraan;
    }

    public void setJenisKendaraan(Integer jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public ArrayList<Integer> getJenisPembiayaan() {
        return this.jenisPembiayaan;
    }

    public void setJenisPembiayaan(ArrayList<Integer> jenisPembiayaan) {
        this.jenisPembiayaan = jenisPembiayaan;
    }

    public Integer getTipeAsuransi() {
        return this.tipeAsuransi;
    }

    public void setTipeAsuransi(Integer tipeAsuransi) {
        this.tipeAsuransi = tipeAsuransi;
    }

    public Integer getStartOtr() {
        return this.startOtr;
    }

    public void setStartOtr(Integer startOtr) {
        this.startOtr = startOtr;
    }

    public Integer getEndOtr() {
        return this.endOtr;
    }

    public void setEndOtr(Integer endOtr) {
        this.endOtr = endOtr;
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

    public Integer getStatusApproval() {
        return this.statusApproval;
    }

    public void setStatusApproval(Integer statusApproval) {
        this.statusApproval = statusApproval;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getIsRejected() {
        return this.isRejected;
    }

    public void setIsRejected(Integer isRejected) {
        this.isRejected = isRejected;
    }

    public Integer getIsApproved() {
        return this.isApproved;
    }

    public void setIsApproved(Integer isApproved) {
        this.isApproved = isApproved;
    }

    public Long getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Long getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedDate() {
        return this.updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
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

    public RateAsuransiForm id(Integer id) {
        setId(id);
        return this;
    }

    public RateAsuransiForm namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public RateAsuransiForm wilayah(Integer wilayah) {
        setWilayah(wilayah);
        return this;
    }

    public RateAsuransiForm jenisKendaraan(Integer jenisKendaraan) {
        setJenisKendaraan(jenisKendaraan);
        return this;
    }

    public RateAsuransiForm jenisPembiayaan(ArrayList<Integer> jenisPembiayaan) {
        setJenisPembiayaan(jenisPembiayaan);
        return this;
    }

    public RateAsuransiForm tipeAsuransi(Integer tipeAsuransi) {
        setTipeAsuransi(tipeAsuransi);
        return this;
    }

    public RateAsuransiForm startOtr(Integer startOtr) {
        setStartOtr(startOtr);
        return this;
    }

    public RateAsuransiForm endOtr(Integer endOtr) {
        setEndOtr(endOtr);
        return this;
    }

    public RateAsuransiForm startYear(Integer startYear) {
        setStartYear(startYear);
        return this;
    }

    public RateAsuransiForm endYear(Integer endYear) {
        setEndYear(endYear);
        return this;
    }

    public RateAsuransiForm startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public RateAsuransiForm endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public RateAsuransiForm statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    public RateAsuransiForm remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public RateAsuransiForm isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public RateAsuransiForm isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    public RateAsuransiForm createdBy(Long createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public RateAsuransiForm createdDate(Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public RateAsuransiForm updatedBy(Long updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    public RateAsuransiForm updatedDate(Date updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    public RateAsuransiForm tenor1(Float tenor1) {
        setTenor1(tenor1);
        return this;
    }

    public RateAsuransiForm tenor2(Float tenor2) {
        setTenor2(tenor2);
        return this;
    }

    public RateAsuransiForm tenor3(Float tenor3) {
        setTenor3(tenor3);
        return this;
    }

    public RateAsuransiForm tenor4(Float tenor4) {
        setTenor4(tenor4);
        return this;
    }

    public RateAsuransiForm tenor5(Float tenor5) {
        setTenor5(tenor5);
        return this;
    }

    public RateAsuransiForm tenor6(Float tenor6) {
        setTenor6(tenor6);
        return this;
    }

    public RateAsuransiForm tenor7(Float tenor7) {
        setTenor7(tenor7);
        return this;
    }

    public RateAsuransiForm tenor8(Float tenor8) {
        setTenor8(tenor8);
        return this;
    }

    public RateAsuransiForm tenor9(Float tenor9) {
        setTenor9(tenor9);
        return this;
    }

    public RateAsuransiForm tenor10(Float tenor10) {
        setTenor10(tenor10);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            ", wilayah='" + getWilayah() + "'" +
            ", jenisKendaraan='" + getJenisKendaraan() + "'" +
            ", jenisPembiayaan='" + getJenisPembiayaan() + "'" +
            ", tipeAsuransi='" + getTipeAsuransi() + "'" +
            ", startOtr='" + getStartOtr() + "'" +
            ", endOtr='" + getEndOtr() + "'" +
            ", startYear='" + getStartYear() + "'" +
            ", endYear='" + getEndYear() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", isRejected='" + getIsRejected() + "'" +
            ", isApproved='" + getIsApproved() + "'" +
            ", createdBy='" + getCreatedBy() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", updatedBy='" + getUpdatedBy() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
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
