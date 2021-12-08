
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.Date;

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
public class DataTipeKonsumen {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("nama")
    private String nama;
    @JsonProperty("produk")
    private Integer produk;
    @JsonProperty("deskripsi")
    private String deskripsi;
    @JsonProperty("start_date")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date start_date;
    @JsonProperty("end_date")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date end_date;
    @JsonProperty("is_approved")
    private Integer is_approved;
    @JsonProperty("is_rejected")
    private Integer is_rejected;
    @JsonProperty("remarks")
    private String remarks;


    public DataTipeKonsumen() {
    }

    public DataTipeKonsumen(Integer id, String nama, Integer produk, String deskripsi, Date start_date, Date end_date, Integer is_approved, Integer is_rejected, String remarks) {
        this.id = id;
        this.nama = nama;
        this.produk = produk;
        this.deskripsi = deskripsi;
        this.start_date = start_date;
        this.end_date = end_date;
        this.is_approved = is_approved;
        this.is_rejected = is_rejected;
        this.remarks = remarks;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getProduk() {
        return this.produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    public String getDeskripsi() {
        return this.deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public Date getStart_date() {
        return this.start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return this.end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
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

    public DataTipeKonsumen id(Integer id) {
        setId(id);
        return this;
    }

    public DataTipeKonsumen nama(String nama) {
        setNama(nama);
        return this;
    }

    public DataTipeKonsumen produk(Integer produk) {
        setProduk(produk);
        return this;
    }

    public DataTipeKonsumen deskripsi(String deskripsi) {
        setDeskripsi(deskripsi);
        return this;
    }

    public DataTipeKonsumen start_date(Date start_date) {
        setStart_date(start_date);
        return this;
    }

    public DataTipeKonsumen end_date(Date end_date) {
        setEnd_date(end_date);
        return this;
    }

    public DataTipeKonsumen is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    public DataTipeKonsumen is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public DataTipeKonsumen remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nama='" + getNama() + "'" +
            ", produk='" + getProduk() + "'" +
            ", deskripsi='" + getDeskripsi() + "'" +
            ", start_date='" + getStart_date() + "'" +
            ", end_date='" + getEnd_date() + "'" +
            ", is_approved='" + getIs_approved() + "'" +
            ", is_rejected='" + getIs_rejected() + "'" +
            ", remarks='" + getRemarks() + "'" +
            "}";
    }
    

}
