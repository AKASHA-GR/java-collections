package com.xworkz.collectionIntro.sorting.comparator.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Comparator;

@Getter
@ToString
@Setter
@AllArgsConstructor
public class CarDTO implements Serializable, Comparator<CarDTO> {

    private String company;
    private String model;
    private double price;

    @Override
    public int compare(CarDTO o1, CarDTO o2) {
        return 0;
    }
}
