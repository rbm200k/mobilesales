package com.mobile.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Setter
@Getter
@ToString
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String customerAdd1;
    private String customerAdd2;
    private String city;
    private String state;
    private String country;
    private String zip;

    public Address() {
    }

    public Address(int id, String customerAdd1, String customerAdd2, String city, String state, String country, String zip) {
        this.id = id;
        this.customerAdd1 = customerAdd1;
        this.customerAdd2 = customerAdd2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zip = zip;
    }
}
