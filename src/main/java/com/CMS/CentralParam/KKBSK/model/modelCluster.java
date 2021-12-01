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
@Table(name="sp_cluster")
public class modelCluster implements Serializable {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "cluster")
    private String cluster_id;
    
    @Column(name = "produk")
    private Integer produk;

    @Column(name = "deskripsi")
    private String deskripsi;

    @Column(name = "start_date")
    private Date start_date;

    @Column(name = "end_date")
    private Date end_date;

    @Column(name = "is_approved")
    private Integer is_approved;

    @Column(name = "is_rejected")
    private Integer is_rejected;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "createdby")
    private Integer createdby;

    @Column(name = "createddate")
    private Date createddate;

    @Column(name = "updatedby")
    private Integer updatedby;

    @Column(name = "updateddate")
    private Date updateddate;

    

    public modelCluster(Integer id, String cluster_id, Integer produk, String deskripsi, Date start_date, Date end_date, Integer is_approved, Integer is_rejected, String remarks, Integer createdby, Date createddate, Integer updatedby, Date updateddate) {
        this.id = id;
        this.cluster_id = cluster_id;
        this.produk = produk;
        this.deskripsi = deskripsi;
        this.start_date = start_date;
        this.end_date = end_date;
        this.is_approved = is_approved;
        this.is_rejected = is_rejected;
        this.remarks = remarks;
        this.createdby = createdby;
        this.createddate = createddate;
        this.updatedby = updatedby;
        this.updateddate = updateddate;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCluster_id() {
        return this.cluster_id;
    }

    public void setCluster_id(String cluster_id) {
        this.cluster_id = cluster_id;
    }

    public Integer getProduk() {
        return this.produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    public String getDeskripsi() {
        return this.deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
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

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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



}
