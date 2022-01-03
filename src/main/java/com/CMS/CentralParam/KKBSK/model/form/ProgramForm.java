
package com.CMS.CentralParam.KKBSK.model.form;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;


public class ProgramForm {

    private Integer id;

    private String program;
    private ArrayList<Integer> produk;
    private String deskripsi;

    private ArrayList<String> branch;
    private Integer biayaAdmin;
    private Integer rateAsuransi;
    private Integer rateBunga;
    private Integer rateCp;
    private Integer minimalDp;
    private Integer komponenPh;
    private Integer perluasanAsuransi;
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

    public ProgramForm(Integer id, String program, ArrayList<Integer> produk, String deskripsi, ArrayList<String> branch, Integer biayaAdmin, Integer rateAsuransi, Integer rateBunga, Integer rateCp, Integer minimalDp, Integer komponenPh, Integer perluasanAsuransi, Integer biayaProvisi, Integer biayaFidusia, Integer usiaKendaraanLunas, Date startBerlaku, Date endBerlaku, Integer statusApproval, String remarks, Integer isRejected, Integer isApproved, Long createdBy, Date createdDate, Long updatedBy, Date updatedDate) {
        this.id = id;
        this.program = program;
        this.produk = produk;
        this.deskripsi = deskripsi;
        this.branch = branch;
        this.biayaAdmin = biayaAdmin;
        this.rateAsuransi = rateAsuransi;
        this.rateBunga = rateBunga;
        this.rateCp = rateCp;
        this.minimalDp = minimalDp;
        this.komponenPh = komponenPh;
        this.perluasanAsuransi = perluasanAsuransi;
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

    public ArrayList<Integer> getProduk() {
        return this.produk;
    }

    public void setProduk(ArrayList<Integer> produk) {
        this.produk = produk;
    }

    public String getDeskripsi() {
        return this.deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public ArrayList<String> getBranch() {
        return this.branch;
    }

    public void setBranch(ArrayList<String> branch) {
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

    public Integer getMinimalDp() {
        return this.minimalDp;
    }

    public void setMinimalDp(Integer minimalDp) {
        this.minimalDp = minimalDp;
    }

    public Integer getKomponenPh() {
        return this.komponenPh;
    }

    public void setKomponenPh(Integer komponenPh) {
        this.komponenPh = komponenPh;
    }

    public Integer getPerluasanAsuransi() {
        return this.perluasanAsuransi;
    }

    public void setPerluasanAsuransi(Integer perluasanAsuransi) {
        this.perluasanAsuransi = perluasanAsuransi;
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

    public ProgramForm produk(ArrayList<Integer> produk) {
        setProduk(produk);
        return this;
    }

    public ProgramForm deskripsi(String deskripsi) {
        setDeskripsi(deskripsi);
        return this;
    }

    public ProgramForm branch(ArrayList<String> branch) {
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

    public ProgramForm minimalDp(Integer minimalDp) {
        setMinimalDp(minimalDp);
        return this;
    }

    public ProgramForm komponenPh(Integer komponenPh) {
        setKomponenPh(komponenPh);
        return this;
    }

    public ProgramForm perluasanAsuransi(Integer perluasanAsuransi) {
        setPerluasanAsuransi(perluasanAsuransi);
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
            ", minimalDp='" + getMinimalDp() + "'" +
            ", komponenPh='" + getKomponenPh() + "'" +
            ", perluasanAsuransi='" + getPerluasanAsuransi() + "'" +
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
