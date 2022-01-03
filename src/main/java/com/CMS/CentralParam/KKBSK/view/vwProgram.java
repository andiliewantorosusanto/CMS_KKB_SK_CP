package com.CMS.CentralParam.KKBSK.view;

import java.util.Date;

public class vwProgram {

    private Integer id;

    private String program;
    private String deskripsi;

    private Integer produk;
    private String produkName;

    private String branch;
    private String branchName;

    private Integer rateAsuransi;
    private String rateAsuransiName;

    private Integer ratePerluasan;
    private String ratePerluasanName;

    private Integer rateCp;
    private String rateCpName;

    private Integer rateBunga;
    private String rateBungaName;

    private Integer biayaAdmin;
    private String BiayaAdminName;

    private Integer biayaProvisi;
    private String biayaProvisiName;

    private Integer minmalDp;
    private String minimalDpName;

    private Integer biayaFidusia;
    private String biayaFidusiaName;

    private Integer komponenPh;
    private String komponenPhName;

    private Integer usiaKendaraanLunas;
    private String usiaKendaraanLunasName;

    private Date startBerlaku;
    private Date endBerlaku;

    private Integer statusApproval;
    private String remarks;
    private Integer isRejected;
    private Integer isApproved;
    

    public vwProgram() {
        
    }

    public vwProgram(Integer id, String program, String deskripsi, Integer produk, String produkName, String branch, String branchName, Integer rateAsuransi, String rateAsuransiName, Integer ratePerluasan, String ratePerluasanName, Integer rateCp, String rateCpName, Integer rateBunga, String rateBungaName, Integer biayaAdmin, String BiayaAdminName, Integer biayaProvisi, String biayaProvisiName, Integer minmalDp, String minimalDpName, Integer biayaFidusia, String biayaFidusiaName, Integer komponenPh, String komponenPhName, Integer usiaKendaraanLunas, String usiaKendaraanLunasName, Date startBerlaku, Date endBerlaku, Integer statusApproval, String remarks, Integer isRejected, Integer isApproved) {
        this.id = id;
        this.program = program;
        this.deskripsi = deskripsi;
        this.produk = produk;
        this.produkName = produkName;
        this.branch = branch;
        this.branchName = branchName;
        this.rateAsuransi = rateAsuransi;
        this.rateAsuransiName = rateAsuransiName;
        this.ratePerluasan = ratePerluasan;
        this.ratePerluasanName = ratePerluasanName;
        this.rateCp = rateCp;
        this.rateCpName = rateCpName;
        this.rateBunga = rateBunga;
        this.rateBungaName = rateBungaName;
        this.biayaAdmin = biayaAdmin;
        this.BiayaAdminName = BiayaAdminName;
        this.biayaProvisi = biayaProvisi;
        this.biayaProvisiName = biayaProvisiName;
        this.minmalDp = minmalDp;
        this.minimalDpName = minimalDpName;
        this.biayaFidusia = biayaFidusia;
        this.biayaFidusiaName = biayaFidusiaName;
        this.komponenPh = komponenPh;
        this.komponenPhName = komponenPhName;
        this.usiaKendaraanLunas = usiaKendaraanLunas;
        this.usiaKendaraanLunasName = usiaKendaraanLunasName;
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

    public String getProgram() {
        return this.program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getDeskripsi() {
        return this.deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Integer getProduk() {
        return this.produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    public String getProdukName() {
        return this.produkName;
    }

    public void setProdukName(String produkName) {
        this.produkName = produkName;
    }

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getBranchName() {
        return this.branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public Integer getRateAsuransi() {
        return this.rateAsuransi;
    }

    public void setRateAsuransi(Integer rateAsuransi) {
        this.rateAsuransi = rateAsuransi;
    }

    public String getRateAsuransiName() {
        return this.rateAsuransiName;
    }

    public void setRateAsuransiName(String rateAsuransiName) {
        this.rateAsuransiName = rateAsuransiName;
    }

    public Integer getRatePerluasan() {
        return this.ratePerluasan;
    }

    public void setRatePerluasan(Integer ratePerluasan) {
        this.ratePerluasan = ratePerluasan;
    }

    public String getRatePerluasanName() {
        return this.ratePerluasanName;
    }

    public void setRatePerluasanName(String ratePerluasanName) {
        this.ratePerluasanName = ratePerluasanName;
    }

    public Integer getRateCp() {
        return this.rateCp;
    }

    public void setRateCp(Integer rateCp) {
        this.rateCp = rateCp;
    }

    public String getRateCpName() {
        return this.rateCpName;
    }

    public void setRateCpName(String rateCpName) {
        this.rateCpName = rateCpName;
    }

    public Integer getRateBunga() {
        return this.rateBunga;
    }

    public void setRateBunga(Integer rateBunga) {
        this.rateBunga = rateBunga;
    }

    public String getRateBungaName() {
        return this.rateBungaName;
    }

    public void setRateBungaName(String rateBungaName) {
        this.rateBungaName = rateBungaName;
    }

    public Integer getBiayaAdmin() {
        return this.biayaAdmin;
    }

    public void setBiayaAdmin(Integer biayaAdmin) {
        this.biayaAdmin = biayaAdmin;
    }

    public String getBiayaAdminName() {
        return this.BiayaAdminName;
    }

    public void setBiayaAdminName(String BiayaAdminName) {
        this.BiayaAdminName = BiayaAdminName;
    }

    public Integer getBiayaProvisi() {
        return this.biayaProvisi;
    }

    public void setBiayaProvisi(Integer biayaProvisi) {
        this.biayaProvisi = biayaProvisi;
    }

    public String getBiayaProvisiName() {
        return this.biayaProvisiName;
    }

    public void setBiayaProvisiName(String biayaProvisiName) {
        this.biayaProvisiName = biayaProvisiName;
    }

    public Integer getMinmalDp() {
        return this.minmalDp;
    }

    public void setMinmalDp(Integer minmalDp) {
        this.minmalDp = minmalDp;
    }

    public String getMinimalDpName() {
        return this.minimalDpName;
    }

    public void setMinimalDpName(String minimalDpName) {
        this.minimalDpName = minimalDpName;
    }

    public Integer getBiayaFidusia() {
        return this.biayaFidusia;
    }

    public void setBiayaFidusia(Integer biayaFidusia) {
        this.biayaFidusia = biayaFidusia;
    }

    public String getBiayaFidusiaName() {
        return this.biayaFidusiaName;
    }

    public void setBiayaFidusiaName(String biayaFidusiaName) {
        this.biayaFidusiaName = biayaFidusiaName;
    }

    public Integer getKomponenPh() {
        return this.komponenPh;
    }

    public void setKomponenPh(Integer komponenPh) {
        this.komponenPh = komponenPh;
    }

    public String getKomponenPhName() {
        return this.komponenPhName;
    }

    public void setKomponenPhName(String komponenPhName) {
        this.komponenPhName = komponenPhName;
    }

    public Integer getUsiaKendaraanLunas() {
        return this.usiaKendaraanLunas;
    }

    public void setUsiaKendaraanLunas(Integer usiaKendaraanLunas) {
        this.usiaKendaraanLunas = usiaKendaraanLunas;
    }

    public String getUsiaKendaraanLunasName() {
        return this.usiaKendaraanLunasName;
    }

    public void setUsiaKendaraanLunasName(String usiaKendaraanLunasName) {
        this.usiaKendaraanLunasName = usiaKendaraanLunasName;
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

    public vwProgram id(Integer id) {
        setId(id);
        return this;
    }

    public vwProgram program(String program) {
        setProgram(program);
        return this;
    }

    public vwProgram deskripsi(String deskripsi) {
        setDeskripsi(deskripsi);
        return this;
    }

    public vwProgram produk(Integer produk) {
        setProduk(produk);
        return this;
    }

    public vwProgram produkName(String produkName) {
        setProdukName(produkName);
        return this;
    }

    public vwProgram branch(String branch) {
        setBranch(branch);
        return this;
    }

    public vwProgram branchName(String branchName) {
        setBranchName(branchName);
        return this;
    }

    public vwProgram rateAsuransi(Integer rateAsuransi) {
        setRateAsuransi(rateAsuransi);
        return this;
    }

    public vwProgram rateAsuransiName(String rateAsuransiName) {
        setRateAsuransiName(rateAsuransiName);
        return this;
    }

    public vwProgram ratePerluasan(Integer ratePerluasan) {
        setRatePerluasan(ratePerluasan);
        return this;
    }

    public vwProgram ratePerluasanName(String ratePerluasanName) {
        setRatePerluasanName(ratePerluasanName);
        return this;
    }

    public vwProgram rateCp(Integer rateCp) {
        setRateCp(rateCp);
        return this;
    }

    public vwProgram rateCpName(String rateCpName) {
        setRateCpName(rateCpName);
        return this;
    }

    public vwProgram rateBunga(Integer rateBunga) {
        setRateBunga(rateBunga);
        return this;
    }

    public vwProgram rateBungaName(String rateBungaName) {
        setRateBungaName(rateBungaName);
        return this;
    }

    public vwProgram biayaAdmin(Integer biayaAdmin) {
        setBiayaAdmin(biayaAdmin);
        return this;
    }

    public vwProgram BiayaAdminName(String BiayaAdminName) {
        setBiayaAdminName(BiayaAdminName);
        return this;
    }

    public vwProgram biayaProvisi(Integer biayaProvisi) {
        setBiayaProvisi(biayaProvisi);
        return this;
    }

    public vwProgram biayaProvisiName(String biayaProvisiName) {
        setBiayaProvisiName(biayaProvisiName);
        return this;
    }

    public vwProgram minmalDp(Integer minmalDp) {
        setMinmalDp(minmalDp);
        return this;
    }

    public vwProgram minimalDpName(String minimalDpName) {
        setMinimalDpName(minimalDpName);
        return this;
    }

    public vwProgram biayaFidusia(Integer biayaFidusia) {
        setBiayaFidusia(biayaFidusia);
        return this;
    }

    public vwProgram biayaFidusiaName(String biayaFidusiaName) {
        setBiayaFidusiaName(biayaFidusiaName);
        return this;
    }

    public vwProgram komponenPh(Integer komponenPh) {
        setKomponenPh(komponenPh);
        return this;
    }

    public vwProgram komponenPhName(String komponenPhName) {
        setKomponenPhName(komponenPhName);
        return this;
    }

    public vwProgram usiaKendaraanLunas(Integer usiaKendaraanLunas) {
        setUsiaKendaraanLunas(usiaKendaraanLunas);
        return this;
    }

    public vwProgram usiaKendaraanLunasName(String usiaKendaraanLunasName) {
        setUsiaKendaraanLunasName(usiaKendaraanLunasName);
        return this;
    }

    public vwProgram startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public vwProgram endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public vwProgram statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    public vwProgram remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public vwProgram isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public vwProgram isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", program='" + getProgram() + "'" +
            ", deskripsi='" + getDeskripsi() + "'" +
            ", produk='" + getProduk() + "'" +
            ", produkName='" + getProdukName() + "'" +
            ", branch='" + getBranch() + "'" +
            ", branchName='" + getBranchName() + "'" +
            ", rateAsuransi='" + getRateAsuransi() + "'" +
            ", rateAsuransiName='" + getRateAsuransiName() + "'" +
            ", ratePerluasan='" + getRatePerluasan() + "'" +
            ", ratePerluasanName='" + getRatePerluasanName() + "'" +
            ", rateCp='" + getRateCp() + "'" +
            ", rateCpName='" + getRateCpName() + "'" +
            ", rateBunga='" + getRateBunga() + "'" +
            ", rateBungaName='" + getRateBungaName() + "'" +
            ", biayaAdmin='" + getBiayaAdmin() + "'" +
            ", BiayaAdminName='" + getBiayaAdminName() + "'" +
            ", biayaProvisi='" + getBiayaProvisi() + "'" +
            ", biayaProvisiName='" + getBiayaProvisiName() + "'" +
            ", minmalDp='" + getMinmalDp() + "'" +
            ", minimalDpName='" + getMinimalDpName() + "'" +
            ", biayaFidusia='" + getBiayaFidusia() + "'" +
            ", biayaFidusiaName='" + getBiayaFidusiaName() + "'" +
            ", komponenPh='" + getKomponenPh() + "'" +
            ", komponenPhName='" + getKomponenPhName() + "'" +
            ", usiaKendaraanLunas='" + getUsiaKendaraanLunas() + "'" +
            ", usiaKendaraanLunasName='" + getUsiaKendaraanLunasName() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", isRejected='" + getIsRejected() + "'" +
            ", isApproved='" + getIsApproved() + "'" +
            "}";
    }

}