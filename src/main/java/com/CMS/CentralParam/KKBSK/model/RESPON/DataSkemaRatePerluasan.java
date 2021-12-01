
package com.CMS.CentralParam.KKBSK.model.RESPON;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "namaSkema"
})
public class DataSkemaRatePerluasan {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("namaSkema")
    private Object namaSkema;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DataSkemaRatePerluasan() {
    }

    /**
     * 
     * @param namaSkema
     * @param id
     */
    public DataSkemaRatePerluasan(Integer id, Object namaSkema) {
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
    public Object getNamaSkema() {
        return namaSkema;
    }

    @JsonProperty("namaSkema")
    public void setNamaSkema(Object namaSkema) {
        this.namaSkema = namaSkema;
    }

}
