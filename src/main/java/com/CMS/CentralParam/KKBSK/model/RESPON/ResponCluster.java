
package com.CMS.CentralParam.KKBSK.model.RESPON;
import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cluster",
    "code"
})
@Generated("jsonschema2pojo")
public class ResponCluster {

    @JsonProperty("cluster")
    private List<Cluster> cluster = null;
    @JsonProperty("code")
    private String code;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponCluster() {
    }

    /**
     * 
     * @param cluster
     * @param code
     */
    public ResponCluster(List<Cluster> cluster, String code) {
        super();
        this.cluster = cluster;
        this.code = code;
    }

    @JsonProperty("cluster")
    public List<Cluster> getCluster() {
        return cluster;
    }

    @JsonProperty("cluster")
    public void setCluster(List<Cluster> cluster) {
        this.cluster = cluster;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

}
