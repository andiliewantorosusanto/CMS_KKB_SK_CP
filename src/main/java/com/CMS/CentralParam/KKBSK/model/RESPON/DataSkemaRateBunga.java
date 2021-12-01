
package com.CMS.CentralParam.KKBSK.model.RESPON;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "namaSkema"
})
public class DataSkemaRateBunga {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("namaSkema")
    private String namaSkema;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DataSkemaRateBunga() {
    }

    /**
     * 
     * @param namaSkema
     * @param id
     */
    public DataSkemaRateBunga(Integer id, String namaSkema) {
        super();
        this.id = id;
        this.namaSkema = namaSkema;
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

}
