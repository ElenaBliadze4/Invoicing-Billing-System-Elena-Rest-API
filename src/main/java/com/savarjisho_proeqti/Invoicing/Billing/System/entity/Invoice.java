package com.savarjisho_proeqti.Invoicing.Billing.System.entity;

import com.savarjisho_proeqti.Invoicing.Billing.System.entity.status.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "invoice")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_id")
    private Long id;

    @Column(name = "invoice_number" , unique = true)
    private String invoiceNumber;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "issued_date")
    private LocalDateTime issuedDate;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "status")
    private Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", nullable = false) // ქმნის Foreign Key სვეტს invoices
    private Client client;

    public Invoice(String invoiceNumber, BigDecimal amount, LocalDateTime issuedDate, Status status) {
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
        this.issuedDate = issuedDate;
        this.status = status;
    }
}
