package com.api.crud.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {

    final String firstName;
    final String lastName;


    public UserDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
