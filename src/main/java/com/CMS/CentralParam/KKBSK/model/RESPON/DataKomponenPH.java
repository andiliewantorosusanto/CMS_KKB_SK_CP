package com.CMS.CentralParam.KKBSK.model.RESPON;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "idKompPH",
    "jenis",
    "addm",
    "addb",
    "created_at",
    "startBerlaku",
    "endBerlaku",
    "is_rejected",
    "group_id",
    "kondisi_kendaraan",
    "produk",
    "status",
    "tipe_konsumen",
    "jenis_pembiayaan",
    "jenis_kendaraan",
    "program",
    "cluster",
    "is_login",
    "remarks"
})
@Generated("jsonschema2pojo")
public class DataKomponenPH {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("idKompPH")
    private Integer idKompPH;
    @JsonProperty("jenis")
    private String jenis;
    @JsonProperty("addm")
    private Integer addm;
    @JsonProperty("addb")
    private Integer addb;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("startBerlaku")
    private Object startBerlaku;
    @JsonProperty("endBerlaku")
    private Object endBerlaku;
    @JsonProperty("is_rejected")
    private Integer isRejected;
    @JsonProperty("group_id")
    private String groupId;
    @JsonProperty("kondisi_kendaraan")
    private Object kondisiKendaraan;
    @JsonProperty("produk")
    private String produk;
    @JsonProperty("status")
    private String status;
    @JsonProperty("tipe_konsumen")
    private Integer tipeKonsumen;
    @JsonProperty("jenis_pembiayaan")
    private Integer jenisPembiayaan;
    @JsonProperty("jenis_kendaraan")
    private Integer jenisKendaraan;
    @JsonProperty("program")
    private Integer program;
    @JsonProperty("cluster")
    private Integer cluster;
    @JsonProperty("is_login")
    private Integer isLogin;
    @JsonProperty("remarks")
    private Object remarks;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DataKomponenPH() {
    }

    /**
     * 
     * @param addm
     * @param cluster
     * @param jenisPembiayaan
     * @param groupId
     * @param program
     * @param addb
     * @param tipeKonsumen
     * @param idKompPH
     * @param createdAt
     * @param isLogin
     * @param produk
     * @param endBerlaku
     * @param jenis
     * @param kondisiKendaraan
     * @param jenisKendaraan
     * @param isRejected
     * @param id
     * @param startBerlaku
     * @param remarks
     * @param status
     */
    public DataKomponenPH(Integer id, Integer idKompPH, String jenis, Integer addm, Integer addb, String createdAt, Object startBerlaku, Object endBerlaku, Integer isRejected, String groupId, Object kondisiKendaraan, String produk, String status, Integer tipeKonsumen, Integer jenisPembiayaan, Integer jenisKendaraan, Integer program, Integer cluster, Integer isLogin, Object remarks) {
        super();
        this.id = id;
        this.idKompPH = idKompPH;
        this.jenis = jenis;
        this.addm = addm;
        this.addb = addb;
        this.createdAt = createdAt;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.isRejected = isRejected;
        this.groupId = groupId;
        this.kondisiKendaraan = kondisiKendaraan;
        this.produk = produk;
        this.status = status;
        this.tipeKonsumen = tipeKonsumen;
        this.jenisPembiayaan = jenisPembiayaan;
        this.jenisKendaraan = jenisKendaraan;
        this.program = program;
        this.cluster = cluster;
        this.isLogin = isLogin;
        this.remarks = remarks;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("idKompPH")
    public Integer getIdKompPH() {
        return idKompPH;
    }

    @JsonProperty("idKompPH")
    public void setIdKompPH(Integer idKompPH) {
        this.idKompPH = idKompPH;
    }

    @JsonProperty("jenis")
    public String getJenis() {
        return jenis;
    }

    @JsonProperty("jenis")
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    @JsonProperty("addm")
    public Integer getAddm() {
        return addm;
    }

    @JsonProperty("addm")
    public void setAddm(Integer addm) {
        this.addm = addm;
    }

    @JsonProperty("addb")
    public Integer getAddb() {
        return addb;
    }

    @JsonProperty("addb")
    public void setAddb(Integer addb) {
        this.addb = addb;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("startBerlaku")
    public Object getStartBerlaku() {
        return startBerlaku;
    }

    @JsonProperty("startBerlaku")
    public void setStartBerlaku(Object startBerlaku) {
        this.startBerlaku = startBerlaku;
    }

    @JsonProperty("endBerlaku")
    public Object getEndBerlaku() {
        return endBerlaku;
    }

    @JsonProperty("endBerlaku")
    public void setEndBerlaku(Object endBerlaku) {
        this.endBerlaku = endBerlaku;
    }

    @JsonProperty("is_rejected")
    public Integer getIsRejected() {
        return isRejected;
    }

    @JsonProperty("is_rejected")
    public void setIsRejected(Integer isRejected) {
        this.isRejected = isRejected;
    }

    @JsonProperty("group_id")
    public String getGroupId() {
        return groupId;
    }

    @JsonProperty("group_id")
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @JsonProperty("kondisi_kendaraan")
    public Object getKondisiKendaraan() {
        return kondisiKendaraan;
    }

    @JsonProperty("kondisi_kendaraan")
    public void setKondisiKendaraan(Object kondisiKendaraan) {
        this.kondisiKendaraan = kondisiKendaraan;
    }

    @JsonProperty("produk")
    public String getProduk() {
        return produk;
    }

    @JsonProperty("produk")
    public void setProduk(String produk) {
        this.produk = produk;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("tipe_konsumen")
    public Integer getTipeKonsumen() {
        return tipeKonsumen;
    }

    @JsonProperty("tipe_konsumen")
    public void setTipeKonsumen(Integer tipeKonsumen) {
        this.tipeKonsumen = tipeKonsumen;
    }

    @JsonProperty("jenis_pembiayaan")
    public Integer getJenisPembiayaan() {
        return jenisPembiayaan;
    }

    @JsonProperty("jenis_pembiayaan")
    public void setJenisPembiayaan(Integer jenisPembiayaan) {
        this.jenisPembiayaan = jenisPembiayaan;
    }

    @JsonProperty("jenis_kendaraan")
    public Integer getJenisKendaraan() {
        return jenisKendaraan;
    }

    @JsonProperty("jenis_kendaraan")
    public void setJenisKendaraan(Integer jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    @JsonProperty("program")
    public Integer getProgram() {
        return program;
    }

    @JsonProperty("program")
    public void setProgram(Integer program) {
        this.program = program;
    }

    @JsonProperty("cluster")
    public Integer getCluster() {
        return cluster;
    }

    @JsonProperty("cluster")
    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    @JsonProperty("is_login")
    public Integer getIsLogin() {
        return isLogin;
    }

    @JsonProperty("is_login")
    public void setIsLogin(Integer isLogin) {
        this.isLogin = isLogin;
    }

    @JsonProperty("remarks")
    public Object getRemarks() {
        return remarks;
    }

    @JsonProperty("remarks")
    public void setRemarks(Object remarks) {
        this.remarks = remarks;
    }

}
