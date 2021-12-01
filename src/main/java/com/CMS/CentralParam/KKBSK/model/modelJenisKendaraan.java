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
@Table(name="sp_jeniskendaraan")
public class modelJenisKendaraan implements Serializable {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "jenis_kendaraan")
    private String jenis_kendaraan_id;
    
    @Column(name = "deskripsi")
    private String deskripsi;

    @Column(name = "startberlaku")
    private Date startBerlaku;

    @Column(name = "endberlaku")
    private Date endBerlaku;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "status")
    private String status;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "is_rejected")
    private Integer is_rejected;
    

    public modelJenisKendaraan(){
        
    }
    public modelJenisKendaraan(Integer id, String jenis_kendaraan_id, String deskripsi, Date startBerlaku, Date endBerlaku, Date created_at, String status, String remarks, Integer is_rejected) {
        this.id = id;
        this.jenis_kendaraan_id = jenis_kendaraan_id;
        this.deskripsi = deskripsi;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.created_at = created_at;
        this.status = status;
        this.remarks = remarks;
        this.is_rejected = is_rejected;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
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
