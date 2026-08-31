package com.savarjisho_proeqti.Invoicing.Billing.System.repository;


import com.savarjisho_proeqti.Invoicing.Billing.System.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRep extends JpaRepository<Client,Long> {

}
