package com.xworkz.collectionIntro.sorting.comparable.runner;

import com.xworkz.collectionIntro.sorting.comparable.dto.CricketPlayerDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CricketPlayerRunner {
    public static void main(String[] args) {

        List<CricketPlayerDTO> list = new ArrayList<>();


        list.add(new CricketPlayerDTO("Sachin", 100));
        list.add(new CricketPlayerDTO("Dhoni", 90));
        list.add(new CricketPlayerDTO("Rohit", 80));
        list.add(new CricketPlayerDTO("Virat", 70));
        list.add(new CricketPlayerDTO("Ashwin", 60));
        list.add(new CricketPlayerDTO("Hardik", 50));
        list.add(new CricketPlayerDTO("Kohli", 40));
        list.add(new CricketPlayerDTO("Raina", 30));
        list.add(new CricketPlayerDTO("Pujara", 20));
        list.add(new CricketPlayerDTO("Sharma", 10));
        list.add(new CricketPlayerDTO("Ashwin", 99));
        list.add(new CricketPlayerDTO("Raina", 100));
        list.add(new CricketPlayerDTO("Pujara", 101));
        list.add(new CricketPlayerDTO("Sharma", 102));


        System.out.println("Before Sorting");
        list.forEach(cricket -> System.out.println(cricket));
        System.out.println();

        Collections.sort(list);

        System.out.println("After Sorting");
        list.forEach(cricket -> System.out.println(cricket));
        System.out.println();

    }
}
