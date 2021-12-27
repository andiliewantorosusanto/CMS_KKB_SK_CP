
package com.CMS.CentralParam.KKBSK.model.data;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.format.annotation.DateTimeFormat;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class JenisPembiayaan {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("jenisPembiayaan")
    @NotEmpty(message = "Jenis Pembiayaan Tidak Boleh Kosong")
    private String jenisPembiayaan;

    @JsonProperty("isRefinancing")
    @NotNull(message = "Is Refinancing Tidak Boleh Kosong")
    private Integer isRefinancing;

    @JsonProperty("produk")
    @NotNull(message = "Produk Tidak Boleh Kosong")
    private Integer produk;

    @JsonProperty("startBerlaku")
    @NotNull(message = "Start Date Tidak Boleh Kosong")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date startBerlaku;
    @JsonProperty("endBerlaku")
    @NotNull(message = "End Date Tidak Boleh Kosong")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date endBerlaku;

    @JsonProperty("statusApproval")
    private Integer statusApproval;
    @JsonProperty("remarks")
    private String remarks;
    @JsonProperty("isRejected")
    private Integer isRejected;
    @JsonProperty("isApproved")
    private Integer isApproved;

    @JsonProperty("createdBy")
    private Long createdBy;
    @JsonProperty("createdDate")
    private Date createdDate;
    @JsonProperty("updatedBy")
    private Long updatedBy;
    @JsonProperty("updatedDate")
    private Date updatedDate;


    public JenisPembiayaan() {
    }

    public JenisPembiayaan(Integer id, String jenisPembiayaan, Integer isRefinancing, Integer produk, Date startBerlaku, Date endBerlaku, Integer statusApproval, String remarks, Integer isRejected, Integer isApproved, Long createdBy, Date createdDate, Long updatedBy, Date updatedDate) {
        this.id = id;
        this.jenisPembiayaan = jenisPembiayaan;
        this.isRefinancing = isRefinancing;
        this.produk = produk;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.statusApproval = statusApproval;
        this.remarks = remarks;
        this.isRejected = isRejected;
        this.isApproved = isApproved;
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.updatedBy = updatedBy;
        this.updatedDate = updatedDate;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJenisPembiayaan() {
        return this.jenisPembiayaan;
    }

    public void setJenisPembiayaan(String jenisPembiayaan) {
        this.jenisPembiayaan = jenisPembiayaan;
    }

    public Integer getIsRefinancing() {
        return this.isRefinancing;
    }

    public void setIsRefinancing(Integer isRefinancing) {
        this.isRefinancing = isRefinancing;
    }

    public Integer getProduk() {
        return this.produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
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

    public Long getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Long getUpdatedBy() {
        return this.updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }

    public Date getUpdatedDate() {
        return this.updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public JenisPembiayaan id(Integer id) {
        setId(id);
        return this;
    }

    public JenisPembiayaan jenisPembiayaan(String jenisPembiayaan) {
        setJenisPembiayaan(jenisPembiayaan);
        return this;
    }

    public JenisPembiayaan isRefinancing(Integer isRefinancing) {
        setIsRefinancing(isRefinancing);
        return this;
    }

    public JenisPembiayaan produk(Integer produk) {
        setProduk(produk);
        return this;
    }

    public JenisPembiayaan startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public JenisPembiayaan endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public JenisPembiayaan statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    public JenisPembiayaan remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public JenisPembiayaan isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public JenisPembiayaan isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    public JenisPembiayaan createdBy(Long createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public JenisPembiayaan createdDate(Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public JenisPembiayaan updatedBy(Long updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    public JenisPembiayaan updatedDate(Date updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", jenisPembiayaan='" + getJenisPembiayaan() + "'" +
            ", isRefinancing='" + getIsRefinancing() + "'" +
            ", produk='" + getProduk() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", isRejected='" + getIsRejected() + "'" +
            ", isApproved='" + getIsApproved() + "'" +
            ", createdBy='" + getCreatedBy() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", updatedBy='" + getUpdatedBy() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
            "}";
    }


}
