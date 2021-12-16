
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
    "nama",
    "produk",
    "deskripsi",
    "start_date",
    "end_date",
    "is_approved",
    "is_rejected",
    "remarks"
})
public class DataTipeAsuransi {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("namaAsuransi")
    @NotEmpty(message = "Nama Asuransi Tidak Boleh Kosong")
    private String namaAsuransi;
    @JsonProperty("startBerlaku")
    @NotNull(message = "Start Berlaku Tidak Boleh Kosong")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date startBerlaku;
    @JsonProperty("deskripsi")
    private String deskripsi;
    @JsonProperty("endBerlaku")
    @NotNull(message = "End Berlaku Tidak Boleh Kosong")
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


    public DataTipeAsuransi() {
    }

    public DataTipeAsuransi(Integer id, String namaAsuransi, Date startBerlaku, String deskripsi, Date endBerlaku, Integer is_approved, Integer is_rejected, String remarks, Integer statusApproval) {
        this.id = id;
        this.namaAsuransi = namaAsuransi;
        this.startBerlaku = startBerlaku;
        this.deskripsi = deskripsi;
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

    public String getNamaAsuransi() {
        return this.namaAsuransi;
    }

    public void setNamaAsuransi(String namaAsuransi) {
        this.namaAsuransi = namaAsuransi;
    }

    public Date getStartBerlaku() {
        return this.startBerlaku;
    }

    public void setStartBerlaku(Date startBerlaku) {
        this.startBerlaku = startBerlaku;
    }

    public String getDeskripsi() {
        return this.deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
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

    public DataTipeAsuransi id(Integer id) {
        setId(id);
        return this;
    }

    public DataTipeAsuransi namaAsuransi(String namaAsuransi) {
        setNamaAsuransi(namaAsuransi);
        return this;
    }

    public DataTipeAsuransi startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public DataTipeAsuransi deskripsi(String deskripsi) {
        setDeskripsi(deskripsi);
        return this;
    }

    public DataTipeAsuransi endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public DataTipeAsuransi is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    public DataTipeAsuransi is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public DataTipeAsuransi remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public DataTipeAsuransi statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaAsuransi='" + getNamaAsuransi() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", deskripsi='" + getDeskripsi() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", is_approved='" + getIs_approved() + "'" +
            ", is_rejected='" + getIs_rejected() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            "}";
    }


}
