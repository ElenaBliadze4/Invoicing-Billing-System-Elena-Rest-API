package com.savarjisho_proeqti.Invoicing.Billing.System.dto;

import com.savarjisho_proeqti.Invoicing.Billing.System.entity.Invoice;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ClientResponse {
    private  Long id;
    private  String name;
    private  String fullClientName;
    private  String email;
    private  String taxNumber;
}
