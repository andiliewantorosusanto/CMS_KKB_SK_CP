package com.CMS.CentralParam.KKBSK.model.RESPON;


import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "namaSkema",
    "loanType",
    "deskripsi",
    "tujuan_penggunaan",
    "tipe_konsumen",
    "jeniskendaraanid",
    "jenis_kendaraan_id",
    "jenis_pembiayaan",
    "jenis_pembiayaan_id",
    "cluster",
    "cluster_id",
    "minimalDP",
    "status",
    "remarks",
    "nama",
    "nama_konsumen"
})
@Generated("jsonschema2pojo")
public class DataMinimalDP {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("namaSkema")
    private String namaSkema;
    @JsonProperty("loanType")
    private Integer loanType;
    @JsonProperty("deskripsi")
    private String deskripsi;
    @JsonProperty("tujuan_penggunaan")
    private Integer tujuanPenggunaan;
    @JsonProperty("tipe_konsumen")
    private Object tipeKonsumen;
    @JsonProperty("jeniskendaraanid")
    private Integer jeniskendaraanid;
    @JsonProperty("jenis_kendaraan_id")
    private String jenisKendaraanId;
    @JsonProperty("jenis_pembiayaan")
    private Integer jenisPembiayaan;
    @JsonProperty("jenis_pembiayaan_id")
    private String jenisPembiayaanId;
    @JsonProperty("cluster")
    private Integer cluster;
    @JsonProperty("cluster_id")
    private Object clusterId;
    @JsonProperty("minimalDP")
    private Float minimalDP;
    @JsonProperty("status")
    private Object status;
    @JsonProperty("remarks")
    private Object remarks;
    @JsonProperty("nama")
    private String nama;
    @JsonProperty("nama_konsumen")
    private Object namaKonsumen;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DataMinimalDP() {
    }

    /**
     * 
     * @param cluster
     * @param loanType
     * @param jenisKendaraanId
     * @param jenisPembiayaanId
     * @param jenisPembiayaan
     * @param clusterId
     * @param minimalDP
     * @param tipeKonsumen
     * @param namaKonsumen
     * @param jeniskendaraanid
     * @param namaSkema
     * @param nama
     * @param id
     * @param deskripsi
     * @param tujuanPenggunaan
     * @param remarks
     * @param status
     */
    public DataMinimalDP(Integer id, String namaSkema, Integer loanType, String deskripsi, Integer tujuanPenggunaan, Object tipeKonsumen, Integer jeniskendaraanid, String jenisKendaraanId, Integer jenisPembiayaan, String jenisPembiayaanId, Integer cluster, Object clusterId, Float minimalDP, Object status, Object remarks, String nama, Object namaKonsumen) {
        super();
        this.id = id;
        this.namaSkema = namaSkema;
        this.loanType = loanType;
        this.deskripsi = deskripsi;
        this.tujuanPenggunaan = tujuanPenggunaan;
        this.tipeKonsumen = tipeKonsumen;
        this.jeniskendaraanid = jeniskendaraanid;
        this.jenisKendaraanId = jenisKendaraanId;
        this.jenisPembiayaan = jenisPembiayaan;
        this.jenisPembiayaanId = jenisPembiayaanId;
        this.cluster = cluster;
        this.clusterId = clusterId;
        this.minimalDP = minimalDP;
        this.status = status;
        this.remarks = remarks;
        this.nama = nama;
        this.namaKonsumen = namaKonsumen;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("namaSkema")
    public String getNamaSkema() {
        return namaSkema;
    }

    @JsonProperty("namaSkema")
    public void setNamaSkema(String namaSkema) {
        this.namaSkema = namaSkema;
    }

    @JsonProperty("loanType")
    public Integer getLoanType() {
        return loanType;
    }

    @JsonProperty("loanType")
    public void setLoanType(Integer loanType) {
        this.loanType = loanType;
    }

    @JsonProperty("deskripsi")
    public String getDeskripsi() {
        return deskripsi;
    }

    @JsonProperty("deskripsi")
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @JsonProperty("tujuan_penggunaan")
    public Integer getTujuanPenggunaan() {
        return tujuanPenggunaan;
    }

    @JsonProperty("tujuan_penggunaan")
    public void setTujuanPenggunaan(Integer tujuanPenggunaan) {
        this.tujuanPenggunaan = tujuanPenggunaan;
    }

    @JsonProperty("tipe_konsumen")
    public Object getTipeKonsumen() {
        return tipeKonsumen;
    }

    @JsonProperty("tipe_konsumen")
    public void setTipeKonsumen(Object tipeKonsumen) {
        this.tipeKonsumen = tipeKonsumen;
    }

    @JsonProperty("jeniskendaraanid")
    public Integer getJeniskendaraanid() {
        return jeniskendaraanid;
    }

    @JsonProperty("jeniskendaraanid")
    public void setJeniskendaraanid(Integer jeniskendaraanid) {
        this.jeniskendaraanid = jeniskendaraanid;
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
    public String getJenisPembiayaanId() {
        return jenisPembiayaanId;
    }

    @JsonProperty("jenis_pembiayaan_id")
    public void setJenisPembiayaanId(String jenisPembiayaanId) {
        this.jenisPembiayaanId = jenisPembiayaanId;
    }

    @JsonProperty("cluster")
    public Integer getCluster() {
        return cluster;
    }

    @JsonProperty("cluster")
    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    @JsonProperty("cluster_id")
    public Object getClusterId() {
        return clusterId;
    }

    @JsonProperty("cluster_id")
    public void setClusterId(Object clusterId) {
        this.clusterId = clusterId;
    }

    @JsonProperty("minimalDP")
    public Float getMinimalDP() {
        return minimalDP;
    }

    @JsonProperty("minimalDP")
    public void setMinimalDP(Float minimalDP) {
        this.minimalDP = minimalDP;
    }

    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
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
    public String getNama() {
        return nama;
    }

    @JsonProperty("nama")
    public void setNama(String nama) {
        this.nama = nama;
    }

    @JsonProperty("nama_konsumen")
    public Object getNamaKonsumen() {
        return namaKonsumen;
    }

    @JsonProperty("nama_konsumen")
    public void setNamaKonsumen(Object namaKonsumen) {
        this.namaKonsumen = namaKonsumen;
    }

}
