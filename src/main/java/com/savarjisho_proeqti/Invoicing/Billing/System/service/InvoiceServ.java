package com.savarjisho_proeqti.Invoicing.Billing.System.service;

import com.savarjisho_proeqti.Invoicing.Billing.System.dto.InvoiceRequest;
import com.savarjisho_proeqti.Invoicing.Billing.System.dto.InvoiceResponse;
import com.savarjisho_proeqti.Invoicing.Billing.System.entity.Invoice;
import com.savarjisho_proeqti.Invoicing.Billing.System.repository.ClientRep;
import com.savarjisho_proeqti.Invoicing.Billing.System.repository.InvoiceRep;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InvoiceServ {

    private final InvoiceRep invoiceRep;
    private final ClientRep clientRep;


    private Invoice mapToEntity(InvoiceRequest request){
        Invoice entity = new Invoice();

        return  entity;
    }

    private InvoiceResponse mapToEntity(Invoice entity){
        InvoiceResponse invoiceResponse = new InvoiceResponse();

        return  invoiceResponse;
    }
}
