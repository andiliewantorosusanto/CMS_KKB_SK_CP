
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.Date;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import org.springframework.format.annotation.DateTimeFormat;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "jenis_kendaraan",
    "deskripsi",
    "startBerlaku",
    "endBerlaku",
    "created_at",
    "status",
    "remarks",
    "is_rejected",
    "is_approved",
    "updateddate",
    "createdby",
    "updatedby"
})

@Generated("jsonschema2pojo")
public class DataJenisKendaraan {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("jenis_kendaraan")
    private String jenis_kendaraan;
    @JsonProperty("deskripsi")
    private String deskripsi;
    @JsonProperty("startBerlaku")
    @NotNull(message = "Start Date Tidak Boleh Kosong")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date startBerlaku;
    @JsonProperty("endBerlaku")
    @NotNull(message = "Start Date Tidak Boleh Kosong")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date endBerlaku;
    @JsonProperty("created_at")
    private Date created_at;
    @JsonProperty("status")
    private Integer status;
    @JsonProperty("remarks")
    private String remarks;
    @JsonProperty("is_rejected")
    private Integer is_rejected;
    @JsonProperty("is_approved")
    private Integer is_approved;
    @JsonProperty("updateddate")
    private Date updateddate;
    @JsonProperty("createdby")
    private Integer createdby;
    @JsonProperty("updatedby")
    private Integer updatedby;


    public DataJenisKendaraan() {
    }

    public DataJenisKendaraan(Integer id, String jenis_kendaraan, String deskripsi, Date startBerlaku, Date endBerlaku, Date created_at, Integer status, String remarks, Integer is_rejected, Integer is_approved, Date updateddate, Integer createdby, Integer updatedby) {
        this.id = id;
        this.jenis_kendaraan = jenis_kendaraan;
        this.deskripsi = deskripsi;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.created_at = created_at;
        this.status = status;
        this.remarks = remarks;
        this.is_rejected = is_rejected;
        this.is_approved = is_approved;
        this.updateddate = updateddate;
        this.createdby = createdby;
        this.updatedby = updatedby;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJenis_kendaraan() {
        return this.jenis_kendaraan;
    }

    public void setJenis_kendaraan(String jenis_kendaraan) {
        this.jenis_kendaraan = jenis_kendaraan;
    }

    public String getDeskripsi() {
        return this.deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
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

    public Date getCreated_at() {
        return this.created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getIs_rejected() {
        return this.is_rejected;
    }

    public void setIs_rejected(Integer is_rejected) {
        this.is_rejected = is_rejected;
    }

    public Integer getIs_approved() {
        return this.is_approved;
    }

    public void setIs_approved(Integer is_approved) {
        this.is_approved = is_approved;
    }

    public Date getUpdateddate() {
        return this.updateddate;
    }

    public void setUpdateddate(Date updateddate) {
        this.updateddate = updateddate;
    }

    public Integer getCreatedby() {
        return this.createdby;
    }

    public void setCreatedby(Integer createdby) {
        this.createdby = createdby;
    }

    public Integer getUpdatedby() {
        return this.updatedby;
    }

    public void setUpdatedby(Integer updatedby) {
        this.updatedby = updatedby;
    }

    public DataJenisKendaraan id(Integer id) {
        setId(id);
        return this;
    }

    public DataJenisKendaraan jenis_kendaraan(String jenis_kendaraan) {
        setJenis_kendaraan(jenis_kendaraan);
        return this;
    }

    public DataJenisKendaraan deskripsi(String deskripsi) {
        setDeskripsi(deskripsi);
        return this;
    }

    public DataJenisKendaraan startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public DataJenisKendaraan endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public DataJenisKendaraan created_at(Date created_at) {
        setCreated_at(created_at);
        return this;
    }

    public DataJenisKendaraan status(Integer status) {
        setStatus(status);
        return this;
    }

    public DataJenisKendaraan remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public DataJenisKendaraan is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public DataJenisKendaraan is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    public DataJenisKendaraan updateddate(Date updateddate) {
        setUpdateddate(updateddate);
        return this;
    }

    public DataJenisKendaraan createdby(Integer createdby) {
        setCreatedby(createdby);
        return this;
    }

    public DataJenisKendaraan updatedby(Integer updatedby) {
        setUpdatedby(updatedby);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", jenis_kendaraan='" + getJenis_kendaraan() + "'" +
            ", deskripsi='" + getDeskripsi() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", created_at='" + getCreated_at() + "'" +
            ", status='" + getStatus() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", is_rejected='" + getIs_rejected() + "'" +
            ", is_approved='" + getIs_approved() + "'" +
            ", updateddate='" + getUpdateddate() + "'" +
            ", createdby='" + getCreatedby() + "'" +
            ", updatedby='" + getUpdatedby() + "'" +
            "}";
    }


}
