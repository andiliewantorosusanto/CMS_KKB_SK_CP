package com.CMS.CentralParam.KKBSK.model.data;

import java.util.Date;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
public class MinimalDP {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("namaSkema")
    private String namaSkema;

    @JsonProperty("loanType")
    private Integer loanType;

    @JsonProperty("produk")
    private Integer produk;

    @JsonProperty("tujuanPenggunaan")
    private Integer tujuanPenggunaan;

    @JsonProperty("tipeKonsumen")
    private Integer tipeKonsumen;

    @JsonProperty("jenisKendaraan")
    private Integer jenisKendaraan;

    @JsonProperty("jenisPembiayaan")
    private Integer jenisPembiayaan;

    @JsonProperty("cluster")
    private Integer cluster;

    @JsonProperty("minimalDp")
    private Float minimalDp;

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


    public MinimalDP() {
    }

    public MinimalDP(Integer id, String namaSkema, Integer loanType, Integer produk, Integer tujuanPenggunaan, Integer tipeKonsumen, Integer jenisKendaraan, Integer jenisPembiayaan, Integer cluster, Float minimalDp, Integer statusApproval, String remarks, Integer isRejected, Integer isApproved, Long createdBy, Date createdDate, Long updatedBy, Date updatedDate) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.loanType = loanType;
        this.produk = produk;
        this.tujuanPenggunaan = tujuanPenggunaan;
        this.tipeKonsumen = tipeKonsumen;
        this.jenisKendaraan = jenisKendaraan;
        this.jenisPembiayaan = jenisPembiayaan;
        this.cluster = cluster;
        this.minimalDp = minimalDp;
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

    public Integer getLoanType() {
        return this.loanType;
    }

    public void setLoanType(Integer loanType) {
        this.loanType = loanType;
    }

    public Integer getProduk() {
        return this.produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    public Integer getTujuanPenggunaan() {
        return this.tujuanPenggunaan;
    }

    public void setTujuanPenggunaan(Integer tujuanPenggunaan) {
        this.tujuanPenggunaan = tujuanPenggunaan;
    }

    public Integer getTipeKonsumen() {
        return this.tipeKonsumen;
    }

    public void setTipeKonsumen(Integer tipeKonsumen) {
        this.tipeKonsumen = tipeKonsumen;
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

    public Integer getCluster() {
        return this.cluster;
    }

    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    public Float getMinimalDp() {
        return this.minimalDp;
    }

    public void setMinimalDp(Float minimalDp) {
        this.minimalDp = minimalDp;
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

    public MinimalDP id(Integer id) {
        setId(id);
        return this;
    }

    public MinimalDP namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public MinimalDP loanType(Integer loanType) {
        setLoanType(loanType);
        return this;
    }

    public MinimalDP produk(Integer produk) {
        setProduk(produk);
        return this;
    }

    public MinimalDP tujuanPenggunaan(Integer tujuanPenggunaan) {
        setTujuanPenggunaan(tujuanPenggunaan);
        return this;
    }

    public MinimalDP tipeKonsumen(Integer tipeKonsumen) {
        setTipeKonsumen(tipeKonsumen);
        return this;
    }

    public MinimalDP jenisKendaraan(Integer jenisKendaraan) {
        setJenisKendaraan(jenisKendaraan);
        return this;
    }

    public MinimalDP jenisPembiayaan(Integer jenisPembiayaan) {
        setJenisPembiayaan(jenisPembiayaan);
        return this;
    }

    public MinimalDP cluster(Integer cluster) {
        setCluster(cluster);
        return this;
    }

    public MinimalDP minimalDp(Float minimalDp) {
        setMinimalDp(minimalDp);
        return this;
    }

    public MinimalDP statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    public MinimalDP remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public MinimalDP isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public MinimalDP isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    public MinimalDP createdBy(Long createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public MinimalDP createdDate(Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public MinimalDP updatedBy(Long updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    public MinimalDP updatedDate(Date updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            ", loanType='" + getLoanType() + "'" +
            ", produk='" + getProduk() + "'" +
            ", tujuanPenggunaan='" + getTujuanPenggunaan() + "'" +
            ", tipeKonsumen='" + getTipeKonsumen() + "'" +
            ", jenisKendaraan='" + getJenisKendaraan() + "'" +
            ", jenisPembiayaan='" + getJenisPembiayaan() + "'" +
            ", cluster='" + getCluster() + "'" +
            ", minimalDp='" + getMinimalDp() + "'" +
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
