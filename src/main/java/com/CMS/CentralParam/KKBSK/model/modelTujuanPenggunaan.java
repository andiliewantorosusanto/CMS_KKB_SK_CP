package com.CMS.CentralParam.KKBSK.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "sp_tujuanpenggunaan")
public class modelTujuanPenggunaan implements Serializable {
  
    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Nama")
    private String Nama;

    @Column(name = "Produk")
    private Integer Produk;

    @Column(name = "Deskripsi")
    private String Deskripsi;
    
    @Column(name = "Start_date")
    private Date Start_date;

    @Column(name = "End_date")
    private Date End_date;

    @Column(name = "is_approved")
    private Integer is_approved;

    @Column(name = "is_rejected")
    private Integer is_rejected;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "createddate")
    private Date createddate;

    @Column(name = "createdby")
    private Integer createdby;

    @Column(name = "updateddate")
    private Date updateddate;

    @Column(name = "updatedby")
    private Integer updatedby;
   


    public modelTujuanPenggunaan(Integer id, String Nama, Integer Produk, String Deskripsi, Date Start_date, Date End_date, Integer is_approved, Integer is_rejected, String remarks, Date createddate, Integer createdby, Date updateddate, Integer updatedby) {
        this.id = id;
        this.Nama = Nama;
        this.Produk = Produk;
        this.Deskripsi = Deskripsi;
        this.Start_date = Start_date;
        this.End_date = End_date;
        this.is_approved = is_approved;
        this.is_rejected = is_rejected;
        this.remarks = remarks;
        this.createddate = createddate;
        this.createdby = createdby;
        this.updateddate = updateddate;
        this.updatedby = updatedby;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getIs_approved() {
        return this.is_approved;
    }

    public void setIs_approved(Integer is_approved) {
        this.is_approved = is_approved;
    }

    public Integer getIs_rejected() {
        return this.is_rejected;
    }

    public void setIs_rejected(Integer is_rejected) {
        this.is_rejected = is_rejected;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getCreateddate() {
        return this.createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Integer getCreatedby() {
        return this.createdby;
    }

    public void setCreatedby(Integer createdby) {
        this.createdby = createdby;
    }

    public Date getUpdateddate() {
        return this.updateddate;
    }

    public void setUpdateddate(Date updateddate) {
        this.updateddate = updateddate;
    }

    public Integer getUpdatedby() {
        return this.updatedby;
    }

    public void setUpdatedby(Integer updatedby) {
        this.updatedby = updatedby;
    }
    
 
}