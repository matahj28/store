package mx.uam.cua.store.service.impl;

import mx.uam.cua.store.dto.OrderDTO;
import mx.uam.cua.store.entity.Order;
import mx.uam.cua.store.mapper.OrderMapper;
import mx.uam.cua.store.repository.OrderRepository;
import mx.uam.cua.store.service.OrderSevice;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderSevice {

    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;


    public OrderServiceImpl(OrderRepository orderRepository, OrderMapper orderMapper) {
        this.orderRepository = orderRepository;
        this.orderMapper = orderMapper;
    }

    @Override
    public List<OrderDTO> findAll() {

        List<Order>  orders = orderRepository.findAll();

        List<OrderDTO>  orderDTOs = new ArrayList<>();

        for (Order order : orders) {
            orderDTOs.add(orderMapper.toOrderDTO(order));
        }
        return orderDTOs;
    }
}
