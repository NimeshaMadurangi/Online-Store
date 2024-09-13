package com.example.Piggy.Service.ServiceImpl;

import com.example.Piggy.Controller.DTO.Request.UserRequestDTO;
import com.example.Piggy.Controller.DTO.Response.UserResponseDTO;
import com.example.Piggy.Model.User;
import com.example.Piggy.Repository.UserRepository;
import com.example.Piggy.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public abstract class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Override
    public User addUser(UserRequestDTO userRequestDTO) {
        User user = new User();
        user.setUsername(userRequestDTO.getUsername());
        user.setEmail(userRequestDTO.getEmail());
        user.setPassword(userRequestDTO.getPassword());
        userRepository.save(user);

        return null;
    }

}
