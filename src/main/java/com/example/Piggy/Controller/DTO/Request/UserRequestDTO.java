package com.example.Piggy.Controller.DTO.Request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserRequestDTO {

    private String username;

    private String email;

    private String password;
}
