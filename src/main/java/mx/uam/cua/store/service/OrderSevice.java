package mx.uam.cua.store.service;

import mx.uam.cua.store.dto.OrderDTO;

import java.util.List;

public interface OrderSevice {
    List<OrderDTO> findAll();
}
