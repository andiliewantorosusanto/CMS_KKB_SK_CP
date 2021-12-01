
package com.CMS.CentralParam.KKBSK.model.LDAP;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Login"
})
public class ResponLoginBE {

    @JsonProperty("Login")
    private Login login;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ResponLoginBE() {
    }

    /**
     * 
     * @param login
     */
    public ResponLoginBE(Login login) {
        super();
        this.login = login;
    }

    @JsonProperty("Login")
    public Login getLogin() {
        return login;
    }

    @JsonProperty("Login")
    public void setLogin(Login login) {
        this.login = login;
    }

}
