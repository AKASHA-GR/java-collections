package com.xworkz.collectionIntro.sorting.comparator.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Comparator;


@ToString
@Getter
@Setter
@AllArgsConstructor
public class AmazonProductDTO implements Serializable, Comparator<AmazonProductDTO> {

    private String productName;
    private double rating;
    private double price;
    private int reviews;


    @Override
    public int compare(AmazonProductDTO o1, AmazonProductDTO o2) {
        return 0;
    }
}
