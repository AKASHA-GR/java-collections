package com.xworkz.collectionIntro.sorting.comparator.runner;

import com.xworkz.collectionIntro.sorting.comparator.dto.CarDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarRunner {
    public static void main(String[] args) {

        List<CarDTO> list = new ArrayList<>();

        list.add(new CarDTO("BMW", "7 series", 100000.0));
        list.add(new CarDTO("Benz", "C Class", 80000.0));
        list.add(new CarDTO("Audi", "A5", 85000.0));
        list.add(new CarDTO("Honda", "Accord", 60000.0));
        list.add(new CarDTO("Toyota", "Corolla", 55000.0));
        list.add(new CarDTO("Ford", "Mustang", 75000.0));
        list.add(new CarDTO("Chevrolet", "Camaro", 68000.0));
        list.add(new CarDTO("Nissan", "Altima", 58000.0));
        list.add(new CarDTO("Subaru", "Forester", 50000.0));
        list.add(new CarDTO("Volkswagen", "Golf", 45000.0));
        list.add(new CarDTO("Hyundai", "Elantra", 40000.0));

        Collections.sort(list, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()));

        System.out.println("After Sorting by Price");
        list.forEach(car -> System.out.println(car));
        System.out.println();


        Collections.sort(list, (o1, o2) -> o1.getCompany().compareTo(o2.getCompany()));

        System.out.println("After Sorting by Company");
        list.forEach(car -> System.out.println(car));
        System.out.println();





    }
}
