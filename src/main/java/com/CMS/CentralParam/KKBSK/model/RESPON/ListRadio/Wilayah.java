
package com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio;


import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "namaWilayah",
    "deskripsi",
    "startBerlaku",
    "endBerlaku",
    "created_at",
    "status",
    "remarks",
    "is_rejected"
})
@Generated("jsonschema2pojo")
public class Wilayah {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("namaWilayah")
    private String namaWilayah;
    @JsonProperty("deskripsi")
    private String deskripsi;
    @JsonProperty("startBerlaku")
    private String startBerlaku;
    @JsonProperty("endBerlaku")
    private String endBerlaku;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("status")
    private Object status;
    @JsonProperty("remarks")
    private Object remarks;
    @JsonProperty("is_rejected")
    private Object isRejected;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Wilayah() {
    }

    /**
     * 
     * @param createdAt
     * @param endBerlaku
     * @param namaWilayah
     * @param isRejected
     * @param id
     * @param deskripsi
     * @param startBerlaku
     * @param remarks
     * @param status
     */
    public Wilayah(Integer id, String namaWilayah, String deskripsi, String startBerlaku, String endBerlaku, String createdAt, Object status, Object remarks, Object isRejected) {
        super();
        this.id = id;
        this.namaWilayah = namaWilayah;
        this.deskripsi = deskripsi;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.createdAt = createdAt;
        this.status = status;
        this.remarks = remarks;
        this.isRejected = isRejected;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("namaWilayah")
    public String getNamaWilayah() {
        return namaWilayah;
    }

    @JsonProperty("namaWilayah")
    public void setNamaWilayah(String namaWilayah) {
        this.namaWilayah = namaWilayah;
    }

    @JsonProperty("deskripsi")
    public String getDeskripsi() {
        return deskripsi;
    }

    @JsonProperty("deskripsi")
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
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
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
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

    @JsonProperty("is_rejected")
    public Object getIsRejected() {
        return isRejected;
    }

    @JsonProperty("is_rejected")
    public void setIsRejected(Object isRejected) {
        this.isRejected = isRejected;
    }

}
