package com.CMS.CentralParam.KKBSK.model.LOGIN;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="user_account_cms", uniqueConstraints = @UniqueConstraint(columnNames = "nip"))
public class User {

    @Id
    private Long id;

    private String firstName;
    private String lastName;
    private String nip;
    private String password;
    private Integer counter;
    private String status;
    private String login;
    private String expired;
    private String log;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "users_roles_cms", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;

    public User() {
    }






    public User(String firstName, String lastName, String nip, String password,Long id,Integer counter,String status,String login,String expired,String log) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.nip = nip;
        this.password = password;
        this.id = id;
        this.counter = counter;
        this.status = status;
        this.login = login;
        this.expired = expired;
        this.log = log;
    }

    public User(String firstName, String lastName,  String nip, String password,Long id,Integer counter,String status,String login,String expired,String log, Collection<Role> roles) {
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.nip = nip;
        this.password = password;
        this.id = id;
        this.counter = counter;
        this.status = status;
        this.login = login;
        this.expired = expired;
        this.log=log;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getnip() {
        return nip;
    }

    public void setnip(String nip) {
        this.nip = nip;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }


    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getExpired() {
        return this.expired;
    }

    public void setExpired(String expired) {
        this.expired = expired;
    }


    public String getLog() {
        return this.log;
    }

    public void setLog(String log) {
        this.log = log;
    }



    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\''
                + ", nip='" + nip + '\'' + ", password='" + "*********" + '\'' + ", roles=" + roles + '}';
    }
}