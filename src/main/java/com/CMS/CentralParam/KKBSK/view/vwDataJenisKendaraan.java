package com.CMS.CentralParam.KKBSK.view;

import java.util.Date;

public class vwDataJenisKendaraan {

    private String jenis_kendaraan_id;
    private String deskripsi;
    private Date startBerlaku;
    private Date endBerlaku;


    public vwDataJenisKendaraan(String jenis_kendaraan_id, String deskripsi, Date startBerlaku, Date endBerlaku) {
        this.jenis_kendaraan_id = jenis_kendaraan_id;
        this.deskripsi = deskripsi;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
    }

    public String getJenis_kendaraan_id() {
        return this.jenis_kendaraan_id;
    }

    public void setJenis_kendaraan_id(String jenis_kendaraan_id) {
        this.jenis_kendaraan_id = jenis_kendaraan_id;
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

}