package com.api.crud.models;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOMBRE", length = 50, nullable = false)
    private String firstName;

    @Column(name = "APELLIDO", length = 50, nullable = false)
    private String lastName;

    @Column
    private String email;
    @Column(name = "NOMBRE_USUARIO", length = 50, nullable = false)
    private String userName;
    @Column(name = "DIRECCION")
    private String address;
    @Column(name = "TIPO", nullable = false)
    private String type;
    @Column(unique = true, nullable = false)
    private String password;

    public UserModel() {
    }

    public UserModel(Long id, String firstName, String lastName, String email, String userName, String address, String type, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
        this.address = address;
        this.type = type;
        this.password = password;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
