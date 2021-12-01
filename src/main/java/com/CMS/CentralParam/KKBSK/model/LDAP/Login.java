
package com.CMS.CentralParam.KKBSK.model.LDAP;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "firstName",
    "lastName",
    "role",
    "succeed",
    "username",
    "token"
})
public class Login {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("role")
    private String role;
    @JsonProperty("succeed")
    private String succeed;
    @JsonProperty("username")
    private String username;
    @JsonProperty("token")
    private String token;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Login() {
    }

    /**
     * 
     * @param firstName
     * @param lastName
     * @param role
     * @param succeed
     * @param id
     * @param username
     * @param token
     */
    public Login(Integer id, String firstName, String lastName, String role, String succeed, String username, String token) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
        this.succeed = succeed;
        this.username = username;
        this.token = token;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    @JsonProperty("role")
    public void setRole(String role) {
        this.role = role;
    }

    @JsonProperty("succeed")
    public String getSucceed() {
        return succeed;
    }

    @JsonProperty("succeed")
    public void setSucceed(String succeed) {
        this.succeed = succeed;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("token")
    public String getToken() {
        return token;
    }

    @JsonProperty("token")
    public void setToken(String token) {
        this.token = token;
    }

}
