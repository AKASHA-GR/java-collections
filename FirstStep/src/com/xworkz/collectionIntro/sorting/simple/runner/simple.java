package com.xworkz.collectionIntro.sorting.simple.runner;

import java.util.*;

public class simple {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(50, 10, 40, 20, 30);

        Collections.sort(numbers);

        System.out.println(numbers);
    }
}

