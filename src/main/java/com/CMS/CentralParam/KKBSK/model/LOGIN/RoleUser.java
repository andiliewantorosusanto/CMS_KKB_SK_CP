package com.CMS.CentralParam.KKBSK.model.LOGIN;

import javax.persistence.*;

@Entity
@Table(name="users_roles_cms")
public class RoleUser {

    @Id
    private Long user_id;

    private Long role_id;


    public RoleUser() {
    }


    public RoleUser(Long user_id, Long role_id) {
        this.user_id = user_id;
        this.role_id = role_id;
    }

    public Long getUser_id() {
        return this.user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getRole_id() {
        return this.role_id;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }
    


}


    