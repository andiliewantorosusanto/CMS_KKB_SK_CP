
package com.CMS.CentralParam.KKBSK.model.RESPON;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "cluster_id",
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
public class Cluster {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("cluster_id")
    private String clusterId;
    @JsonProperty("produk")
    private Integer produk;
    @JsonProperty("deskripsi")
    private String deskripsi;
    @JsonProperty("start_date")
    private String startDate;
    @JsonProperty("end_date")
    private String endDate;
    @JsonProperty("is_approved")
    private Object isApproved;
    @JsonProperty("is_rejected")
    private Object isRejected;
    @JsonProperty("remarks")
    private Object remarks;
    @JsonProperty("createdby")
    private Integer createdby;
    @JsonProperty("createddate")
    private String createddate;
    @JsonProperty("updatedby")
    private Object updatedby;
    @JsonProperty("updateddate")
    private Object updateddate;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cluster() {
    }

    /**
     * 
     * @param updatedby
     * @param endDate
     * @param createddate
     * @param clusterId
     * @param produk
     * @param createdby
     * @param updateddate
     * @param isRejected
     * @param id
     * @param deskripsi
     * @param isApproved
     * @param startDate
     * @param remarks
     */
    public Cluster(Integer id, String clusterId, Integer produk, String deskripsi, String startDate, String endDate, Object isApproved, Object isRejected, Object remarks, Integer createdby, String createddate, Object updatedby, Object updateddate) {
        super();
        this.id = id;
        this.clusterId = clusterId;
        this.produk = produk;
        this.deskripsi = deskripsi;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isApproved = isApproved;
        this.isRejected = isRejected;
        this.remarks = remarks;
        this.createdby = createdby;
        this.createddate = createddate;
        this.updatedby = updatedby;
        this.updateddate = updateddate;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("cluster_id")
    public String getClusterId() {
        return clusterId;
    }

    @JsonProperty("cluster_id")
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    @JsonProperty("produk")
    public Integer getProduk() {
        return produk;
    }

    @JsonProperty("produk")
    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    @JsonProperty("deskripsi")
    public String getDeskripsi() {
        return deskripsi;
    }

    @JsonProperty("deskripsi")
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @JsonProperty("start_date")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("end_date")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("end_date")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("is_approved")
    public Object getIsApproved() {
        return isApproved;
    }

    @JsonProperty("is_approved")
    public void setIsApproved(Object isApproved) {
        this.isApproved = isApproved;
    }

    @JsonProperty("is_rejected")
    public Object getIsRejected() {
        return isRejected;
    }

    @JsonProperty("is_rejected")
    public void setIsRejected(Object isRejected) {
        this.isRejected = isRejected;
    }

    @JsonProperty("remarks")
    public Object getRemarks() {
        return remarks;
    }

    @JsonProperty("remarks")
    public void setRemarks(Object remarks) {
        this.remarks = remarks;
    }

    @JsonProperty("createdby")
    public Integer getCreatedby() {
        return createdby;
    }

    @JsonProperty("createdby")
    public void setCreatedby(Integer createdby) {
        this.createdby = createdby;
    }

    @JsonProperty("createddate")
    public String getCreateddate() {
        return createddate;
    }

    @JsonProperty("createddate")
    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    @JsonProperty("updatedby")
    public Object getUpdatedby() {
        return updatedby;
    }

    @JsonProperty("updatedby")
    public void setUpdatedby(Object updatedby) {
        this.updatedby = updatedby;
    }

    @JsonProperty("updateddate")
    public Object getUpdateddate() {
        return updateddate;
    }

    @JsonProperty("updateddate")
    public void setUpdateddate(Object updateddate) {
        this.updateddate = updateddate;
    }

}
