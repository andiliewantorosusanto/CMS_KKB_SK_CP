package com.CMS.CentralParam.KKBSK.model.LDAP;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Credentials {


    @JsonProperty("UserId")
    @Column(name = "UserId")
    private String UserId;

    @JsonProperty("Password")
    @Column(name = "Password")
    private String Password;
        
        public String getUserId() {
        return UserId;
        }
        
        public void setUserId(String UserId) {
        this.UserId = UserId;
        }
        
        public String getPassword() {
        return Password;
        }
        
        public void setPassword(String Password) {
        this.Password = Password;
        }

            
        public Credentials(String UserId, String Password) {
            this.UserId = UserId;
            this.Password = Password;
        }
    
        
        }