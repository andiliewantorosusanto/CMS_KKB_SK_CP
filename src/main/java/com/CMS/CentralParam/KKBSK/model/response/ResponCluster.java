
package com.CMS.CentralParam.KKBSK.model.response;

import java.util.List;

import com.CMS.CentralParam.KKBSK.model.data.Cluster;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dataCluster",
    "cluster",
    "code"
})
public class ResponCluster {

    @JsonProperty("dataCluster")
    private List<Cluster> dataCluster = null;
    @JsonProperty("cluster")
    private Cluster cluster = null;
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
     * @param dataCluster
     * @param code
     */
    public ResponCluster(List<Cluster> dataCluster,Cluster cluster,String code) {
        super();
        this.dataCluster = dataCluster;
        this.cluster = cluster;
        this.code = code;
    }

    @JsonProperty("dataCluster")
    public List<Cluster> getDataCluster() {
        return dataCluster;
    }

    @JsonProperty("dataCluster")
    public void setDataCluster(List<Cluster> dataCluster) {
        this.dataCluster = dataCluster;
    }

    
    @JsonProperty("cluster")
    public Cluster getCluster() {
        return cluster;
    }

    @JsonProperty("cluster")
    public void setCluster(Cluster cluster) {
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
