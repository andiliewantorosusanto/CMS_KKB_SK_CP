package com.CMS.CentralParam.KKBSK.model.LDAP;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ErrorCode",
        "ErrorDescription",
        "TrxId",

})
public class ResponseHeaderLDAP {

    @JsonProperty("ErrorCode")
    private String ErrorCode;
    @JsonProperty("ErrorDescription")
    private String ErrorDescription;
    @JsonProperty("TrxId")
    private String TrxId;
  
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public ResponseHeaderLDAP() {
    }

    /**
     *
     * @param ErrorCode
     * @param ErrorDescription
     * @param TrxId
     */
  

    @JsonProperty("ErrorCode")
    public String getErrorCode() {
        return ErrorCode;
    }

    @JsonProperty("ErrorCode")
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    @JsonProperty("ErrorDescription")
    public String getErrorDescription() {
        return ErrorDescription;
    }

    @JsonProperty("ErrorDescription")
    public void setErrorDescription(String ErrorDescription) {
        this.ErrorDescription = ErrorDescription;
    }

    @JsonProperty("TrxId")
    public String getTrxId() {
        return TrxId;
    }

    @JsonProperty("TrxId")
    public void setTrxId(String TrxId) {
        this.TrxId = TrxId;
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
