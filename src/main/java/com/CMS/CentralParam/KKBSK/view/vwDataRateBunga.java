package com.CMS.CentralParam.KKBSK.view;

import java.util.Date;

public class vwDataRateBunga {

    private String namaSkema;
    private Integer loan_type;
    private String deskripsi;
    private Integer jenis_kendaraan;
    private String jenis_kendaraan_id;
    private Integer jenis_pembiayaan;
    private String jenis_pembiayaan_id;
    private Integer cluster;
    private String cluster_id;
    private Integer start_tahun_kendaraan;
    private Integer end_tahun;
    private Date start_berlaku;
    private Date end_berlaku;
    private String statusApproved;
    private String Remarks;


    public vwDataRateBunga(String namaSkema, Integer loan_type, String deskripsi, Integer jenis_kendaraan, String jenis_kendaraan_id, Integer jenis_pembiayaan, String jenis_pembiayaan_id, Integer cluster, String cluster_id, Integer start_tahun_kendaraan, Integer end_tahun, Date start_berlaku, Date end_berlaku, String statusApproved, String Remarks) {
        this.namaSkema = namaSkema;
        this.loan_type = loan_type;
        this.deskripsi = deskripsi;
        this.jenis_kendaraan = jenis_kendaraan;
        this.jenis_kendaraan_id = jenis_kendaraan_id;
        this.jenis_pembiayaan = jenis_pembiayaan;
        this.jenis_pembiayaan_id = jenis_pembiayaan_id;
        this.cluster = cluster;
        this.cluster_id = cluster_id;
        this.start_tahun_kendaraan = start_tahun_kendaraan;
        this.end_tahun = end_tahun;
        this.start_berlaku = start_berlaku;
        this.end_berlaku = end_berlaku;
        this.statusApproved = statusApproved;
        this.Remarks = Remarks;
    }

    public String getNamaSkema() {
        return this.namaSkema;
    }

    public void setNamaSkema(String namaSkema) {
        this.namaSkema = namaSkema;
    }

    public Integer getLoan_type() {
        return this.loan_type;
    }

    public void setLoan_type(Integer loan_type) {
        this.loan_type = loan_type;
    }

    public String getDeskripsi() {
        return this.deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Integer getJenis_kendaraan() {
        return this.jenis_kendaraan;
    }

    public void setJenis_kendaraan(Integer jenis_kendaraan) {
        this.jenis_kendaraan = jenis_kendaraan;
    }

    public String getJenis_kendaraan_id() {
        return this.jenis_kendaraan_id;
    }

    public void setJenis_kendaraan_id(String jenis_kendaraan_id) {
        this.jenis_kendaraan_id = jenis_kendaraan_id;
    }

    public Integer getJenis_pembiayaan() {
        return this.jenis_pembiayaan;
    }

    public void setJenis_pembiayaan(Integer jenis_pembiayaan) {
        this.jenis_pembiayaan = jenis_pembiayaan;
    }

    public String getJenis_pembiayaan_id() {
        return this.jenis_pembiayaan_id;
    }

    public void setJenis_pembiayaan_id(String jenis_pembiayaan_id) {
        this.jenis_pembiayaan_id = jenis_pembiayaan_id;
    }

    public Integer getCluster() {
        return this.cluster;
    }

    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    public String getCluster_id() {
        return this.cluster_id;
    }

    public void setCluster_id(String cluster_id) {
        this.cluster_id = cluster_id;
    }

    public Integer getStart_tahun_kendaraan() {
        return this.start_tahun_kendaraan;
    }

    public void setStart_tahun_kendaraan(Integer start_tahun_kendaraan) {
        this.start_tahun_kendaraan = start_tahun_kendaraan;
    }

    public Integer getEnd_tahun() {
        return this.end_tahun;
    }

    public void setEnd_tahun(Integer end_tahun) {
        this.end_tahun = end_tahun;
    }

    public Date getStart_berlaku() {
        return this.start_berlaku;
    }

    public void setStart_berlaku(Date start_berlaku) {
        this.start_berlaku = start_berlaku;
    }

    public Date getEnd_berlaku() {
        return this.end_berlaku;
    }

    public void setEnd_berlaku(Date end_berlaku) {
        this.end_berlaku = end_berlaku;
    }

    public String getStatusApproved() {
        return this.statusApproved;
    }

    public void setStatusApproved(String statusApproved) {
        this.statusApproved = statusApproved;
    }

    public String getRemarks() {
        return this.Remarks;
    }

    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

}