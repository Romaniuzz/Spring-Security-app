package org.example.springsecurityproject.rest;


import java.lang.*;
import lombok.Data;

@Data
public class AuthenticationRequestDTO {

    private String email;
    private String password;
}
