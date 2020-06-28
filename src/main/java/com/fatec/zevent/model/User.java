package com.fatec.zevent.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fatec.zevent.model.enumeration.GenderEnum;

@Document(collection = "users")
public class User {

    @JsonSerialize(using = ToStringSerializer.class)
    @Id
    private String id;

    @NotNull(message = "User's name must not be null")
    private String name;

    @NotNull(message = "User's birthday must not be null")
    private Date birthday;

    @NotNull(message = "User's gender must not be null")
    private GenderEnum gender;

    @NotNull(message = "User's phone must not be null")
    private String phone;

    @NotNull(message = "User's email must not be null")
//    @Column(unique = true)
//    @Indexed(unique=true)
    private String email;
    
    @NotNull(message = "User's password must not be null")
    private String password;
    @NotNull(message = "User's address must not be null")
    private Address address;

    private List<String> subscribedEventsIds = new ArrayList<String>();
    
//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name="user_role",
//            joinColumns=@JoinColumn(name="user_id"),
//            inverseJoinColumns=@JoinColumn(name="role_id")
//    )

    @NotNull(message = "User's role must not be null")
    private List<Role> roles;

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public Date getBirthday() {
        return birthday;
    }

    public User setBirthday(Date birthday) {
        this.birthday = birthday;
        return this;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public User setGender(GenderEnum gender) {
        this.gender = gender;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public User setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<String> getSubscribedEventsIds() {
        return subscribedEventsIds;
    }

    public void setSubscribedEventsIds(List<String> subscribedEventsIds) {
        this.subscribedEventsIds = subscribedEventsIds;
    }

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
    
}
