package com.xworkz.map.hashtable.runner;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Prob {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10};

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.stream(arr).boxed().collect(Collectors.toSet()));
        set.forEach(s -> System.out.println(s));

    }
}
