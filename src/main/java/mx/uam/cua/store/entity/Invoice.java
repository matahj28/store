package mx.uam.cua.store.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "invoices")
@Setter @Getter
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_invoice")
    private Long idInvoice;
    @Column(name = "invoice_number", nullable = false)
    private String invoiceNumber;
    @Column(name = "tax_id")
    private String taxId;
    @Column(name = "billing_address")
    private String billingAddress;
    @Column(name = "issued_at")
    LocalDateTime issuedAt;

    @OneToOne()
    @JoinColumn(name = "id_order", nullable = false)
    private Order order;

}
