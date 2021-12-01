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
@Table(name="sp_biayafiducia_kkbsk")
public class modelBiayaFidusia implements Serializable {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "startph")
    private Integer startPH;

    @Column(name = "endph")
    private Integer endPH;

    @Column(name = "biaya")
    private Integer biaya;

    @Column(name = "startberlaku")
    private Date startBerlaku;

    @Column(name = "endBerlaku")
    private Date endBerlaku;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "operatorawal")
    private String operatorAwal;

    @Column(name = "operatorakhir")
    private String operatorAkhir;

    @Column(name = "is_rejected")
    private String is_rejected;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "statusapproved")
    private String statusApproved;

    @Column(name = "program")
    private Integer program;

    @Column(name = "produk")
    private Integer produk;

    @Column(name = "createddate")
    private Date createddate;

    @Column(name = "createdby")
    private Integer createdby;

    @Column(name = "updateddate")
    private Date updateddate;

    @Column(name = "updatedby")
    private Integer updatedby;

    @Column(name = "is_login")
    private Integer is_login;

    public modelBiayaFidusia(Integer id, Integer startPH, Integer endPH, Integer biaya, Date startBerlaku, Date endBerlaku, Date created_at, String operatorAwal, String operatorAkhir, String is_rejected, String remarks, String statusApproved, Integer program, Integer produk, Date createddate, Integer createdby, Date updateddate, Integer updatedby, Integer is_login) {
        this.id = id;
        this.startPH = startPH;
        this.endPH = endPH;
        this.biaya = biaya;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.created_at = created_at;
        this.operatorAwal = operatorAwal;
        this.operatorAkhir = operatorAkhir;
        this.is_rejected = is_rejected;
        this.remarks = remarks;
        this.statusApproved = statusApproved;
        this.program = program;
        this.produk = produk;
        this.createddate = createddate;
        this.createdby = createdby;
        this.updateddate = updateddate;
        this.updatedby = updatedby;
        this.is_login = is_login;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStartPH() {
        return this.startPH;
    }

    public void setStartPH(Integer startPH) {
        this.startPH = startPH;
    }

    public Integer getEndPH() {
        return this.endPH;
    }

    public void setEndPH(Integer endPH) {
        this.endPH = endPH;
    }

    public Integer getBiaya() {
        return this.biaya;
    }

    public void setBiaya(Integer biaya) {
        this.biaya = biaya;
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

    public String getOperatorAwal() {
        return this.operatorAwal;
    }

    public void setOperatorAwal(String operatorAwal) {
        this.operatorAwal = operatorAwal;
    }

    public String getOperatorAkhir() {
        return this.operatorAkhir;
    }

    public void setOperatorAkhir(String operatorAkhir) {
        this.operatorAkhir = operatorAkhir;
    }

    public String getIs_rejected() {
        return this.is_rejected;
    }

    public void setIs_rejected(String is_rejected) {
        this.is_rejected = is_rejected;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getStatusApproved() {
        return this.statusApproved;
    }

    public void setStatusApproved(String statusApproved) {
        this.statusApproved = statusApproved;
    }

    public Integer getProgram() {
        return this.program;
    }

    public void setProgram(Integer program) {
        this.program = program;
    }

    public Integer getProduk() {
        return this.produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
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

    public Integer getIs_login() {
        return this.is_login;
    }

    public void setIs_login(Integer is_login) {
        this.is_login = is_login;
    }

}
