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
        "ResponseHeader",
        "UserInfo"
})
public class CustomerAuthority {

    @JsonProperty("ResponseHeader")
    private ResponseHeaderLDAP responseHeader;
    @JsonProperty("UserInfo")
    private UserInfoLDAP userInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public CustomerAuthority() {
    }

    /**
     *
     * @param uesponseHeader
     * @param userInfo
     */
    public CustomerAuthority(ResponseHeaderLDAP responseHeader, UserInfoLDAP userInfo) {
        super();
        this.responseHeader = responseHeader;
        this.userInfo = userInfo;
    }

    @JsonProperty("ResponseHeader")
    public ResponseHeaderLDAP getResponseHeader() {
        return responseHeader;
    }

    @JsonProperty("ResponseHeader")
    public void setResponseHeader(ResponseHeaderLDAP responseHeader) {
        this.responseHeader = responseHeader;
    }

    @JsonProperty("UserInfo")
    public UserInfoLDAP getUserInfo() {
        return userInfo;
    }

    @JsonProperty("UserInfo")
    public void setUserInfo(UserInfoLDAP userInfo) {
        this.userInfo = userInfo;
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
