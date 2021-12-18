package com.CMS.CentralParam.KKBSK.model.data;


import java.util.Date;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.format.annotation.DateTimeFormat;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
public class BiayaProvisi {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("namaSkema")
    private String namaSkema;

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

    @JsonProperty("jenisKendaraan")
    private Integer jenisKendaraan;

    @JsonProperty("jenisPembiayaan")
    private Integer jenisPembiayaan;

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

    @JsonProperty("tenor1Persen")
    private Float tenor1Persen;
    @JsonProperty("tenor2Persen")
    private Float tenor2Persen;
    @JsonProperty("tenor3Persen")
    private Float tenor3Persen;
    @JsonProperty("tenor4Persen")
    private Float tenor4Persen;
    @JsonProperty("tenor5Persen")
    private Float tenor5Persen;
    @JsonProperty("tenor6Persen")
    private Float tenor6Persen;
    @JsonProperty("tenor7Persen")
    private Float tenor7Persen;
    @JsonProperty("tenor8Persen")
    private Float tenor8Persen;
    @JsonProperty("tenor9Persen")
    private Float tenor9Persen;
    @JsonProperty("tenor10Persen")
    private Float tenor10Persen;

    @JsonProperty("statusApproval")
    private Integer statusApproval;
    @JsonProperty("remarks")
    private String remarks;
    @JsonProperty("isRejected")
    private Integer isRejected;
    @JsonProperty("isApproved")
    private Integer isApproved;

    @JsonProperty("createdBy")
    private Long createdBy;
    @JsonProperty("createdDate")
    private Date createdDate;
    @JsonProperty("updatedBy")
    private Long updatedBy;
    @JsonProperty("updatedDate")
    private Date updatedDate;


    public BiayaProvisi() {
    }

    public BiayaProvisi(Integer id, String namaSkema, Date startBerlaku, Date endBerlaku, Integer loanType, Integer jenisKendaraan, Integer jenisPembiayaan, Float tenor1, Float tenor2, Float tenor3, Float tenor4, Float tenor5, Float tenor6, Float tenor7, Float tenor8, Float tenor9, Float tenor10, Float tenor1Persen, Float tenor2Persen, Float tenor3Persen, Float tenor4Persen, Float tenor5Persen, Float tenor6Persen, Float tenor7Persen, Float tenor8Persen, Float tenor9Persen, Float tenor10Persen, Integer statusApproval, String remarks, Integer isRejected, Integer isApproved, Long createdBy, Date createdDate, Long updatedBy, Date updatedDate) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.loanType = loanType;
        this.jenisKendaraan = jenisKendaraan;
        this.jenisPembiayaan = jenisPembiayaan;
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
        this.tenor1Persen = tenor1Persen;
        this.tenor2Persen = tenor2Persen;
        this.tenor3Persen = tenor3Persen;
        this.tenor4Persen = tenor4Persen;
        this.tenor5Persen = tenor5Persen;
        this.tenor6Persen = tenor6Persen;
        this.tenor7Persen = tenor7Persen;
        this.tenor8Persen = tenor8Persen;
        this.tenor9Persen = tenor9Persen;
        this.tenor10Persen = tenor10Persen;
        this.statusApproval = statusApproval;
        this.remarks = remarks;
        this.isRejected = isRejected;
        this.isApproved = isApproved;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
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

    public Integer getJenisKendaraan() {
        return this.jenisKendaraan;
    }

    public void setJenisKendaraan(Integer jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public Integer getJenisPembiayaan() {
        return this.jenisPembiayaan;
    }

    public void setJenisPembiayaan(Integer jenisPembiayaan) {
        this.jenisPembiayaan = jenisPembiayaan;
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

    public Float getTenor1Persen() {
        return this.tenor1Persen;
    }

    public void setTenor1Persen(Float tenor1Persen) {
        this.tenor1Persen = tenor1Persen;
    }

    public Float getTenor2Persen() {
        return this.tenor2Persen;
    }

    public void setTenor2Persen(Float tenor2Persen) {
        this.tenor2Persen = tenor2Persen;
    }

    public Float getTenor3Persen() {
        return this.tenor3Persen;
    }

    public void setTenor3Persen(Float tenor3Persen) {
        this.tenor3Persen = tenor3Persen;
    }

    public Float getTenor4Persen() {
        return this.tenor4Persen;
    }

    public void setTenor4Persen(Float tenor4Persen) {
        this.tenor4Persen = tenor4Persen;
    }

    public Float getTenor5Persen() {
        return this.tenor5Persen;
    }

    public void setTenor5Persen(Float tenor5Persen) {
        this.tenor5Persen = tenor5Persen;
    }

    public Float getTenor6Persen() {
        return this.tenor6Persen;
    }

    public void setTenor6Persen(Float tenor6Persen) {
        this.tenor6Persen = tenor6Persen;
    }

    public Float getTenor7Persen() {
        return this.tenor7Persen;
    }

    public void setTenor7Persen(Float tenor7Persen) {
        this.tenor7Persen = tenor7Persen;
    }

    public Float getTenor8Persen() {
        return this.tenor8Persen;
    }

    public void setTenor8Persen(Float tenor8Persen) {
        this.tenor8Persen = tenor8Persen;
    }

    public Float getTenor9Persen() {
        return this.tenor9Persen;
    }

    public void setTenor9Persen(Float tenor9Persen) {
        this.tenor9Persen = tenor9Persen;
    }

    public Float getTenor10Persen() {
        return this.tenor10Persen;
    }

    public void setTenor10Persen(Float tenor10Persen) {
        this.tenor10Persen = tenor10Persen;
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

    public BiayaProvisi id(Integer id) {
        setId(id);
        return this;
    }

    public BiayaProvisi namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public BiayaProvisi startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public BiayaProvisi endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public BiayaProvisi loanType(Integer loanType) {
        setLoanType(loanType);
        return this;
    }

    public BiayaProvisi jenisKendaraan(Integer jenisKendaraan) {
        setJenisKendaraan(jenisKendaraan);
        return this;
    }

    public BiayaProvisi jenisPembiayaan(Integer jenisPembiayaan) {
        setJenisPembiayaan(jenisPembiayaan);
        return this;
    }

    public BiayaProvisi tenor1(Float tenor1) {
        setTenor1(tenor1);
        return this;
    }

    public BiayaProvisi tenor2(Float tenor2) {
        setTenor2(tenor2);
        return this;
    }

    public BiayaProvisi tenor3(Float tenor3) {
        setTenor3(tenor3);
        return this;
    }

    public BiayaProvisi tenor4(Float tenor4) {
        setTenor4(tenor4);
        return this;
    }

    public BiayaProvisi tenor5(Float tenor5) {
        setTenor5(tenor5);
        return this;
    }

    public BiayaProvisi tenor6(Float tenor6) {
        setTenor6(tenor6);
        return this;
    }

    public BiayaProvisi tenor7(Float tenor7) {
        setTenor7(tenor7);
        return this;
    }

    public BiayaProvisi tenor8(Float tenor8) {
        setTenor8(tenor8);
        return this;
    }

    public BiayaProvisi tenor9(Float tenor9) {
        setTenor9(tenor9);
        return this;
    }

    public BiayaProvisi tenor10(Float tenor10) {
        setTenor10(tenor10);
        return this;
    }

    public BiayaProvisi tenor1Persen(Float tenor1Persen) {
        setTenor1Persen(tenor1Persen);
        return this;
    }

    public BiayaProvisi tenor2Persen(Float tenor2Persen) {
        setTenor2Persen(tenor2Persen);
        return this;
    }

    public BiayaProvisi tenor3Persen(Float tenor3Persen) {
        setTenor3Persen(tenor3Persen);
        return this;
    }

    public BiayaProvisi tenor4Persen(Float tenor4Persen) {
        setTenor4Persen(tenor4Persen);
        return this;
    }

    public BiayaProvisi tenor5Persen(Float tenor5Persen) {
        setTenor5Persen(tenor5Persen);
        return this;
    }

    public BiayaProvisi tenor6Persen(Float tenor6Persen) {
        setTenor6Persen(tenor6Persen);
        return this;
    }

    public BiayaProvisi tenor7Persen(Float tenor7Persen) {
        setTenor7Persen(tenor7Persen);
        return this;
    }

    public BiayaProvisi tenor8Persen(Float tenor8Persen) {
        setTenor8Persen(tenor8Persen);
        return this;
    }

    public BiayaProvisi tenor9Persen(Float tenor9Persen) {
        setTenor9Persen(tenor9Persen);
        return this;
    }

    public BiayaProvisi tenor10Persen(Float tenor10Persen) {
        setTenor10Persen(tenor10Persen);
        return this;
    }

    public BiayaProvisi statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    public BiayaProvisi remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public BiayaProvisi isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public BiayaProvisi isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    public BiayaProvisi createdBy(Long createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public BiayaProvisi createdDate(Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public BiayaProvisi updatedBy(Long updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    public BiayaProvisi updatedDate(Date updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", loanType='" + getLoanType() + "'" +
            ", jenisKendaraan='" + getJenisKendaraan() + "'" +
            ", jenisPembiayaan='" + getJenisPembiayaan() + "'" +
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
            ", tenor1Persen='" + getTenor1Persen() + "'" +
            ", tenor2Persen='" + getTenor2Persen() + "'" +
            ", tenor3Persen='" + getTenor3Persen() + "'" +
            ", tenor4Persen='" + getTenor4Persen() + "'" +
            ", tenor5Persen='" + getTenor5Persen() + "'" +
            ", tenor6Persen='" + getTenor6Persen() + "'" +
            ", tenor7Persen='" + getTenor7Persen() + "'" +
            ", tenor8Persen='" + getTenor8Persen() + "'" +
            ", tenor9Persen='" + getTenor9Persen() + "'" +
            ", tenor10Persen='" + getTenor10Persen() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", isRejected='" + getIsRejected() + "'" +
            ", isApproved='" + getIsApproved() + "'" +
            ", createdBy='" + getCreatedBy() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", updatedBy='" + getUpdatedBy() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
            "}";
    }
    
}
