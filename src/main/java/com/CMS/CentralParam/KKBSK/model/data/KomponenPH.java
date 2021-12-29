package com.CMS.CentralParam.KKBSK.model.data;

import java.util.Date;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
public class KomponenPH {

    @JsonProperty("ID")
    private Integer id;

    @JsonProperty("namaSkema")
    private String namaSkema;

    @JsonProperty("jenis")
    private String jenis;

    @JsonProperty("addm")
    private Integer addm;
    @JsonProperty("addb")
    private Integer addb;


    @JsonProperty("tipeKonsumen")
    private Integer tipeKonsumen;
    @JsonProperty("jenisPembiayaan")
    private Integer jenisPembiayaan;
    
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
    

    public KomponenPH() {
    }

    public KomponenPH(Integer id, String namaSkema, String jenis, Integer addm, Integer addb, Integer tipeKonsumen, Integer jenisPembiayaan, Integer statusApproval, String remarks, Integer isRejected, Integer isApproved, Long createdBy, Date createdDate, Long updatedBy, Date updatedDate) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.jenis = jenis;
        this.addm = addm;
        this.addb = addb;
        this.tipeKonsumen = tipeKonsumen;
        this.jenisPembiayaan = jenisPembiayaan;
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

    public String getJenis() {
        return this.jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public Integer getAddm() {
        return this.addm;
    }

    public void setAddm(Integer addm) {
        this.addm = addm;
    }

    public Integer getAddb() {
        return this.addb;
    }

    public void setAddb(Integer addb) {
        this.addb = addb;
    }

    public Integer getTipeKonsumen() {
        return this.tipeKonsumen;
    }

    public void setTipeKonsumen(Integer tipeKonsumen) {
        this.tipeKonsumen = tipeKonsumen;
    }

    public Integer getJenisPembiayaan() {
        return this.jenisPembiayaan;
    }

    public void setJenisPembiayaan(Integer jenisPembiayaan) {
        this.jenisPembiayaan = jenisPembiayaan;
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

    public KomponenPH id(Integer id) {
        setId(id);
        return this;
    }

    public KomponenPH namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public KomponenPH jenis(String jenis) {
        setJenis(jenis);
        return this;
    }

    public KomponenPH addm(Integer addm) {
        setAddm(addm);
        return this;
    }

    public KomponenPH addb(Integer addb) {
        setAddb(addb);
        return this;
    }

    public KomponenPH tipeKonsumen(Integer tipeKonsumen) {
        setTipeKonsumen(tipeKonsumen);
        return this;
    }

    public KomponenPH jenisPembiayaan(Integer jenisPembiayaan) {
        setJenisPembiayaan(jenisPembiayaan);
        return this;
    }

    public KomponenPH statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    public KomponenPH remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public KomponenPH isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public KomponenPH isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    public KomponenPH createdBy(Long createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public KomponenPH createdDate(Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public KomponenPH updatedBy(Long updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    public KomponenPH updatedDate(Date updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            ", jenis='" + getJenis() + "'" +
            ", addm='" + getAddm() + "'" +
            ", addb='" + getAddb() + "'" +
            ", tipeKonsumen='" + getTipeKonsumen() + "'" +
            ", jenisPembiayaan='" + getJenisPembiayaan() + "'" +
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
