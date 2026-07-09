package com.xworkz.collectionIntro.sorting.comparable.runner;

import com.xworkz.collectionIntro.sorting.comparable.dto.ProductDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class productRunner {
    public static void main(String[] args) {

        List<ProductDto> list = new ArrayList<>();


        list.add(new ProductDto("pen", 1000, "Office", 10));
        list.add(new ProductDto("book", 2000, "Office", 20));
        list.add(new ProductDto("bag", 3000, "Office", 30));
        list.add(new ProductDto("notebook", 4000, "Office", 40));
        list.add(new ProductDto("pens", 5000, "Office", 50));
        list.add(new ProductDto("bottle", 6000, "Office", 60));
        list.add(new ProductDto("glass", 7000, "Office", 70));
        list.add(new ProductDto("shoes", 8000, "Office", 80));
        list.add(new ProductDto("dress", 9000, "Office", 90));
        list.add(new ProductDto("shirt", 10000, "Office", 100));

        System.out.println("Before Sorting");
        list.forEach(product -> System.out.println(product));
        System.out.println();

        //descending order
        Collections.sort(list);

        System.out.println("After Sorting");
        list.forEach(product -> System.out.println(product));
        System.out.println();
    }
}
