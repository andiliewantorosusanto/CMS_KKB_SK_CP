
package com.CMS.CentralParam.KKBSK.model.RESPON;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

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

    @JsonProperty("namaSkema")
    private String namaSkema;
    @JsonProperty("tipe_konsumen")
    private Integer tipeKonsumen;
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
    private String clusterId;
    @JsonProperty("diskon_npwp")
    private Integer diskonNpwp;
    @JsonProperty("startBerlaku")
    private String startBerlaku;
    @JsonProperty("endBerlaku")
    private String endBerlaku;
    @JsonProperty("statusApproval")
    private String statusApproval;
    @JsonProperty("remarks")
    private String remarks;
    @JsonProperty("nama")
    private String nama;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DataBiayaAdmin() {
    }

    /**
     * 
     * @param cluster
     * @param jenisKendaraanId
     * @param jenisPembiayaanId
     * @param jenisPembiayaan
     * @param statusApproval
     * @param clusterId
     * @param tipeKonsumen
     * @param jeniskendaraanid
     * @param namaSkema
     * @param nama
     * @param diskonNpwp
     * @param endBerlaku
     * @param startBerlaku
     * @param remarks
     */
    public DataBiayaAdmin(String namaSkema, Integer tipeKonsumen, Integer jeniskendaraanid, String jenisKendaraanId, Integer jenisPembiayaan, String jenisPembiayaanId, Integer cluster, String clusterId, Integer diskonNpwp, String startBerlaku, String endBerlaku, String statusApproval, String remarks, String nama) {
        super();
        this.namaSkema = namaSkema;
        this.tipeKonsumen = tipeKonsumen;
        this.jeniskendaraanid = jeniskendaraanid;
        this.jenisKendaraanId = jenisKendaraanId;
        this.jenisPembiayaan = jenisPembiayaan;
        this.jenisPembiayaanId = jenisPembiayaanId;
        this.cluster = cluster;
        this.clusterId = clusterId;
        this.diskonNpwp = diskonNpwp;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.statusApproval = statusApproval;
        this.remarks = remarks;
        this.nama = nama;
    }

    @JsonProperty("namaSkema")
    public String getNamaSkema() {
        return namaSkema;
    }

    @JsonProperty("namaSkema")
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
    public String getClusterId() {
        return clusterId;
    }

    @JsonProperty("cluster_id")
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    @JsonProperty("diskon_npwp")
    public Integer getDiskonNpwp() {
        return diskonNpwp;
    }

    @JsonProperty("diskon_npwp")
    public void setDiskonNpwp(Integer diskonNpwp) {
        this.diskonNpwp = diskonNpwp;
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

    @JsonProperty("statusApproval")
    public String getStatusApproval() {
        return statusApproval;
    }

    @JsonProperty("statusApproval")
    public void setStatusApproval(String statusApproval) {
        this.statusApproval = statusApproval;
    }

    @JsonProperty("remarks")
    public String getRemarks() {
        return remarks;
    }

    @JsonProperty("remarks")
    public void setRemarks(String remarks) {
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

}
