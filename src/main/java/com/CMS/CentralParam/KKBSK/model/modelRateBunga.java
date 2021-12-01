package com.CMS.CentralParam.KKBSK.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="sp_ratebunga_kkbsk")
public class modelRateBunga implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "nama_skema")
    private String namaSkema;

    @Column(name = "loan_type")
    private Integer loan_type;

    @Column(name = "produk")
    private Integer produk;

    @Column(name = "jenis_kendaraan")
    private Integer jenis_kendaraan;

    @Column(name = "kondisi_kendaraan")
    private Integer kondisi_kendaraan;

    @Column(name = "start_tahun_kendaraan")
    private Integer start_tahun_kendaraan;

    @Column(name = "end_tahun")
    private Integer end_tahun;

    @Column(name = "start_berlaku")
    private Date start_berlaku;

    @Column(name = "end_berlaku")
    private Date end_berlaku;

    @Column(name = "tenor1")
    private Float tenor1;

    @Column(name = "tenor2")
    private Float tenor2;

    @Column(name = "tenor3")
    private Float tenor3;

    @Column(name = "tenor4")
    private Float tenor4;

    @Column(name = "tenor5periode1")
    private Integer tenor5periode1;
    
    @Column(name = "tenor5periode2")
    private Integer tenor5periode2;

    @Column(name = "tenor5rate1")
    private Float tenor5rate1;

    @Column(name = "tenor5rate2")
    private Float tenor5rate2;

    @Column(name = "tenor6periode1")
    private Integer tenor6periode1;
    
    @Column(name = "tenor6periode2")
    private Integer tenor6periode2;

    @Column(name = "tenor6rate1")
    private Float tenor6rate1;

    @Column(name = "tenor6rate2")
    private Float tenor6rate2;

    @Column(name = "tenor7periode1")
    private Integer tenor7periode1;
    
    @Column(name = "tenor7periode2")
    private Integer tenor7periode2;

    @Column(name = "tenor7rate1")
    private Float tenor7rate1;

    @Column(name = "tenor7rate2")
    private Float tenor7rate2;

    @Column(name = "tenor8periode1")
    private Integer tenor8periode1;
    
    @Column(name = "tenor8periode2")
    private Integer tenor8periode2;

    @Column(name = "tenor8rate1")
    private Float tenor8rate1;

    @Column(name = "tenor8rate2")
    private Float tenor8rate2;

    @Column(name = "tenor9periode1")
    private Integer tenor9periode1;
    
    @Column(name = "tenor9periode2")
    private Integer tenor9periode2;

    @Column(name = "tenor9rate1")
    private Float tenor9rate1;

    @Column(name = "tenor9rate2")
    private Float tenor9rate2;

    @Column(name = "tenor10periode1")
    private Integer tenor10periode1;
    
    @Column(name = "tenor10periode2")
    private Integer tenor10periode2;

    @Column(name = "tenor10rate1")
    private Float tenor10rate1;

    @Column(name = "tenor10rate2")
    private Float tenor10rate2;

    @Column(name = "operatorawal")
    private String operatorAwal;

    @Column(name = "operatorakhir")
    private String operatorAkhir;

    @Column(name = "statusapproved")
    private String statusApproved;

    @Column(name = "Remarks")
    private String Remarks;
    
    @Column(name = "is_rejected")
    private String is_rejected;
    
    @Column(name = "jenis_pembiayaan")
    private Integer jenis_pembiayaan;

    @Column(name = "tujuan_penggunaan")
    private Integer tujuan_penggunaan;

    @Column(name = "cluster")
    private Integer cluster;

    @Column(name = "program")
    private Integer program;
    
    @Column(name = "createddate")
    private Date createddate;

    @Column(name = "updateddate")
    private Date updateddate;

    @Column(name = "updatedby")
    private Integer updatedby;

    @Column(name = "createdby")
    private Integer createdby;

    @Column(name = "tipe_konsumen")
    private Integer tipe_konsumen;

    @Column(name = "is_login")
    private Integer is_login;

    
    public modelRateBunga(){

    }


    public modelRateBunga(Integer id, String namaSkema, Integer loan_type, Integer produk, Integer jenis_kendaraan, Integer kondisi_kendaraan, Integer start_tahun_kendaraan, Integer end_tahun, Date start_berlaku, Date end_berlaku, Float tenor1, Float tenor2, Float tenor3, Float tenor4, Integer tenor5periode1, Integer tenor5periode2, Float tenor5rate1, Float tenor5rate2, Integer tenor6periode1, Integer tenor6periode2, Float tenor6rate1, Float tenor6rate2, Integer tenor7periode1, Integer tenor7periode2, Float tenor7rate1, Float tenor7rate2, Integer tenor8periode1, Integer tenor8periode2, Float tenor8rate1, Float tenor8rate2, Integer tenor9periode1, Integer tenor9periode2, Float tenor9rate1, Float tenor9rate2, Integer tenor10periode1, Integer tenor10periode2, Float tenor10rate1, Float tenor10rate2, String operatorAwal, String operatorAkhir, String statusApproved, String Remarks, String is_rejected, Integer jenis_pembiayaan, Integer tujuan_penggunaan, Integer cluster, Integer program, Date createddate, Date updateddate, Integer updatedby, Integer createdby, Integer tipe_konsumen, Integer is_login) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.loan_type = loan_type;
        this.produk = produk;
        this.jenis_kendaraan = jenis_kendaraan;
        this.kondisi_kendaraan = kondisi_kendaraan;
        this.start_tahun_kendaraan = start_tahun_kendaraan;
        this.end_tahun = end_tahun;
        this.start_berlaku = start_berlaku;
        this.end_berlaku = end_berlaku;
        this.tenor1 = tenor1;
        this.tenor2 = tenor2;
        this.tenor3 = tenor3;
        this.tenor4 = tenor4;
        this.tenor5periode1 = tenor5periode1;
        this.tenor5periode2 = tenor5periode2;
        this.tenor5rate1 = tenor5rate1;
        this.tenor5rate2 = tenor5rate2;
        this.tenor6periode1 = tenor6periode1;
        this.tenor6periode2 = tenor6periode2;
        this.tenor6rate1 = tenor6rate1;
        this.tenor6rate2 = tenor6rate2;
        this.tenor7periode1 = tenor7periode1;
        this.tenor7periode2 = tenor7periode2;
        this.tenor7rate1 = tenor7rate1;
        this.tenor7rate2 = tenor7rate2;
        this.tenor8periode1 = tenor8periode1;
        this.tenor8periode2 = tenor8periode2;
        this.tenor8rate1 = tenor8rate1;
        this.tenor8rate2 = tenor8rate2;
        this.tenor9periode1 = tenor9periode1;
        this.tenor9periode2 = tenor9periode2;
        this.tenor9rate1 = tenor9rate1;
        this.tenor9rate2 = tenor9rate2;
        this.tenor10periode1 = tenor10periode1;
        this.tenor10periode2 = tenor10periode2;
        this.tenor10rate1 = tenor10rate1;
        this.tenor10rate2 = tenor10rate2;
        this.operatorAwal = operatorAwal;
        this.operatorAkhir = operatorAkhir;
        this.statusApproved = statusApproved;
        this.Remarks = Remarks;
        this.is_rejected = is_rejected;
        this.jenis_pembiayaan = jenis_pembiayaan;
        this.tujuan_penggunaan = tujuan_penggunaan;
        this.cluster = cluster;
        this.program = program;
        this.createddate = createddate;
        this.updateddate = updateddate;
        this.updatedby = updatedby;
        this.createdby = createdby;
        this.tipe_konsumen = tipe_konsumen;
        this.is_login = is_login;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaSkema() {
        return this.namaSkema;
    }

    public void setNamaSkema(String namaSkema) {
        this.namaSkema = namaSkema;
    }

    public Integer getLoan_type() {
        return this.loan_type;
    }

    public void setLoan_type(Integer loan_type) {
        this.loan_type = loan_type;
    }

    public Integer getProduk() {
        return this.produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    public Integer getJenis_kendaraan() {
        return this.jenis_kendaraan;
    }

    public void setJenis_kendaraan(Integer jenis_kendaraan) {
        this.jenis_kendaraan = jenis_kendaraan;
    }

    public Integer getKondisi_kendaraan() {
        return this.kondisi_kendaraan;
    }

    public void setKondisi_kendaraan(Integer kondisi_kendaraan) {
        this.kondisi_kendaraan = kondisi_kendaraan;
    }

    public Integer getStart_tahun_kendaraan() {
        return this.start_tahun_kendaraan;
    }

    public void setStart_tahun_kendaraan(Integer start_tahun_kendaraan) {
        this.start_tahun_kendaraan = start_tahun_kendaraan;
    }

    public Integer getEnd_tahun() {
        return this.end_tahun;
    }

    public void setEnd_tahun(Integer end_tahun) {
        this.end_tahun = end_tahun;
    }

    public Date getStart_berlaku() {
        return this.start_berlaku;
    }

    public void setStart_berlaku(Date start_berlaku) {
        this.start_berlaku = start_berlaku;
    }

    public Date getEnd_berlaku() {
        return this.end_berlaku;
    }

    public void setEnd_berlaku(Date end_berlaku) {
        this.end_berlaku = end_berlaku;
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

    public Integer getTenor5periode1() {
        return this.tenor5periode1;
    }

    public void setTenor5periode1(Integer tenor5periode1) {
        this.tenor5periode1 = tenor5periode1;
    }

    public Integer getTenor5periode2() {
        return this.tenor5periode2;
    }

    public void setTenor5periode2(Integer tenor5periode2) {
        this.tenor5periode2 = tenor5periode2;
    }

    public Float getTenor5rate1() {
        return this.tenor5rate1;
    }

    public void setTenor5rate1(Float tenor5rate1) {
        this.tenor5rate1 = tenor5rate1;
    }

    public Float getTenor5rate2() {
        return this.tenor5rate2;
    }

    public void setTenor5rate2(Float tenor5rate2) {
        this.tenor5rate2 = tenor5rate2;
    }

    public Integer getTenor6periode1() {
        return this.tenor6periode1;
    }

    public void setTenor6periode1(Integer tenor6periode1) {
        this.tenor6periode1 = tenor6periode1;
    }

    public Integer getTenor6periode2() {
        return this.tenor6periode2;
    }

    public void setTenor6periode2(Integer tenor6periode2) {
        this.tenor6periode2 = tenor6periode2;
    }

    public Float getTenor6rate1() {
        return this.tenor6rate1;
    }

    public void setTenor6rate1(Float tenor6rate1) {
        this.tenor6rate1 = tenor6rate1;
    }

    public Float getTenor6rate2() {
        return this.tenor6rate2;
    }

    public void setTenor6rate2(Float tenor6rate2) {
        this.tenor6rate2 = tenor6rate2;
    }

    public Integer getTenor7periode1() {
        return this.tenor7periode1;
    }

    public void setTenor7periode1(Integer tenor7periode1) {
        this.tenor7periode1 = tenor7periode1;
    }

    public Integer getTenor7periode2() {
        return this.tenor7periode2;
    }

    public void setTenor7periode2(Integer tenor7periode2) {
        this.tenor7periode2 = tenor7periode2;
    }

    public Float getTenor7rate1() {
        return this.tenor7rate1;
    }

    public void setTenor7rate1(Float tenor7rate1) {
        this.tenor7rate1 = tenor7rate1;
    }

    public Float getTenor7rate2() {
        return this.tenor7rate2;
    }

    public void setTenor7rate2(Float tenor7rate2) {
        this.tenor7rate2 = tenor7rate2;
    }

    public Integer getTenor8periode1() {
        return this.tenor8periode1;
    }

    public void setTenor8periode1(Integer tenor8periode1) {
        this.tenor8periode1 = tenor8periode1;
    }

    public Integer getTenor8periode2() {
        return this.tenor8periode2;
    }

    public void setTenor8periode2(Integer tenor8periode2) {
        this.tenor8periode2 = tenor8periode2;
    }

    public Float getTenor8rate1() {
        return this.tenor8rate1;
    }

    public void setTenor8rate1(Float tenor8rate1) {
        this.tenor8rate1 = tenor8rate1;
    }

    public Float getTenor8rate2() {
        return this.tenor8rate2;
    }

    public void setTenor8rate2(Float tenor8rate2) {
        this.tenor8rate2 = tenor8rate2;
    }

    public Integer getTenor9periode1() {
        return this.tenor9periode1;
    }

    public void setTenor9periode1(Integer tenor9periode1) {
        this.tenor9periode1 = tenor9periode1;
    }

    public Integer getTenor9periode2() {
        return this.tenor9periode2;
    }

    public void setTenor9periode2(Integer tenor9periode2) {
        this.tenor9periode2 = tenor9periode2;
    }

    public Float getTenor9rate1() {
        return this.tenor9rate1;
    }

    public void setTenor9rate1(Float tenor9rate1) {
        this.tenor9rate1 = tenor9rate1;
    }

    public Float getTenor9rate2() {
        return this.tenor9rate2;
    }

    public void setTenor9rate2(Float tenor9rate2) {
        this.tenor9rate2 = tenor9rate2;
    }

    public Integer getTenor10periode1() {
        return this.tenor10periode1;
    }

    public void setTenor10periode1(Integer tenor10periode1) {
        this.tenor10periode1 = tenor10periode1;
    }

    public Integer getTenor10periode2() {
        return this.tenor10periode2;
    }

    public void setTenor10periode2(Integer tenor10periode2) {
        this.tenor10periode2 = tenor10periode2;
    }

    public Float getTenor10rate1() {
        return this.tenor10rate1;
    }

    public void setTenor10rate1(Float tenor10rate1) {
        this.tenor10rate1 = tenor10rate1;
    }

    public Float getTenor10rate2() {
        return this.tenor10rate2;
    }

    public void setTenor10rate2(Float tenor10rate2) {
        this.tenor10rate2 = tenor10rate2;
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

    public String getStatusApproved() {
        return this.statusApproved;
    }

    public void setStatusApproved(String statusApproved) {
        this.statusApproved = statusApproved;
    }

    public String getRemarks() {
        return this.Remarks;
    }

    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

    public String getIs_rejected() {
        return this.is_rejected;
    }

    public void setIs_rejected(String is_rejected) {
        this.is_rejected = is_rejected;
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

    public Date getCreateddate() {
        return this.createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
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

    public Integer getCreatedby() {
        return this.createdby;
    }

    public void setCreatedby(Integer createdby) {
        this.createdby = createdby;
    }

    public Integer getTipe_konsumen() {
        return this.tipe_konsumen;
    }

    public void setTipe_konsumen(Integer tipe_konsumen) {
        this.tipe_konsumen = tipe_konsumen;
    }

    public Integer getIs_login() {
        return this.is_login;
    }

    public void setIs_login(Integer is_login) {
        this.is_login = is_login;
    }


}
