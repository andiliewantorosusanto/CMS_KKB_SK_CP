package com.CMS.CentralParam.KKBSK.model.data;

import java.util.Date;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.format.annotation.DateTimeFormat;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
public class KomponenPH {

    @JsonProperty("ID")
    private Integer id;

    @JsonProperty("namaSkema")
    private String namaSkema;

    @JsonProperty("idKompPh")
    private Integer idKompPh;

    @JsonProperty("jenis")
    private String jenis;

    @JsonProperty("addm")
    private Integer addm;
    @JsonProperty("addb")
    private Integer addb;


    @JsonProperty("group_id")
    private String group_id;
    @JsonProperty("kondisiKendaraan")
    private Integer kondisiKendaraan;
    @JsonProperty("produk")
    private Integer produk;
    @JsonProperty("tipeKonsumen")
    private Integer tipeKonsumen;
    @JsonProperty("jenisPembiayaan")
    private Integer jenisPembiayaan;
    @JsonProperty("jenisKendaraan")
    private Integer jenisKendaraan;
    @JsonProperty("program")
    private Integer program;
    @JsonProperty("cluster")
    private Integer cluster;
    
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
    

    public KomponenPH() {
    }

    public KomponenPH(Integer id, String namaSkema, Integer idKompPh, String jenis, Integer addm, Integer addb, String group_id, Integer kondisiKendaraan, Integer produk, Integer tipeKonsumen, Integer jenisPembiayaan, Integer jenisKendaraan, Integer program, Integer cluster, Date startBerlaku, Date endBerlaku, Integer statusApproval, String remarks, Integer isRejected, Integer isApproved, Long createdBy, Date createdDate, Long updatedBy, Date updatedDate) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.idKompPh = idKompPh;
        this.jenis = jenis;
        this.addm = addm;
        this.addb = addb;
        this.group_id = group_id;
        this.kondisiKendaraan = kondisiKendaraan;
        this.produk = produk;
        this.tipeKonsumen = tipeKonsumen;
        this.jenisPembiayaan = jenisPembiayaan;
        this.jenisKendaraan = jenisKendaraan;
        this.program = program;
        this.cluster = cluster;
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

    public Integer getIdKompPh() {
        return this.idKompPh;
    }

    public void setIdKompPh(Integer idKompPh) {
        this.idKompPh = idKompPh;
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

    public String getGroup_id() {
        return this.group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public Integer getKondisiKendaraan() {
        return this.kondisiKendaraan;
    }

    public void setKondisiKendaraan(Integer kondisiKendaraan) {
        this.kondisiKendaraan = kondisiKendaraan;
    }

    public Integer getProduk() {
        return this.produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
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

    public Integer getJenisKendaraan() {
        return this.jenisKendaraan;
    }

    public void setJenisKendaraan(Integer jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public Integer getProgram() {
        return this.program;
    }

    public void setProgram(Integer program) {
        this.program = program;
    }

    public Integer getCluster() {
        return this.cluster;
    }

    public void setCluster(Integer cluster) {
        this.cluster = cluster;
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

    public KomponenPH id(Integer id) {
        setId(id);
        return this;
    }

    public KomponenPH namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public KomponenPH idKompPh(Integer idKompPh) {
        setIdKompPh(idKompPh);
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

    public KomponenPH group_id(String group_id) {
        setGroup_id(group_id);
        return this;
    }

    public KomponenPH kondisiKendaraan(Integer kondisiKendaraan) {
        setKondisiKendaraan(kondisiKendaraan);
        return this;
    }

    public KomponenPH produk(Integer produk) {
        setProduk(produk);
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

    public KomponenPH jenisKendaraan(Integer jenisKendaraan) {
        setJenisKendaraan(jenisKendaraan);
        return this;
    }

    public KomponenPH program(Integer program) {
        setProgram(program);
        return this;
    }

    public KomponenPH cluster(Integer cluster) {
        setCluster(cluster);
        return this;
    }

    public KomponenPH startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public KomponenPH endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
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
            ", idKompPh='" + getIdKompPh() + "'" +
            ", jenis='" + getJenis() + "'" +
            ", addm='" + getAddm() + "'" +
            ", addb='" + getAddb() + "'" +
            ", group_id='" + getGroup_id() + "'" +
            ", kondisiKendaraan='" + getKondisiKendaraan() + "'" +
            ", produk='" + getProduk() + "'" +
            ", tipeKonsumen='" + getTipeKonsumen() + "'" +
            ", jenisPembiayaan='" + getJenisPembiayaan() + "'" +
            ", jenisKendaraan='" + getJenisKendaraan() + "'" +
            ", program='" + getProgram() + "'" +
            ", cluster='" + getCluster() + "'" +
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
