package mx.uam.cua.store.mapper.impl;

import mx.uam.cua.store.dto.OrderDTO;
import mx.uam.cua.store.entity.Order;
import mx.uam.cua.store.mapper.OrderMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order toOrder(OrderDTO orderDTO) {
        Order order = new Order();
        BeanUtils.copyProperties(orderDTO, order);
        return order;
    }

    @Override
    public OrderDTO toOrderDTO(Order order) {
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(order, orderDTO);
        return orderDTO;
    }

}
