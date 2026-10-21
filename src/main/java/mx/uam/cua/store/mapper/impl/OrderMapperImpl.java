package mx.uam.cua.store.mapper.impl;

import mx.uam.cua.store.dto.OrderDTO;
import mx.uam.cua.store.dto.UserDTO;
import mx.uam.cua.store.entity.Order;
import mx.uam.cua.store.entity.User;
import mx.uam.cua.store.mapper.OrderMapper;
import mx.uam.cua.store.mapper.UserMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class OrderMapperImpl implements OrderMapper {
    private final UserMapper userMapper;

    public OrderMapperImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public OrderDTO toOrderDTO(Order order) {
        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(order, orderDTO);

        UserDTO userDTO = userMapper.toUserDTO(order.getUser());
        orderDTO.setUserDTO(userDTO);

        return orderDTO;
    }

    @Override
    public Order toOrder(OrderDTO orderDTO) {
        Order order = new Order();
        BeanUtils.copyProperties(orderDTO, order);

        User user = userMapper.toUser(orderDTO.getUserDTO());
        order.setUser(user);

        return order;
    }

}
