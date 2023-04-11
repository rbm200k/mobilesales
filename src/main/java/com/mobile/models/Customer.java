package com.mobile.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String customerFirstName;
    private String customerLastName;
    private String mobile;
    private String email;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "ca_fid", referencedColumnName = "id")
    private List<Address> add = new ArrayList<>();



}
