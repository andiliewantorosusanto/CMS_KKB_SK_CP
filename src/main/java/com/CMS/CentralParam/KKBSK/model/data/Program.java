
package com.CMS.CentralParam.KKBSK.model.data;

import java.util.Date;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.format.annotation.DateTimeFormat;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
public class Program {

    @JsonProperty("ID")
    private Integer id;

    @JsonProperty("program")
    private String program;
    @JsonProperty("produk")
    private Integer produk;
    @JsonProperty("deskripsi")
    private String deskripsi;

    @JsonProperty("branchid")
    private String BranchId;
    @JsonProperty("biayaAdmin")
    private Integer biayaAdmin;
    @JsonProperty("rateAsuransi")
    private Integer rateAsuransi;
    @JsonProperty("rateBunga")
    private Integer rateBunga;
    @JsonProperty("rateCp")
    private Integer rateCp;
    @JsonProperty("minmalDp")
    private Integer minmalDp;
    @JsonProperty("komponenph")
    private Integer komponenph;
    @JsonProperty("ratePerluasan")
    private Integer ratePerluasan;
    @JsonProperty("biayaProvisi")
    private Integer biayaProvisi;
    @JsonProperty("biayaFidusia")
    private Integer biayaFidusia;
    @JsonProperty("usiaKendaraanLunas")
    private Integer usiaKendaraanLunas;

    @JsonProperty("startBerlaku")
    @NotNull(message = "Start Date Tidak Boleh Kosong")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date startBerlaku;
    @JsonProperty("endBerlaku")
    @NotNull(message = "End Date Tidak Boleh Kosong")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date endBerlaku;

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


    public Program() {
    }

    public Program(Integer id, String program, Integer produk, String deskripsi, String BranchId, Integer biayaAdmin, Integer rateAsuransi, Integer rateBunga, Integer rateCp, Integer minmalDp, Integer komponenph, Integer ratePerluasan, Integer biayaProvisi, Integer biayaFidusia, Integer usiaKendaraanLunas, Date startBerlaku, Date endBerlaku, Integer statusApproval, String remarks, Integer isRejected, Integer isApproved, Long createdBy, Date createdDate, Long updatedBy, Date updatedDate) {
        this.id = id;
        this.program = program;
        this.produk = produk;
        this.deskripsi = deskripsi;
        this.BranchId = BranchId;
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

    public String getBranchId() {
        return this.BranchId;
    }

    public void setBranchId(String BranchId) {
        this.BranchId = BranchId;
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

    public Program id(Integer id) {
        setId(id);
        return this;
    }

    public Program program(String program) {
        setProgram(program);
        return this;
    }

    public Program produk(Integer produk) {
        setProduk(produk);
        return this;
    }

    public Program deskripsi(String deskripsi) {
        setDeskripsi(deskripsi);
        return this;
    }

    public Program BranchId(String BranchId) {
        setBranchId(BranchId);
        return this;
    }

    public Program biayaAdmin(Integer biayaAdmin) {
        setBiayaAdmin(biayaAdmin);
        return this;
    }

    public Program rateAsuransi(Integer rateAsuransi) {
        setRateAsuransi(rateAsuransi);
        return this;
    }

    public Program rateBunga(Integer rateBunga) {
        setRateBunga(rateBunga);
        return this;
    }

    public Program rateCp(Integer rateCp) {
        setRateCp(rateCp);
        return this;
    }

    public Program minmalDp(Integer minmalDp) {
        setMinmalDp(minmalDp);
        return this;
    }

    public Program komponenph(Integer komponenph) {
        setKomponenph(komponenph);
        return this;
    }

    public Program ratePerluasan(Integer ratePerluasan) {
        setRatePerluasan(ratePerluasan);
        return this;
    }

    public Program biayaProvisi(Integer biayaProvisi) {
        setBiayaProvisi(biayaProvisi);
        return this;
    }

    public Program biayaFidusia(Integer biayaFidusia) {
        setBiayaFidusia(biayaFidusia);
        return this;
    }

    public Program usiaKendaraanLunas(Integer usiaKendaraanLunas) {
        setUsiaKendaraanLunas(usiaKendaraanLunas);
        return this;
    }

    public Program startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public Program endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public Program statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    public Program remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public Program isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public Program isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    public Program createdBy(Long createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public Program createdDate(Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public Program updatedBy(Long updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    public Program updatedDate(Date updatedDate) {
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
            ", BranchId='" + getBranchId() + "'" +
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
