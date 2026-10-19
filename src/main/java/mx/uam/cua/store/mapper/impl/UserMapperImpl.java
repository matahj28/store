package mx.uam.cua.store.mapper.impl;

import mx.uam.cua.store.dto.UserDTO;
import mx.uam.cua.store.entity.User;
import mx.uam.cua.store.mapper.UserMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImpl implements UserMapper {
    @Override
    public User toUser(UserDTO userDTO) {
        User user = new User();
        BeanUtils.copyProperties(userDTO,user);

        //Password temporal. Se genera aleatoriamente.
        //y se le envía al usuario por correo
        user.setPassword("P455W0RD");

        return user;
    }

    @Override
    public UserDTO toUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user,userDTO);
        return userDTO;
    }
}
