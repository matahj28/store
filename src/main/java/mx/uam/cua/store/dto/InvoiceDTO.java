package mx.uam.cua.store.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class InvoiceDTO {
    private Long idInvoice;
    private String invoiceNumber;
    private String taxId;
    private String billingAddress;
    LocalDateTime issuedAt;

    private OrderDTO order;
}

