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
@Table(name="sp_masterkompph")
public class modelLoanType implements Serializable {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "id_komp")
    private Integer id_komp;
    
    @Column(name = "deskripsi")
    private String deskripsi;

    @Column(name = "created_at")
    private Date created_at;


    public modelLoanType(Integer id, Integer id_komp, String deskripsi, Date created_at) {
        this.id = id;
        this.id_komp = id_komp;
        this.deskripsi = deskripsi;
        this.created_at = created_at;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_komp() {
        return this.id_komp;
    }

    public void setId_komp(Integer id_komp) {
        this.id_komp = id_komp;
    }

    public String getDeskripsi() {
        return this.deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }



}
