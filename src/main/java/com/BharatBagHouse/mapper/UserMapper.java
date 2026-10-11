package com.BharatBagHouse.mapper;

import com.BharatBagHouse.modal.User;
import com.BharatBagHouse.payload.dto.UserDto;

public class UserMapper {

    public static UserDto toDTO(User savedUser) {
        UserDto userDto = new UserDto();
        userDto.setFullName(savedUser.getFullName());
        userDto.setId(savedUser.getId());
        userDto.setEmail(savedUser.getEmail());
        userDto.setRole(savedUser.getRole());
        userDto.setCreatedAt(savedUser.getCreatedAt());
        userDto.setUpdatedAt(savedUser.getUpdatedAt());
        userDto.setLastLogin(savedUser.getLastLogin());
        userDto.setPhone(savedUser.getPhone());

        return userDto;
    }
}
