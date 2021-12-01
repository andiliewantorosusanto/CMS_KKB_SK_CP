
package com.CMS.CentralParam.KKBSK.model.RESPON;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "message"
})
@Generated("jsonschema2pojo")
public class ResponRateBiayaAdmin {

    @JsonProperty("code")
    private String code;
    @JsonProperty("message")
    private String message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponRateBiayaAdmin() {
    }

    /**
     * 
     * @param code
     * @param message
     */
    public ResponRateBiayaAdmin(String code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

}
