package com.xworkz.collectionIntro.sorting.comparable.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;


@Getter
@Setter
@AllArgsConstructor
@ToString
public class RestaurantDTO implements Serializable,Comparable<RestaurantDTO>{

    private String foodName;
    private double price;
    private boolean vegetarian;
    private int discount;

    @Override
    public int compareTo(RestaurantDTO o) {
        return o.discount - this.discount;
    }
}
