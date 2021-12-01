package com.CMS.CentralParam.KKBSK.model.RESPON;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "loan_type",
    "namaSkema",
    "deskripsi",
    "jenis_kendaraan",
    "jenis_kendaraan_id",
    "jenis_pembiayaan",
    "jenis_pembiayaan_id",
    "cluster",
    "cluster_id",
    "start_tahun_kendaraan",
    "end_tahun",
    "start_berlaku",
    "end_berlaku",
    "statusApproved",
    "remarks"
})
public class DataRateBunga {

    @JsonProperty("loan_type")
    private String loanType;
    @JsonProperty("namaSkema")
    private String namaSkema;
    @JsonProperty("deskripsi")
    private String deskripsi;
    @JsonProperty("jenis_kendaraan")
    private String jenisKendaraan;
    @JsonProperty("jenis_kendaraan_id")
    private String jenisKendaraanId;
    @JsonProperty("jenis_pembiayaan")
    private String jenisPembiayaan;
    @JsonProperty("jenis_pembiayaan_id")
    private String jenisPembiayaanId;
    @JsonProperty("cluster")
    private String cluster;
    @JsonProperty("cluster_id")
    private String clusterId;
    @JsonProperty("start_tahun_kendaraan")
    private String startTahunKendaraan;
    @JsonProperty("end_tahun")
    private String endTahun;
    @JsonProperty("start_berlaku")
    private String startBerlaku;
    @JsonProperty("end_berlaku")
    private String endBerlaku;
    @JsonProperty("statusApproved")
    private String statusApproved;
    @JsonProperty("remarks")
    private String remarks;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DataRateBunga() {
    }

    /**
     * 
     * @param cluster
     * @param namaSkema
     * @param loanType
     * @param jenisKendaraanId
     * @param jenisPembiayaanId
     * @param jenisPembiayaan
     * @param clusterId
     * @param endTahun
     * @param startTahunKendaraan
     * @param statusApproved
     * @param endBerlaku
     * @param jenisKendaraan
     * @param deskripsi
     * @param startBerlaku
     * @param remarks
     */
    public DataRateBunga(String loanType,String namaSkema, String deskripsi, String jenisKendaraan, String jenisKendaraanId, String jenisPembiayaan, String jenisPembiayaanId, String cluster, String clusterId, String startTahunKendaraan, String endTahun, String startBerlaku, String endBerlaku, String statusApproved, String remarks) {
        super();
        this.loanType = loanType;
        this.namaSkema = namaSkema;
        this.deskripsi = deskripsi;
        this.jenisKendaraan = jenisKendaraan;
        this.jenisKendaraanId = jenisKendaraanId;
        this.jenisPembiayaan = jenisPembiayaan;
        this.jenisPembiayaanId = jenisPembiayaanId;
        this.cluster = cluster;
        this.clusterId = clusterId;
        this.startTahunKendaraan = startTahunKendaraan;
        this.endTahun = endTahun;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.statusApproved = statusApproved;
        this.remarks = remarks;
    }

    @JsonProperty("loan_type")
    public String getLoanType() {
        return loanType;
    }

    @JsonProperty("loan_type")
    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    @JsonProperty("namaSkema")
    public String getNamaSkema() {
        return namaSkema;
    }

    @JsonProperty("namaSkema")
    public void setNamaSkema(String namaSkema) {
        this.namaSkema = namaSkema;
    }

    @JsonProperty("deskripsi")
    public String getDeskripsi() {
        return deskripsi;
    }

    @JsonProperty("deskripsi")
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @JsonProperty("jenis_kendaraan")
    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    @JsonProperty("jenis_kendaraan")
    public void setJenisKendaraan(String jenisKendaraan) {
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
    public String getJenisPembiayaan() {
        return jenisPembiayaan;
    }

    @JsonProperty("jenis_pembiayaan")
    public void setJenisPembiayaan(String jenisPembiayaan) {
        this.jenisPembiayaan = jenisPembiayaan;
    }

    @JsonProperty("jenis_pembiayaan_id")
    public String getJenisPembiayaanId() {
        return jenisPembiayaanId;
    }

    @JsonProperty("jenis_pembiayaan_id")
    public void setJenisPembiayaanId(String jenisPembiayaanId) {
        this.jenisPembiayaanId = jenisPembiayaanId;
    }

    @JsonProperty("cluster")
    public String getCluster() {
        return cluster;
    }

    @JsonProperty("cluster")
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    @JsonProperty("cluster_id")
    public String getClusterId() {
        return clusterId;
    }

    @JsonProperty("cluster_id")
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    @JsonProperty("start_tahun_kendaraan")
    public String getStartTahunKendaraan() {
        return startTahunKendaraan;
    }

    @JsonProperty("start_tahun_kendaraan")
    public void setStartTahunKendaraan(String startTahunKendaraan) {
        this.startTahunKendaraan = startTahunKendaraan;
    }

    @JsonProperty("end_tahun")
    public String getEndTahun() {
        return endTahun;
    }

    @JsonProperty("end_tahun")
    public void setEndTahun(String endTahun) {
        this.endTahun = endTahun;
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

}
