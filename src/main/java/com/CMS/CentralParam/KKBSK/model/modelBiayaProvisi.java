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
@Table(name="sp_biayaprovisi_kkbsk")
public class modelBiayaProvisi implements Serializable {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "startberlaku")
    private Date startBerlaku;
    
    @Column(name = "endberlaku")
    private Date endBerlaku;
        
    @Column(name = "loantype")
    private Integer loanType;
        
    @Column(name = "productid")
    private Integer productid;

    @Column(name = "jeniskendaraanid")
    private Integer jeniskendaraanid;

    @Column(name = "kondisikendaraanid")
    private Integer kondisikendaraanid;

    @Column(name = "tenor1")
    private Float tenor1;

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

    @Column(name = "tipe_konsumen")
    private Integer tipe_konsumen;

    @Column(name = "jenis_pembiayaan")
    private Integer jenis_pembiayaan;

    @Column(name = "tujuan_penggunaan")
    private Integer tujuan_penggunaan;

    @Column(name = "cluster")
    private Integer cluster;

    @Column(name = "program")
    private Integer program;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "status")
    private String status;

    @Column(name = "tenor1_persen")
    private Float tenor1_persen;

    @Column(name = "tenor2_persen")
    private Float tenor2_persen;

    @Column(name = "tenor3_persen")
    private Float tenor3_persen;

    @Column(name = "tenor4_persen")
    private Float tenor4_persen;

    @Column(name = "tenor5_persen")
    private Float tenor5_persen;

    @Column(name = "tenor6_persen")
    private Float tenor6_persen;

    @Column(name = "tenor7_persen")
    private Float tenor7_persen;

    @Column(name = "tenor8_persen")
    private Float tenor8_persen;

    @Column(name = "tenor9_persen")
    private Float tenor9_persen;

    @Column(name = "tenor10_persen")
    private Float tenor10_persen;
    
    @Column(name = "tahun_awal")
    private Integer tahun_awal;

    @Column(name = "tahun_akhir")
    private Integer tahun_akhir;

    @Column(name = "updateddate")
    private Date updateddate;

    @Column(name = "createddate")
    private Date createddate;

    @Column(name = "createdby")
    private Integer createdby;

    @Column(name = "updatedby")
    private Integer updatedby;

    @Column(name = "is_login")
    private Integer is_login;


    public modelBiayaProvisi(Integer id, Date startBerlaku, Date endBerlaku, Integer loanType, Integer productid, Integer jeniskendaraanid, Integer kondisikendaraanid, Float tenor1, Float tenor2, Float tenor3, Float tenor4, Float tenor5, Float tenor6, Float tenor7, Float tenor8, Float tenor9, Float tenor10, Integer tipe_konsumen, Integer jenis_pembiayaan, Integer tujuan_penggunaan, Integer cluster, Integer program, String remarks, String status, Float tenor1_persen, Float tenor2_persen, Float tenor3_persen, Float tenor4_persen, Float tenor5_persen, Float tenor6_persen, Float tenor7_persen, Float tenor8_persen, Float tenor9_persen, Float tenor10_persen, Integer tahun_awal, Integer tahun_akhir, Date updateddate, Date createddate, Integer createdby, Integer updatedby, Integer is_login) {
        this.id = id;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.loanType = loanType;
        this.productid = productid;
        this.jeniskendaraanid = jeniskendaraanid;
        this.kondisikendaraanid = kondisikendaraanid;
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
        this.tipe_konsumen = tipe_konsumen;
        this.jenis_pembiayaan = jenis_pembiayaan;
        this.tujuan_penggunaan = tujuan_penggunaan;
        this.cluster = cluster;
        this.program = program;
        this.remarks = remarks;
        this.status = status;
        this.tenor1_persen = tenor1_persen;
        this.tenor2_persen = tenor2_persen;
        this.tenor3_persen = tenor3_persen;
        this.tenor4_persen = tenor4_persen;
        this.tenor5_persen = tenor5_persen;
        this.tenor6_persen = tenor6_persen;
        this.tenor7_persen = tenor7_persen;
        this.tenor8_persen = tenor8_persen;
        this.tenor9_persen = tenor9_persen;
        this.tenor10_persen = tenor10_persen;
        this.tahun_awal = tahun_awal;
        this.tahun_akhir = tahun_akhir;
        this.updateddate = updateddate;
        this.createddate = createddate;
        this.createdby = createdby;
        this.updatedby = updatedby;
        this.is_login = is_login;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Float getTenor1() {
        return this.tenor1;
    }

    public void setTenor1(Float tenor1) {
        this.tenor1 = tenor1;
    }

    public Float getTenor2() {
        return this.tenor2;
    }

    public void setTenor2(Float tenor2) {
        this.tenor2 = tenor2;
    }

    public Float getTenor3() {
        return this.tenor3;
    }

    public void setTenor3(Float tenor3) {
        this.tenor3 = tenor3;
    }

    public Float getTenor4() {
        return this.tenor4;
    }

    public void setTenor4(Float tenor4) {
        this.tenor4 = tenor4;
    }

    public Float getTenor5() {
        return this.tenor5;
    }

    public void setTenor5(Float tenor5) {
        this.tenor5 = tenor5;
    }

    public Float getTenor6() {
        return this.tenor6;
    }

    public void setTenor6(Float tenor6) {
        this.tenor6 = tenor6;
    }

    public Float getTenor7() {
        return this.tenor7;
    }

    public void setTenor7(Float tenor7) {
        this.tenor7 = tenor7;
    }

    public Float getTenor8() {
        return this.tenor8;
    }

    public void setTenor8(Float tenor8) {
        this.tenor8 = tenor8;
    }

    public Float getTenor9() {
        return this.tenor9;
    }

    public void setTenor9(Float tenor9) {
        this.tenor9 = tenor9;
    }

    public Float getTenor10() {
        return this.tenor10;
    }

    public void setTenor10(Float tenor10) {
        this.tenor10 = tenor10;
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

    public Integer getTujuan_penggunaan() {
        return this.tujuan_penggunaan;
    }

    public void setTujuan_penggunaan(Integer tujuan_penggunaan) {
        this.tujuan_penggunaan = tujuan_penggunaan;
    }

    public Integer getCluster() {
        return this.cluster;
    }

    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    public Integer getProgram() {
        return this.program;
    }

    public void setProgram(Integer program) {
        this.program = program;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Float getTenor1_persen() {
        return this.tenor1_persen;
    }

    public void setTenor1_persen(Float tenor1_persen) {
        this.tenor1_persen = tenor1_persen;
    }

    public Float getTenor2_persen() {
        return this.tenor2_persen;
    }

    public void setTenor2_persen(Float tenor2_persen) {
        this.tenor2_persen = tenor2_persen;
    }

    public Float getTenor3_persen() {
        return this.tenor3_persen;
    }

    public void setTenor3_persen(Float tenor3_persen) {
        this.tenor3_persen = tenor3_persen;
    }

    public Float getTenor4_persen() {
        return this.tenor4_persen;
    }

    public void setTenor4_persen(Float tenor4_persen) {
        this.tenor4_persen = tenor4_persen;
    }

    public Float getTenor5_persen() {
        return this.tenor5_persen;
    }

    public void setTenor5_persen(Float tenor5_persen) {
        this.tenor5_persen = tenor5_persen;
    }

    public Float getTenor6_persen() {
        return this.tenor6_persen;
    }

    public void setTenor6_persen(Float tenor6_persen) {
        this.tenor6_persen = tenor6_persen;
    }

    public Float getTenor7_persen() {
        return this.tenor7_persen;
    }

    public void setTenor7_persen(Float tenor7_persen) {
        this.tenor7_persen = tenor7_persen;
    }

    public Float getTenor8_persen() {
        return this.tenor8_persen;
    }

    public void setTenor8_persen(Float tenor8_persen) {
        this.tenor8_persen = tenor8_persen;
    }

    public Float getTenor9_persen() {
        return this.tenor9_persen;
    }

    public void setTenor9_persen(Float tenor9_persen) {
        this.tenor9_persen = tenor9_persen;
    }

    public Float getTenor10_persen() {
        return this.tenor10_persen;
    }

    public void setTenor10_persen(Float tenor10_persen) {
        this.tenor10_persen = tenor10_persen;
    }

    public Integer getTahun_awal() {
        return this.tahun_awal;
    }

    public void setTahun_awal(Integer tahun_awal) {
        this.tahun_awal = tahun_awal;
    }

    public Integer getTahun_akhir() {
        return this.tahun_akhir;
    }

    public void setTahun_akhir(Integer tahun_akhir) {
        this.tahun_akhir = tahun_akhir;
    }

    public Date getUpdateddate() {
        return this.updateddate;
    }

    public void setUpdateddate(Date updateddate) {
        this.updateddate = updateddate;
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
