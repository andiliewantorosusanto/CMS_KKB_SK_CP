package com.CMS.CentralParam.KKBSK.model.REQUEST;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nama_skema",
    "tipe_konsumen",
    "jenis_kendaraan",
    "jenis_pembiayaan",
    "cluster",
    "diskon",
    "start_berlaku",
    "end_berlaku",
    "tenor1",
    "tenor2",
    "tenor3",
    "tenor4",
    "tenor5",
    "tenor6",
    "tenor7",
    "tenor8",
    "tenor9",
    "tenor10"
})
@Generated("jsonschema2pojo")
public class RequestInputRateBiayaAdmin {

    @JsonProperty("nama_skema")
    private String namaSkema;
    @JsonProperty("tipe_konsumen")
    private Integer tipeKonsumen;
    @JsonProperty("jenis_kendaraan")
    private Integer jenisKendaraan;
    @JsonProperty("jenis_pembiayaan")
    private Integer jenisPembiayaan;
    @JsonProperty("cluster")
    private Integer cluster;
    @JsonProperty("diskon")
    private Integer diskon;
    @JsonProperty("start_berlaku")
    private String startBerlaku;
    @JsonProperty("end_berlaku")
    private String endBerlaku;
    @JsonProperty("tenor1")
    private Integer tenor1;
    @JsonProperty("tenor2")
    private Integer tenor2;
    @JsonProperty("tenor3")
    private Integer tenor3;
    @JsonProperty("tenor4")
    private Integer tenor4;
    @JsonProperty("tenor5")
    private Integer tenor5;
    @JsonProperty("tenor6")
    private Integer tenor6;
    @JsonProperty("tenor7")
    private Integer tenor7;
    @JsonProperty("tenor8")
    private Integer tenor8;
    @JsonProperty("tenor9")
    private Integer tenor9;
    @JsonProperty("tenor10")
    private Integer tenor10;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequestInputRateBiayaAdmin() {
    }

    /**
     * 
     * @param tenor5
     * @param cluster
     * @param tenor4
     * @param tenor7
     * @param tenor6
     * @param tenor1
     * @param jenisPembiayaan
     * @param tenor3
     * @param tenor2
     * @param tenor9
     * @param tipeKonsumen
     * @param tenor8
     * @param namaSkema
     * @param tenor10
     * @param endBerlaku
     * @param jenisKendaraan
     * @param startBerlaku
     * @param diskon
     */
    public RequestInputRateBiayaAdmin(String namaSkema, Integer tipeKonsumen, Integer jenisKendaraan, Integer jenisPembiayaan, Integer cluster, Integer diskon, String startBerlaku, String endBerlaku, Integer tenor1, Integer tenor2, Integer tenor3, Integer tenor4, Integer tenor5, Integer tenor6, Integer tenor7, Integer tenor8, Integer tenor9, Integer tenor10) {
        super();
        this.namaSkema = namaSkema;
        this.tipeKonsumen = tipeKonsumen;
        this.jenisKendaraan = jenisKendaraan;
        this.jenisPembiayaan = jenisPembiayaan;
        this.cluster = cluster;
        this.diskon = diskon;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
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
    }

    @JsonProperty("nama_skema")
    public String getNamaSkema() {
        return namaSkema;
    }

    @JsonProperty("nama_skema")
    public void setNamaSkema(String namaSkema) {
        this.namaSkema = namaSkema;
    }

    @JsonProperty("tipe_konsumen")
    public Integer getTipeKonsumen() {
        return tipeKonsumen;
    }

    @JsonProperty("tipe_konsumen")
    public void setTipeKonsumen(Integer tipeKonsumen) {
        this.tipeKonsumen = tipeKonsumen;
    }

    @JsonProperty("jenis_kendaraan")
    public Integer getJenisKendaraan() {
        return jenisKendaraan;
    }

    @JsonProperty("jenis_kendaraan")
    public void setJenisKendaraan(Integer jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    @JsonProperty("jenis_pembiayaan")
    public Integer getJenisPembiayaan() {
        return jenisPembiayaan;
    }

    @JsonProperty("jenis_pembiayaan")
    public void setJenisPembiayaan(Integer jenisPembiayaan) {
        this.jenisPembiayaan = jenisPembiayaan;
    }

    @JsonProperty("cluster")
    public Integer getCluster() {
        return cluster;
    }

    @JsonProperty("cluster")
    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    @JsonProperty("diskon")
    public Integer getDiskon() {
        return diskon;
    }

    @JsonProperty("diskon")
    public void setDiskon(Integer diskon) {
        this.diskon = diskon;
    }

    @JsonProperty("start_berlaku")
    public String getStartBerlaku() {
        return startBerlaku;
    }

    @JsonProperty("start_berlaku")
    public void setStartBerlaku(String startBerlaku) {
        this.startBerlaku = startBerlaku;
    }

    @JsonProperty("end_berlaku")
    public String getEndBerlaku() {
        return endBerlaku;
    }

    @JsonProperty("end_berlaku")
    public void setEndBerlaku(String endBerlaku) {
        this.endBerlaku = endBerlaku;
    }

    @JsonProperty("tenor1")
    public Integer getTenor1() {
        return tenor1;
    }

    @JsonProperty("tenor1")
    public void setTenor1(Integer tenor1) {
        this.tenor1 = tenor1;
    }

    @JsonProperty("tenor2")
    public Integer getTenor2() {
        return tenor2;
    }

    @JsonProperty("tenor2")
    public void setTenor2(Integer tenor2) {
        this.tenor2 = tenor2;
    }

    @JsonProperty("tenor3")
    public Integer getTenor3() {
        return tenor3;
    }

    @JsonProperty("tenor3")
    public void setTenor3(Integer tenor3) {
        this.tenor3 = tenor3;
    }

    @JsonProperty("tenor4")
    public Integer getTenor4() {
        return tenor4;
    }

    @JsonProperty("tenor4")
    public void setTenor4(Integer tenor4) {
        this.tenor4 = tenor4;
    }

    @JsonProperty("tenor5")
    public Integer getTenor5() {
        return tenor5;
    }

    @JsonProperty("tenor5")
    public void setTenor5(Integer tenor5) {
        this.tenor5 = tenor5;
    }

    @JsonProperty("tenor6")
    public Integer getTenor6() {
        return tenor6;
    }

    @JsonProperty("tenor6")
    public void setTenor6(Integer tenor6) {
        this.tenor6 = tenor6;
    }

    @JsonProperty("tenor7")
    public Integer getTenor7() {
        return tenor7;
    }

    @JsonProperty("tenor7")
    public void setTenor7(Integer tenor7) {
        this.tenor7 = tenor7;
    }

    @JsonProperty("tenor8")
    public Integer getTenor8() {
        return tenor8;
    }

    @JsonProperty("tenor8")
    public void setTenor8(Integer tenor8) {
        this.tenor8 = tenor8;
    }

    @JsonProperty("tenor9")
    public Integer getTenor9() {
        return tenor9;
    }

    @JsonProperty("tenor9")
    public void setTenor9(Integer tenor9) {
        this.tenor9 = tenor9;
    }

    @JsonProperty("tenor10")
    public Integer getTenor10() {
        return tenor10;
    }

    @JsonProperty("tenor10")
    public void setTenor10(Integer tenor10) {
        this.tenor10 = tenor10;
    }

}
