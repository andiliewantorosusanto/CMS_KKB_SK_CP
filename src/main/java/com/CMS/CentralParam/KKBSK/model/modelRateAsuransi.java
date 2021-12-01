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
@Table(name="SP_rateasuransi_KKBSK")
public class modelRateAsuransi implements Serializable {

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

    
    
    public modelRateAsuransi() {
        
    }

    public modelRateAsuransi(Integer id, Integer wilayah, Integer startOTR, Integer endOTR, Integer startyear, Integer endyear, Float tenor1, Integer tipeAsuransi, Date startBerlaku, Date endBerlaku, Date created_at, Integer loan_type, Integer produk, Integer jenis_kendaraan, Integer kondisi_kendaraan, Float tenor2, Float tenor3, Float tenor4, Float tenor5, Float tenor6, Float tenor7, Float tenor8, Float tenor9, Float tenor10, String operatorTahunAwal, String operatorTahunAkhir, String operatorOTRAwal, String operatorOTRAkhir, String statusApproved, String remarks, String is_rejected, Integer jenis_pembiayaan, Integer tujuan_penggunaan, Integer program, Integer is_login) {
        this.id = id;
        this.wilayah = wilayah;
        this.startOTR = startOTR;
        this.endOTR = endOTR;
        this.startyear = startyear;
        this.endyear = endyear;
        this.tenor1 = tenor1;
        this.tipeAsuransi = tipeAsuransi;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.created_at = created_at;
        this.loan_type = loan_type;
        this.produk = produk;
        this.jenis_kendaraan = jenis_kendaraan;
        this.kondisi_kendaraan = kondisi_kendaraan;
        this.tenor2 = tenor2;
        this.tenor3 = tenor3;
        this.tenor4 = tenor4;
        this.tenor5 = tenor5;
        this.tenor6 = tenor6;
        this.tenor7 = tenor7;
        this.tenor8 = tenor8;
        this.tenor9 = tenor9;
        this.tenor10 = tenor10;
        this.operatorTahunAwal = operatorTahunAwal;
        this.operatorTahunAkhir = operatorTahunAkhir;
        this.operatorOTRAwal = operatorOTRAwal;
        this.operatorOTRAkhir = operatorOTRAkhir;
        this.statusApproved = statusApproved;
        this.remarks = remarks;
        this.is_rejected = is_rejected;
        this.jenis_pembiayaan = jenis_pembiayaan;
        this.tujuan_penggunaan = tujuan_penggunaan;
        this.program = program;
        this.is_login = is_login;
    }

    

    /**
     * @return Integer return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return Integer return the wilayah
     */
    public Integer getWilayah() {
        return wilayah;
    }

    /**
     * @param wilayah the wilayah to set
     */
    public void setWilayah(Integer wilayah) {
        this.wilayah = wilayah;
    }

    /**
     * @return Integer return the startOTR
     */
    public Integer getStartOTR() {
        return startOTR;
    }

    /**
     * @param startOTR the startOTR to set
     */
    public void setStartOTR(Integer startOTR) {
        this.startOTR = startOTR;
    }

    /**
     * @return Integer return the endOTR
     */
    public Integer getEndOTR() {
        return endOTR;
    }

    /**
     * @param endOTR the endOTR to set
     */
    public void setEndOTR(Integer endOTR) {
        this.endOTR = endOTR;
    }

    /**
     * @return Integer return the startyear
     */
    public Integer getstartyear() {
        return startyear;
    }

    /**
     * @param startyear the startyear to set
     */
    public void setstartyear(Integer startyear) {
        this.startyear = startyear;
    }

    /**
     * @return Integer return the endYear
     */
    public Integer getEndyear() {
        return endyear;
    }

    /**
     * @param endYear the endYear to set
     */
    public void setEndyear(Integer endyear) {
        this.endyear = endyear;
    }

    /**
     * @return Float return the tenor1
     */
    public Float getTenor1() {
        return tenor1;
    }

    /**
     * @param tenor1 the tenor1 to set
     */
    public void setTenor1(Float tenor1) {
        this.tenor1 = tenor1;
    }

    /**
     * @return Integer return the tipeAsuransi
     */
    public Integer getTipeAsuransi() {
        return tipeAsuransi;
    }

    /**
     * @param tipeAsuransi the tipeAsuransi to set
     */
    public void setTipeAsuransi(Integer tipeAsuransi) {
        this.tipeAsuransi = tipeAsuransi;
    }

    /**
     * @return Date return the startBerlaku
     */
    public Date getStartBerlaku() {
        return startBerlaku;
    }

    /**
     * @param startBerlaku the startBerlaku to set
     */
    public void setStartBerlaku(Date startBerlaku) {
        this.startBerlaku = startBerlaku;
    }

    /**
     * @return Date return the endBerlaku
     */
    public Date getEndBerlaku() {
        return endBerlaku;
    }

    /**
     * @param endBerlaku the endBerlaku to set
     */
    public void setEndBerlaku(Date endBerlaku) {
        this.endBerlaku = endBerlaku;
    }

    /**
     * @return Date return the created_at
     */
    public Date getCreated_at() {
        return created_at;
    }

    /**
     * @param created_at the created_at to set
     */
    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    /**
     * @return Integer return the loan_type
     */
    public Integer getLoan_type() {
        return loan_type;
    }

    /**
     * @param loan_type the loan_type to set
     */
    public void setLoan_type(Integer loan_type) {
        this.loan_type = loan_type;
    }

    /**
     * @return Integer return the produk
     */
    public Integer getProduk() {
        return produk;
    }

    /**
     * @param produk the produk to set
     */
    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    /**
     * @return Integer return the jenis_kendaraan
     */
    public Integer getJenis_kendaraan() {
        return jenis_kendaraan;
    }

    /**
     * @param jenis_kendaraan the jenis_kendaraan to set
     */
    public void setJenis_kendaraan(Integer jenis_kendaraan) {
        this.jenis_kendaraan = jenis_kendaraan;
    }

    /**
     * @return Integer return the kondisi_kendaraan
     */
    public Integer getKondisi_kendaraan() {
        return kondisi_kendaraan;
    }

    /**
     * @param kondisi_kendaraan the kondisi_kendaraan to set
     */
    public void setKondisi_kendaraan(Integer kondisi_kendaraan) {
        this.kondisi_kendaraan = kondisi_kendaraan;
    }

    /**
     * @return Float return the tenor2
     */
    public Float getTenor2() {
        return tenor2;
    }

    /**
     * @param tenor2 the tenor2 to set
     */
    public void setTenor2(Float tenor2) {
        this.tenor2 = tenor2;
    }

    /**
     * @return Float return the tenor3
     */
    public Float getTenor3() {
        return tenor3;
    }

    /**
     * @param tenor3 the tenor3 to set
     */
    public void setTenor3(Float tenor3) {
        this.tenor3 = tenor3;
    }

    /**
     * @return Float return the tenor4
     */
    public Float getTenor4() {
        return tenor4;
    }

    /**
     * @param tenor4 the tenor4 to set
     */
    public void setTenor4(Float tenor4) {
        this.tenor4 = tenor4;
    }

    /**
     * @return Float return the tenor5
     */
    public Float getTenor5() {
        return tenor5;
    }

    /**
     * @param tenor5 the tenor5 to set
     */
    public void setTenor5(Float tenor5) {
        this.tenor5 = tenor5;
    }

    /**
     * @return Float return the tenor6
     */
    public Float getTenor6() {
        return tenor6;
    }

    /**
     * @param tenor6 the tenor6 to set
     */
    public void setTenor6(Float tenor6) {
        this.tenor6 = tenor6;
    }

    /**
     * @return Float return the tenor7
     */
    public Float getTenor7() {
        return tenor7;
    }

    /**
     * @param tenor7 the tenor7 to set
     */
    public void setTenor7(Float tenor7) {
        this.tenor7 = tenor7;
    }

    /**
     * @return Float return the tenor8
     */
    public Float getTenor8() {
        return tenor8;
    }

    /**
     * @param tenor8 the tenor8 to set
     */
    public void setTenor8(Float tenor8) {
        this.tenor8 = tenor8;
    }

    /**
     * @return Float return the tenor9
     */
    public Float getTenor9() {
        return tenor9;
    }

    /**
     * @param tenor9 the tenor9 to set
     */
    public void setTenor9(Float tenor9) {
        this.tenor9 = tenor9;
    }

    /**
     * @return Float return the tenor10
     */
    public Float getTenor10() {
        return tenor10;
    }

    /**
     * @param tenor10 the tenor10 to set
     */
    public void setTenor10(Float tenor10) {
        this.tenor10 = tenor10;
    }

    /**
     * @return String return the operatorTahunAwal
     */
    public String getOperatorTahunAwal() {
        return operatorTahunAwal;
    }

    /**
     * @param operatorTahunAwal the operatorTahunAwal to set
     */
    public void setOperatorTahunAwal(String operatorTahunAwal) {
        this.operatorTahunAwal = operatorTahunAwal;
    }

    /**
     * @return String return the operatorTahunAkhir
     */
    public String getOperatorTahunAkhir() {
        return operatorTahunAkhir;
    }

    /**
     * @param operatorTahunAkhir the operatorTahunAkhir to set
     */
    public void setOperatorTahunAkhir(String operatorTahunAkhir) {
        this.operatorTahunAkhir = operatorTahunAkhir;
    }

    /**
     * @return String return the operatorOTRAwal
     */
    public String getOperatorOTRAwal() {
        return operatorOTRAwal;
    }

    /**
     * @param operatorOTRAwal the operatorOTRAwal to set
     */
    public void setOperatorOTRAwal(String operatorOTRAwal) {
        this.operatorOTRAwal = operatorOTRAwal;
    }

    /**
     * @return String return the operatorOTRAkhir
     */
    public String getOperatorOTRAkhir() {
        return operatorOTRAkhir;
    }

    /**
     * @param operatorOTRAkhir the operatorOTRAkhir to set
     */
    public void setOperatorOTRAkhir(String operatorOTRAkhir) {
        this.operatorOTRAkhir = operatorOTRAkhir;
    }

    /**
     * @return String return the statusApproved
     */
    public String getStatusApproved() {
        return statusApproved;
    }

    /**
     * @param statusApproved the statusApproved to set
     */
    public void setStatusApproved(String statusApproved) {
        this.statusApproved = statusApproved;
    }

    /**
     * @return String return the remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param remarks the remarks to set
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * @return String return the is_rejected
     */
    public String getIs_rejected() {
        return is_rejected;
    }

    /**
     * @param is_rejected the is_rejected to set
     */
    public void setIs_rejected(String is_rejected) {
        this.is_rejected = is_rejected;
    }

    /**
     * @return Integer return the jenis_pembiayaan
     */
    public Integer getJenis_pembiayaan() {
        return jenis_pembiayaan;
    }

    /**
     * @param jenis_pembiayaan the jenis_pembiayaan to set
     */
    public void setJenis_pembiayaan(Integer jenis_pembiayaan) {
        this.jenis_pembiayaan = jenis_pembiayaan;
    }

    /**
     * @return Integer return the tujuan_penggunaan
     */
    public Integer getTujuan_penggunaan() {
        return tujuan_penggunaan;
    }

    /**
     * @param tujuan_penggunaan the tujuan_penggunaan to set
     */
    public void setTujuan_penggunaan(Integer tujuan_penggunaan) {
        this.tujuan_penggunaan = tujuan_penggunaan;
    }

    /**
     * @return Integer return the program
     */
    public Integer getProgram() {
        return program;
    }

    /**
     * @param program the program to set
     */
    public void setProgram(Integer program) {
        this.program = program;
    }

    /**
     * @return Integer return the is_login
     */
    public Integer getIs_login() {
        return is_login;
    }

    /**
     * @param is_login the is_login to set
     */
    public void setIs_login(Integer is_login) {
        this.is_login = is_login;
    }

}
