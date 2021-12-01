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
@Table(name="")
public class modelPerluasanAsuransi implements Serializable {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "wilayah")
    private Integer wilayah;
    
    @Column(name = "startOTR")
    private Integer startOTR;

    @Column(name = "endOTR")
    private Integer endOTR;

    @Column(name = "startyear")
    private Integer startyear;

    @Column(name = "endyear")
    private Integer endyear;

    @Column(name = "tenor1")
    private Float tenor1;

    @Column(name = "tipeasuransi")
    private Integer tipeAsuransi;

    @Column(name = "startberlaku")
    private Date startBerlaku;

    @Column(name = "endberlaku")
    private Date endBerlaku;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "loan_type")
    private Integer loan_type;

    @Column(name = "produk")
    private Integer produk;

    @Column(name = "jenis_kendaraan")
    private Integer jenis_kendaraan;

    @Column(name = "kondisi_kendaraan")
    private Integer kondisi_kendaraan;

    @Column(name = "tenor2")
    private Float tenor2;

    @Column(name = "tenor3")
    private Float tenor3;

    @Column(name = "tenor4")
    private Float tenor4;

    @Column(name = "tenor5")
    private Float tenor5;

    @Column(name = "tenor6")
    private Float tenor6;

    @Column(name = "tenor7")
    private Float tenor7;

    @Column(name = "tenor8")
    private Float tenor8;

    @Column(name = "tenor9")
    private Float tenor9;

    @Column(name = "tenor10")
    private Float tenor10;

    @Column(name = "operatorTahunAwal")
    private String operatorTahunAwal;

    @Column(name = "operatorTahunAkhir")
    private String operatorTahunAkhir;

    @Column(name = "operatorOTRAwal")
    private String operatorOTRAwal;

    @Column(name = "operatorOTRAkhir")
    private String operatorOTRAkhir;

    @Column(name = "statusapproved")
    private String statusApproved;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "is_rejected")
    private String is_rejected;

    @Column(name = "jenis_pembiayaan")
    private Integer jenis_pembiayaan;

    @Column(name = "tujuan_penggunaan")
    private Integer tujuan_penggunaan;

    @Column(name = "program")
    private Integer program;

    @Column(name = "is_login")
    private Integer is_login;

}