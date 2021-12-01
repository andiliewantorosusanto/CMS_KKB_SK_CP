package com.CMS.CentralParam.KKBSK.view;

import java.util.Date;

public class vwDataBiayaAdmin {
    
    //private Integer skema;
    private Integer tipe_konsumen;
    private Integer jeniskendaraanid;
    private Integer jenis_pembiayaan;
    private Integer cluster;
    private Integer diskon_npwp;
    private Date startBerlaku;
    private Date endBerlaku;
    private String statusApproval;
    private String remarks;


    public vwDataBiayaAdmin(Integer tipe_konsumen, Integer jeniskendaraanid, Integer jenis_pembiayaan, Integer cluster, Integer diskon_npwp, Date startBerlaku, Date endBerlaku, String statusApproval, String remarks) {
        this.tipe_konsumen = tipe_konsumen;
        this.jeniskendaraanid = jeniskendaraanid;
        this.jenis_pembiayaan = jenis_pembiayaan;
        this.cluster = cluster;
        this.diskon_npwp = diskon_npwp;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.statusApproval = statusApproval;
        this.remarks = remarks;
    }

    public Integer getTipe_konsumen() {
        return this.tipe_konsumen;
    }

    public void setTipe_konsumen(Integer tipe_konsumen) {
        this.tipe_konsumen = tipe_konsumen;
    }

    public Integer getJeniskendaraanid() {
        return this.jeniskendaraanid;
    }

    public void setJeniskendaraanid(Integer jeniskendaraanid) {
        this.jeniskendaraanid = jeniskendaraanid;
    }

    public Integer getJenis_pembiayaan() {
        return this.jenis_pembiayaan;
    }

    public void setJenis_pembiayaan(Integer jenis_pembiayaan) {
        this.jenis_pembiayaan = jenis_pembiayaan;
    }

    public Integer getCluster() {
        return this.cluster;
    }

    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    public Integer getDiskon_npwp() {
        return this.diskon_npwp;
    }

    public void setDiskon_npwp(Integer diskon_npwp) {
        this.diskon_npwp = diskon_npwp;
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

    public String getStatusApproval() {
        return this.statusApproval;
    }

    public void setStatusApproval(String statusApproval) {
        this.statusApproval = statusApproval;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }




}