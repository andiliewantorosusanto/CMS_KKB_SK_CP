
package com.CMS.CentralParam.KKBSK.model.data;

import java.util.Date;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.springframework.format.annotation.DateTimeFormat;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
public class BiayaAdmin {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("namaSkema")
    private String namaSkema;

    @JsonProperty("tipeKonsumen")
    private Integer tipeKonsumen;

    @JsonProperty("jenisKendaraan")
    private Integer jenisKendaraan;

    @JsonProperty("jenisPembiayaan")
    private Integer jenisPembiayaan;

    @JsonProperty("cluster")
    private Integer cluster;

    @JsonProperty("diskonNpwp")
    private Integer diskonNpwp;

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

    @JsonProperty("isApproved")
    private Integer isApproved;
    @JsonProperty("isRejected")
    private Integer isRejected;
    @JsonProperty("statusApproval")
    private Integer statusApproval;
    @JsonProperty("remarks")
    private String remarks;

    @JsonProperty("createdBy")
    private Long createdBy;
    @JsonProperty("createdDate")
    private Date createdDate;
    @JsonProperty("updatedBy")
    private Long updatedBy;
    @JsonProperty("updatedDate")
    private Date updatedDate;


    public BiayaAdmin() {
    }

    public BiayaAdmin(Integer id, String namaSkema, Integer tipeKonsumen, Integer jenisKendaraan, Integer jenisPembiayaan, Integer cluster, Integer diskonNpwp, Float tenor1, Float tenor2, Float tenor3, Float tenor4, Float tenor5, Float tenor6, Float tenor7, Float tenor8, Float tenor9, Float tenor10, Date startBerlaku, Date endBerlaku, Integer isApproved, Integer isRejected, Integer statusApproval, String remarks, Long createdBy, Date createdDate, Long updatedBy, Date updatedDate) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.tipeKonsumen = tipeKonsumen;
        this.jenisKendaraan = jenisKendaraan;
        this.jenisPembiayaan = jenisPembiayaan;
        this.cluster = cluster;
        this.diskonNpwp = diskonNpwp;
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
        this.isApproved = isApproved;
        this.isRejected = isRejected;
        this.statusApproval = statusApproval;
        this.remarks = remarks;
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

    public Integer getTipeKonsumen() {
        return this.tipeKonsumen;
    }

    public void setTipeKonsumen(Integer tipeKonsumen) {
        this.tipeKonsumen = tipeKonsumen;
    }

    public Integer getJenisKendaraan() {
        return this.jenisKendaraan;
    }

    public void setJenisKendaraan(Integer jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public Integer getJenisPembiayaan() {
        return this.jenisPembiayaan;
    }

    public void setJenisPembiayaan(Integer jenisPembiayaan) {
        this.jenisPembiayaan = jenisPembiayaan;
    }

    public Integer getCluster() {
        return this.cluster;
    }

    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    public Integer getDiskonNpwp() {
        return this.diskonNpwp;
    }

    public void setDiskonNpwp(Integer diskonNpwp) {
        this.diskonNpwp = diskonNpwp;
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

    public Integer getIsApproved() {
        return this.isApproved;
    }

    public void setIsApproved(Integer isApproved) {
        this.isApproved = isApproved;
    }

    public Integer getIsRejected() {
        return this.isRejected;
    }

    public void setIsRejected(Integer isRejected) {
        this.isRejected = isRejected;
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

    public BiayaAdmin id(Integer id) {
        setId(id);
        return this;
    }

    public BiayaAdmin namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public BiayaAdmin tipeKonsumen(Integer tipeKonsumen) {
        setTipeKonsumen(tipeKonsumen);
        return this;
    }

    public BiayaAdmin jenisKendaraan(Integer jenisKendaraan) {
        setJenisKendaraan(jenisKendaraan);
        return this;
    }

    public BiayaAdmin jenisPembiayaan(Integer jenisPembiayaan) {
        setJenisPembiayaan(jenisPembiayaan);
        return this;
    }

    public BiayaAdmin cluster(Integer cluster) {
        setCluster(cluster);
        return this;
    }

    public BiayaAdmin diskonNpwp(Integer diskonNpwp) {
        setDiskonNpwp(diskonNpwp);
        return this;
    }

    public BiayaAdmin tenor1(Float tenor1) {
        setTenor1(tenor1);
        return this;
    }

    public BiayaAdmin tenor2(Float tenor2) {
        setTenor2(tenor2);
        return this;
    }

    public BiayaAdmin tenor3(Float tenor3) {
        setTenor3(tenor3);
        return this;
    }

    public BiayaAdmin tenor4(Float tenor4) {
        setTenor4(tenor4);
        return this;
    }

    public BiayaAdmin tenor5(Float tenor5) {
        setTenor5(tenor5);
        return this;
    }

    public BiayaAdmin tenor6(Float tenor6) {
        setTenor6(tenor6);
        return this;
    }

    public BiayaAdmin tenor7(Float tenor7) {
        setTenor7(tenor7);
        return this;
    }

    public BiayaAdmin tenor8(Float tenor8) {
        setTenor8(tenor8);
        return this;
    }

    public BiayaAdmin tenor9(Float tenor9) {
        setTenor9(tenor9);
        return this;
    }

    public BiayaAdmin tenor10(Float tenor10) {
        setTenor10(tenor10);
        return this;
    }

    public BiayaAdmin startBerlaku(Date startBerlaku) {
        setStartBerlaku(startBerlaku);
        return this;
    }

    public BiayaAdmin endBerlaku(Date endBerlaku) {
        setEndBerlaku(endBerlaku);
        return this;
    }

    public BiayaAdmin isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    public BiayaAdmin isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public BiayaAdmin statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    public BiayaAdmin remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public BiayaAdmin createdBy(Long createdBy) {
        setCreatedBy(createdBy);
        return this;
    }

    public BiayaAdmin createdDate(Date createdDate) {
        setCreatedDate(createdDate);
        return this;
    }

    public BiayaAdmin updatedBy(Long updatedBy) {
        setUpdatedBy(updatedBy);
        return this;
    }

    public BiayaAdmin updatedDate(Date updatedDate) {
        setUpdatedDate(updatedDate);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            ", tipeKonsumen='" + getTipeKonsumen() + "'" +
            ", jenisKendaraan='" + getJenisKendaraan() + "'" +
            ", jenisPembiayaan='" + getJenisPembiayaan() + "'" +
            ", cluster='" + getCluster() + "'" +
            ", diskonNpwp='" + getDiskonNpwp() + "'" +
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
            ", isApproved='" + getIsApproved() + "'" +
            ", isRejected='" + getIsRejected() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", createdBy='" + getCreatedBy() + "'" +
            ", createdDate='" + getCreatedDate() + "'" +
            ", updatedBy='" + getUpdatedBy() + "'" +
            ", updatedDate='" + getUpdatedDate() + "'" +
            "}";
    }


}
