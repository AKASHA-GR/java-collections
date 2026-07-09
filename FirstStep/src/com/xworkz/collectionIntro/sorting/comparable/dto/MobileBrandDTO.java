package com.xworkz.collectionIntro.sorting.comparable.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class MobileBrandDTO implements Serializable,Comparable<MobileBrandDTO>{

    private String brand;
    private int price;
    private int ram;
    private String color;

    @Override
    public int compareTo(MobileBrandDTO o) {
        return this.brand.compareTo(o.brand);
    }
}
