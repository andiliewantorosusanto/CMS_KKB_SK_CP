package com.CMS.CentralParam.KKBSK.model.RESPON;


import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "startBerlaku",
    "endBerlaku",
    "loanType",
    "productid",
    "jeniskendaraanid",
    "jenis_kendaraan_id",
    "kondisikendaraanid",
    "tipe_konsumen",
    "jenis_pembiayaan",
    "jenis_pembiayaan_id",
    "tujuan_penggunaan",
    "cluster",
    "program",
    "remarks",
    "status",
    "tahun_awal",
    "tahun_akhir",
    "updateddate",
    "createddate",
    "createdby",
    "updatedby",
    "is_login",
    "statusApproved",
    "namaSkema",
    "deskripsi"
})
@Generated("jsonschema2pojo")
public class DataBiayaProvisi {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("startBerlaku")
    private String startBerlaku;
    @JsonProperty("endBerlaku")
    private String endBerlaku;
    @JsonProperty("loanType")
    private Integer loanType;
    @JsonProperty("productid")
    private Integer productid;
    @JsonProperty("jeniskendaraanid")
    private Integer jeniskendaraanid;
    @JsonProperty("jenis_kendaraan_id")
    private String jenisKendaraanId;
    @JsonProperty("kondisikendaraanid")
    private Object kondisikendaraanid;
    @JsonProperty("tipe_konsumen")
    private Integer tipeKonsumen;
    @JsonProperty("jenis_pembiayaan")
    private Integer jenisPembiayaan;
    @JsonProperty("jenis_pembiayaan_id")
    private String jenisPembiayaanId;
    @JsonProperty("tujuan_penggunaan")
    private Integer tujuanPenggunaan;
    @JsonProperty("cluster")
    private Integer cluster;
    @JsonProperty("program")
    private Integer program;
    @JsonProperty("remarks")
    private String remarks;
    @JsonProperty("status")
    private Object status;
    @JsonProperty("tahun_awal")
    private Integer tahunAwal;
    @JsonProperty("tahun_akhir")
    private Integer tahunAkhir;
    @JsonProperty("updateddate")
    private Object updateddate;
    @JsonProperty("createddate")
    private String createddate;
    @JsonProperty("createdby")
    private Integer createdby;
    @JsonProperty("updatedby")
    private Object updatedby;
    @JsonProperty("is_login")
    private Integer isLogin;
    @JsonProperty("statusApproved")
    private String statusApproved;
    @JsonProperty("namaSkema")
    private String namaSkema;
    @JsonProperty("deskripsi")
    private String deskripsi;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DataBiayaProvisi() {
    }

    /**
     * 
     * @param cluster
     * @param updatedby
     * @param loanType
     * @param productid
     * @param jenisKendaraanId
     * @param tahunAwal
     * @param createddate
     * @param jenisPembiayaan
     * @param program
     * @param tipeKonsumen
     * @param namaSkema
     * @param isLogin
     * @param createdby
     * @param endBerlaku
     * @param id
     * @param startBerlaku
     * @param jenisPembiayaanId
     * @param kondisikendaraanid
     * @param jeniskendaraanid
     * @param tahunAkhir
     * @param statusApproved
     * @param updateddate
     * @param deskripsi
     * @param tujuanPenggunaan
     * @param remarks
     * @param status
     */
    public DataBiayaProvisi(Integer id, String startBerlaku, String endBerlaku, Integer loanType, Integer productid, Integer jeniskendaraanid, String jenisKendaraanId, Object kondisikendaraanid, Integer tipeKonsumen, Integer jenisPembiayaan, String jenisPembiayaanId, Integer tujuanPenggunaan, Integer cluster, Integer program, String remarks, Object status, Integer tahunAwal, Integer tahunAkhir, Object updateddate, String createddate, Integer createdby, Object updatedby, Integer isLogin, String statusApproved, String namaSkema, String deskripsi) {
        super();
        this.id = id;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.loanType = loanType;
        this.productid = productid;
        this.jeniskendaraanid = jeniskendaraanid;
        this.jenisKendaraanId = jenisKendaraanId;
        this.kondisikendaraanid = kondisikendaraanid;
        this.tipeKonsumen = tipeKonsumen;
        this.jenisPembiayaan = jenisPembiayaan;
        this.jenisPembiayaanId = jenisPembiayaanId;
        this.tujuanPenggunaan = tujuanPenggunaan;
        this.cluster = cluster;
        this.program = program;
        this.remarks = remarks;
        this.status = status;
        this.tahunAwal = tahunAwal;
        this.tahunAkhir = tahunAkhir;
        this.updateddate = updateddate;
        this.createddate = createddate;
        this.createdby = createdby;
        this.updatedby = updatedby;
        this.isLogin = isLogin;
        this.statusApproved = statusApproved;
        this.namaSkema = namaSkema;
        this.deskripsi = deskripsi;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
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

    @JsonProperty("loanType")
    public Integer getLoanType() {
        return loanType;
    }

    @JsonProperty("loanType")
    public void setLoanType(Integer loanType) {
        this.loanType = loanType;
    }

    @JsonProperty("productid")
    public Integer getProductid() {
        return productid;
    }

    @JsonProperty("productid")
    public void setProductid(Integer productid) {
        this.productid = productid;
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

    @JsonProperty("kondisikendaraanid")
    public Object getKondisikendaraanid() {
        return kondisikendaraanid;
    }

    @JsonProperty("kondisikendaraanid")
    public void setKondisikendaraanid(Object kondisikendaraanid) {
        this.kondisikendaraanid = kondisikendaraanid;
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

    @JsonProperty("jenis_pembiayaan_id")
    public String getJenisPembiayaanId() {
        return jenisPembiayaanId;
    }

    @JsonProperty("jenis_pembiayaan_id")
    public void setJenisPembiayaanId(String jenisPembiayaanId) {
        this.jenisPembiayaanId = jenisPembiayaanId;
    }

    @JsonProperty("tujuan_penggunaan")
    public Integer getTujuanPenggunaan() {
        return tujuanPenggunaan;
    }

    @JsonProperty("tujuan_penggunaan")
    public void setTujuanPenggunaan(Integer tujuanPenggunaan) {
        this.tujuanPenggunaan = tujuanPenggunaan;
    }

    @JsonProperty("cluster")
    public Integer getCluster() {
        return cluster;
    }

    @JsonProperty("cluster")
    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    @JsonProperty("program")
    public Integer getProgram() {
        return program;
    }

    @JsonProperty("program")
    public void setProgram(Integer program) {
        this.program = program;
    }

    @JsonProperty("remarks")
    public String getRemarks() {
        return remarks;
    }

    @JsonProperty("remarks")
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @JsonProperty("status")
    public Object getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Object status) {
        this.status = status;
    }

    @JsonProperty("tahun_awal")
    public Integer getTahunAwal() {
        return tahunAwal;
    }

    @JsonProperty("tahun_awal")
    public void setTahunAwal(Integer tahunAwal) {
        this.tahunAwal = tahunAwal;
    }

    @JsonProperty("tahun_akhir")
    public Integer getTahunAkhir() {
        return tahunAkhir;
    }

    @JsonProperty("tahun_akhir")
    public void setTahunAkhir(Integer tahunAkhir) {
        this.tahunAkhir = tahunAkhir;
    }

    @JsonProperty("updateddate")
    public Object getUpdateddate() {
        return updateddate;
    }

    @JsonProperty("updateddate")
    public void setUpdateddate(Object updateddate) {
        this.updateddate = updateddate;
    }

    @JsonProperty("createddate")
    public String getCreateddate() {
        return createddate;
    }

    @JsonProperty("createddate")
    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    @JsonProperty("createdby")
    public Integer getCreatedby() {
        return createdby;
    }

    @JsonProperty("createdby")
    public void setCreatedby(Integer createdby) {
        this.createdby = createdby;
    }

    @JsonProperty("updatedby")
    public Object getUpdatedby() {
        return updatedby;
    }

    @JsonProperty("updatedby")
    public void setUpdatedby(Object updatedby) {
        this.updatedby = updatedby;
    }

    @JsonProperty("is_login")
    public Integer getIsLogin() {
        return isLogin;
    }

    @JsonProperty("is_login")
    public void setIsLogin(Integer isLogin) {
        this.isLogin = isLogin;
    }

    @JsonProperty("statusApproved")
    public String getStatusApproved() {
        return statusApproved;
    }

    @JsonProperty("statusApproved")
    public void setStatusApproved(String statusApproved) {
        this.statusApproved = statusApproved;
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

}
