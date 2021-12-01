package com.CMS.CentralParam.KKBSK.view;

import java.util.Date;

public class vwDataJenisPerluasan {

    private String Nama;
    private Integer Produk;
    private String Deskripsi;
    private Date Start_date;
    private Date End_date;
   

    public vwDataJenisPerluasan(String Nama, Integer Produk, String Deskripsi, Date Start_date, Date End_date) {
        this.Nama = Nama;
        this.Produk = Produk;
        this.Deskripsi = Deskripsi;
        this.Start_date = Start_date;
        this.End_date = End_date;
    }

    public String getNama() {
        return this.Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public Integer getProduk() {
        return this.Produk;
    }

    public void setProduk(Integer Produk) {
        this.Produk = Produk;
    }

    public String getDeskripsi() {
        return this.Deskripsi;
    }

    public void setDeskripsi(String Deskripsi) {
        this.Deskripsi = Deskripsi;
    }

    public Date getStart_date() {
        return this.Start_date;
    }

    public void setStart_date(Date Start_date) {
        this.Start_date = Start_date;
    }

    public Date getEnd_date() {
        return this.End_date;
    }

    public void setEnd_date(Date End_date) {
        this.End_date = End_date;
    }



}
