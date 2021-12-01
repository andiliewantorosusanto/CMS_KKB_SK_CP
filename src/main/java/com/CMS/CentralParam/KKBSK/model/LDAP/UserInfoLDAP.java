package com.CMS.CentralParam.KKBSK.model.LDAP;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "UserId",
        "FullName",

})
public class UserInfoLDAP {

    @JsonProperty("UserId")
    private String UserId;
    @JsonProperty("FullName")
    private String FullName;
  
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public UserInfoLDAP() {
    }

    /**
     *
     * @param UserId
     * @param FullName
     */
  

    @JsonProperty("UserId")
    public String getUserId() {
        return UserId;
    }

    @JsonProperty("UserId")
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    @JsonProperty("FullName")
    public String getFullName() {
        return FullName;
    }

    @JsonProperty("FullName")
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }   

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
