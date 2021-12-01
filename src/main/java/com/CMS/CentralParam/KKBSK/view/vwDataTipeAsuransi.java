package com.CMS.CentralParam.KKBSK.view;

import java.util.Date;

public class vwDataTipeAsuransi {
    private String namaAsuransi;
    private Date startBerlaku;
    private Date endBerlaku;
    private String deskripsi;

    public vwDataTipeAsuransi(String namaAsuransi, Date startBerlaku, Date endBerlaku, String deskripsi) {
        this.namaAsuransi = namaAsuransi;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.deskripsi = deskripsi;
    }

    public String getNamaAsuransi() {
        return this.namaAsuransi;
    }

    public void setNamaAsuransi(String namaAsuransi) {
        this.namaAsuransi = namaAsuransi;
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

    public String getDeskripsi() {
        return this.deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

}