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
@Table(name="sp_biayaadmin_kkbsk")
public class modelBiayaAdmin implements Serializable {

    @Id
    @Column(name = "ID")
    private Integer id;


    @Column(name = "loantype")
    private Integer loanType;


    @Column(name = "productid")
    private Integer productid;


    @Column(name = "jeniskendaraanid")
    private Integer jeniskendaraanid;


    @Column(name = "kondisikendaraanid")
    private Integer kondisikendaraanid;


    @Column(name = "usiakendaraanlunasmin")
    private Integer usiaKendaraanLunasMin;


    @Column(name = "usiakendaraanlunasmax")
    private Integer usiaKendaraanLunasMax;


    @Column(name = "tenor1")
    private Integer tenor1;


    @Column(name = "tenor2")
    private Integer tenor2;


    @Column(name = "tenor3")
    private Integer tenor3;


    @Column(name = "tenor4")
    private Integer tenor4;


    @Column(name = "tenor5")
    private Integer tenor5;


    @Column(name = "tenor6")
    private Integer tenor6;


    @Column(name = "tenor7")
    private Integer tenor7;


    @Column(name = "tenor8")
    private Integer tenor8;


    @Column(name = "tenor9")
    private Integer tenor9;


    @Column(name = "tenor10")
    private Integer tenor10;


    @Column(name = "startberlaku")
    private Date startBerlaku;


    @Column(name = "endberlaku")
    private Date endBerlaku;


    @Column(name = "operatorawal")
    private String operatorAwal;


    @Column(name = "operatorakhir")
    private String operatorAkhir;


    @Column(name = "statusapproval")
    private String statusApproval;


    @Column(name = "remarks")
    private String remarks;


    @Column(name = "is_rejected")
    private String is_rejected;


    @Column(name = "tujuan_penggunaan")
    private Integer tujuan_penggunaan;


    @Column(name = "tipe_konsumen")
    private Integer tipe_konsumen;


    @Column(name = "jenis_pembiayaan")
    private Integer jenis_pembiayaan;


    @Column(name = "cluster")
    private Integer cluster;


    @Column(name = "diskon_npwp")
    private Integer diskon_npwp;


    @Column(name = "program")
    private Integer program;


    @Column(name = "createdby")
    private Integer createdby;


    @Column(name = "createddate")
    private Date createddate;



    @Column(name = "updatedby")
    private Integer updatedby;



    @Column(name = "updateddate")
    private Date updateddate;



    @Column(name = "is_login")
    private Integer is_login;


    public modelBiayaAdmin(Integer id, Integer loanType, Integer productid, Integer jeniskendaraanid, Integer kondisikendaraanid, Integer usiaKendaraanLunasMin, Integer usiaKendaraanLunasMax, Integer tenor1, Integer tenor2, Integer tenor3, Integer tenor4, Integer tenor5, Integer tenor6, Integer tenor7, Integer tenor8, Integer tenor9, Integer tenor10, Date startBerlaku, Date endBerlaku, String operatorAwal, String operatorAkhir, String statusApproval, String remarks, String is_rejected, Integer tujuan_penggunaan, Integer tipe_konsumen, Integer jenis_pembiayaan, Integer cluster, Integer diskon_npwp, Integer program, Integer createdby, Date createddate, Integer updatedby, Date updateddate, Integer is_login) {
        this.id = id;
        this.loanType = loanType;
        this.productid = productid;
        this.jeniskendaraanid = jeniskendaraanid;
        this.kondisikendaraanid = kondisikendaraanid;
        this.usiaKendaraanLunasMin = usiaKendaraanLunasMin;
        this.usiaKendaraanLunasMax = usiaKendaraanLunasMax;
        this.tenor1 = tenor1;
        this.tenor2 = tenor2;
        this.tenor3 = tenor3;
        this.tenor4 = tenor4;
        this.tenor5 = tenor5;
        this.tenor6 = tenor6;
        this.tenor7 = tenor7;
        this.tenor8 = tenor8;
        this.tenor9 = tenor9;
        this.tenor10 = tenor10;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.operatorAwal = operatorAwal;
        this.operatorAkhir = operatorAkhir;
        this.statusApproval = statusApproval;
        this.remarks = remarks;
        this.is_rejected = is_rejected;
        this.tujuan_penggunaan = tujuan_penggunaan;
        this.tipe_konsumen = tipe_konsumen;
        this.jenis_pembiayaan = jenis_pembiayaan;
        this.cluster = cluster;
        this.diskon_npwp = diskon_npwp;
        this.program = program;
        this.createdby = createdby;
        this.createddate = createddate;
        this.updatedby = updatedby;
        this.updateddate = updateddate;
        this.is_login = is_login;
    }


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLoanType() {
        return this.loanType;
    }

    public void setLoanType(Integer loanType) {
        this.loanType = loanType;
    }

    public Integer getProductid() {
        return this.productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getJeniskendaraanid() {
        return this.jeniskendaraanid;
    }

    public void setJeniskendaraanid(Integer jeniskendaraanid) {
        this.jeniskendaraanid = jeniskendaraanid;
    }

    public Integer getKondisikendaraanid() {
        return this.kondisikendaraanid;
    }

    public void setKondisikendaraanid(Integer kondisikendaraanid) {
        this.kondisikendaraanid = kondisikendaraanid;
    }

    public Integer getUsiaKendaraanLunasMin() {
        return this.usiaKendaraanLunasMin;
    }

    public void setUsiaKendaraanLunasMin(Integer usiaKendaraanLunasMin) {
        this.usiaKendaraanLunasMin = usiaKendaraanLunasMin;
    }

    public Integer getUsiaKendaraanLunasMax() {
        return this.usiaKendaraanLunasMax;
    }

    public void setUsiaKendaraanLunasMax(Integer usiaKendaraanLunasMax) {
        this.usiaKendaraanLunasMax = usiaKendaraanLunasMax;
    }

    public Integer getTenor1() {
        return this.tenor1;
    }

    public void setTenor1(Integer tenor1) {
        this.tenor1 = tenor1;
    }

    public Integer getTenor2() {
        return this.tenor2;
    }

    public void setTenor2(Integer tenor2) {
        this.tenor2 = tenor2;
    }

    public Integer getTenor3() {
        return this.tenor3;
    }

    public void setTenor3(Integer tenor3) {
        this.tenor3 = tenor3;
    }

    public Integer getTenor4() {
        return this.tenor4;
    }

    public void setTenor4(Integer tenor4) {
        this.tenor4 = tenor4;
    }

    public Integer getTenor5() {
        return this.tenor5;
    }

    public void setTenor5(Integer tenor5) {
        this.tenor5 = tenor5;
    }

    public Integer getTenor6() {
        return this.tenor6;
    }

    public void setTenor6(Integer tenor6) {
        this.tenor6 = tenor6;
    }

    public Integer getTenor7() {
        return this.tenor7;
    }

    public void setTenor7(Integer tenor7) {
        this.tenor7 = tenor7;
    }

    public Integer getTenor8() {
        return this.tenor8;
    }

    public void setTenor8(Integer tenor8) {
        this.tenor8 = tenor8;
    }

    public Integer getTenor9() {
        return this.tenor9;
    }

    public void setTenor9(Integer tenor9) {
        this.tenor9 = tenor9;
    }

    public Integer getTenor10() {
        return this.tenor10;
    }

    public void setTenor10(Integer tenor10) {
        this.tenor10 = tenor10;
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

    public String getStatusApproval() {
        return this.statusApproval;
    }

    public void setStatusApproval(String statusApproval) {
        this.statusApproval = statusApproval;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getIs_rejected() {
        return this.is_rejected;
    }

    public void setIs_rejected(String is_rejected) {
        this.is_rejected = is_rejected;
    }

    public Integer getTujuan_penggunaan() {
        return this.tujuan_penggunaan;
    }

    public void setTujuan_penggunaan(Integer tujuan_penggunaan) {
        this.tujuan_penggunaan = tujuan_penggunaan;
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

    public Integer getCluster() {
        return this.cluster;
    }

    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    public Integer getDiskon_npwp() {
        return this.diskon_npwp;
    }

    public void setDiskon_npwp(Integer diskon_npwp) {
        this.diskon_npwp = diskon_npwp;
    }

    public Integer getProgram() {
        return this.program;
    }

    public void setProgram(Integer program) {
        this.program = program;
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

    public Integer getIs_login() {
        return this.is_login;
    }

    public void setIs_login(Integer is_login) {
        this.is_login = is_login;
    }


}
