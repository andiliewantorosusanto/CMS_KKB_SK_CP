
package com.CMS.CentralParam.KKBSK.model.form;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;


public class RateBungaForm {
    
    private Integer id;
    private String namaSkema;
    private Integer loanType;

    private Integer produk;
    private Integer jenisKendaraan;
    private Integer kondisiKendaraan;
    private ArrayList<Integer> jenisPembiayaan;
    private Integer tujuanPenggunaan;

    private ArrayList<Integer> cluster;
    private Integer program;
    private Integer tipeKonsumen;

    private Integer startTahunKendaraan;
    private Integer endTahun;


    private Float tenor1;
    private Float tenor2;
    private Float tenor3;
    private Float tenor4;

    private Integer tenor5Periode1;
    private Integer tenor5Periode2;

    private Float tenor5Rate1;
    private Float tenor5Rate2;

    private Integer tenor6Periode1;
    private Integer tenor6Periode2;

    private Float tenor6Rate1;
    private Float tenor6Rate2;

    private Integer tenor7Periode1;
    private Integer tenor7Periode2;

    private Float tenor7Rate1;
    private Float tenor7Rate2;

    private Integer tenor8Periode1;
    private Integer tenor8Periode2;

    private Float tenor8Rate1;
    private Float tenor8Rate2;

    private Integer tenor9Periode1;
    private Integer tenor9Periode2;

    private Float tenor9Rate1;
    private Float tenor9Rate2;

    private Integer tenor10Periode1;
    private Integer tenor10Periode2;

    private Float tenor10Rate1;
    private Float tenor10Rate2;

    @NotNull(message = "Start Date Tidak Boleh Kosong")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date startBerlaku;
    @NotNull(message = "End Date Tidak Boleh Kosong")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date endBerlaku;


    public RateBungaForm() {
    }

    public RateBungaForm(Integer id, String namaSkema, Integer loanType, Integer produk, Integer jenisKendaraan, Integer kondisiKendaraan, ArrayList<Integer> jenisPembiayaan, Integer tujuanPenggunaan, ArrayList<Integer> cluster, Integer program, Integer tipeKonsumen, Integer startTahunKendaraan, Integer endTahun, Float tenor1, Float tenor2, Float tenor3, Float tenor4, Integer tenor5Periode1, Integer tenor5Periode2, Float tenor5Rate1, Float tenor5Rate2, Integer tenor6Periode1, Integer tenor6Periode2, Float tenor6Rate1, Float tenor6Rate2, Integer tenor7Periode1, Integer tenor7Periode2, Float tenor7Rate1, Float tenor7Rate2, Integer tenor8Periode1, Integer tenor8Periode2, Float tenor8Rate1, Float tenor8Rate2, Integer tenor9Periode1, Integer tenor9Periode2, Float tenor9Rate1, Float tenor9Rate2, Integer tenor10Periode1, Integer tenor10Periode2, Float tenor10Rate1, Float tenor10Rate2, Date startBerlaku, Date endBerlaku) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.loanType = loanType;
        this.produk = produk;
        this.jenisKendaraan = jenisKendaraan;
        this.kondisiKendaraan = kondisiKendaraan;
        this.jenisPembiayaan = jenisPembiayaan;
        this.tujuanPenggunaan = tujuanPenggunaan;
        this.cluster = cluster;
        this.program = program;
        this.tipeKonsumen = tipeKonsumen;
        this.startTahunKendaraan = startTahunKendaraan;
        this.endTahun = endTahun;
        this.tenor1 = tenor1;
        this.tenor2 = tenor2;
        this.tenor3 = tenor3;
        this.tenor4 = tenor4;
        this.tenor5Periode1 = tenor5Periode1;
        this.tenor5Periode2 = tenor5Periode2;
        this.tenor5Rate1 = tenor5Rate1;
        this.tenor5Rate2 = tenor5Rate2;
        this.tenor6Periode1 = tenor6Periode1;
        this.tenor6Periode2 = tenor6Periode2;
        this.tenor6Rate1 = tenor6Rate1;
        this.tenor6Rate2 = tenor6Rate2;
        this.tenor7Periode1 = tenor7Periode1;
        this.tenor7Periode2 = tenor7Periode2;
        this.tenor7Rate1 = tenor7Rate1;
        this.tenor7Rate2 = tenor7Rate2;
        this.tenor8Periode1 = tenor8Periode1;
        this.tenor8Periode2 = tenor8Periode2;
        this.tenor8Rate1 = tenor8Rate1;
        this.tenor8Rate2 = tenor8Rate2;
        this.tenor9Periode1 = tenor9Periode1;
        this.tenor9Periode2 = tenor9Periode2;
        this.tenor9Rate1 = tenor9Rate1;
        this.tenor9Rate2 = tenor9Rate2;
        this.tenor10Periode1 = tenor10Periode1;
        this.tenor10Periode2 = tenor10Periode2;
        this.tenor10Rate1 = tenor10Rate1;
        this.tenor10Rate2 = tenor10Rate2;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
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

    public Integer getLoanType() {
        return this.loanType;
    }

    public void setLoanType(Integer loanType) {
        this.loanType = loanType;
    }

    public Integer getProduk() {
        return this.produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    public Integer getJenisKendaraan() {
        return this.jenisKendaraan;
    }

    public void setJenisKendaraan(Integer jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public Integer getKondisiKendaraan() {
        return this.kondisiKendaraan;
    }

    public void setKondisiKendaraan(Integer kondisiKendaraan) {
        this.kondisiKendaraan = kondisiKendaraan;
    }

    public ArrayList<Integer> getJenisPembiayaan() {
        return this.jenisPembiayaan;
    }

    public void setJenisPembiayaan(ArrayList<Integer> jenisPembiayaan) {
        this.jenisPembiayaan = jenisPembiayaan;
    }

    public Integer getTujuanPenggunaan() {
        return this.tujuanPenggunaan;
    }

    public void setTujuanPenggunaan(Integer tujuanPenggunaan) {
        this.tujuanPenggunaan = tujuanPenggunaan;
    }

    public ArrayList<Integer> getCluster() {
        return this.cluster;
    }

    public void setCluster(ArrayList<Integer> cluster) {
        this.cluster = cluster;
    }

    public Integer getProgram() {
        return this.program;
    }

    public void setProgram(Integer program) {
        this.program = program;
    }

    public Integer getTipeKonsumen() {
        return this.tipeKonsumen;
    }

    public void setTipeKonsumen(Integer tipeKonsumen) {
        this.tipeKonsumen = tipeKonsumen;
    }

    public Integer getStartTahunKendaraan() {
        return this.startTahunKendaraan;
    }

    public void setStartTahunKendaraan(Integer startTahunKendaraan) {
        this.startTahunKendaraan = startTahunKendaraan;
    }

    public Integer getEndTahun() {
        return this.endTahun;
    }

    public void setEndTahun(Integer endTahun) {
        this.endTahun = endTahun;
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

    public Integer getTenor5Periode1() {
        return this.tenor5Periode1;
    }

    public void setTenor5Periode1(Integer tenor5Periode1) {
        this.tenor5Periode1 = tenor5Periode1;
    }

    public Integer getTenor5Periode2() {
        return this.tenor5Periode2;
    }

    public void setTenor5Periode2(Integer tenor5Periode2) {
        this.tenor5Periode2 = tenor5Periode2;
    }

    public Float getTenor5Rate1() {
        return this.tenor5Rate1;
    }

    public void setTenor5Rate1(Float tenor5Rate1) {
        this.tenor5Rate1 = tenor5Rate1;
    }

    public Float getTenor5Rate2() {
        return this.tenor5Rate2;
    }

    public void setTenor5Rate2(Float tenor5Rate2) {
        this.tenor5Rate2 = tenor5Rate2;
    }

    public Integer getTenor6Periode1() {
        return this.tenor6Periode1;
    }

    public void setTenor6Periode1(Integer tenor6Periode1) {
        this.tenor6Periode1 = tenor6Periode1;
    }

    public Integer getTenor6Periode2() {
        return this.tenor6Periode2;
    }

    public void setTenor6Periode2(Integer tenor6Periode2) {
        this.tenor6Periode2 = tenor6Periode2;
    }

    public Float getTenor6Rate1() {
        return this.tenor6Rate1;
    }

    public void setTenor6Rate1(Float tenor6Rate1) {
        this.tenor6Rate1 = tenor6Rate1;
    }

    public Float getTenor6Rate2() {
        return this.tenor6Rate2;
    }

    public void setTenor6Rate2(Float tenor6Rate2) {
        this.tenor6Rate2 = tenor6Rate2;
    }

    public Integer getTenor7Periode1() {
        return this.tenor7Periode1;
    }

    public void setTenor7Periode1(Integer tenor7Periode1) {
        this.tenor7Periode1 = tenor7Periode1;
    }

    public Integer getTenor7Periode2() {
        return this.tenor7Periode2;
    }

    public void setTenor7Periode2(Integer tenor7Periode2) {
        this.tenor7Periode2 = tenor7Periode2;
    }

    public Float getTenor7Rate1() {
        return this.tenor7Rate1;
    }

    public void setTenor7Rate1(Float tenor7Rate1) {
        this.tenor7Rate1 = tenor7Rate1;
    }

    public Float getTenor7Rate2() {
        return this.tenor7Rate2;
    }

    public void setTenor7Rate2(Float tenor7Rate2) {
        this.tenor7Rate2 = tenor7Rate2;
    }

    public Integer getTenor8Periode1() {
        return this.tenor8Periode1;
    }

    public void setTenor8Periode1(Integer tenor8Periode1) {
        this.tenor8Periode1 = tenor8Periode1;
    }

    public Integer getTenor8Periode2() {
        return this.tenor8Periode2;
    }

    public void setTenor8Periode2(Integer tenor8Periode2) {
        this.tenor8Periode2 = tenor8Periode2;
    }

    public Float getTenor8Rate1() {
        return this.tenor8Rate1;
    }

    public void setTenor8Rate1(Float tenor8Rate1) {
        this.tenor8Rate1 = tenor8Rate1;
    }

    public Float getTenor8Rate2() {
        return this.tenor8Rate2;
    }

    public void setTenor8Rate2(Float tenor8Rate2) {
        this.tenor8Rate2 = tenor8Rate2;
    }

    public Integer getTenor9Periode1() {
        return this.tenor9Periode1;
    }

    public void setTenor9Periode1(Integer tenor9Periode1) {
        this.tenor9Periode1 = tenor9Periode1;
    }

    public Integer getTenor9Periode2() {
        return this.tenor9Periode2;
    }

    public void setTenor9Periode2(Integer tenor9Periode2) {
        this.tenor9Periode2 = tenor9Periode2;
    }

    public Float getTenor9Rate1() {
        return this.tenor9Rate1;
    }

    public void setTenor9Rate1(Float tenor9Rate1) {
        this.tenor9Rate1 = tenor9Rate1;
    }

    public Float getTenor9Rate2() {
        return this.tenor9Rate2;
    }

    public void setTenor9Rate2(Float tenor9Rate2) {
        this.tenor9Rate2 = tenor9Rate2;
    }

    public Integer getTenor10Periode1() {
        return this.tenor10Periode1;
    }

    public void setTenor10Periode1(Integer tenor10Periode1) {
        this.tenor10Periode1 = tenor10Periode1;
    }

    public Integer getTenor10Periode2() {
        return this.tenor10Periode2;
    }

    public void setTenor10Periode2(Integer tenor10Periode2) {
        this.tenor10Periode2 = tenor10Periode2;
    }

    public Float getTenor10Rate1() {
        return this.tenor10Rate1;
    }

    public void setTenor10Rate1(Float tenor10Rate1) {
        this.tenor10Rate1 = tenor10Rate1;
    }

    public Float getTenor10Rate2() {
        return this.tenor10Rate2;
    }

    public void setTenor10Rate2(Float tenor10Rate2) {
        this.tenor10Rate2 = tenor10Rate2;
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

    public RateBungaForm id(Integer id) {
        setId(id);
        return this;
    }

    public RateBungaForm namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public RateBungaForm loanType(Integer loanType) {
        setLoanType(loanType);
        return this;
    }

    public RateBungaForm produk(Integer produk) {
        setProduk(produk);
        return this;
    }

    public RateBungaForm jenisKendaraan(Integer jenisKendaraan) {
        setJenisKendaraan(jenisKendaraan);
        return this;
    }

    public RateBungaForm kondisiKendaraan(Integer kondisiKendaraan) {
        setKondisiKendaraan(kondisiKendaraan);
        return this;
    }

    public RateBungaForm jenisPembiayaan(ArrayList<Integer> jenisPembiayaan) {
        setJenisPembiayaan(jenisPembiayaan);
        return this;
    }

    public RateBungaForm tujuanPenggunaan(Integer tujuanPenggunaan) {
        setTujuanPenggunaan(tujuanPenggunaan);
        return this;
    }

    public RateBungaForm cluster(ArrayList<Integer> cluster) {
        setCluster(cluster);
        return this;
    }

    public RateBungaForm program(Integer program) {
        setProgram(program);
        return this;
    }

    public RateBungaForm tipeKonsumen(Integer tipeKonsumen) {
        setTipeKonsumen(tipeKonsumen);
        return this;
    }

    public RateBungaForm startTahunKendaraan(Integer startTahunKendaraan) {
        setStartTahunKendaraan(startTahunKendaraan);
        return this;
    }

    public RateBungaForm endTahun(Integer endTahun) {
        setEndTahun(endTahun);
        return this;
    }

    public RateBungaForm tenor1(Float tenor1) {
        setTenor1(tenor1);
        return this;
    }

    public RateBungaForm tenor2(Float tenor2) {
        setTenor2(tenor2);
        return this;
    }

    public RateBungaForm tenor3(Float tenor3) {
        setTenor3(tenor3);
        return this;
    }

    public RateBungaForm tenor4(Float tenor4) {
        setTenor4(tenor4);
        return this;
    }

    public RateBungaForm tenor5Periode1(Integer tenor5Periode1) {
        setTenor5Periode1(tenor5Periode1);
        return this;
    }

    public RateBungaForm tenor5Periode2(Integer tenor5Periode2) {
        setTenor5Periode2(tenor5Periode2);
        return this;
    }

    public RateBungaForm tenor5Rate1(Float tenor5Rate1) {
        setTenor5Rate1(tenor5Rate1);
        return this;
    }

    public RateBungaForm tenor5Rate2(Float tenor5Rate2) {
        setTenor5Rate2(tenor5Rate2);
        return this;
    }

    public RateBungaForm tenor6Periode1(Integer tenor6Periode1) {
        setTenor6Periode1(tenor6Periode1);
        return this;
    }

    public RateBungaForm tenor6Periode2(Integer tenor6Periode2) {
        setTenor6Periode2(tenor6Periode2);
        return this;
    }

    public RateBungaForm tenor6Rate1(Float tenor6Rate1) {
        setTenor6Rate1(tenor6Rate1);
        return this;
    }

    public RateBungaForm tenor6Rate2(Float tenor6Rate2) {
        setTenor6Rate2(tenor6Rate2);
        return this;
    }

    public RateBungaForm tenor7Periode1(Integer tenor7Periode1) {
        setTenor7Periode1(tenor7Periode1);
        return this;
    }

    public RateBungaForm tenor7Periode2(Integer tenor7Periode2) {
        setTenor7Periode2(tenor7Periode2);
        return this;
    }

    public RateBungaForm tenor7Rate1(Float tenor7Rate1) {
        setTenor7Rate1(tenor7Rate1);
        return this;
    }

    public RateBungaForm tenor7Rate2(Float tenor7Rate2) {
        setTenor7Rate2(tenor7Rate2);
        return this;
    }

    public RateBungaForm tenor8Periode1(Integer tenor8Periode1) {
        setTenor8Periode1(tenor8Periode1);
        return this;
    }

    public RateBungaForm tenor8Periode2(Integer tenor8Periode2) {
        setTenor8Periode2(tenor8Periode2);
        return this;
    }

    public RateBungaForm tenor8Rate1(Float tenor8Rate1) {
        setTenor8Rate1(tenor8Rate1);
        return this;
    }

    public RateBungaForm tenor8Rate2(Float tenor8Rate2) {
        setTenor8Rate2(tenor8Rate2);
        return this;
    }

    public RateBungaForm tenor9Periode1(Integer tenor9Periode1) {
        setTenor9Periode1(tenor9Periode1);
        return this;
    }

    public RateBungaForm tenor9Periode2(Integer tenor9Periode2) {
        setTenor9Periode2(tenor9Periode2);
        return this;
    }

    public RateBungaForm tenor9Rate1(Float tenor9Rate1) {
        setTenor9Rate1(tenor9Rate1);
        return this;
    }

    public RateBungaForm tenor9Rate2(Float tenor9Rate2) {
        setTenor9Rate2(tenor9Rate2);
        return this;
    }

    public RateBungaForm tenor10Periode1(Integer tenor10Periode1) {
        setTenor10Periode1(tenor10Periode1);
        return this;
    }

    public RateBungaForm tenor10Periode2(Integer tenor10Periode2) {
        setTenor10Periode2(tenor10Periode2);
        return this;
    }

    public RateBungaForm tenor10Rate1(Float tenor10Rate1) {
        setTenor10Rate1(tenor10Rate1);
        return this;
    }

    public RateBungaForm tenor10Rate2(Float tenor10Rate2) {
        setTenor10Rate2(tenor10Rate2);
        return this;
    }

    public RateBungaForm startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public RateBungaForm endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            ", loanType='" + getLoanType() + "'" +
            ", produk='" + getProduk() + "'" +
            ", jenisKendaraan='" + getJenisKendaraan() + "'" +
            ", kondisiKendaraan='" + getKondisiKendaraan() + "'" +
            ", jenisPembiayaan='" + getJenisPembiayaan() + "'" +
            ", tujuanPenggunaan='" + getTujuanPenggunaan() + "'" +
            ", cluster='" + getCluster() + "'" +
            ", program='" + getProgram() + "'" +
            ", tipeKonsumen='" + getTipeKonsumen() + "'" +
            ", startTahunKendaraan='" + getStartTahunKendaraan() + "'" +
            ", endTahun='" + getEndTahun() + "'" +
            ", tenor1='" + getTenor1() + "'" +
            ", tenor2='" + getTenor2() + "'" +
            ", tenor3='" + getTenor3() + "'" +
            ", tenor4='" + getTenor4() + "'" +
            ", tenor5Periode1='" + getTenor5Periode1() + "'" +
            ", tenor5Periode2='" + getTenor5Periode2() + "'" +
            ", tenor5Rate1='" + getTenor5Rate1() + "'" +
            ", tenor5Rate2='" + getTenor5Rate2() + "'" +
            ", tenor6Periode1='" + getTenor6Periode1() + "'" +
            ", tenor6Periode2='" + getTenor6Periode2() + "'" +
            ", tenor6Rate1='" + getTenor6Rate1() + "'" +
            ", tenor6Rate2='" + getTenor6Rate2() + "'" +
            ", tenor7Periode1='" + getTenor7Periode1() + "'" +
            ", tenor7Periode2='" + getTenor7Periode2() + "'" +
            ", tenor7Rate1='" + getTenor7Rate1() + "'" +
            ", tenor7Rate2='" + getTenor7Rate2() + "'" +
            ", tenor8Periode1='" + getTenor8Periode1() + "'" +
            ", tenor8Periode2='" + getTenor8Periode2() + "'" +
            ", tenor8Rate1='" + getTenor8Rate1() + "'" +
            ", tenor8Rate2='" + getTenor8Rate2() + "'" +
            ", tenor9Periode1='" + getTenor9Periode1() + "'" +
            ", tenor9Periode2='" + getTenor9Periode2() + "'" +
            ", tenor9Rate1='" + getTenor9Rate1() + "'" +
            ", tenor9Rate2='" + getTenor9Rate2() + "'" +
            ", tenor10Periode1='" + getTenor10Periode1() + "'" +
            ", tenor10Periode2='" + getTenor10Periode2() + "'" +
            ", tenor10Rate1='" + getTenor10Rate1() + "'" +
            ", tenor10Rate2='" + getTenor10Rate2() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            "}";
    }

}
