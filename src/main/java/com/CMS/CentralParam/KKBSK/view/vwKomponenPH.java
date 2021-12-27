package com.CMS.CentralParam.KKBSK.view;

public class vwKomponenPH {

    private Integer id;

    private String namaSkema;

    private Integer tipeKonsumen;
    private String tipeKonsumenName;

    private Integer jenisPembiayaan;
    private String jenisPembiayaanName;

    private String jenis;
    private String addm;
    private String addb;

    private Integer statusApproval;
    private String remarks;
    private Integer isRejected;
    private Integer isApproved;


    public vwKomponenPH() {
    }

    public vwKomponenPH(Integer id, String namaSkema, Integer tipeKonsumen, String tipeKonsumenName, Integer jenisPembiayaan, String jenisPembiayaanName, String jenis, String addm, String addb, Integer statusApproval, String remarks, Integer isRejected, Integer isApproved) {
        this.id = id;
        this.namaSkema = namaSkema;
        this.tipeKonsumen = tipeKonsumen;
        this.tipeKonsumenName = tipeKonsumenName;
        this.jenisPembiayaan = jenisPembiayaan;
        this.jenisPembiayaanName = jenisPembiayaanName;
        this.jenis = jenis;
        this.addm = addm;
        this.addb = addb;
        this.statusApproval = statusApproval;
        this.remarks = remarks;
        this.isRejected = isRejected;
        this.isApproved = isApproved;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamaSkema() {
        return this.namaSkema;
    }

    public void setNamaSkema(String namaSkema) {
        this.namaSkema = namaSkema;
    }

    public Integer getTipeKonsumen() {
        return this.tipeKonsumen;
    }

    public void setTipeKonsumen(Integer tipeKonsumen) {
        this.tipeKonsumen = tipeKonsumen;
    }

    public String getTipeKonsumenName() {
        return this.tipeKonsumenName;
    }

    public void setTipeKonsumenName(String tipeKonsumenName) {
        this.tipeKonsumenName = tipeKonsumenName;
    }

    public Integer getJenisPembiayaan() {
        return this.jenisPembiayaan;
    }

    public void setJenisPembiayaan(Integer jenisPembiayaan) {
        this.jenisPembiayaan = jenisPembiayaan;
    }

    public String getJenisPembiayaanName() {
        return this.jenisPembiayaanName;
    }

    public void setJenisPembiayaanName(String jenisPembiayaanName) {
        this.jenisPembiayaanName = jenisPembiayaanName;
    }

    public String getJenis() {
        return this.jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getAddm() {
        return this.addm;
    }

    public void setAddm(String addm) {
        this.addm = addm;
    }

    public String getAddb() {
        return this.addb;
    }

    public void setAddb(String addb) {
        this.addb = addb;
    }

    public Integer getStatusApproval() {
        return this.statusApproval;
    }

    public void setStatusApproval(Integer statusApproval) {
        this.statusApproval = statusApproval;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getIsRejected() {
        return this.isRejected;
    }

    public void setIsRejected(Integer isRejected) {
        this.isRejected = isRejected;
    }

    public Integer getIsApproved() {
        return this.isApproved;
    }

    public void setIsApproved(Integer isApproved) {
        this.isApproved = isApproved;
    }

    public vwKomponenPH id(Integer id) {
        setId(id);
        return this;
    }

    public vwKomponenPH namaSkema(String namaSkema) {
        setNamaSkema(namaSkema);
        return this;
    }

    public vwKomponenPH tipeKonsumen(Integer tipeKonsumen) {
        setTipeKonsumen(tipeKonsumen);
        return this;
    }

    public vwKomponenPH tipeKonsumenName(String tipeKonsumenName) {
        setTipeKonsumenName(tipeKonsumenName);
        return this;
    }

    public vwKomponenPH jenisPembiayaan(Integer jenisPembiayaan) {
        setJenisPembiayaan(jenisPembiayaan);
        return this;
    }

    public vwKomponenPH jenisPembiayaanName(String jenisPembiayaanName) {
        setJenisPembiayaanName(jenisPembiayaanName);
        return this;
    }

    public vwKomponenPH jenis(String jenis) {
        setJenis(jenis);
        return this;
    }

    public vwKomponenPH addm(String addm) {
        setAddm(addm);
        return this;
    }

    public vwKomponenPH addb(String addb) {
        setAddb(addb);
        return this;
    }

    public vwKomponenPH statusApproval(Integer statusApproval) {
        setStatusApproval(statusApproval);
        return this;
    }

    public vwKomponenPH remarks(String remarks) {
        setRemarks(remarks);
        return this;
    }

    public vwKomponenPH isRejected(Integer isRejected) {
        setIsRejected(isRejected);
        return this;
    }

    public vwKomponenPH isApproved(Integer isApproved) {
        setIsApproved(isApproved);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", namaSkema='" + getNamaSkema() + "'" +
            ", tipeKonsumen='" + getTipeKonsumen() + "'" +
            ", tipeKonsumenName='" + getTipeKonsumenName() + "'" +
            ", jenisPembiayaan='" + getJenisPembiayaan() + "'" +
            ", jenisPembiayaanName='" + getJenisPembiayaanName() + "'" +
            ", jenis='" + getJenis() + "'" +
            ", addm='" + getAddm() + "'" +
            ", addb='" + getAddb() + "'" +
            ", statusApproval='" + getStatusApproval() + "'" +
            ", remarks='" + getRemarks() + "'" +
            ", isRejected='" + getIsRejected() + "'" +
            ", isApproved='" + getIsApproved() + "'" +
            "}";
    }

    
}