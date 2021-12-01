
package com.CMS.CentralParam.KKBSK.model.RESPON;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "jenis_kendaraan",
    "jenis_kendaraan_id",
    "produk",
    "tenor1",
    "tenor2",
    "tenor3",
    "tenor4",
    "tenor5",
    "tenor6",
    "tenor7",
    "tenor8",
    "tenor9",
    "tenor10",
    "startBerlaku",
    "endBerlaku",
    "is_approved",
    "statusApproved",
    "tipeKonsumen",
    "namaSkema",
    "remarks",
    "nama"
})
@Generated("jsonschema2pojo")
public class DataRatecp {

    @JsonProperty("jenis_kendaraan")
    private Integer jenisKendaraan;
    @JsonProperty("jenis_kendaraan_id")
    private Object jenisKendaraanId;
    @JsonProperty("produk")
    private Integer produk;
    @JsonProperty("tenor1")
    private Object tenor1;
    @JsonProperty("tenor2")
    private Object tenor2;
    @JsonProperty("tenor3")
    private Object tenor3;
    @JsonProperty("tenor4")
    private Object tenor4;
    @JsonProperty("tenor5")
    private Object tenor5;
    @JsonProperty("tenor6")
    private Object tenor6;
    @JsonProperty("tenor7")
    private Object tenor7;
    @JsonProperty("tenor8")
    private Float tenor8;
    @JsonProperty("tenor9")
    private Object tenor9;
    @JsonProperty("tenor10")
    private Object tenor10;
    @JsonProperty("startBerlaku")
    private String startBerlaku;
    @JsonProperty("endBerlaku")
    private String endBerlaku;
    @JsonProperty("is_approved")
    private Object isApproved;
    @JsonProperty("statusApproved")
    private Object statusApproved;
    @JsonProperty("tipeKonsumen")
    private Object tipeKonsumen;
    @JsonProperty("namaSkema")
    private String namaSkema;
    @JsonProperty("remarks")
    private Object remarks;
    @JsonProperty("nama")
    private Object nama;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DataRatecp() {
    }

    /**
     * 
     * @param tenor5
     * @param tenor4
     * @param tenor7
     * @param tenor6
     * @param jenisKendaraanId
     * @param tenor1
     * @param tenor3
     * @param tenor2
     * @param tenor9
     * @param tenor8
     * @param tipeKonsumen
     * @param namaSkema
     * @param tenor10
     * @param produk
     * @param nama
     * @param statusApproved
     * @param endBerlaku
     * @param jenisKendaraan
     * @param isApproved
     * @param startBerlaku
     * @param remarks
     */
    public DataRatecp(Integer jenisKendaraan, Object jenisKendaraanId, Integer produk, Object tenor1, Object tenor2, Object tenor3, Object tenor4, Object tenor5, Object tenor6, Object tenor7, Float tenor8, Object tenor9, Object tenor10, String startBerlaku, String endBerlaku, Object isApproved, Object statusApproved, Object tipeKonsumen, String namaSkema, Object remarks, Object nama) {
        super();
        this.jenisKendaraan = jenisKendaraan;
        this.jenisKendaraanId = jenisKendaraanId;
        this.produk = produk;
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
        this.statusApproved = statusApproved;
        this.tipeKonsumen = tipeKonsumen;
        this.namaSkema = namaSkema;
        this.remarks = remarks;
        this.nama = nama;
    }

    @JsonProperty("jenis_kendaraan")
    public Integer getJenisKendaraan() {
        return jenisKendaraan;
    }

    @JsonProperty("jenis_kendaraan")
    public void setJenisKendaraan(Integer jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    @JsonProperty("jenis_kendaraan_id")
    public Object getJenisKendaraanId() {
        return jenisKendaraanId;
    }

    @JsonProperty("jenis_kendaraan_id")
    public void setJenisKendaraanId(Object jenisKendaraanId) {
        this.jenisKendaraanId = jenisKendaraanId;
    }

    @JsonProperty("produk")
    public Integer getProduk() {
        return produk;
    }

    @JsonProperty("produk")
    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    @JsonProperty("tenor1")
    public Object getTenor1() {
        return tenor1;
    }

    @JsonProperty("tenor1")
    public void setTenor1(Object tenor1) {
        this.tenor1 = tenor1;
    }

    @JsonProperty("tenor2")
    public Object getTenor2() {
        return tenor2;
    }

    @JsonProperty("tenor2")
    public void setTenor2(Object tenor2) {
        this.tenor2 = tenor2;
    }

    @JsonProperty("tenor3")
    public Object getTenor3() {
        return tenor3;
    }

    @JsonProperty("tenor3")
    public void setTenor3(Object tenor3) {
        this.tenor3 = tenor3;
    }

    @JsonProperty("tenor4")
    public Object getTenor4() {
        return tenor4;
    }

    @JsonProperty("tenor4")
    public void setTenor4(Object tenor4) {
        this.tenor4 = tenor4;
    }

    @JsonProperty("tenor5")
    public Object getTenor5() {
        return tenor5;
    }

    @JsonProperty("tenor5")
    public void setTenor5(Object tenor5) {
        this.tenor5 = tenor5;
    }

    @JsonProperty("tenor6")
    public Object getTenor6() {
        return tenor6;
    }

    @JsonProperty("tenor6")
    public void setTenor6(Object tenor6) {
        this.tenor6 = tenor6;
    }

    @JsonProperty("tenor7")
    public Object getTenor7() {
        return tenor7;
    }

    @JsonProperty("tenor7")
    public void setTenor7(Object tenor7) {
        this.tenor7 = tenor7;
    }

    @JsonProperty("tenor8")
    public Float getTenor8() {
        return tenor8;
    }

    @JsonProperty("tenor8")
    public void setTenor8(Float tenor8) {
        this.tenor8 = tenor8;
    }

    @JsonProperty("tenor9")
    public Object getTenor9() {
        return tenor9;
    }

    @JsonProperty("tenor9")
    public void setTenor9(Object tenor9) {
        this.tenor9 = tenor9;
    }

    @JsonProperty("tenor10")
    public Object getTenor10() {
        return tenor10;
    }

    @JsonProperty("tenor10")
    public void setTenor10(Object tenor10) {
        this.tenor10 = tenor10;
    }

    @JsonProperty("startBerlaku")
    public String getStartBerlaku() {
        return startBerlaku;
    }

    @JsonProperty("startBerlaku")
    public void setStartBerlaku(String startBerlaku) {
        this.startBerlaku = startBerlaku;
    }

    @JsonProperty("endBerlaku")
    public String getEndBerlaku() {
        return endBerlaku;
    }

    @JsonProperty("endBerlaku")
    public void setEndBerlaku(String endBerlaku) {
        this.endBerlaku = endBerlaku;
    }

    @JsonProperty("is_approved")
    public Object getIsApproved() {
        return isApproved;
    }

    @JsonProperty("is_approved")
    public void setIsApproved(Object isApproved) {
        this.isApproved = isApproved;
    }

    @JsonProperty("statusApproved")
    public Object getStatusApproved() {
        return statusApproved;
    }

    @JsonProperty("statusApproved")
    public void setStatusApproved(Object statusApproved) {
        this.statusApproved = statusApproved;
    }

    @JsonProperty("tipeKonsumen")
    public Object getTipeKonsumen() {
        return tipeKonsumen;
    }

    @JsonProperty("tipeKonsumen")
    public void setTipeKonsumen(Object tipeKonsumen) {
        this.tipeKonsumen = tipeKonsumen;
    }

    @JsonProperty("namaSkema")
    public String getNamaSkema() {
        return namaSkema;
    }

    @JsonProperty("namaSkema")
    public void setNamaSkema(String namaSkema) {
        this.namaSkema = namaSkema;
    }

    @JsonProperty("remarks")
    public Object getRemarks() {
        return remarks;
    }

    @JsonProperty("remarks")
    public void setRemarks(Object remarks) {
        this.remarks = remarks;
    }

    @JsonProperty("nama")
    public Object getNama() {
        return nama;
    }

    @JsonProperty("nama")
    public void setNama(Object nama) {
        this.nama = nama;
    }

}
