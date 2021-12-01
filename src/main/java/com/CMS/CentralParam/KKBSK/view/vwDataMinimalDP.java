package com.CMS.CentralParam.KKBSK.view;

import java.util.Date;

public class vwDataMinimalDP {

    private Integer id;

    private Float minimalDP;

    private Date created_at;

    private Date startBerlaku;

    private Date endBerlaku;

    private Integer loanType;

    private Integer productid;

    private Integer jeniskendaraanid;

    private Integer kondisikendaraanid;

    private String status;

    private String remarks;

    private Integer is_rejected;

    private Integer cluster;

    private Integer tujuan_penggunaan;

    private Integer jenis_pembiayaan;

    private Integer tahun_kendaraan;

    private Integer is_login;

    public vwDataMinimalDP(Integer id, Float minimalDP, Date created_at, Date startBerlaku, Date endBerlaku, Integer loanType, Integer productid, Integer jeniskendaraanid, Integer kondisikendaraanid, String status, String remarks, Integer is_rejected, Integer cluster, Integer tujuan_penggunaan, Integer jenis_pembiayaan, Integer tahun_kendaraan, Integer is_login) {
        this.id = id;
        this.minimalDP = minimalDP;
        this.created_at = created_at;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.loanType = loanType;
        this.productid = productid;
        this.jeniskendaraanid = jeniskendaraanid;
        this.kondisikendaraanid = kondisikendaraanid;
        this.status = status;
        this.remarks = remarks;
        this.is_rejected = is_rejected;
        this.cluster = cluster;
        this.tujuan_penggunaan = tujuan_penggunaan;
        this.jenis_pembiayaan = jenis_pembiayaan;
        this.tahun_kendaraan = tahun_kendaraan;
        this.is_login = is_login;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getMinimalDP() {
        return this.minimalDP;
    }

    public void setMinimalDP(Float minimalDP) {
        this.minimalDP = minimalDP;
    }

    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
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

    public Integer getLoanType() {
        return this.loanType;
    }

    public void setLoanType(Integer loanType) {
        this.loanType = loanType;
    }

    public Integer getProductid() {
        return this.productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getJeniskendaraanid() {
        return this.jeniskendaraanid;
    }

    public void setJeniskendaraanid(Integer jeniskendaraanid) {
        this.jeniskendaraanid = jeniskendaraanid;
    }

    public Integer getKondisikendaraanid() {
        return this.kondisikendaraanid;
    }

    public void setKondisikendaraanid(Integer kondisikendaraanid) {
        this.kondisikendaraanid = kondisikendaraanid;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getIs_rejected() {
        return this.is_rejected;
    }

    public void setIs_rejected(Integer is_rejected) {
        this.is_rejected = is_rejected;
    }

    public Integer getCluster() {
        return this.cluster;
    }

    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    public Integer getTujuan_penggunaan() {
        return this.tujuan_penggunaan;
    }

    public void setTujuan_penggunaan(Integer tujuan_penggunaan) {
        this.tujuan_penggunaan = tujuan_penggunaan;
    }

    public Integer getJenis_pembiayaan() {
        return this.jenis_pembiayaan;
    }

    public void setJenis_pembiayaan(Integer jenis_pembiayaan) {
        this.jenis_pembiayaan = jenis_pembiayaan;
    }

    public Integer getTahun_kendaraan() {
        return this.tahun_kendaraan;
    }

    public void setTahun_kendaraan(Integer tahun_kendaraan) {
        this.tahun_kendaraan = tahun_kendaraan;
    }

    public Integer getIs_login() {
        return this.is_login;
    }

    public void setIs_login(Integer is_login) {
        this.is_login = is_login;
    }
    


}