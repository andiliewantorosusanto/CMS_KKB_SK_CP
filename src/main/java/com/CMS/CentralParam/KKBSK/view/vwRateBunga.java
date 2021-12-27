package com.CMS.CentralParam.KKBSK.view;

import java.util.Date;

public class vwRateBunga {

    private Integer id;
    private String namaSkema;

    private Integer loanType;
    private String loanTypeName;

    private Integer jenisKendaraan;
    private String jenisKendaraanName;

    private Integer jenisPembiayaan;
    private String jenisPembiayaanName;

    private Integer cluster;
    private String clusterName;

    private Integer startTahunKendaraan;
    private Integer endTahun;

    private Float tenor1;
    private Float tenor2;
    private Float tenor3;
    private Float tenor4;
    private Integer tenor5Periode1;
    private Integer tenor5Periode2;
    private Float tenor5Rate1;
    private Float tenor5Rate2;
    private Integer tenor6Periode1;
    private Integer tenor6Periode2;
    private Float tenor6Rate1;
    private Float tenor6Rate2;
    private Integer tenor7Periode1;
    private Integer tenor7Periode2;
    private Float tenor7Rate1;
    private Float tenor7Rate2;
    private Integer tenor8Periode1;
    private Integer tenor8Periode2;
    private Float tenor8Rate1;
    private Float tenor8Rate2;
    private Integer tenor9Periode1;
    private Integer tenor9Periode2;
    private Float tenor9Rate1;
    private Float tenor9Rate2;
    private Integer tenor10Periode1;
    private Integer tenor10Periode2;
    private Float tenor10Rate1;
    private Float tenor10Rate2;

    private Date startBerlaku;
    private Date endBerlaku;

    private Integer statusApproval;
    private String remarks;
    private Integer isRejected;
    private Integer isApproved;
    

    public vwRateBunga() {
    }

    public vwRateBunga(Integer id, String namaSkema, Integer loanType, String loanTypeName, Integer jenisKendaraan, String jenisKendaraanName, Integer jenisPembiayaan, String jenisPembiayaanName, Integer cluster, String clusterName, Integer startTahunKendaraan, Integer endTahun, Float tenor1, Float tenor2, Float tenor3, Float tenor4, Integer tenor5Periode1, Integer tenor5Periode2, Float tenor5Rate1, Float tenor5Rate2, Integer tenor6Periode1, Integer tenor6Periode2, Float tenor6Rate1, Float tenor6Rate2, Integer tenor7Periode1, Integer tenor7Periode2, Float tenor7Rate1, Float tenor7Rate2, Integer tenor8Periode1, Integer tenor8Periode2, Float tenor8Rate1, Float tenor8Rate2, Integer tenor9Periode1, Integer tenor9Periode2, Float tenor9Rate1, Float tenor9Rate2, Integer tenor10Periode1, Integer tenor10Periode2, Float tenor10Rate1, Float tenor10Rate2, Date startBerlaku, Date endBerlaku, Integer statusApproval, String remarks, Integer isRejected, Integer isApproved) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.loanType = loanType;
        this.loanTypeName = loanTypeName;
        this.jenisKendaraan = jenisKendaraan;
        this.jenisKendaraanName = jenisKendaraanName;
        this.jenisPembiayaan = jenisPembiayaan;
        this.jenisPembiayaanName = jenisPembiayaanName;
        this.cluster = cluster;
        this.clusterName = clusterName;
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

    public String getLoanTypeName() {
        return this.loanTypeName;
    }

    public void setLoanTypeName(String loanTypeName) {
        this.loanTypeName = loanTypeName;
    }

    public Integer getJenisKendaraan() {
        return this.jenisKendaraan;
    }

    public void setJenisKendaraan(Integer jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getJenisKendaraanName() {
        return this.jenisKendaraanName;
    }

    public void setJenisKendaraanName(String jenisKendaraanName) {
        this.jenisKendaraanName = jenisKendaraanName;
    }

    public Integer getJenisPembiayaan() {
        return this.jenisPembiayaan;
    }

    public void setJenisPembiayaan(Integer jenisPembiayaan) {
        this.jenisPembiayaan = jenisPembiayaan;
    }

    public String getJenisPembiayaanName() {
        return this.jenisPembiayaanName;
    }

    public void setJenisPembiayaanName(String jenisPembiayaanName) {
        this.jenisPembiayaanName = jenisPembiayaanName;
    }

    public Integer getCluster() {
        return this.cluster;
    }

    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    public String getClusterName() {
        return this.clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
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

    public vwRateBunga id(Integer id) {
        setId(id);
        return this;
    }

    public vwRateBunga namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public vwRateBunga loanType(Integer loanType) {
        setLoanType(loanType);
        return this;
    }

    public vwRateBunga loanTypeName(String loanTypeName) {
        setLoanTypeName(loanTypeName);
        return this;
    }

    public vwRateBunga jenisKendaraan(Integer jenisKendaraan) {
        setJenisKendaraan(jenisKendaraan);
        return this;
    }

    public vwRateBunga jenisKendaraanName(String jenisKendaraanName) {
        setJenisKendaraanName(jenisKendaraanName);
        return this;
    }

    public vwRateBunga jenisPembiayaan(Integer jenisPembiayaan) {
        setJenisPembiayaan(jenisPembiayaan);
        return this;
    }

    public vwRateBunga jenisPembiayaanName(String jenisPembiayaanName) {
        setJenisPembiayaanName(jenisPembiayaanName);
        return this;
    }

    public vwRateBunga cluster(Integer cluster) {
        setCluster(cluster);
        return this;
    }

    public vwRateBunga clusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    public vwRateBunga startTahunKendaraan(Integer startTahunKendaraan) {
        setStartTahunKendaraan(startTahunKendaraan);
        return this;
    }

    public vwRateBunga endTahun(Integer endTahun) {
        setEndTahun(endTahun);
        return this;
    }

    public vwRateBunga tenor1(Float tenor1) {
        setTenor1(tenor1);
        return this;
    }

    public vwRateBunga tenor2(Float tenor2) {
        setTenor2(tenor2);
        return this;
    }

    public vwRateBunga tenor3(Float tenor3) {
        setTenor3(tenor3);
        return this;
    }

    public vwRateBunga tenor4(Float tenor4) {
        setTenor4(tenor4);
        return this;
    }

    public vwRateBunga tenor5Periode1(Integer tenor5Periode1) {
        setTenor5Periode1(tenor5Periode1);
        return this;
    }

    public vwRateBunga tenor5Periode2(Integer tenor5Periode2) {
        setTenor5Periode2(tenor5Periode2);
        return this;
    }

    public vwRateBunga tenor5Rate1(Float tenor5Rate1) {
        setTenor5Rate1(tenor5Rate1);
        return this;
    }

    public vwRateBunga tenor5Rate2(Float tenor5Rate2) {
        setTenor5Rate2(tenor5Rate2);
        return this;
    }

    public vwRateBunga tenor6Periode1(Integer tenor6Periode1) {
        setTenor6Periode1(tenor6Periode1);
        return this;
    }

    public vwRateBunga tenor6Periode2(Integer tenor6Periode2) {
        setTenor6Periode2(tenor6Periode2);
        return this;
    }

    public vwRateBunga tenor6Rate1(Float tenor6Rate1) {
        setTenor6Rate1(tenor6Rate1);
        return this;
    }

    public vwRateBunga tenor6Rate2(Float tenor6Rate2) {
        setTenor6Rate2(tenor6Rate2);
        return this;
    }

    public vwRateBunga tenor7Periode1(Integer tenor7Periode1) {
        setTenor7Periode1(tenor7Periode1);
        return this;
    }

    public vwRateBunga tenor7Periode2(Integer tenor7Periode2) {
        setTenor7Periode2(tenor7Periode2);
        return this;
    }

    public vwRateBunga tenor7Rate1(Float tenor7Rate1) {
        setTenor7Rate1(tenor7Rate1);
        return this;
    }

    public vwRateBunga tenor7Rate2(Float tenor7Rate2) {
        setTenor7Rate2(tenor7Rate2);
        return this;
    }

    public vwRateBunga tenor8Periode1(Integer tenor8Periode1) {
        setTenor8Periode1(tenor8Periode1);
        return this;
    }

    public vwRateBunga tenor8Periode2(Integer tenor8Periode2) {
        setTenor8Periode2(tenor8Periode2);
        return this;
    }

    public vwRateBunga tenor8Rate1(Float tenor8Rate1) {
        setTenor8Rate1(tenor8Rate1);
        return this;
    }

    public vwRateBunga tenor8Rate2(Float tenor8Rate2) {
        setTenor8Rate2(tenor8Rate2);
        return this;
    }

    public vwRateBunga tenor9Periode1(Integer tenor9Periode1) {
        setTenor9Periode1(tenor9Periode1);
        return this;
    }

    public vwRateBunga tenor9Periode2(Integer tenor9Periode2) {
        setTenor9Periode2(tenor9Periode2);
        return this;
    }

    public vwRateBunga tenor9Rate1(Float tenor9Rate1) {
        setTenor9Rate1(tenor9Rate1);
        return this;
    }

    public vwRateBunga tenor9Rate2(Float tenor9Rate2) {
        setTenor9Rate2(tenor9Rate2);
        return this;
    }

    public vwRateBunga tenor10Periode1(Integer tenor10Periode1) {
        setTenor10Periode1(tenor10Periode1);
        return this;
    }

    public vwRateBunga tenor10Periode2(Integer tenor10Periode2) {
        setTenor10Periode2(tenor10Periode2);
        return this;
    }

    public vwRateBunga tenor10Rate1(Float tenor10Rate1) {
        setTenor10Rate1(tenor10Rate1);
        return this;
    }

    public vwRateBunga tenor10Rate2(Float tenor10Rate2) {
        setTenor10Rate2(tenor10Rate2);
        return this;
    }

    public vwRateBunga startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public vwRateBunga endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public vwRateBunga statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    public vwRateBunga remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public vwRateBunga isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public vwRateBunga isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            ", loanType='" + getLoanType() + "'" +
            ", loanTypeName='" + getLoanTypeName() + "'" +
            ", jenisKendaraan='" + getJenisKendaraan() + "'" +
            ", jenisKendaraanName='" + getJenisKendaraanName() + "'" +
            ", jenisPembiayaan='" + getJenisPembiayaan() + "'" +
            ", jenisPembiayaanName='" + getJenisPembiayaanName() + "'" +
            ", cluster='" + getCluster() + "'" +
            ", clusterName='" + getClusterName() + "'" +
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
            "}";
    }
    
    

}