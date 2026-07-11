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
public class AmazonProductDTO implements Serializable {

    private String productName;
    private double rating;
    private double price;
    private int reviews;

}
