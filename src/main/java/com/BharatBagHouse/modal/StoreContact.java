package com.BharatBagHouse.modal;


import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
@Embeddable
public class StoreContact {
    private String adress;
    private String phone;

    @Email(message = "invalid email format")
    private String email;
}
