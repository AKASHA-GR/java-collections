package com.xworkz.collectionIntro.sorting.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@ToString

public class MenuDTO implements Serializable,Comparable<MenuDTO> {
    private String foodName;
    private double price;
    private boolean isVegetarian;
    private int discount;

    @Override
    public int compareTo(MenuDTO o) {
        MenuDTO left = this;
        MenuDTO right = o;
        return left.foodName.compareTo(right.foodName);
    }
}
