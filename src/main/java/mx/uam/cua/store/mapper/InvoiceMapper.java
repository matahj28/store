package mx.uam.cua.store.mapper;

import mx.uam.cua.store.dto.InvoiceDTO;
import mx.uam.cua.store.entity.Invoice;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {OrderMapper.class})
public interface InvoiceMapper {
    Invoice toInvoice(InvoiceDTO invoice);

    InvoiceDTO toInvoiceDTO(Invoice invoice);
}
