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
    @JsonProperty("nama_skema")
    private String nama_skema;

    @JsonProperty("loanType")
    private Integer loanType;

    @JsonProperty("produkObject")
    private DataProduk produkObject;
    @JsonProperty("produk")
    private Integer produk;

    @JsonProperty("tujuan_penggunaanObject")
    private DataTujuanPenggunaan tujuan_penggunaanObject;
    @JsonProperty("tujuan_penggunaan")
    private Integer tujuan_penggunaan;

    @JsonProperty("tipe_konsumenObject")
    private DataTipeKonsumen tipe_konsumenObject;
    @JsonProperty("tipe_konsumen")
    private Integer tipe_konsumen;

    @JsonProperty("jenis_kendaraanObject")
    private DataJenisKendaraan jenis_kendaraanObject;
    @JsonProperty("jenis_kendaraan")
    private Integer jenis_kendaraan;

    @JsonProperty("jenis_pembiayaanObject")
    private DataJenisPembiayaan jenis_pembiayaanObject;
    @JsonProperty("jenis_pembiayaan")
    private Integer jenis_pembiayaan;

    @JsonProperty("clusterObject")
    private DataCluster clusterObject;
    @JsonProperty("cluster")
    private Integer cluster;

    @JsonProperty("minimalDP")
    private Float minimalDP;

    @JsonProperty("is_approved")
    private Integer is_approved;
    @JsonProperty("is_rejected")
    private Integer is_rejected;
    @JsonProperty("remarks")
    private String remarks;
    @JsonProperty("statusApproved")
    private Integer statusApproved;


    public DataMinimalDP() {
    }

    public DataMinimalDP(Integer id, String nama_skema, Integer loanType, DataProduk produkObject, Integer produk, DataTujuanPenggunaan tujuan_penggunaanObject, Integer tujuan_penggunaan, DataTipeKonsumen tipe_konsumenObject, Integer tipe_konsumen, DataJenisKendaraan jenis_kendaraanObject, Integer jenis_kendaraan, DataJenisPembiayaan jenis_pembiayaanObject, Integer jenis_pembiayaan, DataCluster clusterObject, Integer cluster, Float minimalDP, Integer is_approved, Integer is_rejected, String remarks, Integer statusApproved) {
        this.id = id;
        this.nama_skema = nama_skema;
        this.loanType = loanType;
        this.produkObject = produkObject;
        this.produk = produk;
        this.tujuan_penggunaanObject = tujuan_penggunaanObject;
        this.tujuan_penggunaan = tujuan_penggunaan;
        this.tipe_konsumenObject = tipe_konsumenObject;
        this.tipe_konsumen = tipe_konsumen;
        this.jenis_kendaraanObject = jenis_kendaraanObject;
        this.jenis_kendaraan = jenis_kendaraan;
        this.jenis_pembiayaanObject = jenis_pembiayaanObject;
        this.jenis_pembiayaan = jenis_pembiayaan;
        this.clusterObject = clusterObject;
        this.cluster = cluster;
        this.minimalDP = minimalDP;
        this.is_approved = is_approved;
        this.is_rejected = is_rejected;
        this.remarks = remarks;
        this.statusApproved = statusApproved;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama_skema() {
        return this.nama_skema;
    }

    public void setNama_skema(String nama_skema) {
        this.nama_skema = nama_skema;
    }

    public Integer getLoanType() {
        return this.loanType;
    }

    public void setLoanType(Integer loanType) {
        this.loanType = loanType;
    }

    public DataProduk getProdukObject() {
        return this.produkObject;
    }

    public void setProdukObject(DataProduk produkObject) {
        this.produkObject = produkObject;
    }

    public Integer getProduk() {
        return this.produk;
    }

    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    public DataTujuanPenggunaan getTujuan_penggunaanObject() {
        return this.tujuan_penggunaanObject;
    }

    public void setTujuan_penggunaanObject(DataTujuanPenggunaan tujuan_penggunaanObject) {
        this.tujuan_penggunaanObject = tujuan_penggunaanObject;
    }

    public Integer getTujuan_penggunaan() {
        return this.tujuan_penggunaan;
    }

    public void setTujuan_penggunaan(Integer tujuan_penggunaan) {
        this.tujuan_penggunaan = tujuan_penggunaan;
    }

    public DataTipeKonsumen getTipe_konsumenObject() {
        return this.tipe_konsumenObject;
    }

    public void setTipe_konsumenObject(DataTipeKonsumen tipe_konsumenObject) {
        this.tipe_konsumenObject = tipe_konsumenObject;
    }

    public Integer getTipe_konsumen() {
        return this.tipe_konsumen;
    }

    public void setTipe_konsumen(Integer tipe_konsumen) {
        this.tipe_konsumen = tipe_konsumen;
    }

    public DataJenisKendaraan getJenis_kendaraanObject() {
        return this.jenis_kendaraanObject;
    }

    public void setJenis_kendaraanObject(DataJenisKendaraan jenis_kendaraanObject) {
        this.jenis_kendaraanObject = jenis_kendaraanObject;
    }

    public Integer getJenis_kendaraan() {
        return this.jenis_kendaraan;
    }

    public void setJenis_kendaraan(Integer jenis_kendaraan) {
        this.jenis_kendaraan = jenis_kendaraan;
    }

    public DataJenisPembiayaan getJenis_pembiayaanObject() {
        return this.jenis_pembiayaanObject;
    }

    public void setJenis_pembiayaanObject(DataJenisPembiayaan jenis_pembiayaanObject) {
        this.jenis_pembiayaanObject = jenis_pembiayaanObject;
    }

    public Integer getJenis_pembiayaan() {
        return this.jenis_pembiayaan;
    }

    public void setJenis_pembiayaan(Integer jenis_pembiayaan) {
        this.jenis_pembiayaan = jenis_pembiayaan;
    }

    public DataCluster getClusterObject() {
        return this.clusterObject;
    }

    public void setClusterObject(DataCluster clusterObject) {
        this.clusterObject = clusterObject;
    }

    public Integer getCluster() {
        return this.cluster;
    }

    public void setCluster(Integer cluster) {
        this.cluster = cluster;
    }

    public Float getMinimalDP() {
        return this.minimalDP;
    }

    public void setMinimalDP(Float minimalDP) {
        this.minimalDP = minimalDP;
    }

    public Integer getIs_approved() {
        return this.is_approved;
    }

    public void setIs_approved(Integer is_approved) {
        this.is_approved = is_approved;
    }

    public Integer getIs_rejected() {
        return this.is_rejected;
    }

    public void setIs_rejected(Integer is_rejected) {
        this.is_rejected = is_rejected;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getStatusApproved() {
        return this.statusApproved;
    }

    public void setStatusApproved(Integer statusApproved) {
        this.statusApproved = statusApproved;
    }

    public DataMinimalDP id(Integer id) {
        setId(id);
        return this;
    }

    public DataMinimalDP nama_skema(String nama_skema) {
        setNama_skema(nama_skema);
        return this;
    }

    public DataMinimalDP loanType(Integer loanType) {
        setLoanType(loanType);
        return this;
    }

    public DataMinimalDP produkObject(DataProduk produkObject) {
        setProdukObject(produkObject);
        return this;
    }

    public DataMinimalDP produk(Integer produk) {
        setProduk(produk);
        return this;
    }

    public DataMinimalDP tujuan_penggunaanObject(DataTujuanPenggunaan tujuan_penggunaanObject) {
        setTujuan_penggunaanObject(tujuan_penggunaanObject);
        return this;
    }

    public DataMinimalDP tujuan_penggunaan(Integer tujuan_penggunaan) {
        setTujuan_penggunaan(tujuan_penggunaan);
        return this;
    }

    public DataMinimalDP tipe_konsumenObject(DataTipeKonsumen tipe_konsumenObject) {
        setTipe_konsumenObject(tipe_konsumenObject);
        return this;
    }

    public DataMinimalDP tipe_konsumen(Integer tipe_konsumen) {
        setTipe_konsumen(tipe_konsumen);
        return this;
    }

    public DataMinimalDP jenis_kendaraanObject(DataJenisKendaraan jenis_kendaraanObject) {
        setJenis_kendaraanObject(jenis_kendaraanObject);
        return this;
    }

    public DataMinimalDP jenis_kendaraan(Integer jenis_kendaraan) {
        setJenis_kendaraan(jenis_kendaraan);
        return this;
    }

    public DataMinimalDP jenis_pembiayaanObject(DataJenisPembiayaan jenis_pembiayaanObject) {
        setJenis_pembiayaanObject(jenis_pembiayaanObject);
        return this;
    }

    public DataMinimalDP jenis_pembiayaan(Integer jenis_pembiayaan) {
        setJenis_pembiayaan(jenis_pembiayaan);
        return this;
    }

    public DataMinimalDP clusterObject(DataCluster clusterObject) {
        setClusterObject(clusterObject);
        return this;
    }

    public DataMinimalDP cluster(Integer cluster) {
        setCluster(cluster);
        return this;
    }

    public DataMinimalDP minimalDP(Float minimalDP) {
        setMinimalDP(minimalDP);
        return this;
    }

    public DataMinimalDP is_approved(Integer is_approved) {
        setIs_approved(is_approved);
        return this;
    }

    public DataMinimalDP is_rejected(Integer is_rejected) {
        setIs_rejected(is_rejected);
        return this;
    }

    public DataMinimalDP remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public DataMinimalDP statusApproved(Integer statusApproved) {
        setStatusApproved(statusApproved);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nama_skema='" + getNama_skema() + "'" +
            ", loanType='" + getLoanType() + "'" +
            ", produkObject='" + getProdukObject() + "'" +
            ", produk='" + getProduk() + "'" +
            ", tujuan_penggunaanObject='" + getTujuan_penggunaanObject() + "'" +
            ", tujuan_penggunaan='" + getTujuan_penggunaan() + "'" +
            ", tipe_konsumenObject='" + getTipe_konsumenObject() + "'" +
            ", tipe_konsumen='" + getTipe_konsumen() + "'" +
            ", jenis_kendaraanObject='" + getJenis_kendaraanObject() + "'" +
            ", jenis_kendaraan='" + getJenis_kendaraan() + "'" +
            ", jenis_pembiayaanObject='" + getJenis_pembiayaanObject() + "'" +
            ", jenis_pembiayaan='" + getJenis_pembiayaan() + "'" +
            ", clusterObject='" + getClusterObject() + "'" +
            ", cluster='" + getCluster() + "'" +
            ", minimalDP='" + getMinimalDP() + "'" +
            ", is_approved='" + getIs_approved() + "'" +
            ", is_rejected='" + getIs_rejected() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", statusApproved='" + getStatusApproved() + "'" +
            "}";
    }
    

}
