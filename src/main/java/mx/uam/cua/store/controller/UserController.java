package mx.uam.cua.store.controller;

import mx.uam.cua.store.dto.UserDTO;
import mx.uam.cua.store.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public UserDTO createUser(@RequestBody UserDTO userDTO){
        return userService.save(userDTO);
    }

    @RequestMapping("/users")
    public List<UserDTO> getUsers(){
        return userService.findAll();
    }
}
