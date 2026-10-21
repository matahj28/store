package mx.uam.cua.store.service;

import mx.uam.cua.store.dto.InvoiceDTO;

public interface InvoiceService {

    InvoiceDTO findById(Long id);

}
