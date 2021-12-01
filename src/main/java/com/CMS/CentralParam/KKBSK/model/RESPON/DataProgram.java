
package com.CMS.CentralParam.KKBSK.model.RESPON;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "program",
    "produk",
    "nama_produk",
    "deskripsi",
    "start_date",
    "end_date",
    "is_approved",
    "is_rejected",
    "remarks",
    "createdby",
    "createddate",
    "updatedby",
    "updateddate",
    "id_biayaadmin",
    "nama_skema_biayaadmin",
    "id_rateasuransi",
    "nama_skema_rateasuransi",
    "id_ratebunga",
    "nama_skema_ratebunga",
    "id_ratecp",
    "nama_skema_ratecp",
    "id_minimaldp",
    "nama_skema_minimaldp",
    "id_komponenph",
    "nama_skema_komponenph",
    "id_rateperluasan",
    "nama_skema_rateperluasan",
    "id_biayaprovisi",
    "nama_skema_biayaprovisi",
    "id_biayafidusia",
    "nama_skema_biayafidusia",
    "id_usiakendaraanlunas",
    "nama_skema_usiakendaraanlunas",
    "branchId"
})
@Generated("jsonschema2pojo")
public class DataProgram {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("program")
    private String program;
    @JsonProperty("produk")
    private Integer produk;
    @JsonProperty("nama_produk")
    private Object namaProduk;
    @JsonProperty("deskripsi")
    private Object deskripsi;
    @JsonProperty("start_date")
    private String startDate;
    @JsonProperty("end_date")
    private String endDate;
    @JsonProperty("is_approved")
    private Object isApproved;
    @JsonProperty("is_rejected")
    private Object isRejected;
    @JsonProperty("remarks")
    private Object remarks;
    @JsonProperty("createdby")
    private Object createdby;
    @JsonProperty("createddate")
    private String createddate;
    @JsonProperty("updatedby")
    private Object updatedby;
    @JsonProperty("updateddate")
    private Object updateddate;
    @JsonProperty("id_biayaadmin")
    private Integer idBiayaadmin;
    @JsonProperty("nama_skema_biayaadmin")
    private String namaSkemaBiayaadmin;
    @JsonProperty("id_rateasuransi")
    private Integer idRateasuransi;
    @JsonProperty("nama_skema_rateasuransi")
    private String namaSkemaRateasuransi;
    @JsonProperty("id_ratebunga")
    private Integer idRatebunga;
    @JsonProperty("nama_skema_ratebunga")
    private String namaSkemaRatebunga;
    @JsonProperty("id_ratecp")
    private Integer idRatecp;
    @JsonProperty("nama_skema_ratecp")
    private String namaSkemaRatecp;
    @JsonProperty("id_minimaldp")
    private Integer idMinimaldp;
    @JsonProperty("nama_skema_minimaldp")
    private String namaSkemaMinimaldp;
    @JsonProperty("id_komponenph")
    private Integer idKomponenph;
    @JsonProperty("nama_skema_komponenph")
    private String namaSkemaKomponenph;
    @JsonProperty("id_rateperluasan")
    private Integer idRateperluasan;
    @JsonProperty("nama_skema_rateperluasan")
    private String namaSkemaRateperluasan;
    @JsonProperty("id_biayaprovisi")
    private Integer idBiayaprovisi;
    @JsonProperty("nama_skema_biayaprovisi")
    private String namaSkemaBiayaprovisi;
    @JsonProperty("id_biayafidusia")
    private Integer idBiayafidusia;
    @JsonProperty("nama_skema_biayafidusia")
    private String namaSkemaBiayafidusia;
    @JsonProperty("id_usiakendaraanlunas")
    private Integer idUsiakendaraanlunas;
    @JsonProperty("nama_skema_usiakendaraanlunas")
    private String namaSkemaUsiakendaraanlunas;
    @JsonProperty("branchId")
    private Object branchId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DataProgram() {
    }

    /**
     * 
     * @param namaProduk
     * @param updatedby
     * @param namaSkemaUsiakendaraanlunas
     * @param endDate
     * @param createddate
     * @param namaSkemaMinimaldp
     * @param program
     * @param idRatecp
     * @param namaSkemaRateasuransi
     * @param namaSkemaBiayaprovisi
     * @param createdby
     * @param idRatebunga
     * @param id
     * @param namaSkemaKomponenph
     * @param isApproved
     * @param namaSkemaBiayaadmin
     * @param namaSkemaRatecp
     * @param namaSkemaRateperluasan
     * @param branchId
     * @param idMinimaldp
     * @param idKomponenph
     * @param namaSkemaBiayafidusia
     * @param idBiayaadmin
     * @param idBiayafidusia
     * @param idRateperluasan
     * @param produk
     * @param idUsiakendaraanlunas
     * @param idRateasuransi
     * @param updateddate
     * @param isRejected
     * @param deskripsi
     * @param idBiayaprovisi
     * @param namaSkemaRatebunga
     * @param startDate
     * @param remarks
     */
    public DataProgram(Integer id, String program, Integer produk, Object namaProduk, Object deskripsi, String startDate, String endDate, Object isApproved, Object isRejected, Object remarks, Object createdby, String createddate, Object updatedby, Object updateddate, Integer idBiayaadmin, String namaSkemaBiayaadmin, Integer idRateasuransi, String namaSkemaRateasuransi, Integer idRatebunga, String namaSkemaRatebunga, Integer idRatecp, String namaSkemaRatecp, Integer idMinimaldp, String namaSkemaMinimaldp, Integer idKomponenph, String namaSkemaKomponenph, Integer idRateperluasan, String namaSkemaRateperluasan, Integer idBiayaprovisi, String namaSkemaBiayaprovisi, Integer idBiayafidusia, String namaSkemaBiayafidusia, Integer idUsiakendaraanlunas, String namaSkemaUsiakendaraanlunas, Object branchId) {
        super();
        this.id = id;
        this.program = program;
        this.produk = produk;
        this.namaProduk = namaProduk;
        this.deskripsi = deskripsi;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isApproved = isApproved;
        this.isRejected = isRejected;
        this.remarks = remarks;
        this.createdby = createdby;
        this.createddate = createddate;
        this.updatedby = updatedby;
        this.updateddate = updateddate;
        this.idBiayaadmin = idBiayaadmin;
        this.namaSkemaBiayaadmin = namaSkemaBiayaadmin;
        this.idRateasuransi = idRateasuransi;
        this.namaSkemaRateasuransi = namaSkemaRateasuransi;
        this.idRatebunga = idRatebunga;
        this.namaSkemaRatebunga = namaSkemaRatebunga;
        this.idRatecp = idRatecp;
        this.namaSkemaRatecp = namaSkemaRatecp;
        this.idMinimaldp = idMinimaldp;
        this.namaSkemaMinimaldp = namaSkemaMinimaldp;
        this.idKomponenph = idKomponenph;
        this.namaSkemaKomponenph = namaSkemaKomponenph;
        this.idRateperluasan = idRateperluasan;
        this.namaSkemaRateperluasan = namaSkemaRateperluasan;
        this.idBiayaprovisi = idBiayaprovisi;
        this.namaSkemaBiayaprovisi = namaSkemaBiayaprovisi;
        this.idBiayafidusia = idBiayafidusia;
        this.namaSkemaBiayafidusia = namaSkemaBiayafidusia;
        this.idUsiakendaraanlunas = idUsiakendaraanlunas;
        this.namaSkemaUsiakendaraanlunas = namaSkemaUsiakendaraanlunas;
        this.branchId = branchId;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("program")
    public String getProgram() {
        return program;
    }

    @JsonProperty("program")
    public void setProgram(String program) {
        this.program = program;
    }

    @JsonProperty("produk")
    public Integer getProduk() {
        return produk;
    }

    @JsonProperty("produk")
    public void setProduk(Integer produk) {
        this.produk = produk;
    }

    @JsonProperty("nama_produk")
    public Object getNamaProduk() {
        return namaProduk;
    }

    @JsonProperty("nama_produk")
    public void setNamaProduk(Object namaProduk) {
        this.namaProduk = namaProduk;
    }

    @JsonProperty("deskripsi")
    public Object getDeskripsi() {
        return deskripsi;
    }

    @JsonProperty("deskripsi")
    public void setDeskripsi(Object deskripsi) {
        this.deskripsi = deskripsi;
    }

    @JsonProperty("start_date")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("end_date")
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty("end_date")
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @JsonProperty("is_approved")
    public Object getIsApproved() {
        return isApproved;
    }

    @JsonProperty("is_approved")
    public void setIsApproved(Object isApproved) {
        this.isApproved = isApproved;
    }

    @JsonProperty("is_rejected")
    public Object getIsRejected() {
        return isRejected;
    }

    @JsonProperty("is_rejected")
    public void setIsRejected(Object isRejected) {
        this.isRejected = isRejected;
    }

    @JsonProperty("remarks")
    public Object getRemarks() {
        return remarks;
    }

    @JsonProperty("remarks")
    public void setRemarks(Object remarks) {
        this.remarks = remarks;
    }

    @JsonProperty("createdby")
    public Object getCreatedby() {
        return createdby;
    }

    @JsonProperty("createdby")
    public void setCreatedby(Object createdby) {
        this.createdby = createdby;
    }

    @JsonProperty("createddate")
    public String getCreateddate() {
        return createddate;
    }

    @JsonProperty("createddate")
    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    @JsonProperty("updatedby")
    public Object getUpdatedby() {
        return updatedby;
    }

    @JsonProperty("updatedby")
    public void setUpdatedby(Object updatedby) {
        this.updatedby = updatedby;
    }

    @JsonProperty("updateddate")
    public Object getUpdateddate() {
        return updateddate;
    }

    @JsonProperty("updateddate")
    public void setUpdateddate(Object updateddate) {
        this.updateddate = updateddate;
    }

    @JsonProperty("id_biayaadmin")
    public Integer getIdBiayaadmin() {
        return idBiayaadmin;
    }

    @JsonProperty("id_biayaadmin")
    public void setIdBiayaadmin(Integer idBiayaadmin) {
        this.idBiayaadmin = idBiayaadmin;
    }

    @JsonProperty("nama_skema_biayaadmin")
    public String getNamaSkemaBiayaadmin() {
        return namaSkemaBiayaadmin;
    }

    @JsonProperty("nama_skema_biayaadmin")
    public void setNamaSkemaBiayaadmin(String namaSkemaBiayaadmin) {
        this.namaSkemaBiayaadmin = namaSkemaBiayaadmin;
    }

    @JsonProperty("id_rateasuransi")
    public Integer getIdRateasuransi() {
        return idRateasuransi;
    }

    @JsonProperty("id_rateasuransi")
    public void setIdRateasuransi(Integer idRateasuransi) {
        this.idRateasuransi = idRateasuransi;
    }

    @JsonProperty("nama_skema_rateasuransi")
    public String getNamaSkemaRateasuransi() {
        return namaSkemaRateasuransi;
    }

    @JsonProperty("nama_skema_rateasuransi")
    public void setNamaSkemaRateasuransi(String namaSkemaRateasuransi) {
        this.namaSkemaRateasuransi = namaSkemaRateasuransi;
    }

    @JsonProperty("id_ratebunga")
    public Integer getIdRatebunga() {
        return idRatebunga;
    }

    @JsonProperty("id_ratebunga")
    public void setIdRatebunga(Integer idRatebunga) {
        this.idRatebunga = idRatebunga;
    }

    @JsonProperty("nama_skema_ratebunga")
    public String getNamaSkemaRatebunga() {
        return namaSkemaRatebunga;
    }

    @JsonProperty("nama_skema_ratebunga")
    public void setNamaSkemaRatebunga(String namaSkemaRatebunga) {
        this.namaSkemaRatebunga = namaSkemaRatebunga;
    }

    @JsonProperty("id_ratecp")
    public Integer getIdRatecp() {
        return idRatecp;
    }

    @JsonProperty("id_ratecp")
    public void setIdRatecp(Integer idRatecp) {
        this.idRatecp = idRatecp;
    }

    @JsonProperty("nama_skema_ratecp")
    public String getNamaSkemaRatecp() {
        return namaSkemaRatecp;
    }

    @JsonProperty("nama_skema_ratecp")
    public void setNamaSkemaRatecp(String namaSkemaRatecp) {
        this.namaSkemaRatecp = namaSkemaRatecp;
    }

    @JsonProperty("id_minimaldp")
    public Integer getIdMinimaldp() {
        return idMinimaldp;
    }

    @JsonProperty("id_minimaldp")
    public void setIdMinimaldp(Integer idMinimaldp) {
        this.idMinimaldp = idMinimaldp;
    }

    @JsonProperty("nama_skema_minimaldp")
    public String getNamaSkemaMinimaldp() {
        return namaSkemaMinimaldp;
    }

    @JsonProperty("nama_skema_minimaldp")
    public void setNamaSkemaMinimaldp(String namaSkemaMinimaldp) {
        this.namaSkemaMinimaldp = namaSkemaMinimaldp;
    }

    @JsonProperty("id_komponenph")
    public Integer getIdKomponenph() {
        return idKomponenph;
    }

    @JsonProperty("id_komponenph")
    public void setIdKomponenph(Integer idKomponenph) {
        this.idKomponenph = idKomponenph;
    }

    @JsonProperty("nama_skema_komponenph")
    public String getNamaSkemaKomponenph() {
        return namaSkemaKomponenph;
    }

    @JsonProperty("nama_skema_komponenph")
    public void setNamaSkemaKomponenph(String namaSkemaKomponenph) {
        this.namaSkemaKomponenph = namaSkemaKomponenph;
    }

    @JsonProperty("id_rateperluasan")
    public Integer getIdRateperluasan() {
        return idRateperluasan;
    }

    @JsonProperty("id_rateperluasan")
    public void setIdRateperluasan(Integer idRateperluasan) {
        this.idRateperluasan = idRateperluasan;
    }

    @JsonProperty("nama_skema_rateperluasan")
    public String getNamaSkemaRateperluasan() {
        return namaSkemaRateperluasan;
    }

    @JsonProperty("nama_skema_rateperluasan")
    public void setNamaSkemaRateperluasan(String namaSkemaRateperluasan) {
        this.namaSkemaRateperluasan = namaSkemaRateperluasan;
    }

    @JsonProperty("id_biayaprovisi")
    public Integer getIdBiayaprovisi() {
        return idBiayaprovisi;
    }

    @JsonProperty("id_biayaprovisi")
    public void setIdBiayaprovisi(Integer idBiayaprovisi) {
        this.idBiayaprovisi = idBiayaprovisi;
    }

    @JsonProperty("nama_skema_biayaprovisi")
    public String getNamaSkemaBiayaprovisi() {
        return namaSkemaBiayaprovisi;
    }

    @JsonProperty("nama_skema_biayaprovisi")
    public void setNamaSkemaBiayaprovisi(String namaSkemaBiayaprovisi) {
        this.namaSkemaBiayaprovisi = namaSkemaBiayaprovisi;
    }

    @JsonProperty("id_biayafidusia")
    public Integer getIdBiayafidusia() {
        return idBiayafidusia;
    }

    @JsonProperty("id_biayafidusia")
    public void setIdBiayafidusia(Integer idBiayafidusia) {
        this.idBiayafidusia = idBiayafidusia;
    }

    @JsonProperty("nama_skema_biayafidusia")
    public String getNamaSkemaBiayafidusia() {
        return namaSkemaBiayafidusia;
    }

    @JsonProperty("nama_skema_biayafidusia")
    public void setNamaSkemaBiayafidusia(String namaSkemaBiayafidusia) {
        this.namaSkemaBiayafidusia = namaSkemaBiayafidusia;
    }

    @JsonProperty("id_usiakendaraanlunas")
    public Integer getIdUsiakendaraanlunas() {
        return idUsiakendaraanlunas;
    }

    @JsonProperty("id_usiakendaraanlunas")
    public void setIdUsiakendaraanlunas(Integer idUsiakendaraanlunas) {
        this.idUsiakendaraanlunas = idUsiakendaraanlunas;
    }

    @JsonProperty("nama_skema_usiakendaraanlunas")
    public String getNamaSkemaUsiakendaraanlunas() {
        return namaSkemaUsiakendaraanlunas;
    }

    @JsonProperty("nama_skema_usiakendaraanlunas")
    public void setNamaSkemaUsiakendaraanlunas(String namaSkemaUsiakendaraanlunas) {
        this.namaSkemaUsiakendaraanlunas = namaSkemaUsiakendaraanlunas;
    }

    @JsonProperty("branchId")
    public Object getBranchId() {
        return branchId;
    }

    @JsonProperty("branchId")
    public void setBranchId(Object branchId) {
        this.branchId = branchId;
    }

}
