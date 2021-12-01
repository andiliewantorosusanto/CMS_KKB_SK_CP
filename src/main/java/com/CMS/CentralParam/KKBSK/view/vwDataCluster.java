package com.CMS.CentralParam.KKBSK.view;

import java.util.Date;

public class vwDataCluster {
    //private Integer skema;
    private String cluster;
    private Integer produk;
    private Date start_date;
    private Date end_date;
    

    public vwDataCluster(String cluster, Integer produk, Date start_date, Date end_date) {
        this.cluster = cluster;
        this.produk = produk;
        this.start_date = start_date;
        this.end_date = end_date;
    }

    public String getCluster() {
        return this.cluster;
    }

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    public Integer getProduk() {
        return this.produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    public Date getStart_date() {
        return this.start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return this.end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
    

}