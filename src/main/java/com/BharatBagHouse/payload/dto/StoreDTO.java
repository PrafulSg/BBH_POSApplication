package com.BharatBagHouse.payload.dto;

import com.BharatBagHouse.domain.StoreStatus;
import com.BharatBagHouse.modal.StoreContact;
import com.BharatBagHouse.modal.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;

public class StoreDTO {

    private Long id;

    private String brand;

    private UserDto storeAdmin;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    private String description;

    private String storeType;

    private StoreStatus status;


    private StoreContact contact = new StoreContact();
}
