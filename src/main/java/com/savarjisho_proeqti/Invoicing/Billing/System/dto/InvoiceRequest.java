package com.savarjisho_proeqti.Invoicing.Billing.System.dto;

import com.savarjisho_proeqti.Invoicing.Billing.System.entity.Client;
import com.savarjisho_proeqti.Invoicing.Billing.System.entity.status.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class InvoiceRequest {
    private BigDecimal amount;
    private Long clientId;

}
