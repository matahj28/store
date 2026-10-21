package mx.uam.cua.store.service.impl;

import mx.uam.cua.store.dto.InvoiceDTO;
import mx.uam.cua.store.entity.Invoice;
import mx.uam.cua.store.mapper.InvoiceMapper;
import mx.uam.cua.store.repository.InvoiceRespository;
import mx.uam.cua.store.service.InvoiceService;
import org.springframework.stereotype.Service;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceMapper invoiceMapper;
    private final InvoiceRespository invoiceRespository;

    public InvoiceServiceImpl(InvoiceMapper invoiceMapper, InvoiceRespository invoiceRespository) {
        this.invoiceMapper = invoiceMapper;
        this.invoiceRespository = invoiceRespository;
    }

    @Override
    public InvoiceDTO findById(Long id) {
        Invoice invoice = invoiceRespository.findById(id).get();
        return invoiceMapper.toInvoiceDTO(invoice);
    }
}
