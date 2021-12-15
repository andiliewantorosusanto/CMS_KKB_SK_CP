
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import org.springframework.format.annotation.DateTimeFormat;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "produk",
    "deskripsi",
    "startBerlaku",
    "endBerlaku",
    "status",
    "is_approved",
    "is_rejected",
    "remarks"
})
public class DataProduk {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("produk")
    @NotNull(message = "Produk Tidak Boleh Kosong")
    private String produk;
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


    public DataProduk() {
    }

    public DataProduk(Integer id, String produk, String deskripsi, Date startBerlaku, Date endBerlaku, Integer is_approved, Integer is_rejected, String remarks, Integer statusApproval) {
        this.id = id;
        this.produk = produk;
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

    public String getProduk() {
        return this.produk;
    }

    public void setProduk(String produk) {
        this.produk = produk;
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

    public DataProduk id(Integer id) {
        setId(id);
        return this;
    }

    public DataProduk produk(String produk) {
        setProduk(produk);
        return this;
    }

    public DataProduk deskripsi(String deskripsi) {
        setDeskripsi(deskripsi);
        return this;
    }

    public DataProduk startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public DataProduk endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public DataProduk is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    public DataProduk is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public DataProduk remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public DataProduk statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", produk='" + getProduk() + "'" +
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
