
package com.CMS.CentralParam.KKBSK.model.RESPON;


import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "namaSkema",
    "startPH",
    "endPH",
    "biaya",
    "startBerlaku",
    "endBerlaku",
    "created_at",
    "operatorAwal",
    "operatorAkhir",
    "is_rejected",
    "remarks",
    "statusApproved",
    "program",
    "produk",
    "createddate",
    "createdby",
    "updateddate",
    "updatedby",
    "is_login"
})
@Generated("jsonschema2pojo")
public class DataBiayaFidusia {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("namaSkema")
    private String namaSkema;
    @JsonProperty("startPH")
    private Integer startPH;
    @JsonProperty("endPH")
    private Integer endPH;
    @JsonProperty("biaya")
    private Integer biaya;
    @JsonProperty("startBerlaku")
    private String startBerlaku;
    @JsonProperty("endBerlaku")
    private String endBerlaku;
    @JsonProperty("created_at")
    private Object createdAt;
    @JsonProperty("operatorAwal")
    private Object operatorAwal;
    @JsonProperty("operatorAkhir")
    private Object operatorAkhir;
    @JsonProperty("is_rejected")
    private Object isRejected;
    @JsonProperty("remarks")
    private Object remarks;
    @JsonProperty("statusApproved")
    private Object statusApproved;
    @JsonProperty("program")
    private Integer program;
    @JsonProperty("produk")
    private Integer produk;
    @JsonProperty("createddate")
    private Object createddate;
    @JsonProperty("createdby")
    private Object createdby;
    @JsonProperty("updateddate")
    private Object updateddate;
    @JsonProperty("updatedby")
    private Object updatedby;
    @JsonProperty("is_login")
    private Integer isLogin;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DataBiayaFidusia() {
    }

    /**
     * 
     * @param updatedby
     * @param createddate
     * @param program
     * @param operatorAkhir
     * @param namaSkema
     * @param startPH
     * @param endPH
     * @param createdAt
     * @param isLogin
     * @param biaya
     * @param produk
     * @param createdby
     * @param statusApproved
     * @param endBerlaku
     * @param operatorAwal
     * @param updateddate
     * @param isRejected
     * @param id
     * @param startBerlaku
     * @param remarks
     */
    public DataBiayaFidusia(Integer id, String namaSkema, Integer startPH, Integer endPH, Integer biaya, String startBerlaku, String endBerlaku, Object createdAt, Object operatorAwal, Object operatorAkhir, Object isRejected, Object remarks, Object statusApproved, Integer program, Integer produk, Object createddate, Object createdby, Object updateddate, Object updatedby, Integer isLogin) {
        super();
        this.id = id;
        this.namaSkema = namaSkema;
        this.startPH = startPH;
        this.endPH = endPH;
        this.biaya = biaya;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.createdAt = createdAt;
        this.operatorAwal = operatorAwal;
        this.operatorAkhir = operatorAkhir;
        this.isRejected = isRejected;
        this.remarks = remarks;
        this.statusApproved = statusApproved;
        this.program = program;
        this.produk = produk;
        this.createddate = createddate;
        this.createdby = createdby;
        this.updateddate = updateddate;
        this.updatedby = updatedby;
        this.isLogin = isLogin;
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

    @JsonProperty("startPH")
    public Integer getStartPH() {
        return startPH;
    }

    @JsonProperty("startPH")
    public void setStartPH(Integer startPH) {
        this.startPH = startPH;
    }

    @JsonProperty("endPH")
    public Integer getEndPH() {
        return endPH;
    }

    @JsonProperty("endPH")
    public void setEndPH(Integer endPH) {
        this.endPH = endPH;
    }

    @JsonProperty("biaya")
    public Integer getBiaya() {
        return biaya;
    }

    @JsonProperty("biaya")
    public void setBiaya(Integer biaya) {
        this.biaya = biaya;
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

    @JsonProperty("created_at")
    public Object getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(Object createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("operatorAwal")
    public Object getOperatorAwal() {
        return operatorAwal;
    }

    @JsonProperty("operatorAwal")
    public void setOperatorAwal(Object operatorAwal) {
        this.operatorAwal = operatorAwal;
    }

    @JsonProperty("operatorAkhir")
    public Object getOperatorAkhir() {
        return operatorAkhir;
    }

    @JsonProperty("operatorAkhir")
    public void setOperatorAkhir(Object operatorAkhir) {
        this.operatorAkhir = operatorAkhir;
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

    @JsonProperty("statusApproved")
    public Object getStatusApproved() {
        return statusApproved;
    }

    @JsonProperty("statusApproved")
    public void setStatusApproved(Object statusApproved) {
        this.statusApproved = statusApproved;
    }

    @JsonProperty("program")
    public Integer getProgram() {
        return program;
    }

    @JsonProperty("program")
    public void setProgram(Integer program) {
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

    @JsonProperty("createddate")
    public Object getCreateddate() {
        return createddate;
    }

    @JsonProperty("createddate")
    public void setCreateddate(Object createddate) {
        this.createddate = createddate;
    }

    @JsonProperty("createdby")
    public Object getCreatedby() {
        return createdby;
    }

    @JsonProperty("createdby")
    public void setCreatedby(Object createdby) {
        this.createdby = createdby;
    }

    @JsonProperty("updateddate")
    public Object getUpdateddate() {
        return updateddate;
    }

    @JsonProperty("updateddate")
    public void setUpdateddate(Object updateddate) {
        this.updateddate = updateddate;
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

}
