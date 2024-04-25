package com.example.Backend.DTO;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public class LoginDTO {
    private String email;
    private String password;
}
