package com.nerney.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Customer implements Serializable {

    @Getter
    @Setter
    private String city;

    @Getter
    @Setter
    private String email;

    @Id
    @GeneratedValue
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String phone;

    @Getter
    @Setter
    private String state;

    @Getter
    @Setter
    private String street;

    @Getter
    @Setter
    private String zip;

    public Customer() {
    }

    public Customer(String name, String email, String phone, String street, String city, String state, String zip) {
        this.city = city;
        this.email = email;
        this.name = name;
        this.phone = phone;
        this.state = state;
        this.street = street;
        this.zip = zip;
    }
}
