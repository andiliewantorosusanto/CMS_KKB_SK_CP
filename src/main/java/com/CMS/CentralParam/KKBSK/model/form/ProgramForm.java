
package com.CMS.CentralParam.KKBSK.model.form;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;


public class ProgramForm {

    private Integer id;

    private String program;
    private Integer produk;
    private String deskripsi;

    private String branch;
    private Integer biayaAdmin;
    private Integer rateAsuransi;
    private Integer rateBunga;
    private Integer rateCp;
    private Integer minmalDp;
    private Integer komponenph;
    private Integer ratePerluasan;
    private Integer biayaProvisi;
    private Integer biayaFidusia;
    private Integer usiaKendaraanLunas;

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


    public ProgramForm() {
    }

    public ProgramForm(Integer id, String program, Integer produk, String deskripsi, String branch, Integer biayaAdmin, Integer rateAsuransi, Integer rateBunga, Integer rateCp, Integer minmalDp, Integer komponenph, Integer ratePerluasan, Integer biayaProvisi, Integer biayaFidusia, Integer usiaKendaraanLunas, Date startBerlaku, Date endBerlaku, Integer statusApproval, String remarks, Integer isRejected, Integer isApproved, Long createdBy, Date createdDate, Long updatedBy, Date updatedDate) {
        this.id = id;
        this.program = program;
        this.produk = produk;
        this.deskripsi = deskripsi;
        this.branch = branch;
        this.biayaAdmin = biayaAdmin;
        this.rateAsuransi = rateAsuransi;
        this.rateBunga = rateBunga;
        this.rateCp = rateCp;
        this.minmalDp = minmalDp;
        this.komponenph = komponenph;
        this.ratePerluasan = ratePerluasan;
        this.biayaProvisi = biayaProvisi;
        this.biayaFidusia = biayaFidusia;
        this.usiaKendaraanLunas = usiaKendaraanLunas;
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
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProgram() {
        return this.program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public Integer getProduk() {
        return this.produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    public String getDeskripsi() {
        return this.deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Integer getBiayaAdmin() {
        return this.biayaAdmin;
    }

    public void setBiayaAdmin(Integer biayaAdmin) {
        this.biayaAdmin = biayaAdmin;
    }

    public Integer getRateAsuransi() {
        return this.rateAsuransi;
    }

    public void setRateAsuransi(Integer rateAsuransi) {
        this.rateAsuransi = rateAsuransi;
    }

    public Integer getRateBunga() {
        return this.rateBunga;
    }

    public void setRateBunga(Integer rateBunga) {
        this.rateBunga = rateBunga;
    }

    public Integer getRateCp() {
        return this.rateCp;
    }

    public void setRateCp(Integer rateCp) {
        this.rateCp = rateCp;
    }

    public Integer getMinmalDp() {
        return this.minmalDp;
    }

    public void setMinmalDp(Integer minmalDp) {
        this.minmalDp = minmalDp;
    }

    public Integer getKomponenph() {
        return this.komponenph;
    }

    public void setKomponenph(Integer komponenph) {
        this.komponenph = komponenph;
    }

    public Integer getRatePerluasan() {
        return this.ratePerluasan;
    }

    public void setRatePerluasan(Integer ratePerluasan) {
        this.ratePerluasan = ratePerluasan;
    }

    public Integer getBiayaProvisi() {
        return this.biayaProvisi;
    }

    public void setBiayaProvisi(Integer biayaProvisi) {
        this.biayaProvisi = biayaProvisi;
    }

    public Integer getBiayaFidusia() {
        return this.biayaFidusia;
    }

    public void setBiayaFidusia(Integer biayaFidusia) {
        this.biayaFidusia = biayaFidusia;
    }

    public Integer getUsiaKendaraanLunas() {
        return this.usiaKendaraanLunas;
    }

    public void setUsiaKendaraanLunas(Integer usiaKendaraanLunas) {
        this.usiaKendaraanLunas = usiaKendaraanLunas;
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

    public ProgramForm id(Integer id) {
        setId(id);
        return this;
    }

    public ProgramForm program(String program) {
        setProgram(program);
        return this;
    }

    public ProgramForm produk(Integer produk) {
        setProduk(produk);
        return this;
    }

    public ProgramForm deskripsi(String deskripsi) {
        setDeskripsi(deskripsi);
        return this;
    }

    public ProgramForm branch(String branch) {
        setBranch(branch);
        return this;
    }

    public ProgramForm biayaAdmin(Integer biayaAdmin) {
        setBiayaAdmin(biayaAdmin);
        return this;
    }

    public ProgramForm rateAsuransi(Integer rateAsuransi) {
        setRateAsuransi(rateAsuransi);
        return this;
    }

    public ProgramForm rateBunga(Integer rateBunga) {
        setRateBunga(rateBunga);
        return this;
    }

    public ProgramForm rateCp(Integer rateCp) {
        setRateCp(rateCp);
        return this;
    }

    public ProgramForm minmalDp(Integer minmalDp) {
        setMinmalDp(minmalDp);
        return this;
    }

    public ProgramForm komponenph(Integer komponenph) {
        setKomponenph(komponenph);
        return this;
    }

    public ProgramForm ratePerluasan(Integer ratePerluasan) {
        setRatePerluasan(ratePerluasan);
        return this;
    }

    public ProgramForm biayaProvisi(Integer biayaProvisi) {
        setBiayaProvisi(biayaProvisi);
        return this;
    }

    public ProgramForm biayaFidusia(Integer biayaFidusia) {
        setBiayaFidusia(biayaFidusia);
        return this;
    }

    public ProgramForm usiaKendaraanLunas(Integer usiaKendaraanLunas) {
        setUsiaKendaraanLunas(usiaKendaraanLunas);
        return this;
    }

    public ProgramForm startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public ProgramForm endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public ProgramForm statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    public ProgramForm remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public ProgramForm isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public ProgramForm isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    public ProgramForm createdBy(Long createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public ProgramForm createdDate(Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public ProgramForm updatedBy(Long updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    public ProgramForm updatedDate(Date updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", program='" + getProgram() + "'" +
            ", produk='" + getProduk() + "'" +
            ", deskripsi='" + getDeskripsi() + "'" +
            ", branch='" + getBranch() + "'" +
            ", biayaAdmin='" + getBiayaAdmin() + "'" +
            ", rateAsuransi='" + getRateAsuransi() + "'" +
            ", rateBunga='" + getRateBunga() + "'" +
            ", rateCp='" + getRateCp() + "'" +
            ", minmalDp='" + getMinmalDp() + "'" +
            ", komponenph='" + getKomponenph() + "'" +
            ", ratePerluasan='" + getRatePerluasan() + "'" +
            ", biayaProvisi='" + getBiayaProvisi() + "'" +
            ", biayaFidusia='" + getBiayaFidusia() + "'" +
            ", usiaKendaraanLunas='" + getUsiaKendaraanLunas() + "'" +
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
            "}";
    }


}
