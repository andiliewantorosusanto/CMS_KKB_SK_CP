package com.CMS.CentralParam.KKBSK.model.data;


import java.util.Date;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.format.annotation.DateTimeFormat;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class RateBunga {

    @JsonProperty("ID")
    private Integer id;
    @JsonProperty("namaSkema")
    private String namaSkema;
    @JsonProperty("loanType")
    private Integer loanType;

    @JsonProperty("produk")
    private Integer produk;
    @JsonProperty("jenisKendaraan")
    private Integer jenisKendaraan;
    @JsonProperty("kondisiKendaraan")
    private Integer kondisiKendaraan;
    @JsonProperty("jenisPembiayaan")
    private Integer jenisPembiayaan;
    @JsonProperty("tujuanPenggunaan")
    private Integer tujuanPenggunaan;
    @JsonProperty("cluster")
    private Integer cluster;
    @JsonProperty("program")
    private Integer program;
    @JsonProperty("tipeKonsumen")
    private Integer tipeKonsumen;

    @JsonProperty("startTahunKendaraan")
    private Integer startTahunKendaraan;
    @JsonProperty("endTahun")
    private Integer endTahun;


    @JsonProperty("tenor1")
    private Float tenor1;
    @JsonProperty("tenor2")
    private Float tenor2;
    @JsonProperty("tenor3")
    private Float tenor3;
    @JsonProperty("tenor4")
    private Float tenor4;

    @JsonProperty("tenor5periode1")
    private Integer tenor5Periode1;
    @JsonProperty("tenor5periode2")
    private Integer tenor5Periode2;

    @JsonProperty("tenor5rate1")
    private Float tenor5Rate1;
    @JsonProperty("tenor5rate2")
    private Float tenor5Rate2;

    @JsonProperty("tenor6periode1")
    private Integer tenor6Periode1;
    @JsonProperty("tenor6periode2")
    private Integer tenor6Periode2;

    @JsonProperty("tenor6rate1")
    private Float tenor6Rate1;
    @JsonProperty("tenor6rate2")
    private Float tenor6Rate2;

    @JsonProperty("tenor7periode1")
    private Integer tenor7Periode1;
    @JsonProperty("tenor7periode2")
    private Integer tenor7Periode2;

    @JsonProperty("tenor7rate1")
    private Float tenor7Rate1;
    @JsonProperty("tenor7rate2")
    private Float tenor7Rate2;

    @JsonProperty("tenor8periode1")
    private Integer tenor8Periode1;
    @JsonProperty("tenor8periode2")
    private Integer tenor8Periode2;

    @JsonProperty("tenor8rate1")
    private Float tenor8Rate1;
    @JsonProperty("tenor8rate2")
    private Float tenor8Rate2;

    @JsonProperty("tenor9periode1")
    private Integer tenor9Periode1;
    @JsonProperty("tenor9periode2")
    private Integer tenor9Periode2;

    @JsonProperty("tenor9rate1")
    private Float tenor9Rate1;
    @JsonProperty("tenor9rate2")
    private Float tenor9Rate2;

    @JsonProperty("tenor10periode1")
    private Integer tenor10Periode1;
    @JsonProperty("tenor10periode2")
    private Integer tenor10Periode2;

    @JsonProperty("tenor10rate1")
    private Float tenor10Rate1;
    @JsonProperty("tenor10rate2")
    private Float tenor10Rate2;

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



    public RateBunga() {
    }

    public RateBunga(Integer id, String namaSkema, Integer loanType, Integer produk, Integer jenisKendaraan, Integer kondisiKendaraan, Integer jenisPembiayaan, Integer tujuanPenggunaan, Integer cluster, Integer program, Integer tipeKonsumen, Integer startTahunKendaraan, Integer endTahun, Float tenor1, Float tenor2, Float tenor3, Float tenor4, Integer tenor5Periode1, Integer tenor5Periode2, Float tenor5Rate1, Float tenor5Rate2, Integer tenor6Periode1, Integer tenor6Periode2, Float tenor6Rate1, Float tenor6Rate2, Integer tenor7Periode1, Integer tenor7Periode2, Float tenor7Rate1, Float tenor7Rate2, Integer tenor8Periode1, Integer tenor8Periode2, Float tenor8Rate1, Float tenor8Rate2, Integer tenor9Periode1, Integer tenor9Periode2, Float tenor9Rate1, Float tenor9Rate2, Integer tenor10Periode1, Integer tenor10Periode2, Float tenor10Rate1, Float tenor10Rate2, Date startBerlaku, Date endBerlaku, Integer statusApproval, String remarks, Integer isRejected, Integer isApproved, Long createdBy, Date createdDate, Long updatedBy, Date updatedDate) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.loanType = loanType;
        this.produk = produk;
        this.jenisKendaraan = jenisKendaraan;
        this.kondisiKendaraan = kondisiKendaraan;
        this.jenisPembiayaan = jenisPembiayaan;
        this.tujuanPenggunaan = tujuanPenggunaan;
        this.cluster = cluster;
        this.program = program;
        this.tipeKonsumen = tipeKonsumen;
        this.startTahunKendaraan = startTahunKendaraan;
        this.endTahun = endTahun;
        this.tenor1 = tenor1;
        this.tenor2 = tenor2;
        this.tenor3 = tenor3;
        this.tenor4 = tenor4;
        this.tenor5Periode1 = tenor5Periode1;
        this.tenor5Periode2 = tenor5Periode2;
        this.tenor5Rate1 = tenor5Rate1;
        this.tenor5Rate2 = tenor5Rate2;
        this.tenor6Periode1 = tenor6Periode1;
        this.tenor6Periode2 = tenor6Periode2;
        this.tenor6Rate1 = tenor6Rate1;
        this.tenor6Rate2 = tenor6Rate2;
        this.tenor7Periode1 = tenor7Periode1;
        this.tenor7Periode2 = tenor7Periode2;
        this.tenor7Rate1 = tenor7Rate1;
        this.tenor7Rate2 = tenor7Rate2;
        this.tenor8Periode1 = tenor8Periode1;
        this.tenor8Periode2 = tenor8Periode2;
        this.tenor8Rate1 = tenor8Rate1;
        this.tenor8Rate2 = tenor8Rate2;
        this.tenor9Periode1 = tenor9Periode1;
        this.tenor9Periode2 = tenor9Periode2;
        this.tenor9Rate1 = tenor9Rate1;
        this.tenor9Rate2 = tenor9Rate2;
        this.tenor10Periode1 = tenor10Periode1;
        this.tenor10Periode2 = tenor10Periode2;
        this.tenor10Rate1 = tenor10Rate1;
        this.tenor10Rate2 = tenor10Rate2;
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

    public Integer getJenisKendaraan() {
        return this.jenisKendaraan;
    }

    public void setJenisKendaraan(Integer jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public Integer getKondisiKendaraan() {
        return this.kondisiKendaraan;
    }

    public void setKondisiKendaraan(Integer kondisiKendaraan) {
        this.kondisiKendaraan = kondisiKendaraan;
    }

    public Integer getJenisPembiayaan() {
        return this.jenisPembiayaan;
    }

    public void setJenisPembiayaan(Integer jenisPembiayaan) {
        this.jenisPembiayaan = jenisPembiayaan;
    }

    public Integer getTujuanPenggunaan() {
        return this.tujuanPenggunaan;
    }

    public void setTujuanPenggunaan(Integer tujuanPenggunaan) {
        this.tujuanPenggunaan = tujuanPenggunaan;
    }

    public Integer getCluster() {
        return this.cluster;
    }

    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    public Integer getProgram() {
        return this.program;
    }

    public void setProgram(Integer program) {
        this.program = program;
    }

    public Integer getTipeKonsumen() {
        return this.tipeKonsumen;
    }

    public void setTipeKonsumen(Integer tipeKonsumen) {
        this.tipeKonsumen = tipeKonsumen;
    }

    public Integer getStartTahunKendaraan() {
        return this.startTahunKendaraan;
    }

    public void setStartTahunKendaraan(Integer startTahunKendaraan) {
        this.startTahunKendaraan = startTahunKendaraan;
    }

    public Integer getEndTahun() {
        return this.endTahun;
    }

    public void setEndTahun(Integer endTahun) {
        this.endTahun = endTahun;
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

    public Integer getTenor5Periode1() {
        return this.tenor5Periode1;
    }

    public void setTenor5Periode1(Integer tenor5Periode1) {
        this.tenor5Periode1 = tenor5Periode1;
    }

    public Integer getTenor5Periode2() {
        return this.tenor5Periode2;
    }

    public void setTenor5Periode2(Integer tenor5Periode2) {
        this.tenor5Periode2 = tenor5Periode2;
    }

    public Float getTenor5Rate1() {
        return this.tenor5Rate1;
    }

    public void setTenor5Rate1(Float tenor5Rate1) {
        this.tenor5Rate1 = tenor5Rate1;
    }

    public Float getTenor5Rate2() {
        return this.tenor5Rate2;
    }

    public void setTenor5Rate2(Float tenor5Rate2) {
        this.tenor5Rate2 = tenor5Rate2;
    }

    public Integer getTenor6Periode1() {
        return this.tenor6Periode1;
    }

    public void setTenor6Periode1(Integer tenor6Periode1) {
        this.tenor6Periode1 = tenor6Periode1;
    }

    public Integer getTenor6Periode2() {
        return this.tenor6Periode2;
    }

    public void setTenor6Periode2(Integer tenor6Periode2) {
        this.tenor6Periode2 = tenor6Periode2;
    }

    public Float getTenor6Rate1() {
        return this.tenor6Rate1;
    }

    public void setTenor6Rate1(Float tenor6Rate1) {
        this.tenor6Rate1 = tenor6Rate1;
    }

    public Float getTenor6Rate2() {
        return this.tenor6Rate2;
    }

    public void setTenor6Rate2(Float tenor6Rate2) {
        this.tenor6Rate2 = tenor6Rate2;
    }

    public Integer getTenor7Periode1() {
        return this.tenor7Periode1;
    }

    public void setTenor7Periode1(Integer tenor7Periode1) {
        this.tenor7Periode1 = tenor7Periode1;
    }

    public Integer getTenor7Periode2() {
        return this.tenor7Periode2;
    }

    public void setTenor7Periode2(Integer tenor7Periode2) {
        this.tenor7Periode2 = tenor7Periode2;
    }

    public Float getTenor7Rate1() {
        return this.tenor7Rate1;
    }

    public void setTenor7Rate1(Float tenor7Rate1) {
        this.tenor7Rate1 = tenor7Rate1;
    }

    public Float getTenor7Rate2() {
        return this.tenor7Rate2;
    }

    public void setTenor7Rate2(Float tenor7Rate2) {
        this.tenor7Rate2 = tenor7Rate2;
    }

    public Integer getTenor8Periode1() {
        return this.tenor8Periode1;
    }

    public void setTenor8Periode1(Integer tenor8Periode1) {
        this.tenor8Periode1 = tenor8Periode1;
    }

    public Integer getTenor8Periode2() {
        return this.tenor8Periode2;
    }

    public void setTenor8Periode2(Integer tenor8Periode2) {
        this.tenor8Periode2 = tenor8Periode2;
    }

    public Float getTenor8Rate1() {
        return this.tenor8Rate1;
    }

    public void setTenor8Rate1(Float tenor8Rate1) {
        this.tenor8Rate1 = tenor8Rate1;
    }

    public Float getTenor8Rate2() {
        return this.tenor8Rate2;
    }

    public void setTenor8Rate2(Float tenor8Rate2) {
        this.tenor8Rate2 = tenor8Rate2;
    }

    public Integer getTenor9Periode1() {
        return this.tenor9Periode1;
    }

    public void setTenor9Periode1(Integer tenor9Periode1) {
        this.tenor9Periode1 = tenor9Periode1;
    }

    public Integer getTenor9Periode2() {
        return this.tenor9Periode2;
    }

    public void setTenor9Periode2(Integer tenor9Periode2) {
        this.tenor9Periode2 = tenor9Periode2;
    }

    public Float getTenor9Rate1() {
        return this.tenor9Rate1;
    }

    public void setTenor9Rate1(Float tenor9Rate1) {
        this.tenor9Rate1 = tenor9Rate1;
    }

    public Float getTenor9Rate2() {
        return this.tenor9Rate2;
    }

    public void setTenor9Rate2(Float tenor9Rate2) {
        this.tenor9Rate2 = tenor9Rate2;
    }

    public Integer getTenor10Periode1() {
        return this.tenor10Periode1;
    }

    public void setTenor10Periode1(Integer tenor10Periode1) {
        this.tenor10Periode1 = tenor10Periode1;
    }

    public Integer getTenor10Periode2() {
        return this.tenor10Periode2;
    }

    public void setTenor10Periode2(Integer tenor10Periode2) {
        this.tenor10Periode2 = tenor10Periode2;
    }

    public Float getTenor10Rate1() {
        return this.tenor10Rate1;
    }

    public void setTenor10Rate1(Float tenor10Rate1) {
        this.tenor10Rate1 = tenor10Rate1;
    }

    public Float getTenor10Rate2() {
        return this.tenor10Rate2;
    }

    public void setTenor10Rate2(Float tenor10Rate2) {
        this.tenor10Rate2 = tenor10Rate2;
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

    public RateBunga id(Integer id) {
        setId(id);
        return this;
    }

    public RateBunga namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public RateBunga loanType(Integer loanType) {
        setLoanType(loanType);
        return this;
    }

    public RateBunga produk(Integer produk) {
        setProduk(produk);
        return this;
    }

    public RateBunga jenisKendaraan(Integer jenisKendaraan) {
        setJenisKendaraan(jenisKendaraan);
        return this;
    }

    public RateBunga kondisiKendaraan(Integer kondisiKendaraan) {
        setKondisiKendaraan(kondisiKendaraan);
        return this;
    }

    public RateBunga jenisPembiayaan(Integer jenisPembiayaan) {
        setJenisPembiayaan(jenisPembiayaan);
        return this;
    }

    public RateBunga tujuanPenggunaan(Integer tujuanPenggunaan) {
        setTujuanPenggunaan(tujuanPenggunaan);
        return this;
    }

    public RateBunga cluster(Integer cluster) {
        setCluster(cluster);
        return this;
    }

    public RateBunga program(Integer program) {
        setProgram(program);
        return this;
    }

    public RateBunga tipeKonsumen(Integer tipeKonsumen) {
        setTipeKonsumen(tipeKonsumen);
        return this;
    }

    public RateBunga startTahunKendaraan(Integer startTahunKendaraan) {
        setStartTahunKendaraan(startTahunKendaraan);
        return this;
    }

    public RateBunga endTahun(Integer endTahun) {
        setEndTahun(endTahun);
        return this;
    }

    public RateBunga tenor1(Float tenor1) {
        setTenor1(tenor1);
        return this;
    }

    public RateBunga tenor2(Float tenor2) {
        setTenor2(tenor2);
        return this;
    }

    public RateBunga tenor3(Float tenor3) {
        setTenor3(tenor3);
        return this;
    }

    public RateBunga tenor4(Float tenor4) {
        setTenor4(tenor4);
        return this;
    }

    public RateBunga tenor5Periode1(Integer tenor5Periode1) {
        setTenor5Periode1(tenor5Periode1);
        return this;
    }

    public RateBunga tenor5Periode2(Integer tenor5Periode2) {
        setTenor5Periode2(tenor5Periode2);
        return this;
    }

    public RateBunga tenor5Rate1(Float tenor5Rate1) {
        setTenor5Rate1(tenor5Rate1);
        return this;
    }

    public RateBunga tenor5Rate2(Float tenor5Rate2) {
        setTenor5Rate2(tenor5Rate2);
        return this;
    }

    public RateBunga tenor6Periode1(Integer tenor6Periode1) {
        setTenor6Periode1(tenor6Periode1);
        return this;
    }

    public RateBunga tenor6Periode2(Integer tenor6Periode2) {
        setTenor6Periode2(tenor6Periode2);
        return this;
    }

    public RateBunga tenor6Rate1(Float tenor6Rate1) {
        setTenor6Rate1(tenor6Rate1);
        return this;
    }

    public RateBunga tenor6Rate2(Float tenor6Rate2) {
        setTenor6Rate2(tenor6Rate2);
        return this;
    }

    public RateBunga tenor7Periode1(Integer tenor7Periode1) {
        setTenor7Periode1(tenor7Periode1);
        return this;
    }

    public RateBunga tenor7Periode2(Integer tenor7Periode2) {
        setTenor7Periode2(tenor7Periode2);
        return this;
    }

    public RateBunga tenor7Rate1(Float tenor7Rate1) {
        setTenor7Rate1(tenor7Rate1);
        return this;
    }

    public RateBunga tenor7Rate2(Float tenor7Rate2) {
        setTenor7Rate2(tenor7Rate2);
        return this;
    }

    public RateBunga tenor8Periode1(Integer tenor8Periode1) {
        setTenor8Periode1(tenor8Periode1);
        return this;
    }

    public RateBunga tenor8Periode2(Integer tenor8Periode2) {
        setTenor8Periode2(tenor8Periode2);
        return this;
    }

    public RateBunga tenor8Rate1(Float tenor8Rate1) {
        setTenor8Rate1(tenor8Rate1);
        return this;
    }

    public RateBunga tenor8Rate2(Float tenor8Rate2) {
        setTenor8Rate2(tenor8Rate2);
        return this;
    }

    public RateBunga tenor9Periode1(Integer tenor9Periode1) {
        setTenor9Periode1(tenor9Periode1);
        return this;
    }

    public RateBunga tenor9Periode2(Integer tenor9Periode2) {
        setTenor9Periode2(tenor9Periode2);
        return this;
    }

    public RateBunga tenor9Rate1(Float tenor9Rate1) {
        setTenor9Rate1(tenor9Rate1);
        return this;
    }

    public RateBunga tenor9Rate2(Float tenor9Rate2) {
        setTenor9Rate2(tenor9Rate2);
        return this;
    }

    public RateBunga tenor10Periode1(Integer tenor10Periode1) {
        setTenor10Periode1(tenor10Periode1);
        return this;
    }

    public RateBunga tenor10Periode2(Integer tenor10Periode2) {
        setTenor10Periode2(tenor10Periode2);
        return this;
    }

    public RateBunga tenor10Rate1(Float tenor10Rate1) {
        setTenor10Rate1(tenor10Rate1);
        return this;
    }

    public RateBunga tenor10Rate2(Float tenor10Rate2) {
        setTenor10Rate2(tenor10Rate2);
        return this;
    }

    public RateBunga startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public RateBunga endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public RateBunga statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    public RateBunga remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public RateBunga isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public RateBunga isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    public RateBunga createdBy(Long createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public RateBunga createdDate(Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public RateBunga updatedBy(Long updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    public RateBunga updatedDate(Date updatedDate) {
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
            ", jenisKendaraan='" + getJenisKendaraan() + "'" +
            ", kondisiKendaraan='" + getKondisiKendaraan() + "'" +
            ", jenisPembiayaan='" + getJenisPembiayaan() + "'" +
            ", tujuanPenggunaan='" + getTujuanPenggunaan() + "'" +
            ", cluster='" + getCluster() + "'" +
            ", program='" + getProgram() + "'" +
            ", tipeKonsumen='" + getTipeKonsumen() + "'" +
            ", startTahunKendaraan='" + getStartTahunKendaraan() + "'" +
            ", endTahun='" + getEndTahun() + "'" +
            ", tenor1='" + getTenor1() + "'" +
            ", tenor2='" + getTenor2() + "'" +
            ", tenor3='" + getTenor3() + "'" +
            ", tenor4='" + getTenor4() + "'" +
            ", tenor5Periode1='" + getTenor5Periode1() + "'" +
            ", tenor5Periode2='" + getTenor5Periode2() + "'" +
            ", tenor5Rate1='" + getTenor5Rate1() + "'" +
            ", tenor5Rate2='" + getTenor5Rate2() + "'" +
            ", tenor6Periode1='" + getTenor6Periode1() + "'" +
            ", tenor6Periode2='" + getTenor6Periode2() + "'" +
            ", tenor6Rate1='" + getTenor6Rate1() + "'" +
            ", tenor6Rate2='" + getTenor6Rate2() + "'" +
            ", tenor7Periode1='" + getTenor7Periode1() + "'" +
            ", tenor7Periode2='" + getTenor7Periode2() + "'" +
            ", tenor7Rate1='" + getTenor7Rate1() + "'" +
            ", tenor7Rate2='" + getTenor7Rate2() + "'" +
            ", tenor8Periode1='" + getTenor8Periode1() + "'" +
            ", tenor8Periode2='" + getTenor8Periode2() + "'" +
            ", tenor8Rate1='" + getTenor8Rate1() + "'" +
            ", tenor8Rate2='" + getTenor8Rate2() + "'" +
            ", tenor9Periode1='" + getTenor9Periode1() + "'" +
            ", tenor9Periode2='" + getTenor9Periode2() + "'" +
            ", tenor9Rate1='" + getTenor9Rate1() + "'" +
            ", tenor9Rate2='" + getTenor9Rate2() + "'" +
            ", tenor10Periode1='" + getTenor10Periode1() + "'" +
            ", tenor10Periode2='" + getTenor10Periode2() + "'" +
            ", tenor10Rate1='" + getTenor10Rate1() + "'" +
            ", tenor10Rate2='" + getTenor10Rate2() + "'" +
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
