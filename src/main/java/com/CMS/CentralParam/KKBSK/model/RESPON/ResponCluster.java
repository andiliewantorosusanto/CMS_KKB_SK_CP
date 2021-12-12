
package com.CMS.CentralParam.KKBSK.model.RESPON;

import java.util.List;
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
    private List<DataCluster> dataCluster = null;
    @JsonProperty("cluster")
    private DataCluster cluster = null;
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
    public ResponCluster(List<DataCluster> dataCluster,DataCluster cluster,String code) {
        super();
        this.dataCluster = dataCluster;
        this.cluster = cluster;
        this.code = code;
    }

    @JsonProperty("dataCluster")
    public List<DataCluster> getDataCluster() {
        return dataCluster;
    }

    @JsonProperty("dataCluster")
    public void setDataCluster(List<DataCluster> dataCluster) {
        this.dataCluster = dataCluster;
    }

    
    @JsonProperty("cluster")
    public DataCluster getCluster() {
        return cluster;
    }

    @JsonProperty("cluster")
    public void setCluster(DataCluster cluster) {
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
