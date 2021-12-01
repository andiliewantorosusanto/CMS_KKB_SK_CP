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
@Table(name="sp_jenispembiayaan")
public class modelJenisPembiayaan implements Serializable {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "jenis_pembiayaan")
    private String jenis_pembiayaan_id;
    
    @Column(name = "produk")
    private Integer produk;

    @Column(name = "is_refinancing")
    private Integer is_refinancing;

    @Column(name = "start_date")
    private Date start_date;

    @Column(name = "end_date")
    private Date end_date;

    @Column(name = "is_approved")
    private Integer is_approved;

    @Column(name = "is_rejected")
    private Integer is_rejected;
    
    @Column(name = "createdby")
    private Integer createdby;

    @Column(name = "createddate")
    private Date createddate;

    @Column(name = "updatedby")
    private Integer updatedby;

    @Column(name = "updateddate")
    private Date updateddate;

    @Column(name = "remarks")
    private String remarks;

    public modelJenisPembiayaan(){

    }

    public modelJenisPembiayaan(Integer id, String jenis_pembiayaan_id, Integer produk, Integer is_refinancing, Date start_date, Date end_date, Integer is_approved, Integer is_rejected, Integer createdby, Date createddate, Integer updatedby, Date updateddate, String remarks) {
        this.id = id;
        this.jenis_pembiayaan_id = jenis_pembiayaan_id;
        this.produk = produk;
        this.is_refinancing = is_refinancing;
        this.start_date = start_date;
        this.end_date = end_date;
        this.is_approved = is_approved;
        this.is_rejected = is_rejected;
        this.createdby = createdby;
        this.createddate = createddate;
        this.updatedby = updatedby;
        this.updateddate = updateddate;
        this.remarks = remarks;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJenis_pembiayaan_id() {
        return this.jenis_pembiayaan_id;
    }

    public void setJenis_pembiayaan_id(String jenis_pembiayaan_id) {
        this.jenis_pembiayaan_id = jenis_pembiayaan_id;
    }

    public Integer getProduk() {
        return this.produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    public Integer getIs_refinancing() {
        return this.is_refinancing;
    }

    public void setIs_refinancing(Integer is_refinancing) {
        this.is_refinancing = is_refinancing;
    }

    public Date getStart_date() {
        return this.start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return this.end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
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

    public Integer getCreatedby() {
        return this.createdby;
    }

    public void setCreatedby(Integer createdby) {
        this.createdby = createdby;
    }

    public Date getCreateddate() {
        return this.createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Integer getUpdatedby() {
        return this.updatedby;
    }

    public void setUpdatedby(Integer updatedby) {
        this.updatedby = updatedby;
    }

    public Date getUpdateddate() {
        return this.updateddate;
    }

    public void setUpdateddate(Date updateddate) {
        this.updateddate = updateddate;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }


}
