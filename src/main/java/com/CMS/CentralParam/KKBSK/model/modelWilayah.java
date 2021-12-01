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
@Table(name = "SP_Wilayah")
public class modelWilayah implements Serializable {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "namawilayah")
    private String namaWilayah;

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


 
}