package com.CMS.CentralParam.KKBSK.model.REQUEST;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "nama_skema",
    "start_berlaku",
    "end_berlaku",
    "jenis_kendaraan",
    "jenis_pembiayaan",
    "loan_type",
    "cluster",
    "diskon",
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
    "tenor1persen",
    "tenor2persen",
    "tenor3persen",
    "tenor4persen",
    "tenor5persen",
    "tenor6persen",
    "tenor7persen",
    "tenor8persen",
    "tenor9persen",
    "tenor10persen"
})
@Generated("jsonschema2pojo")
public class RequestInputRateBiayaProvisi {

    @JsonProperty("nama_skema")
    private String namaSkema;
    @JsonProperty("start_berlaku")
    private String startBerlaku;
    @JsonProperty("end_berlaku")
    private String endBerlaku;
    @JsonProperty("jenis_kendaraan")
    private Integer jenisKendaraan;
    @JsonProperty("jenis_pembiayaan")
    private Integer jenisPembiayaan;
    @JsonProperty("loan_type")
    private Integer loanType;
    @JsonProperty("cluster")
    private Integer cluster;
    @JsonProperty("diskon")
    private Integer diskon;
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
    @JsonProperty("tenor1persen")
    private Integer tenor1persen;
    @JsonProperty("tenor2persen")
    private Integer tenor2persen;
    @JsonProperty("tenor3persen")
    private Integer tenor3persen;
    @JsonProperty("tenor4persen")
    private Integer tenor4persen;
    @JsonProperty("tenor5persen")
    private Integer tenor5persen;
    @JsonProperty("tenor6persen")
    private Integer tenor6persen;
    @JsonProperty("tenor7persen")
    private Integer tenor7persen;
    @JsonProperty("tenor8persen")
    private Integer tenor8persen;
    @JsonProperty("tenor9persen")
    private Integer tenor9persen;
    @JsonProperty("tenor10persen")
    private Integer tenor10persen;

    /**
     * No args constructor for use in serialization
     * 
     */
    public RequestInputRateBiayaProvisi() {
    }

    /**
     * 
     * @param tenor5
     * @param cluster
     * @param tenor4
     * @param tenor7
     * @param tenor7persen
     * @param tenor6
     * @param loanType
     * @param tenor1
     * @param tenor2persen
     * @param jenisPembiayaan
     * @param tenor3
     * @param tenor2
     * @param tenor9
     * @param tenor8
     * @param tenor10persen
     * @param namaSkema
     * @param endBerlaku
     * @param jenisKendaraan
     * @param tenor5persen
     * @param startBerlaku
     * @param diskon
     * @param tenor3persen
     * @param tenor8persen
     * @param tenor10
     * @param tenor4persen
     * @param tenor9persen
     * @param tenor6persen
     * @param tenor1persen
     */
    public RequestInputRateBiayaProvisi(String namaSkema, String startBerlaku, String endBerlaku, Integer jenisKendaraan, Integer jenisPembiayaan, Integer loanType, Integer cluster, Integer diskon, Integer tenor1, Integer tenor2, Integer tenor3, Integer tenor4, Integer tenor5, Integer tenor6, Integer tenor7, Integer tenor8, Integer tenor9, Integer tenor10, Integer tenor1persen, Integer tenor2persen, Integer tenor3persen, Integer tenor4persen, Integer tenor5persen, Integer tenor6persen, Integer tenor7persen, Integer tenor8persen, Integer tenor9persen, Integer tenor10persen) {
        super();
        this.namaSkema = namaSkema;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.jenisKendaraan = jenisKendaraan;
        this.jenisPembiayaan = jenisPembiayaan;
        this.loanType = loanType;
        this.cluster = cluster;
        this.diskon = diskon;
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
        this.tenor1persen = tenor1persen;
        this.tenor2persen = tenor2persen;
        this.tenor3persen = tenor3persen;
        this.tenor4persen = tenor4persen;
        this.tenor5persen = tenor5persen;
        this.tenor6persen = tenor6persen;
        this.tenor7persen = tenor7persen;
        this.tenor8persen = tenor8persen;
        this.tenor9persen = tenor9persen;
        this.tenor10persen = tenor10persen;
    }

    @JsonProperty("nama_skema")
    public String getNamaSkema() {
        return namaSkema;
    }

    @JsonProperty("nama_skema")
    public void setNamaSkema(String namaSkema) {
        this.namaSkema = namaSkema;
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

    @JsonProperty("loan_type")
    public Integer getLoanType() {
        return loanType;
    }

    @JsonProperty("loan_type")
    public void setLoanType(Integer loanType) {
        this.loanType = loanType;
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

    @JsonProperty("tenor1persen")
    public Integer getTenor1persen() {
        return tenor1persen;
    }

    @JsonProperty("tenor1persen")
    public void setTenor1persen(Integer tenor1persen) {
        this.tenor1persen = tenor1persen;
    }

    @JsonProperty("tenor2persen")
    public Integer getTenor2persen() {
        return tenor2persen;
    }

    @JsonProperty("tenor2persen")
    public void setTenor2persen(Integer tenor2persen) {
        this.tenor2persen = tenor2persen;
    }

    @JsonProperty("tenor3persen")
    public Integer getTenor3persen() {
        return tenor3persen;
    }

    @JsonProperty("tenor3persen")
    public void setTenor3persen(Integer tenor3persen) {
        this.tenor3persen = tenor3persen;
    }

    @JsonProperty("tenor4persen")
    public Integer getTenor4persen() {
        return tenor4persen;
    }

    @JsonProperty("tenor4persen")
    public void setTenor4persen(Integer tenor4persen) {
        this.tenor4persen = tenor4persen;
    }

    @JsonProperty("tenor5persen")
    public Integer getTenor5persen() {
        return tenor5persen;
    }

    @JsonProperty("tenor5persen")
    public void setTenor5persen(Integer tenor5persen) {
        this.tenor5persen = tenor5persen;
    }

    @JsonProperty("tenor6persen")
    public Integer getTenor6persen() {
        return tenor6persen;
    }

    @JsonProperty("tenor6persen")
    public void setTenor6persen(Integer tenor6persen) {
        this.tenor6persen = tenor6persen;
    }

    @JsonProperty("tenor7persen")
    public Integer getTenor7persen() {
        return tenor7persen;
    }

    @JsonProperty("tenor7persen")
    public void setTenor7persen(Integer tenor7persen) {
        this.tenor7persen = tenor7persen;
    }

    @JsonProperty("tenor8persen")
    public Integer getTenor8persen() {
        return tenor8persen;
    }

    @JsonProperty("tenor8persen")
    public void setTenor8persen(Integer tenor8persen) {
        this.tenor8persen = tenor8persen;
    }

    @JsonProperty("tenor9persen")
    public Integer getTenor9persen() {
        return tenor9persen;
    }

    @JsonProperty("tenor9persen")
    public void setTenor9persen(Integer tenor9persen) {
        this.tenor9persen = tenor9persen;
    }

    @JsonProperty("tenor10persen")
    public Integer getTenor10persen() {
        return tenor10persen;
    }

    @JsonProperty("tenor10persen")
    public void setTenor10persen(Integer tenor10persen) {
        this.tenor10persen = tenor10persen;
    }

}
