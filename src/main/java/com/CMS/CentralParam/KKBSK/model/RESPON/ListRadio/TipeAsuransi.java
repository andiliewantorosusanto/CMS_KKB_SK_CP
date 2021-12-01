
package com.CMS.CentralParam.KKBSK.model.RESPON.ListRadio;



import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "namaAsuransi",
    "startBerlaku",
    "endBerlaku",
    "created_at",
    "deskripsi",
    "is_rejected",
    "remarks"
})
@Generated("jsonschema2pojo")
public class TipeAsuransi {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("namaAsuransi")
    private String namaAsuransi;
    @JsonProperty("startBerlaku")
    private String startBerlaku;
    @JsonProperty("endBerlaku")
    private String endBerlaku;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("deskripsi")
    private String deskripsi;
    @JsonProperty("is_rejected")
    private Integer isRejected;
    @JsonProperty("remarks")
    private String remarks;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TipeAsuransi() {
    }

    /**
     * 
     * @param createdAt
     * @param endBerlaku
     * @param isRejected
     * @param id
     * @param deskripsi
     * @param namaAsuransi
     * @param startBerlaku
     * @param remarks
     */
    public TipeAsuransi(Integer id, String namaAsuransi, String startBerlaku, String endBerlaku, String createdAt, String deskripsi, Integer isRejected, String remarks) {
        super();
        this.id = id;
        this.namaAsuransi = namaAsuransi;
        this.startBerlaku = startBerlaku;
        this.endBerlaku = endBerlaku;
        this.createdAt = createdAt;
        this.deskripsi = deskripsi;
        this.isRejected = isRejected;
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

    @JsonProperty("namaAsuransi")
    public String getNamaAsuransi() {
        return namaAsuransi;
    }

    @JsonProperty("namaAsuransi")
    public void setNamaAsuransi(String namaAsuransi) {
        this.namaAsuransi = namaAsuransi;
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

    @JsonProperty("deskripsi")
    public String getDeskripsi() {
        return deskripsi;
    }

    @JsonProperty("deskripsi")
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    @JsonProperty("is_rejected")
    public Integer getIsRejected() {
        return isRejected;
    }

    @JsonProperty("is_rejected")
    public void setIsRejected(Integer isRejected) {
        this.isRejected = isRejected;
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
