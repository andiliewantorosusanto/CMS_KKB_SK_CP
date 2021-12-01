
package com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "jenis_pembiayaan_id",
    "produk",
    "is_refinancing",
    "start_date",
    "end_date",
    "is_approved",
    "is_rejected",
    "createdby",
    "createddate",
    "updatedby",
    "updateddate",
    "remarks"
})
@Generated("jsonschema2pojo")
public class JenisPembiayaan {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("jenis_pembiayaan_id")
    private String jenisPembiayaanId;
    @JsonProperty("produk")
    private Integer produk;
    @JsonProperty("is_refinancing")
    private Integer isRefinancing;
    @JsonProperty("start_date")
    private String startDate;
    @JsonProperty("end_date")
    private String endDate;
    @JsonProperty("is_approved")
    private Object isApproved;
    @JsonProperty("is_rejected")
    private Object isRejected;
    @JsonProperty("createdby")
    private Object createdby;
    @JsonProperty("createddate")
    private String createddate;
    @JsonProperty("updatedby")
    private Object updatedby;
    @JsonProperty("updateddate")
    private Object updateddate;
    @JsonProperty("remarks")
    private Object remarks;

    /**
     * No args constructor for use in serialization
     * 
     */
    public JenisPembiayaan() {
    }

    /**
     * 
     * @param updatedby
     * @param jenisPembiayaanId
     * @param endDate
     * @param createddate
     * @param isRefinancing
     * @param produk
     * @param createdby
     * @param updateddate
     * @param isRejected
     * @param id
     * @param isApproved
     * @param startDate
     * @param remarks
     */
    public JenisPembiayaan(Integer id, String jenisPembiayaanId, Integer produk, Integer isRefinancing, String startDate, String endDate, Object isApproved, Object isRejected, Object createdby, String createddate, Object updatedby, Object updateddate, Object remarks) {
        super();
        this.id = id;
        this.jenisPembiayaanId = jenisPembiayaanId;
        this.produk = produk;
        this.isRefinancing = isRefinancing;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isApproved = isApproved;
        this.isRejected = isRejected;
        this.createdby = createdby;
        this.createddate = createddate;
        this.updatedby = updatedby;
        this.updateddate = updateddate;
        this.remarks = remarks;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("jenis_pembiayaan_id")
    public String getJenisPembiayaanId() {
        return jenisPembiayaanId;
    }

    @JsonProperty("jenis_pembiayaan_id")
    public void setJenisPembiayaanId(String jenisPembiayaanId) {
        this.jenisPembiayaanId = jenisPembiayaanId;
    }

    @JsonProperty("produk")
    public Integer getProduk() {
        return produk;
    }

    @JsonProperty("produk")
    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    @JsonProperty("is_refinancing")
    public Integer getIsRefinancing() {
        return isRefinancing;
    }

    @JsonProperty("is_refinancing")
    public void setIsRefinancing(Integer isRefinancing) {
        this.isRefinancing = isRefinancing;
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

    @JsonProperty("createdby")
    public Object getCreatedby() {
        return createdby;
    }

    @JsonProperty("createdby")
    public void setCreatedby(Object createdby) {
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

    @JsonProperty("remarks")
    public Object getRemarks() {
        return remarks;
    }

    @JsonProperty("remarks")
    public void setRemarks(Object remarks) {
        this.remarks = remarks;
    }

}
