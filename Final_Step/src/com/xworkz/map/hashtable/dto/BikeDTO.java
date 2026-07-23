package com.xworkz.map.hashtable.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class BikeDTO {
    private String name;
    private String company;
    private int price;
    private int mileage;
}
