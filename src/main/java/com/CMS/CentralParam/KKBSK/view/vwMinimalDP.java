package com.CMS.CentralParam.KKBSK.view;

public class vwMinimalDP {
    private Integer id;

    private String namaSkema;

    private Integer loanType;
    private String loanTypeName;

    private Integer produk;
    private String produkName;

    private Integer tujuanPenggunaan;
    private String tujuanPenggunaanName;

    private Integer tipeKonsumen;
    private String tipeKonsumenName;
    
    private Integer jenisKendaraan;
    private String jenisKendaraanName;

    private Integer jenisPembiayaan;
    private String jenisPembiayaanName;

    private Integer cluster;
    private String clusterName;

    private Float minimalDp;

    private Integer statusApproval;
    private String remarks;
    private Integer isRejected;
    private Integer isApproved;


    public vwMinimalDP() {
    }

    public vwMinimalDP(Integer id, String namaSkema, Integer loanType, String loanTypeName, Integer produk, String produkName, Integer tujuanPenggunaan, String tujuanPenggunaanName, Integer tipeKonsumen, String tipeKonsumenName, Integer jenisKendaraan, String jenisKendaraanName, Integer jenisPembiayaan, String jenisPembiayaanName, Integer cluster, String clusterName, Float minimalDp, Integer statusApproval, String remarks, Integer isRejected, Integer isApproved) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.loanType = loanType;
        this.loanTypeName = loanTypeName;
        this.produk = produk;
        this.produkName = produkName;
        this.tujuanPenggunaan = tujuanPenggunaan;
        this.tujuanPenggunaanName = tujuanPenggunaanName;
        this.tipeKonsumen = tipeKonsumen;
        this.tipeKonsumenName = tipeKonsumenName;
        this.jenisKendaraan = jenisKendaraan;
        this.jenisKendaraanName = jenisKendaraanName;
        this.jenisPembiayaan = jenisPembiayaan;
        this.jenisPembiayaanName = jenisPembiayaanName;
        this.cluster = cluster;
        this.clusterName = clusterName;
        this.minimalDp = minimalDp;
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

    public Integer getTujuanPenggunaan() {
        return this.tujuanPenggunaan;
    }

    public void setTujuanPenggunaan(Integer tujuanPenggunaan) {
        this.tujuanPenggunaan = tujuanPenggunaan;
    }

    public String getTujuanPenggunaanName() {
        return this.tujuanPenggunaanName;
    }

    public void setTujuanPenggunaanName(String tujuanPenggunaanName) {
        this.tujuanPenggunaanName = tujuanPenggunaanName;
    }

    public Integer getTipeKonsumen() {
        return this.tipeKonsumen;
    }

    public void setTipeKonsumen(Integer tipeKonsumen) {
        this.tipeKonsumen = tipeKonsumen;
    }

    public String getTipeKonsumenName() {
        return this.tipeKonsumenName;
    }

    public void setTipeKonsumenName(String tipeKonsumenName) {
        this.tipeKonsumenName = tipeKonsumenName;
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

    public vwMinimalDP id(Integer id) {
        setId(id);
        return this;
    }

    public vwMinimalDP namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public vwMinimalDP loanType(Integer loanType) {
        setLoanType(loanType);
        return this;
    }

    public vwMinimalDP loanTypeName(String loanTypeName) {
        setLoanTypeName(loanTypeName);
        return this;
    }

    public vwMinimalDP produk(Integer produk) {
        setProduk(produk);
        return this;
    }

    public vwMinimalDP produkName(String produkName) {
        setProdukName(produkName);
        return this;
    }

    public vwMinimalDP tujuanPenggunaan(Integer tujuanPenggunaan) {
        setTujuanPenggunaan(tujuanPenggunaan);
        return this;
    }

    public vwMinimalDP tujuanPenggunaanName(String tujuanPenggunaanName) {
        setTujuanPenggunaanName(tujuanPenggunaanName);
        return this;
    }

    public vwMinimalDP tipeKonsumen(Integer tipeKonsumen) {
        setTipeKonsumen(tipeKonsumen);
        return this;
    }

    public vwMinimalDP tipeKonsumenName(String tipeKonsumenName) {
        setTipeKonsumenName(tipeKonsumenName);
        return this;
    }

    public vwMinimalDP jenisKendaraan(Integer jenisKendaraan) {
        setJenisKendaraan(jenisKendaraan);
        return this;
    }

    public vwMinimalDP jenisKendaraanName(String jenisKendaraanName) {
        setJenisKendaraanName(jenisKendaraanName);
        return this;
    }

    public vwMinimalDP jenisPembiayaan(Integer jenisPembiayaan) {
        setJenisPembiayaan(jenisPembiayaan);
        return this;
    }

    public vwMinimalDP jenisPembiayaanName(String jenisPembiayaanName) {
        setJenisPembiayaanName(jenisPembiayaanName);
        return this;
    }

    public vwMinimalDP cluster(Integer cluster) {
        setCluster(cluster);
        return this;
    }

    public vwMinimalDP clusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    public vwMinimalDP minimalDp(Float minimalDp) {
        setMinimalDp(minimalDp);
        return this;
    }

    public vwMinimalDP statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    public vwMinimalDP remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public vwMinimalDP isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public vwMinimalDP isApproved(Integer isApproved) {
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
            ", produk='" + getProduk() + "'" +
            ", produkName='" + getProdukName() + "'" +
            ", tujuanPenggunaan='" + getTujuanPenggunaan() + "'" +
            ", tujuanPenggunaanName='" + getTujuanPenggunaanName() + "'" +
            ", tipeKonsumen='" + getTipeKonsumen() + "'" +
            ", tipeKonsumenName='" + getTipeKonsumenName() + "'" +
            ", jenisKendaraan='" + getJenisKendaraan() + "'" +
            ", jenisKendaraanName='" + getJenisKendaraanName() + "'" +
            ", jenisPembiayaan='" + getJenisPembiayaan() + "'" +
            ", jenisPembiayaanName='" + getJenisPembiayaanName() + "'" +
            ", cluster='" + getCluster() + "'" +
            ", clusterName='" + getClusterName() + "'" +
            ", minimalDp='" + getMinimalDp() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", isRejected='" + getIsRejected() + "'" +
            ", isApproved='" + getIsApproved() + "'" +
            "}";
    }

    

}