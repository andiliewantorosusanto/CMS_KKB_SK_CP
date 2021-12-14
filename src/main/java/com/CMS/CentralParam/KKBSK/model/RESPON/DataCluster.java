
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.Date;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import org.springframework.format.annotation.DateTimeFormat;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "cluster",
    "produk",
    "deskripsi",
    "start_date",
    "end_date",
    "is_approved",
    "is_rejected",
    "remarks",
    "createdby",
    "createddate",
    "updatedby",
    "updateddate"
})
@Generated("jsonschema2pojo")
public class DataCluster {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("cluster")
    private String cluster;
    @JsonProperty("produk")
    private Integer produk;
    @JsonProperty("deskripsi")
    private String deskripsi;
    @JsonProperty("start_date")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date start_date;
    @JsonProperty("end_date")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date end_date;
    @JsonProperty("is_approved")
    private Integer is_approved;
    @JsonProperty("is_rejected")
    private Integer is_rejected;
    @JsonProperty("remarks")
    private String remarks;
    @JsonProperty("createdby")
    private Integer createdby;
    @JsonProperty("createddate")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date createddate;
    @JsonProperty("updatedby")
    private Integer updatedby;
    @JsonProperty("updateddate")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date updateddate;


    public DataCluster() {
    }

    public DataCluster(Integer id, String cluster, Integer produk, String deskripsi, Date start_date, Date end_date, Integer is_approved, Integer is_rejected, String remarks, Integer createdby, Date createddate, Integer updatedby, Date updateddate) {
        this.id = id;
        this.cluster = cluster;
        this.produk = produk;
        this.deskripsi = deskripsi;
        this.start_date = start_date;
        this.end_date = end_date;
        this.is_approved = is_approved;
        this.is_rejected = is_rejected;
        this.remarks = remarks;
        this.createdby = createdby;
        this.createddate = createddate;
        this.updatedby = updatedby;
        this.updateddate = updateddate;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getDeskripsi() {
        return this.deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
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

    public Integer getIs_approved() {
        return this.is_approved;
    }

    public void setIs_approved(Integer is_approved) {
        this.is_approved = is_approved;
    }

    public Integer getIs_rejected() {
        return this.is_rejected;
    }

    public void setIs_rejected(Integer is_rejected) {
        this.is_rejected = is_rejected;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public DataCluster id(Integer id) {
        setId(id);
        return this;
    }

    public DataCluster cluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    public DataCluster produk(Integer produk) {
        setProduk(produk);
        return this;
    }

    public DataCluster deskripsi(String deskripsi) {
        setDeskripsi(deskripsi);
        return this;
    }

    public DataCluster start_date(Date start_date) {
        setStart_date(start_date);
        return this;
    }

    public DataCluster end_date(Date end_date) {
        setEnd_date(end_date);
        return this;
    }

    public DataCluster is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    public DataCluster is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public DataCluster remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public DataCluster createdby(Integer createdby) {
        setCreatedby(createdby);
        return this;
    }

    public DataCluster createddate(Date createddate) {
        setCreateddate(createddate);
        return this;
    }

    public DataCluster updatedby(Integer updatedby) {
        setUpdatedby(updatedby);
        return this;
    }

    public DataCluster updateddate(Date updateddate) {
        setUpdateddate(updateddate);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", cluster='" + getCluster() + "'" +
            ", produk='" + getProduk() + "'" +
            ", deskripsi='" + getDeskripsi() + "'" +
            ", start_date='" + getStart_date() + "'" +
            ", end_date='" + getEnd_date() + "'" +
            ", is_approved='" + getIs_approved() + "'" +
            ", is_rejected='" + getIs_rejected() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", createdby='" + getCreatedby() + "'" +
            ", createddate='" + getCreateddate() + "'" +
            ", updatedby='" + getUpdatedby() + "'" +
            ", updateddate='" + getUpdateddate() + "'" +
            "}";
    }


}
