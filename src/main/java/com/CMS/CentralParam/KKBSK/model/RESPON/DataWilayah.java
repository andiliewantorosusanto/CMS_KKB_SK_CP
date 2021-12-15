
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import org.springframework.format.annotation.DateTimeFormat;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "namaWilayah",
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
public class DataWilayah {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("namaWilayah")
    @NotEmpty(message = "Nama Wilayah Tidak Boleh Kosong")
    private String namaWilayah;
    @JsonProperty("deskripsi")
    private String deskripsi;
    @JsonProperty("startBerlaku")
    @NotNull(message = "Start Date Tidak Boleh Kosong")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date startBerlaku;
    @JsonProperty("endBerlaku")
    @NotNull(message = "End Date Tidak Boleh Kosong")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date endBerlaku;
    @JsonProperty("is_approved")
    private Integer is_approved;
    @JsonProperty("is_rejected")
    private Integer is_rejected;
    @JsonProperty("remarks")
    private String remarks;
    @JsonProperty("statusApproval")
    private Integer statusApproval;


    public DataWilayah() {
    }

    public DataWilayah(Integer id, String namaWilayah, String deskripsi, Date startBerlaku, Date endBerlaku, Integer is_approved, Integer is_rejected, String remarks, Integer statusApproval) {
        this.id = id;
        this.namaWilayah = namaWilayah;
        this.deskripsi = deskripsi;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.is_approved = is_approved;
        this.is_rejected = is_rejected;
        this.remarks = remarks;
        this.statusApproval = statusApproval;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaWilayah() {
        return this.namaWilayah;
    }

    public void setNamaWilayah(String namaWilayah) {
        this.namaWilayah = namaWilayah;
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

    public Integer getStatusApproval() {
        return this.statusApproval;
    }

    public void setStatusApproval(Integer statusApproval) {
        this.statusApproval = statusApproval;
    }

    public DataWilayah id(Integer id) {
        setId(id);
        return this;
    }

    public DataWilayah namaWilayah(String namaWilayah) {
        setNamaWilayah(namaWilayah);
        return this;
    }

    public DataWilayah deskripsi(String deskripsi) {
        setDeskripsi(deskripsi);
        return this;
    }

    public DataWilayah startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public DataWilayah endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public DataWilayah is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    public DataWilayah is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public DataWilayah remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public DataWilayah statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaWilayah='" + getNamaWilayah() + "'" +
            ", deskripsi='" + getDeskripsi() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", is_approved='" + getIs_approved() + "'" +
            ", is_rejected='" + getIs_rejected() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            "}";
    }


}
