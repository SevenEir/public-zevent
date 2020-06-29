package com.fatec.zevent.model;

import org.springframework.security.core.GrantedAuthority;

public class Role implements GrantedAuthority {

    public Role(String name) {
        this.name = name;
    }
    public Role() {
    }

    private String name;

    @Override
    public String getAuthority() {
        return  this.name;
}

}
