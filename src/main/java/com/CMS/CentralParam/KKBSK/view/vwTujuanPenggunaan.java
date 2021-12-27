package com.CMS.CentralParam.KKBSK.view;

import java.util.Date;

public class vwTujuanPenggunaan {
    
    private Integer id;
    private String nama;
    private String deskripsi;

    private Integer produk;
    private String produkName;

    private Date startBerlaku;
    private Date endBerlaku;

    private Integer statusApproval;
    private String remarks;
    private Integer isRejected;
    private Integer isApproved;


    public vwTujuanPenggunaan() {
    }

    public vwTujuanPenggunaan(Integer id, String nama, String deskripsi, Integer produk, String produkName, Date startBerlaku, Date endBerlaku, Integer statusApproval, String remarks, Integer isRejected, Integer isApproved) {
        this.id = id;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.produk = produk;
        this.produkName = produkName;
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

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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

    public vwTujuanPenggunaan id(Integer id) {
        setId(id);
        return this;
    }

    public vwTujuanPenggunaan nama(String nama) {
        setNama(nama);
        return this;
    }

    public vwTujuanPenggunaan deskripsi(String deskripsi) {
        setDeskripsi(deskripsi);
        return this;
    }

    public vwTujuanPenggunaan produk(Integer produk) {
        setProduk(produk);
        return this;
    }

    public vwTujuanPenggunaan produkName(String produkName) {
        setProdukName(produkName);
        return this;
    }

    public vwTujuanPenggunaan startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public vwTujuanPenggunaan endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public vwTujuanPenggunaan statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    public vwTujuanPenggunaan remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public vwTujuanPenggunaan isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public vwTujuanPenggunaan isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nama='" + getNama() + "'" +
            ", deskripsi='" + getDeskripsi() + "'" +
            ", produk='" + getProduk() + "'" +
            ", produkName='" + getProdukName() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", isRejected='" + getIsRejected() + "'" +
            ", isApproved='" + getIsApproved() + "'" +
            "}";
    }

}