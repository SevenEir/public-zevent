package com.fatec.zevent.model;

import javax.persistence.Entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.security.core.GrantedAuthority;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Role implements GrantedAuthority{
	
    public Role(String name) {
        this.name = name;
    }
    public Role() {
    	
    }

    @Id
    private ObjectId id;
    private String name;
	
    
    @Override
	public String getAuthority() {
        return  this.name;
	}


}
