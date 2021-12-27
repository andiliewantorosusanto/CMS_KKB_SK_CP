package com.CMS.CentralParam.KKBSK.view;

import java.util.Date;

public class vwRateCP {
    private Integer id;
    private String namaSkema;

    private Integer tipeKonsumen;
    private String tipeKonsumenName;

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

    private Date startBerlaku;
    private Date endBerlaku;

    private Integer statusApproval;
    private String remarks;
    private Integer isRejected;
    private Integer isApproved;


    public vwRateCP() {
    }

    public vwRateCP(Integer id, String namaSkema, Integer tipeKonsumen, String tipeKonsumenName, Float tenor1, Float tenor2, Float tenor3, Float tenor4, Float tenor5, Float tenor6, Float tenor7, Float tenor8, Float tenor9, Float tenor10, Date startBerlaku, Date endBerlaku, Integer statusApproval, String remarks, Integer isRejected, Integer isApproved) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.tipeKonsumen = tipeKonsumen;
        this.tipeKonsumenName = tipeKonsumenName;
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
        this.statusApproval = statusApproval;
        this.remarks = remarks;
        this.isRejected = isRejected;
        this.isApproved = isApproved;
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

    public Integer getTipeKonsumen() {
        return this.tipeKonsumen;
    }

    public void setTipeKonsumen(Integer tipeKonsumen) {
        this.tipeKonsumen = tipeKonsumen;
    }

    public String getTipeKonsumenName() {
        return this.tipeKonsumenName;
    }

    public void setTipeKonsumenName(String tipeKonsumenName) {
        this.tipeKonsumenName = tipeKonsumenName;
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

    public Integer getStatusApproval() {
        return this.statusApproval;
    }

    public void setStatusApproval(Integer statusApproval) {
        this.statusApproval = statusApproval;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getIsRejected() {
        return this.isRejected;
    }

    public void setIsRejected(Integer isRejected) {
        this.isRejected = isRejected;
    }

    public Integer getIsApproved() {
        return this.isApproved;
    }

    public void setIsApproved(Integer isApproved) {
        this.isApproved = isApproved;
    }

    public vwRateCP id(Integer id) {
        setId(id);
        return this;
    }

    public vwRateCP namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public vwRateCP tipeKonsumen(Integer tipeKonsumen) {
        setTipeKonsumen(tipeKonsumen);
        return this;
    }

    public vwRateCP tipeKonsumenName(String tipeKonsumenName) {
        setTipeKonsumenName(tipeKonsumenName);
        return this;
    }

    public vwRateCP tenor1(Float tenor1) {
        setTenor1(tenor1);
        return this;
    }

    public vwRateCP tenor2(Float tenor2) {
        setTenor2(tenor2);
        return this;
    }

    public vwRateCP tenor3(Float tenor3) {
        setTenor3(tenor3);
        return this;
    }

    public vwRateCP tenor4(Float tenor4) {
        setTenor4(tenor4);
        return this;
    }

    public vwRateCP tenor5(Float tenor5) {
        setTenor5(tenor5);
        return this;
    }

    public vwRateCP tenor6(Float tenor6) {
        setTenor6(tenor6);
        return this;
    }

    public vwRateCP tenor7(Float tenor7) {
        setTenor7(tenor7);
        return this;
    }

    public vwRateCP tenor8(Float tenor8) {
        setTenor8(tenor8);
        return this;
    }

    public vwRateCP tenor9(Float tenor9) {
        setTenor9(tenor9);
        return this;
    }

    public vwRateCP tenor10(Float tenor10) {
        setTenor10(tenor10);
        return this;
    }

    public vwRateCP startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public vwRateCP endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public vwRateCP statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    public vwRateCP remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public vwRateCP isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public vwRateCP isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            ", tipeKonsumen='" + getTipeKonsumen() + "'" +
            ", tipeKonsumenName='" + getTipeKonsumenName() + "'" +
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
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", isRejected='" + getIsRejected() + "'" +
            ", isApproved='" + getIsApproved() + "'" +
            "}";
    }


}