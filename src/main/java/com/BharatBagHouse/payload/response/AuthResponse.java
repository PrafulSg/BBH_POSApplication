package com.BharatBagHouse.payload.response;


import com.BharatBagHouse.payload.dto.UserDto;
import lombok.Data;

@Data
public class AuthResponse {

    private String jwt;
    private String message;
    private UserDto user;

}
