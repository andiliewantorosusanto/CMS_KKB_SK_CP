package com.CMS.CentralParam.KKBSK.view;

import java.util.Date;

public class vwDataWilayah {

    private String namaWilayah;

    private String deskripsi;

    private Date startBerlaku;

    private Date endBerlaku;
    private String status;
    private String remarks;
    private Integer is_rejected;


    public vwDataWilayah(String namaWilayah, String deskripsi, Date startBerlaku, Date endBerlaku, String status, String remarks, Integer is_rejected) {
        this.namaWilayah = namaWilayah;
        this.deskripsi = deskripsi;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.status = status;
        this.remarks = remarks;
        this.is_rejected = is_rejected;
    }

    public String getNamaWilayah() {
        return this.namaWilayah;
    }

    public void setNamaWilayah(String namaWilayah) {
        this.namaWilayah = namaWilayah;
    }

    public String getDeskripsi() {
        return this.deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
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



}
