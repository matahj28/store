package mx.uam.cua.store.mapper;

import mx.uam.cua.store.dto.UserDTO;
import mx.uam.cua.store.entity.User;
import org.springframework.stereotype.Component;

public interface UserMapper {

    UserDTO toUserDTO(User user);

    User toUser(UserDTO userDTO);

}
