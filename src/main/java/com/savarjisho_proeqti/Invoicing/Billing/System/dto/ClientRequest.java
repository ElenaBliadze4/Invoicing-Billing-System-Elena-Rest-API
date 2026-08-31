package com.savarjisho_proeqti.Invoicing.Billing.System.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ClientRequest {
    private  String name;
    private  String lastName;
    private  String email;
    private  String taxNumber;
}
