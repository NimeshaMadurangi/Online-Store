package com.example.Piggy.Controller;

import com.example.Piggy.Controller.DTO.Request.UserRequestDTO;
import com.example.Piggy.Controller.DTO.Response.UserResponseDTO;
import com.example.Piggy.Model.User;
import com.example.Piggy.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @PostMapping("/users")
    public User addUser(@RequestBody UserRequestDTO userRequestDTO) {
        userService.addUser(userRequestDTO);
        return null;
    }

}
