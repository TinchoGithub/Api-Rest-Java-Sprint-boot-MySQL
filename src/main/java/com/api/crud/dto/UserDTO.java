package com.api.crud.dto;

import java.io.Serializable;

public class UserDTO{

    private String firstName;
    private String lastName;
    private String email;
    private String address;


    public UserDTO() {
    }

    public UserDTO(String firstName, String lastName, String email, String direccion) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = direccion;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
