package com.example.Piggy.Service;

import com.example.Piggy.Controller.DTO.Request.UserRequestDTO;
import com.example.Piggy.Model.User;
import org.springframework.context.annotation.Bean;

public interface UserService {

    User addUser(UserRequestDTO userRequestDTO);
}
