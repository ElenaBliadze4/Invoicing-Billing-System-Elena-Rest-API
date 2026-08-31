package com.savarjisho_proeqti.Invoicing.Billing.System.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "client")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private  Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "lastname")
    private  String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "tax_number", unique = true)
    private String taxNumber;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Invoice> invoices = new ArrayList<>();


    public Client(String name, String lastName, String email, String taxNumber) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.taxNumber = taxNumber;
    }
}
