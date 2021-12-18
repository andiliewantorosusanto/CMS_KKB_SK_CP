
package com.CMS.CentralParam.KKBSK.model.data;


import java.util.Date;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.format.annotation.DateTimeFormat;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
public class BiayaFidusia {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("namaSkema")
    private String namaSkema;

    @JsonProperty("startPh")
    private Integer startPh;
    @JsonProperty("endPh")
    private Integer endPh;
    @JsonProperty("biaya")
    private Integer biaya;

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


    public BiayaFidusia() {
    }

    public BiayaFidusia(Integer id, String namaSkema, Integer startPh, Integer endPh, Integer biaya, Date startBerlaku, Date endBerlaku, Integer statusApproval, String remarks, Integer isRejected, Integer isApproved, Long createdBy, Date createdDate, Long updatedBy, Date updatedDate) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.startPh = startPh;
        this.endPh = endPh;
        this.biaya = biaya;
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

    public String getNamaSkema() {
        return this.namaSkema;
    }

    public void setNamaSkema(String namaSkema) {
        this.namaSkema = namaSkema;
    }

    public Integer getStartPh() {
        return this.startPh;
    }

    public void setStartPh(Integer startPh) {
        this.startPh = startPh;
    }

    public Integer getEndPh() {
        return this.endPh;
    }

    public void setEndPh(Integer endPh) {
        this.endPh = endPh;
    }

    public Integer getBiaya() {
        return this.biaya;
    }

    public void setBiaya(Integer biaya) {
        this.biaya = biaya;
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

    public BiayaFidusia id(Integer id) {
        setId(id);
        return this;
    }

    public BiayaFidusia namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public BiayaFidusia startPh(Integer startPh) {
        setStartPh(startPh);
        return this;
    }

    public BiayaFidusia endPh(Integer endPh) {
        setEndPh(endPh);
        return this;
    }

    public BiayaFidusia biaya(Integer biaya) {
        setBiaya(biaya);
        return this;
    }

    public BiayaFidusia startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public BiayaFidusia endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public BiayaFidusia statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    public BiayaFidusia remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public BiayaFidusia isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public BiayaFidusia isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    public BiayaFidusia createdBy(Long createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public BiayaFidusia createdDate(Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public BiayaFidusia updatedBy(Long updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    public BiayaFidusia updatedDate(Date updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            ", startPh='" + getStartPh() + "'" +
            ", endPh='" + getEndPh() + "'" +
            ", biaya='" + getBiaya() + "'" +
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
