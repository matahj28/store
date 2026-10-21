package mx.uam.cua.store.service.impl;

import mx.uam.cua.store.dto.UserDTO;
import mx.uam.cua.store.entity.User;
import mx.uam.cua.store.mapper.UserMapper;
import mx.uam.cua.store.repository.UserRespository;
import mx.uam.cua.store.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;
    private final UserRespository userRespository;

    public UserServiceImpl(UserMapper userMapper, UserRespository userRespository) {
        this.userMapper = userMapper;
        this.userRespository = userRespository;
    }

    @Override
    public UserDTO save(UserDTO userDTO) {
        User user = new User();
        user = userMapper.toUser(userDTO);
        user = userRespository.save(user);
        userDTO = userMapper.toUserDTO(user);
        return userDTO;
    }

    @Override
    public List<UserDTO> findAll() {
        List<User> users = userRespository.findAll();
        List<UserDTO> userDTOs = new ArrayList<>();

        for (User user : users) {
            userDTOs.add(userMapper.toUserDTO(user));
        }

        return userDTOs;
    }

    @Override
    public List<UserDTO> findByLastName(String lastName) {
        List<User> users= userRespository.findByLastName(lastName);

        List<UserDTO> userDTOs = new ArrayList<>();

        for (User user : users) {
            userDTOs.add(userMapper.toUserDTO(user));
        }
        return userDTOs;
    }


}
