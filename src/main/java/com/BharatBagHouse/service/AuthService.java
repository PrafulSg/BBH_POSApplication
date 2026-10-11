package com.BharatBagHouse.service;

import com.BharatBagHouse.exceptions.UserException;
import com.BharatBagHouse.payload.dto.UserDto;
import com.BharatBagHouse.payload.response.AuthResponse;

public interface AuthService {

    AuthResponse signup(UserDto userDto) throws UserException;
    AuthResponse login(UserDto userDto) throws UserException;
}
