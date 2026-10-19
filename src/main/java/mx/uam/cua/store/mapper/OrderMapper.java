package mx.uam.cua.store.mapper;

import mx.uam.cua.store.dto.OrderDTO;
import mx.uam.cua.store.entity.Order;

public interface OrderMapper {

    OrderDTO toOrderDTO(Order order);

    Order toOrder(OrderDTO orderDTO);

}
