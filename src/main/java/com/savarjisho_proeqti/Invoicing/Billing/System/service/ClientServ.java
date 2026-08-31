package com.savarjisho_proeqti.Invoicing.Billing.System.service;

import com.savarjisho_proeqti.Invoicing.Billing.System.dto.ClientRequest;
import com.savarjisho_proeqti.Invoicing.Billing.System.dto.ClientResponse;
import com.savarjisho_proeqti.Invoicing.Billing.System.entity.Client;
import com.savarjisho_proeqti.Invoicing.Billing.System.entity.Invoice;
import com.savarjisho_proeqti.Invoicing.Billing.System.repository.ClientRep;
import com.savarjisho_proeqti.Invoicing.Billing.System.repository.InvoiceRep;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientServ {

    private final ClientRep clientRep;
    private final InvoiceRep invoiceRep;








    private Client mapToEntity(ClientRequest request){
        Client entity = new Client();
        entity.setName(request.getName());
        entity.setLastName(request.getLastName());
        entity.setEmail(request.getEmail());
        entity.setTaxNumber(request.getTaxNumber());
        return entity;
    }

    private ClientResponse mapToResponse(Client entity){
        ClientResponse clientResponse = new ClientResponse();
        clientResponse.setId(entity.getId());

        if (entity.getName() != null && entity.getLastName() != null) {
            String fullName = entity.getName() + " " + entity.getLastName();
            clientResponse.setFullClientName(fullName);
        } else if (entity.getName() != null) {
            clientResponse.setFullClientName(entity.getName());
        } else if (entity.getLastName() != null) {
            clientResponse.setFullClientName(entity.getLastName());
        } else {
            clientResponse.setFullClientName("Saxeli an Gvari ar aris mititebuli!");
        }

        clientResponse.setEmail(entity.getEmail());
        clientResponse.setTaxNumber(entity.getTaxNumber());
        return clientResponse;
    }

}
