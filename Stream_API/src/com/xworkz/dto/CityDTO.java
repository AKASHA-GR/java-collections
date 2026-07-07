package com.xworkz.dto;

import lombok.*;

@Setter
@Getter
@ToString


public class CityDTO {
    private String name;
    private int pincode;

    public CityDTO(String name, int pincode) {
        this.name = name;
        this.pincode = pincode;
    }

}
