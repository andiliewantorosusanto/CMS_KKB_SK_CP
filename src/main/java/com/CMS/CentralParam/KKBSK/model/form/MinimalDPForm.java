
package com.CMS.CentralParam.KKBSK.model.form;

import java.util.ArrayList;


public class MinimalDPForm {
    
    private Integer id;
    private String namaSkema;
    private Integer loanType;

    private ArrayList<Integer> produk;

    private Integer tujuanPenggunaan;

    private Integer tipeKonsumen;

    private Integer jenisKendaraan;

    private ArrayList<Integer> jenisPembiayaan;

    private ArrayList<Integer> cluster;

    private Float minimalDp;


    public MinimalDPForm() {
    }

    public MinimalDPForm(Integer id, String namaSkema, Integer loanType, ArrayList<Integer> produk, Integer tujuanPenggunaan, Integer tipeKonsumen, Integer jenisKendaraan, ArrayList<Integer> jenisPembiayaan, ArrayList<Integer> cluster, Float minimalDp) {
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

    public ArrayList<Integer> getProduk() {
        return this.produk;
    }

    public void setProduk(ArrayList<Integer> produk) {
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

    public ArrayList<Integer> getJenisPembiayaan() {
        return this.jenisPembiayaan;
    }

    public void setJenisPembiayaan(ArrayList<Integer> jenisPembiayaan) {
        this.jenisPembiayaan = jenisPembiayaan;
    }

    public ArrayList<Integer> getCluster() {
        return this.cluster;
    }

    public void setCluster(ArrayList<Integer> cluster) {
        this.cluster = cluster;
    }

    public Float getMinimalDp() {
        return this.minimalDp;
    }

    public void setMinimalDp(Float minimalDp) {
        this.minimalDp = minimalDp;
    }

    public MinimalDPForm id(Integer id) {
        setId(id);
        return this;
    }

    public MinimalDPForm namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public MinimalDPForm loanType(Integer loanType) {
        setLoanType(loanType);
        return this;
    }

    public MinimalDPForm produk(ArrayList<Integer> produk) {
        setProduk(produk);
        return this;
    }

    public MinimalDPForm tujuanPenggunaan(Integer tujuanPenggunaan) {
        setTujuanPenggunaan(tujuanPenggunaan);
        return this;
    }

    public MinimalDPForm tipeKonsumen(Integer tipeKonsumen) {
        setTipeKonsumen(tipeKonsumen);
        return this;
    }

    public MinimalDPForm jenisKendaraan(Integer jenisKendaraan) {
        setJenisKendaraan(jenisKendaraan);
        return this;
    }

    public MinimalDPForm jenisPembiayaan(ArrayList<Integer> jenisPembiayaan) {
        setJenisPembiayaan(jenisPembiayaan);
        return this;
    }

    public MinimalDPForm cluster(ArrayList<Integer> cluster) {
        setCluster(cluster);
        return this;
    }

    public MinimalDPForm minimalDp(Float minimalDp) {
        setMinimalDp(minimalDp);
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
            "}";
    }

    
}
