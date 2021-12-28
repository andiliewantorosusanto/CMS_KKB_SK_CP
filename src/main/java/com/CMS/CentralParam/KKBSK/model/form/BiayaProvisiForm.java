
package com.CMS.CentralParam.KKBSK.model.form;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;


public class BiayaProvisiForm {
    
    private Integer id;
    private String namaSkema;
    private Integer loanType;

    private Integer jenisKendaraan;
    private ArrayList<Integer> jenisPembiayaan;

    private Float tenor1;
    private Float tenor2;
    private Float tenor3;
    private Float tenor4;
    private Float tenor5;
    private Float tenor6;
    private Float tenor7;
    private Float tenor8;
    private Float tenor9;
    private Float tenor10;

    private Float tenor1Persen;
    private Float tenor2Persen;
    private Float tenor3Persen;
    private Float tenor4Persen;
    private Float tenor5Persen;
    private Float tenor6Persen;
    private Float tenor7Persen;
    private Float tenor8Persen;
    private Float tenor9Persen;
    private Float tenor10Persen;

    @NotNull(message = "Start Date Tidak Boleh Kosong")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date startBerlaku;
    @NotNull(message = "End Date Tidak Boleh Kosong")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date endBerlaku;



    public BiayaProvisiForm() {
    }

    public BiayaProvisiForm(Integer id, String namaSkema, Integer loanType, Integer jenisKendaraan, ArrayList<Integer> jenisPembiayaan, Float tenor1, Float tenor2, Float tenor3, Float tenor4, Float tenor5, Float tenor6, Float tenor7, Float tenor8, Float tenor9, Float tenor10, Float tenor1Persen, Float tenor2Persen, Float tenor3Persen, Float tenor4Persen, Float tenor5Persen, Float tenor6Persen, Float tenor7Persen, Float tenor8Persen, Float tenor9Persen, Float tenor10Persen, Date startBerlaku, Date endBerlaku) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.loanType = loanType;
        this.jenisKendaraan = jenisKendaraan;
        this.jenisPembiayaan = jenisPembiayaan;
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
        this.tenor1Persen = tenor1Persen;
        this.tenor2Persen = tenor2Persen;
        this.tenor3Persen = tenor3Persen;
        this.tenor4Persen = tenor4Persen;
        this.tenor5Persen = tenor5Persen;
        this.tenor6Persen = tenor6Persen;
        this.tenor7Persen = tenor7Persen;
        this.tenor8Persen = tenor8Persen;
        this.tenor9Persen = tenor9Persen;
        this.tenor10Persen = tenor10Persen;
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

    public Integer getJenisKendaraan() {
        return this.jenisKendaraan;
    }

    public void setJenisKendaraan(Integer jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public ArrayList<Integer> getJenisPembiayaan() {
        return this.jenisPembiayaan;
    }

    public void setJenisPembiayaan(ArrayList<Integer> jenisPembiayaan) {
        this.jenisPembiayaan = jenisPembiayaan;
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

    public Float getTenor1Persen() {
        return this.tenor1Persen;
    }

    public void setTenor1Persen(Float tenor1Persen) {
        this.tenor1Persen = tenor1Persen;
    }

    public Float getTenor2Persen() {
        return this.tenor2Persen;
    }

    public void setTenor2Persen(Float tenor2Persen) {
        this.tenor2Persen = tenor2Persen;
    }

    public Float getTenor3Persen() {
        return this.tenor3Persen;
    }

    public void setTenor3Persen(Float tenor3Persen) {
        this.tenor3Persen = tenor3Persen;
    }

    public Float getTenor4Persen() {
        return this.tenor4Persen;
    }

    public void setTenor4Persen(Float tenor4Persen) {
        this.tenor4Persen = tenor4Persen;
    }

    public Float getTenor5Persen() {
        return this.tenor5Persen;
    }

    public void setTenor5Persen(Float tenor5Persen) {
        this.tenor5Persen = tenor5Persen;
    }

    public Float getTenor6Persen() {
        return this.tenor6Persen;
    }

    public void setTenor6Persen(Float tenor6Persen) {
        this.tenor6Persen = tenor6Persen;
    }

    public Float getTenor7Persen() {
        return this.tenor7Persen;
    }

    public void setTenor7Persen(Float tenor7Persen) {
        this.tenor7Persen = tenor7Persen;
    }

    public Float getTenor8Persen() {
        return this.tenor8Persen;
    }

    public void setTenor8Persen(Float tenor8Persen) {
        this.tenor8Persen = tenor8Persen;
    }

    public Float getTenor9Persen() {
        return this.tenor9Persen;
    }

    public void setTenor9Persen(Float tenor9Persen) {
        this.tenor9Persen = tenor9Persen;
    }

    public Float getTenor10Persen() {
        return this.tenor10Persen;
    }

    public void setTenor10Persen(Float tenor10Persen) {
        this.tenor10Persen = tenor10Persen;
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

    public BiayaProvisiForm id(Integer id) {
        setId(id);
        return this;
    }

    public BiayaProvisiForm namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public BiayaProvisiForm loanType(Integer loanType) {
        setLoanType(loanType);
        return this;
    }

    public BiayaProvisiForm jenisKendaraan(Integer jenisKendaraan) {
        setJenisKendaraan(jenisKendaraan);
        return this;
    }

    public BiayaProvisiForm jenisPembiayaan(ArrayList<Integer> jenisPembiayaan) {
        setJenisPembiayaan(jenisPembiayaan);
        return this;
    }

    public BiayaProvisiForm tenor1(Float tenor1) {
        setTenor1(tenor1);
        return this;
    }

    public BiayaProvisiForm tenor2(Float tenor2) {
        setTenor2(tenor2);
        return this;
    }

    public BiayaProvisiForm tenor3(Float tenor3) {
        setTenor3(tenor3);
        return this;
    }

    public BiayaProvisiForm tenor4(Float tenor4) {
        setTenor4(tenor4);
        return this;
    }

    public BiayaProvisiForm tenor5(Float tenor5) {
        setTenor5(tenor5);
        return this;
    }

    public BiayaProvisiForm tenor6(Float tenor6) {
        setTenor6(tenor6);
        return this;
    }

    public BiayaProvisiForm tenor7(Float tenor7) {
        setTenor7(tenor7);
        return this;
    }

    public BiayaProvisiForm tenor8(Float tenor8) {
        setTenor8(tenor8);
        return this;
    }

    public BiayaProvisiForm tenor9(Float tenor9) {
        setTenor9(tenor9);
        return this;
    }

    public BiayaProvisiForm tenor10(Float tenor10) {
        setTenor10(tenor10);
        return this;
    }

    public BiayaProvisiForm tenor1Persen(Float tenor1Persen) {
        setTenor1Persen(tenor1Persen);
        return this;
    }

    public BiayaProvisiForm tenor2Persen(Float tenor2Persen) {
        setTenor2Persen(tenor2Persen);
        return this;
    }

    public BiayaProvisiForm tenor3Persen(Float tenor3Persen) {
        setTenor3Persen(tenor3Persen);
        return this;
    }

    public BiayaProvisiForm tenor4Persen(Float tenor4Persen) {
        setTenor4Persen(tenor4Persen);
        return this;
    }

    public BiayaProvisiForm tenor5Persen(Float tenor5Persen) {
        setTenor5Persen(tenor5Persen);
        return this;
    }

    public BiayaProvisiForm tenor6Persen(Float tenor6Persen) {
        setTenor6Persen(tenor6Persen);
        return this;
    }

    public BiayaProvisiForm tenor7Persen(Float tenor7Persen) {
        setTenor7Persen(tenor7Persen);
        return this;
    }

    public BiayaProvisiForm tenor8Persen(Float tenor8Persen) {
        setTenor8Persen(tenor8Persen);
        return this;
    }

    public BiayaProvisiForm tenor9Persen(Float tenor9Persen) {
        setTenor9Persen(tenor9Persen);
        return this;
    }

    public BiayaProvisiForm tenor10Persen(Float tenor10Persen) {
        setTenor10Persen(tenor10Persen);
        return this;
    }

    public BiayaProvisiForm startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public BiayaProvisiForm endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            ", loanType='" + getLoanType() + "'" +
            ", jenisKendaraan='" + getJenisKendaraan() + "'" +
            ", jenisPembiayaan='" + getJenisPembiayaan() + "'" +
            ", tenor1='" + getTenor1() + "'" +
            ", tenor2='" + getTenor2() + "'" +
            ", tenor3='" + getTenor3() + "'" +
            ", tenor4='" + getTenor4() + "'" +
            ", tenor5='" + getTenor5() + "'" +
            ", tenor6='" + getTenor6() + "'" +
            ", tenor7='" + getTenor7() + "'" +
            ", tenor8='" + getTenor8() + "'" +
            ", tenor9='" + getTenor9() + "'" +
            ", tenor10='" + getTenor10() + "'" +
            ", tenor1Persen='" + getTenor1Persen() + "'" +
            ", tenor2Persen='" + getTenor2Persen() + "'" +
            ", tenor3Persen='" + getTenor3Persen() + "'" +
            ", tenor4Persen='" + getTenor4Persen() + "'" +
            ", tenor5Persen='" + getTenor5Persen() + "'" +
            ", tenor6Persen='" + getTenor6Persen() + "'" +
            ", tenor7Persen='" + getTenor7Persen() + "'" +
            ", tenor8Persen='" + getTenor8Persen() + "'" +
            ", tenor9Persen='" + getTenor9Persen() + "'" +
            ", tenor10Persen='" + getTenor10Persen() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            "}";
    }

}
