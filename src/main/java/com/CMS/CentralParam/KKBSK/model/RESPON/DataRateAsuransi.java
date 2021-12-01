
package com.CMS.CentralParam.KKBSK.model.RESPON;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "namaSkema",
    "wilayah",
    "namaWilayah",
    "startOTR",
    "endOTR",
    "startyear",
    "endyear",
    "tipeAsuransi",
    "namaAsuransi",
    "startBerlaku",
    "endBerlaku",
    "loan_type",
    "produk",
    "jenis_kendaraan",
    "jenis_kendaraan_id",
    "jenis_pembiayaan",
    "jenis_pembiayaan_id",
    "statusApproved",
    "remarks",
    "program"
})
public class DataRateAsuransi {

    @JsonProperty("namaSkema")
    private String namaSkema;
    @JsonProperty("wilayah")
    private Integer wilayah;
    @JsonProperty("namaWilayah")
    private String namaWilayah;
    @JsonProperty("startOTR")
    private Integer startOTR;
    @JsonProperty("endOTR")
    private Integer endOTR;
    @JsonProperty("startyear")
    private Integer startyear;
    @JsonProperty("endyear")
    private Integer endyear;
    @JsonProperty("tipeAsuransi")
    private Integer tipeAsuransi;
    @JsonProperty("namaAsuransi")
    private String namaAsuransi;
    @JsonProperty("startBerlaku")
    private String startBerlaku;
    @JsonProperty("endBerlaku")
    private String endBerlaku;
    @JsonProperty("loan_type")
    private Integer loanType;
    @JsonProperty("produk")
    private Integer produk;
    @JsonProperty("jenis_kendaraan")
    private Integer jenisKendaraan;
    @JsonProperty("jenis_kendaraan_id")
    private String jenisKendaraanId;
    @JsonProperty("jenis_pembiayaan")
    private Integer jenisPembiayaan;
    @JsonProperty("jenis_pembiayaan_id")
    private Object jenisPembiayaanId;
    @JsonProperty("statusApproved")
    private String statusApproved;
    @JsonProperty("remarks")
    private String remarks;
    @JsonProperty("program")
    private Integer program;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DataRateAsuransi() {
    }

    /**
     * 
     * @param endOTR
     * @param loanType
     * @param jenisKendaraanId
     * @param jenisPembiayaanId
     * @param jenisPembiayaan
     * @param namaWilayah
     * @param wilayah
     * @param program
     * @param namaSkema
     * @param produk
     * @param statusApproved
     * @param startOTR
     * @param endBerlaku
     * @param jenisKendaraan
     * @param startyear
     * @param endyear
     * @param tipeAsuransi
     * @param namaAsuransi
     * @param startBerlaku
     * @param remarks
     */
    public DataRateAsuransi(String namaSkema, Integer wilayah, String namaWilayah, Integer startOTR, Integer endOTR, Integer startyear, Integer endyear, Integer tipeAsuransi, String namaAsuransi, String startBerlaku, String endBerlaku, Integer loanType, Integer produk, Integer jenisKendaraan, String jenisKendaraanId, Integer jenisPembiayaan, Object jenisPembiayaanId, String statusApproved, String remarks, Integer program) {
        super();
        this.namaSkema = namaSkema;
        this.wilayah = wilayah;
        this.namaWilayah = namaWilayah;
        this.startOTR = startOTR;
        this.endOTR = endOTR;
        this.startyear = startyear;
        this.endyear = endyear;
        this.tipeAsuransi = tipeAsuransi;
        this.namaAsuransi = namaAsuransi;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.loanType = loanType;
        this.produk = produk;
        this.jenisKendaraan = jenisKendaraan;
        this.jenisKendaraanId = jenisKendaraanId;
        this.jenisPembiayaan = jenisPembiayaan;
        this.jenisPembiayaanId = jenisPembiayaanId;
        this.statusApproved = statusApproved;
        this.remarks = remarks;
        this.program = program;
    }

    @JsonProperty("namaSkema")
    public String getNamaSkema() {
        return namaSkema;
    }

    @JsonProperty("namaSkema")
    public void setNamaSkema(String namaSkema) {
        this.namaSkema = namaSkema;
    }

    @JsonProperty("wilayah")
    public Integer getWilayah() {
        return wilayah;
    }

    @JsonProperty("wilayah")
    public void setWilayah(Integer wilayah) {
        this.wilayah = wilayah;
    }

    @JsonProperty("namaWilayah")
    public String getNamaWilayah() {
        return namaWilayah;
    }

    @JsonProperty("namaWilayah")
    public void setNamaWilayah(String namaWilayah) {
        this.namaWilayah = namaWilayah;
    }

    @JsonProperty("startOTR")
    public Integer getStartOTR() {
        return startOTR;
    }

    @JsonProperty("startOTR")
    public void setStartOTR(Integer startOTR) {
        this.startOTR = startOTR;
    }

    @JsonProperty("endOTR")
    public Integer getEndOTR() {
        return endOTR;
    }

    @JsonProperty("endOTR")
    public void setEndOTR(Integer endOTR) {
        this.endOTR = endOTR;
    }

    @JsonProperty("startyear")
    public Integer getStartyear() {
        return startyear;
    }

    @JsonProperty("startyear")
    public void setStartyear(Integer startyear) {
        this.startyear = startyear;
    }

    @JsonProperty("endyear")
    public Integer getEndyear() {
        return endyear;
    }

    @JsonProperty("endyear")
    public void setEndyear(Integer endyear) {
        this.endyear = endyear;
    }

    @JsonProperty("tipeAsuransi")
    public Integer getTipeAsuransi() {
        return tipeAsuransi;
    }

    @JsonProperty("tipeAsuransi")
    public void setTipeAsuransi(Integer tipeAsuransi) {
        this.tipeAsuransi = tipeAsuransi;
    }

    @JsonProperty("namaAsuransi")
    public String getNamaAsuransi() {
        return namaAsuransi;
    }

    @JsonProperty("namaAsuransi")
    public void setNamaAsuransi(String namaAsuransi) {
        this.namaAsuransi = namaAsuransi;
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

    @JsonProperty("loan_type")
    public Integer getLoanType() {
        return loanType;
    }

    @JsonProperty("loan_type")
    public void setLoanType(Integer loanType) {
        this.loanType = loanType;
    }

    @JsonProperty("produk")
    public Integer getProduk() {
        return produk;
    }

    @JsonProperty("produk")
    public void setProduk(Integer produk) {
        this.produk = produk;
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
    public String getJenisKendaraanId() {
        return jenisKendaraanId;
    }

    @JsonProperty("jenis_kendaraan_id")
    public void setJenisKendaraanId(String jenisKendaraanId) {
        this.jenisKendaraanId = jenisKendaraanId;
    }

    @JsonProperty("jenis_pembiayaan")
    public Integer getJenisPembiayaan() {
        return jenisPembiayaan;
    }

    @JsonProperty("jenis_pembiayaan")
    public void setJenisPembiayaan(Integer jenisPembiayaan) {
        this.jenisPembiayaan = jenisPembiayaan;
    }

    @JsonProperty("jenis_pembiayaan_id")
    public Object getJenisPembiayaanId() {
        return jenisPembiayaanId;
    }

    @JsonProperty("jenis_pembiayaan_id")
    public void setJenisPembiayaanId(Object jenisPembiayaanId) {
        this.jenisPembiayaanId = jenisPembiayaanId;
    }

    @JsonProperty("statusApproved")
    public String getStatusApproved() {
        return statusApproved;
    }

    @JsonProperty("statusApproved")
    public void setStatusApproved(String statusApproved) {
        this.statusApproved = statusApproved;
    }

    @JsonProperty("remarks")
    public String getRemarks() {
        return remarks;
    }

    @JsonProperty("remarks")
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @JsonProperty("program")
    public Integer getProgram() {
        return program;
    }

    @JsonProperty("program")
    public void setProgram(Integer program) {
        this.program = program;
    }

}
