package com.xworkz.collectionIntro.sorting.comparable.runner;

import com.xworkz.collectionIntro.sorting.comparable.dto.RestaurantDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RestaurantRunner {
    public static void main(String[] args) {

        List<RestaurantDTO> list = new ArrayList<>();

        list.add(new RestaurantDTO("Biryani", 100.0, false, 10));
        list.add(new RestaurantDTO("Idli", 50.0, true, 5));
        list.add(new RestaurantDTO("Dosa", 70.0, true, 7));
        list.add(new RestaurantDTO("Pizza", 120.0, false, 12));
        list.add(new RestaurantDTO("Burger", 150.0, false, 15));
        list.add(new RestaurantDTO("Biryani", 100.0, false, 10));
        list.add(new RestaurantDTO("Idli", 50.0, true, 5));
        list.add(new RestaurantDTO("Dosa", 70.0, true, 7));
        list.add(new RestaurantDTO("Pizza", 120.0, false, 12));
        list.add(new RestaurantDTO("Burger", 150.0, false, 15));
        list.add(new RestaurantDTO("Biryani", 100.0, false, 10));

        System.out.println("Before Sorting");
        list.forEach(rest -> System.out.println(rest));
        System.out.println();

        Collections.sort(list);

        System.out.println("After Sorting");
        list.forEach(rest -> System.out.println(rest));
        System.out.println();

    }
}
