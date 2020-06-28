package com.fatec.zevent.model;

import com.fatec.zevent.model.enumeration.RoleEnum;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.security.core.GrantedAuthority;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Role implements GrantedAuthority{
	
    public Role(RoleEnum name) {
        this.name = name;
    }
    public Role() {
    	
    }

    @Id
    private ObjectId id;
    private RoleEnum name;
	
    
    @Override
	public String getAuthority() {
        return  this.name.toString();
	}


}
