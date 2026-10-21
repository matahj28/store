package mx.uam.cua.store.repository;

import mx.uam.cua.store.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoiceRespository extends JpaRepository<Invoice, Long> {

}
