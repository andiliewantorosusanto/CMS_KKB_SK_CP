
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
    "namaSkema",
    "tipe_konsumen",
    "jeniskendaraanid",
    "jenis_kendaraan_id",
    "jenis_pembiayaan",
    "jenis_pembiayaan_id",
    "cluster",
    "cluster_id",
    "diskon_npwp",
    "startBerlaku",
    "endBerlaku",
    "statusApproval",
    "remarks",
    "nama"
})
@Generated("jsonschema2pojo")
public class DataBiayaAdmin {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("nama_skema")
    private String nama_skema;

    @JsonProperty("tipe_konsumenObject")
    private DataTipeKonsumen tipe_konsumenObject;
    @JsonProperty("tipe_konsumen")
    private Integer tipe_konsumen;

    @JsonProperty("jenis_kendaraanObject")
    private DataJenisKendaraan jenis_kendaraanObject;
    @JsonProperty("jenis_kendaraan")
    private Integer jenis_kendaraan;

    @JsonProperty("jenis_pembiayaanObject")
    private DataJenisPembiayaan jenis_pembiayaanObject;
    @JsonProperty("jenis_pembiayaan")
    private Integer jenis_pembiayaan;

    @JsonProperty("clusterObject")
    private DataCluster clusterObject;
    @JsonProperty("cluster")
    private Integer cluster;

    @JsonProperty("diskon_npwp")
    private Integer diskon_npwp;

    @JsonProperty("tenor1")
    private Float tenor1;
    @JsonProperty("tenor2")
    private Float tenor2;
    @JsonProperty("tenor3")
    private Float tenor3;
    @JsonProperty("tenor4")
    private Float tenor4;
    @JsonProperty("tenor5")
    private Float tenor5;
    @JsonProperty("tenor6")
    private Float tenor6;
    @JsonProperty("tenor7")
    private Float tenor7;
    @JsonProperty("tenor8")
    private Float tenor8;
    @JsonProperty("tenor9")
    private Float tenor9;
    @JsonProperty("tenor10")
    private Float tenor10;

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
    @JsonProperty("statusApproval")
    private Integer statusApproval;
    @JsonProperty("remarks")
    private String remarks;


    public DataBiayaAdmin() {
    }

    public DataBiayaAdmin(Integer id, String nama_skema, DataTipeKonsumen tipe_konsumenObject, Integer tipe_konsumen, DataJenisKendaraan jenis_kendaraanObject, Integer jenis_kendaraan, DataJenisPembiayaan jenis_pembiayaanObject, Integer jenis_pembiayaan, DataCluster clusterObject, Integer cluster, Integer diskon_npwp, Float tenor1, Float tenor2, Float tenor3, Float tenor4, Float tenor5, Float tenor6, Float tenor7, Float tenor8, Float tenor9, Float tenor10, Date startBerlaku, Date endBerlaku, Integer is_approved, Integer is_rejected, Integer statusApproval, String remarks) {
        this.id = id;
        this.nama_skema = nama_skema;
        this.tipe_konsumenObject = tipe_konsumenObject;
        this.tipe_konsumen = tipe_konsumen;
        this.jenis_kendaraanObject = jenis_kendaraanObject;
        this.jenis_kendaraan = jenis_kendaraan;
        this.jenis_pembiayaanObject = jenis_pembiayaanObject;
        this.jenis_pembiayaan = jenis_pembiayaan;
        this.clusterObject = clusterObject;
        this.cluster = cluster;
        this.diskon_npwp = diskon_npwp;
        this.tenor1 = tenor1;
        this.tenor2 = tenor2;
        this.tenor3 = tenor3;
        this.tenor4 = tenor4;
        this.tenor5 = tenor5;
        this.tenor6 = tenor6;
        this.tenor7 = tenor7;
        this.tenor8 = tenor8;
        this.tenor9 = tenor9;
        this.tenor10 = tenor10;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.is_approved = is_approved;
        this.is_rejected = is_rejected;
        this.statusApproval = statusApproval;
        this.remarks = remarks;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama_skema() {
        return this.nama_skema;
    }

    public void setNama_skema(String nama_skema) {
        this.nama_skema = nama_skema;
    }

    public DataTipeKonsumen getTipe_konsumenObject() {
        return this.tipe_konsumenObject;
    }

    public void setTipe_konsumenObject(DataTipeKonsumen tipe_konsumenObject) {
        this.tipe_konsumenObject = tipe_konsumenObject;
    }

    public Integer getTipe_konsumen() {
        return this.tipe_konsumen;
    }

    public void setTipe_konsumen(Integer tipe_konsumen) {
        this.tipe_konsumen = tipe_konsumen;
    }

    public DataJenisKendaraan getJenis_kendaraanObject() {
        return this.jenis_kendaraanObject;
    }

    public void setJenis_kendaraanObject(DataJenisKendaraan jenis_kendaraanObject) {
        this.jenis_kendaraanObject = jenis_kendaraanObject;
    }

    public Integer getJenis_kendaraan() {
        return this.jenis_kendaraan;
    }

    public void setJenis_kendaraan(Integer jenis_kendaraan) {
        this.jenis_kendaraan = jenis_kendaraan;
    }

    public DataJenisPembiayaan getJenis_pembiayaanObject() {
        return this.jenis_pembiayaanObject;
    }

    public void setJenis_pembiayaanObject(DataJenisPembiayaan jenis_pembiayaanObject) {
        this.jenis_pembiayaanObject = jenis_pembiayaanObject;
    }

    public Integer getJenis_pembiayaan() {
        return this.jenis_pembiayaan;
    }

    public void setJenis_pembiayaan(Integer jenis_pembiayaan) {
        this.jenis_pembiayaan = jenis_pembiayaan;
    }

    public DataCluster getClusterObject() {
        return this.clusterObject;
    }

    public void setClusterObject(DataCluster clusterObject) {
        this.clusterObject = clusterObject;
    }

    public Integer getCluster() {
        return this.cluster;
    }

    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    public Integer getDiskon_npwp() {
        return this.diskon_npwp;
    }

    public void setDiskon_npwp(Integer diskon_npwp) {
        this.diskon_npwp = diskon_npwp;
    }

    public Float getTenor1() {
        return this.tenor1;
    }

    public void setTenor1(Float tenor1) {
        this.tenor1 = tenor1;
    }

    public Float getTenor2() {
        return this.tenor2;
    }

    public void setTenor2(Float tenor2) {
        this.tenor2 = tenor2;
    }

    public Float getTenor3() {
        return this.tenor3;
    }

    public void setTenor3(Float tenor3) {
        this.tenor3 = tenor3;
    }

    public Float getTenor4() {
        return this.tenor4;
    }

    public void setTenor4(Float tenor4) {
        this.tenor4 = tenor4;
    }

    public Float getTenor5() {
        return this.tenor5;
    }

    public void setTenor5(Float tenor5) {
        this.tenor5 = tenor5;
    }

    public Float getTenor6() {
        return this.tenor6;
    }

    public void setTenor6(Float tenor6) {
        this.tenor6 = tenor6;
    }

    public Float getTenor7() {
        return this.tenor7;
    }

    public void setTenor7(Float tenor7) {
        this.tenor7 = tenor7;
    }

    public Float getTenor8() {
        return this.tenor8;
    }

    public void setTenor8(Float tenor8) {
        this.tenor8 = tenor8;
    }

    public Float getTenor9() {
        return this.tenor9;
    }

    public void setTenor9(Float tenor9) {
        this.tenor9 = tenor9;
    }

    public Float getTenor10() {
        return this.tenor10;
    }

    public void setTenor10(Float tenor10) {
        this.tenor10 = tenor10;
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

    public DataBiayaAdmin id(Integer id) {
        setId(id);
        return this;
    }

    public DataBiayaAdmin nama_skema(String nama_skema) {
        setNama_skema(nama_skema);
        return this;
    }

    public DataBiayaAdmin tipe_konsumenObject(DataTipeKonsumen tipe_konsumenObject) {
        setTipe_konsumenObject(tipe_konsumenObject);
        return this;
    }

    public DataBiayaAdmin tipe_konsumen(Integer tipe_konsumen) {
        setTipe_konsumen(tipe_konsumen);
        return this;
    }

    public DataBiayaAdmin jenis_kendaraanObject(DataJenisKendaraan jenis_kendaraanObject) {
        setJenis_kendaraanObject(jenis_kendaraanObject);
        return this;
    }

    public DataBiayaAdmin jenis_kendaraan(Integer jenis_kendaraan) {
        setJenis_kendaraan(jenis_kendaraan);
        return this;
    }

    public DataBiayaAdmin jenis_pembiayaanObject(DataJenisPembiayaan jenis_pembiayaanObject) {
        setJenis_pembiayaanObject(jenis_pembiayaanObject);
        return this;
    }

    public DataBiayaAdmin jenis_pembiayaan(Integer jenis_pembiayaan) {
        setJenis_pembiayaan(jenis_pembiayaan);
        return this;
    }

    public DataBiayaAdmin clusterObject(DataCluster clusterObject) {
        setClusterObject(clusterObject);
        return this;
    }

    public DataBiayaAdmin cluster(Integer cluster) {
        setCluster(cluster);
        return this;
    }

    public DataBiayaAdmin diskon_npwp(Integer diskon_npwp) {
        setDiskon_npwp(diskon_npwp);
        return this;
    }

    public DataBiayaAdmin tenor1(Float tenor1) {
        setTenor1(tenor1);
        return this;
    }

    public DataBiayaAdmin tenor2(Float tenor2) {
        setTenor2(tenor2);
        return this;
    }

    public DataBiayaAdmin tenor3(Float tenor3) {
        setTenor3(tenor3);
        return this;
    }

    public DataBiayaAdmin tenor4(Float tenor4) {
        setTenor4(tenor4);
        return this;
    }

    public DataBiayaAdmin tenor5(Float tenor5) {
        setTenor5(tenor5);
        return this;
    }

    public DataBiayaAdmin tenor6(Float tenor6) {
        setTenor6(tenor6);
        return this;
    }

    public DataBiayaAdmin tenor7(Float tenor7) {
        setTenor7(tenor7);
        return this;
    }

    public DataBiayaAdmin tenor8(Float tenor8) {
        setTenor8(tenor8);
        return this;
    }

    public DataBiayaAdmin tenor9(Float tenor9) {
        setTenor9(tenor9);
        return this;
    }

    public DataBiayaAdmin tenor10(Float tenor10) {
        setTenor10(tenor10);
        return this;
    }

    public DataBiayaAdmin startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public DataBiayaAdmin endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public DataBiayaAdmin is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    public DataBiayaAdmin is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public DataBiayaAdmin statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    public DataBiayaAdmin remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nama_skema='" + getNama_skema() + "'" +
            ", tipe_konsumenObject='" + getTipe_konsumenObject() + "'" +
            ", tipe_konsumen='" + getTipe_konsumen() + "'" +
            ", jenis_kendaraanObject='" + getJenis_kendaraanObject() + "'" +
            ", jenis_kendaraan='" + getJenis_kendaraan() + "'" +
            ", jenis_pembiayaanObject='" + getJenis_pembiayaanObject() + "'" +
            ", jenis_pembiayaan='" + getJenis_pembiayaan() + "'" +
            ", clusterObject='" + getClusterObject() + "'" +
            ", cluster='" + getCluster() + "'" +
            ", diskon_npwp='" + getDiskon_npwp() + "'" +
            ", tenor1='" + getTenor1() + "'" +
            ", tenor2='" + getTenor2() + "'" +
            ", tenor3='" + getTenor3() + "'" +
            ", tenor4='" + getTenor4() + "'" +
            ", tenor5='" + getTenor5() + "'" +
            ", tenor6='" + getTenor6() + "'" +
            ", tenor7='" + getTenor7() + "'" +
            ", tenor8='" + getTenor8() + "'" +
            ", tenor9='" + getTenor9() + "'" +
            ", tenor10='" + getTenor10() + "'" +
            ", startBerlaku='" + getStartBerlaku() + "'" +
            ", endBerlaku='" + getEndBerlaku() + "'" +
            ", is_approved='" + getIs_approved() + "'" +
            ", is_rejected='" + getIs_rejected() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            ", remarks='" + getRemarks() + "'" +
            "}";
    }


}
