package com.xworkz.collectionIntro.sorting.comparable.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class ProductDto implements Serializable,Comparable<ProductDto>{
    private String name;
    private double price;
    private String category;
    private int discount;

    @Override
    public int compareTo(ProductDto o) {
        ProductDto left = this;
        ProductDto right = o;

        if (left.discount > right.discount) {
            return -1;
        } else if (left.discount < right.discount) {
            return 1;
        } else {
            return 0;
        }
    }
}
