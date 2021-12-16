
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
    "jenis_pembiayaan",
    "produk",
    "is_refinancing",
    "start_date",
    "end_date",
    "is_approved",
    "is_rejected",
    "remarks",
    "createdby",
    "createddate",
    "updatedby",
    "updateddate"
})
public class DataJenisPembiayaan {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("jenis_pembiayaan")
    @NotEmpty(message = "Jenis Pembiayaan Tidak Boleh Kosong")
    private String jenis_pembiayaan;
    @JsonProperty("produkObject")
    private DataProduk produkObject;
    @JsonProperty("produk")
    @NotNull(message = "Produk Tidak Boleh Kosong")
    private Integer produk;
    @JsonProperty("is_refinancing")
    private String is_refinancing;
    @JsonProperty("start_date")
    @NotNull(message = "Start Date Tidak Boleh Kosong")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date start_date;
    @JsonProperty("end_date")
    @NotNull(message = "End Date Tidak Boleh Kosong")
    @DateTimeFormat (pattern="yyyy-MM-dd")
    private Date end_date;
    @JsonProperty("is_approved")
    private Integer is_approved;
    @JsonProperty("is_rejected")
    private Integer is_rejected;
    @JsonProperty("remarks")
    private String remarks;
    @JsonProperty("statusApproval")
    private Integer statusApproval;


    public DataJenisPembiayaan() {
    }

    public DataJenisPembiayaan(Integer id, String jenis_pembiayaan, DataProduk produkObject, Integer produk, String is_refinancing, Date start_date, Date end_date, Integer is_approved, Integer is_rejected, String remarks, Integer statusApproval) {
        this.id = id;
        this.jenis_pembiayaan = jenis_pembiayaan;
        this.produkObject = produkObject;
        this.produk = produk;
        this.is_refinancing = is_refinancing;
        this.start_date = start_date;
        this.end_date = end_date;
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

    public String getJenis_pembiayaan() {
        return this.jenis_pembiayaan;
    }

    public void setJenis_pembiayaan(String jenis_pembiayaan) {
        this.jenis_pembiayaan = jenis_pembiayaan;
    }

    public DataProduk getProdukObject() {
        return this.produkObject;
    }

    public void setProdukObject(DataProduk produkObject) {
        this.produkObject = produkObject;
    }

    public Integer getProduk() {
        return this.produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    public String getIs_refinancing() {
        return this.is_refinancing;
    }

    public void setIs_refinancing(String is_refinancing) {
        this.is_refinancing = is_refinancing;
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

    public Integer getStatusApproval() {
        return this.statusApproval;
    }

    public void setStatusApproval(Integer statusApproval) {
        this.statusApproval = statusApproval;
    }

    public DataJenisPembiayaan id(Integer id) {
        setId(id);
        return this;
    }

    public DataJenisPembiayaan jenis_pembiayaan(String jenis_pembiayaan) {
        setJenis_pembiayaan(jenis_pembiayaan);
        return this;
    }

    public DataJenisPembiayaan produkObject(DataProduk produkObject) {
        setProdukObject(produkObject);
        return this;
    }

    public DataJenisPembiayaan produk(Integer produk) {
        setProduk(produk);
        return this;
    }

    public DataJenisPembiayaan is_refinancing(String is_refinancing) {
        setIs_refinancing(is_refinancing);
        return this;
    }

    public DataJenisPembiayaan start_date(Date start_date) {
        setStart_date(start_date);
        return this;
    }

    public DataJenisPembiayaan end_date(Date end_date) {
        setEnd_date(end_date);
        return this;
    }

    public DataJenisPembiayaan is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    public DataJenisPembiayaan is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public DataJenisPembiayaan remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public DataJenisPembiayaan statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", jenis_pembiayaan='" + getJenis_pembiayaan() + "'" +
            ", produkObject='" + getProdukObject() + "'" +
            ", produk='" + getProduk() + "'" +
            ", is_refinancing='" + getIs_refinancing() + "'" +
            ", start_date='" + getStart_date() + "'" +
            ", end_date='" + getEnd_date() + "'" +
            ", is_approved='" + getIs_approved() + "'" +
            ", is_rejected='" + getIs_rejected() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            "}";
    }
}
