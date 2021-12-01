
package com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "is_approved",
    "is_rejected",
    "remarks",
    "createdby",
    "createddate",
    "updatedby",
    "updateddate",
    "nama",
    "produk",
    "deskripsi",
    "start_date",
    "end_date"
})
@Generated("jsonschema2pojo")
public class TipeKonsuman {

    @JsonProperty("id")
    private Integer id;
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
    private Integer updatedby;
    @JsonProperty("updateddate")
    private String updateddate;
    @JsonProperty("nama")
    private String nama;
    @JsonProperty("produk")
    private Integer produk;
    @JsonProperty("deskripsi")
    private String deskripsi;
    @JsonProperty("start_date")
    private String startDate;
    @JsonProperty("end_date")
    private String endDate;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TipeKonsuman() {
    }

    /**
     * 
     * @param updatedby
     * @param createddate
     * @param endDate
     * @param nama
     * @param produk
     * @param createdby
     * @param updateddate
     * @param isRejected
     * @param id
     * @param deskripsi
     * @param isApproved
     * @param remarks
     * @param startDate
     */
    public TipeKonsuman(Integer id, Object isApproved, Object isRejected, Object remarks, Integer createdby, String createddate, Integer updatedby, String updateddate, String nama, Integer produk, String deskripsi, String startDate, String endDate) {
        super();
        this.id = id;
        this.isApproved = isApproved;
        this.isRejected = isRejected;
        this.remarks = remarks;
        this.createdby = createdby;
        this.createddate = createddate;
        this.updatedby = updatedby;
        this.updateddate = updateddate;
        this.nama = nama;
        this.produk = produk;
        this.deskripsi = deskripsi;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
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
    public Integer getUpdatedby() {
        return updatedby;
    }

    @JsonProperty("updatedby")
    public void setUpdatedby(Integer updatedby) {
        this.updatedby = updatedby;
    }

    @JsonProperty("updateddate")
    public String getUpdateddate() {
        return updateddate;
    }

    @JsonProperty("updateddate")
    public void setUpdateddate(String updateddate) {
        this.updateddate = updateddate;
    }

    @JsonProperty("nama")
    public String getNama() {
        return nama;
    }

    @JsonProperty("nama")
    public void setNama(String nama) {
        this.nama = nama;
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

}
