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
public class modelKomponenPH implements Serializable {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "idKompPH")
    private Integer idKompPH;

    @Column(name = "jenis")
    private String jenis;

    @Column(name = "addm")
    private Integer addm;

    @Column(name = "addb")
    private Integer addb;

    @Column(name = "created_at")
    private Date created_at;

    @Column(name = "startBerlaku")
    private Date startBerlaku;

    @Column(name = "endBerlaku")
    private Date endBerlaku;

    @Column(name = "Remarks")
    private String Remarks;

    @Column(name = "is_rejected")
    private Integer is_rejected;

    @Column(name = "group_id")
    private String group_id;

    @Column(name = "kondisi_kendaraan")
    private String kondisi_kendaraan;

    @Column(name = "produk")
    private String produk;

    @Column(name = "status")
    private String status;

    @Column(name = "tipe_konsumen")
    private Integer tipe_konsumen;

    @Column(name = "jenis_pembiayaan")
    private Integer jenis_pembiayaan;

    @Column(name = "jenis_kendaraan")
    private Integer jenis_kendaraan;

    @Column(name = "program")
    private Integer program;

    @Column(name = "cluster")
    private Integer cluster;

    @Column(name = "is_login")
    private Integer is_login;
    

    public modelKomponenPH(Integer id, Integer idKompPH, String jenis, Integer addm, Integer addb, Date created_at, Date startBerlaku, Date endBerlaku, String Remarks, Integer is_rejected, String group_id, String kondisi_kendaraan, String produk, String status, Integer tipe_konsumen, Integer jenis_pembiayaan, Integer jenis_kendaraan, Integer program, Integer cluster, Integer is_login) {
        this.id = id;
        this.idKompPH = idKompPH;
        this.jenis = jenis;
        this.addm = addm;
        this.addb = addb;
        this.created_at = created_at;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.Remarks = Remarks;
        this.is_rejected = is_rejected;
        this.group_id = group_id;
        this.kondisi_kendaraan = kondisi_kendaraan;
        this.produk = produk;
        this.status = status;
        this.tipe_konsumen = tipe_konsumen;
        this.jenis_pembiayaan = jenis_pembiayaan;
        this.jenis_kendaraan = jenis_kendaraan;
        this.program = program;
        this.cluster = cluster;
        this.is_login = is_login;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdKompPH() {
        return this.idKompPH;
    }

    public void setIdKompPH(Integer idKompPH) {
        this.idKompPH = idKompPH;
    }

    public String getJenis() {
        return this.jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public Integer getAddm() {
        return this.addm;
    }

    public void setAddm(Integer addm) {
        this.addm = addm;
    }

    public Integer getAddb() {
        return this.addb;
    }

    public void setAddb(Integer addb) {
        this.addb = addb;
    }

    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
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

    public String getRemarks() {
        return this.Remarks;
    }

    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

    public Integer getIs_rejected() {
        return this.is_rejected;
    }

    public void setIs_rejected(Integer is_rejected) {
        this.is_rejected = is_rejected;
    }

    public String getGroup_id() {
        return this.group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getKondisi_kendaraan() {
        return this.kondisi_kendaraan;
    }

    public void setKondisi_kendaraan(String kondisi_kendaraan) {
        this.kondisi_kendaraan = kondisi_kendaraan;
    }

    public String getProduk() {
        return this.produk;
    }

    public void setProduk(String produk) {
        this.produk = produk;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getTipe_konsumen() {
        return this.tipe_konsumen;
    }

    public void setTipe_konsumen(Integer tipe_konsumen) {
        this.tipe_konsumen = tipe_konsumen;
    }

    public Integer getJenis_pembiayaan() {
        return this.jenis_pembiayaan;
    }

    public void setJenis_pembiayaan(Integer jenis_pembiayaan) {
        this.jenis_pembiayaan = jenis_pembiayaan;
    }

    public Integer getJenis_kendaraan() {
        return this.jenis_kendaraan;
    }

    public void setJenis_kendaraan(Integer jenis_kendaraan) {
        this.jenis_kendaraan = jenis_kendaraan;
    }

    public Integer getProgram() {
        return this.program;
    }

    public void setProgram(Integer program) {
        this.program = program;
    }

    public Integer getCluster() {
        return this.cluster;
    }

    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    public Integer getIs_login() {
        return this.is_login;
    }

    public void setIs_login(Integer is_login) {
        this.is_login = is_login;
    }


}