package mx.uam.cua.store.controller;

import mx.uam.cua.store.dto.OrderDTO;
import mx.uam.cua.store.service.OrderSevice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class OrderController {
    private final OrderSevice orderSevice;

    public OrderController(OrderSevice orderSevice) {
        this.orderSevice = orderSevice;
    }

    @GetMapping("/orders")
    public List<OrderDTO> findAll(){
        return orderSevice.findAll();
    }
}
