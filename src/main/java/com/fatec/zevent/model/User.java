package com.fatec.zevent.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fatec.zevent.model.enumeration.GenderEnum;
import com.fatec.zevent.model.enumeration.RoleEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Document(collection = "users")
public class User {

    @JsonSerialize(using = ToStringSerializer.class)
    @Id
    private String id;

    @NotNull(message = "User's name must not be null")
    private String name;

    @NotNull(message = "User's birthday must not be null")
    private Date birthday;

    @NotNull(message = "User's role must not be null")
    private List<Role> roles;

    @NotNull(message = "User's gender must not be null")
    private GenderEnum gender;

    @NotNull(message = "User's phone must not be null")
    private String phone;

    @NotNull(message = "User's email must not be null")
    private String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @NotNull(message = "User's address must not be null")
    private Address address;

    private List<String> subscribedEventsIds = new ArrayList<String>();

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

    public List<Role> getRoles() {
        return roles;
    }

    public User setRoles(List<Role> role) {
        this.roles = role;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", username=" + email + ", password=" + password + ", roles="
                + roles.toString() + "]";
    }

}
