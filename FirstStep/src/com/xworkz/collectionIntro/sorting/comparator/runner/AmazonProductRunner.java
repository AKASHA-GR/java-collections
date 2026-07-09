package com.xworkz.collectionIntro.sorting.comparator.runner;

import com.xworkz.collectionIntro.sorting.comparator.dto.AmazonProductDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AmazonProductRunner {
    public static void main(String[] args) {

        List<AmazonProductDTO> list = new ArrayList<>();

        list.add(new AmazonProductDTO("Mobile", 2000, 4.5, 100));
        list.add(new AmazonProductDTO("Book", 1000, 4.0, 50));
        list.add(new AmazonProductDTO("TV", 3000, 4.8, 200));
        list.add(new AmazonProductDTO("Pen", 500, 4.0, 10));
        list.add(new AmazonProductDTO("Laptop", 10000, 4.7, 500));
        list.add(new AmazonProductDTO("Chair", 5000, 4.5, 200));
        list.add(new AmazonProductDTO("Clock", 1500, 4.2, 100));
        list.add(new AmazonProductDTO("Table", 10000, 4.7, 500));
        list.add(new AmazonProductDTO("Shoe", 3000, 4.8, 200));
        list.add(new AmazonProductDTO("T-Shirt", 500, 4.0, 10));
        list.add(new AmazonProductDTO("Bag", 1000, 4.7, 50));
        list.add(new AmazonProductDTO("Watch", 2000, 4.5, 100));


        Collections.sort(list, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));

        System.out.println("After Sorting by Price");
        list.forEach(product -> System.out.println(product));
        System.out.println();

        Collections.sort(list,((o1, o2) -> Double.compare(o1.getRating(),o2.getRating())));

        System.out.println("After Sorting by Rating");
        list.forEach(product -> System.out.println(product));
        System.out.println();

        Collections.sort(list,((o1, o2) -> Integer.compare(o1.getReviews(),o2.getReviews())));

        System.out.println("After Sorting by Reviews");
        list.forEach(product -> System.out.println(product));
        System.out.println();




    }
}
