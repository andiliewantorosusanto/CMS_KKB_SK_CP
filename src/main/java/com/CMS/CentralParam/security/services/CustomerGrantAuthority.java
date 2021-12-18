package com.CMS.CentralParam.security.services;

import org.springframework.security.core.GrantedAuthority;

import javax.validation.constraints.NotNull;

import com.CMS.CentralParam.KKBSK.model.LDAP.ResponLoginBE;

import java.util.Objects;

public class CustomerGrantAuthority implements GrantedAuthority {

    private String customerEmail;
    private ResponLoginBE customerAuthority;

    public CustomerGrantAuthority(@NotNull ResponLoginBE customerAuthority){
        this.customerAuthority = customerAuthority;
        this.customerEmail = customerAuthority.getLogin().getToken();
    }

    public ResponLoginBE getCustomerAuthority() {
        return customerAuthority;
    }

    @Override
    public String getAuthority() {
        return customerEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerGrantAuthority that = (CustomerGrantAuthority) o;
        return Objects.equals(customerEmail, that.customerEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerEmail);
    }

}
