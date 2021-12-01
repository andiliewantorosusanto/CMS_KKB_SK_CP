package com.CMS.CentralParam.KKBSK.model.LDAP;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Example {

    @JsonProperty("Credentials")
    @Column(name = "Credentials")
    private Credentials Credentials;
    
    public Credentials getCredentials() {
    return Credentials;
    }
    
    public void setCredentials(Credentials Credentials) {
    this.Credentials = Credentials;
    }

    public Example(Credentials Credentials) {
        this.Credentials = Credentials;
    }

}