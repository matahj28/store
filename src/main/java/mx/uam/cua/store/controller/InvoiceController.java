package mx.uam.cua.store.controller;

import mx.uam.cua.store.dto.InvoiceDTO;
import mx.uam.cua.store.service.InvoiceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class InvoiceController {
    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping("/invoices/{id}")
    public InvoiceDTO findById(@PathVariable Long id) {
        return invoiceService.findById(id);
    }
}
