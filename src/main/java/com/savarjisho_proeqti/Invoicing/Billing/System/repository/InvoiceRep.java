package com.savarjisho_proeqti.Invoicing.Billing.System.repository;

import com.savarjisho_proeqti.Invoicing.Billing.System.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRep extends JpaRepository<Invoice,Long> {

}
