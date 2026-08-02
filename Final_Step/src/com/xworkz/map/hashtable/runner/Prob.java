package com.xworkz.map.hashtable.runner;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Prob {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10};

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.stream(arr).boxed().collect(Collectors.toSet()));
        set.forEach(s -> System.out.println(s));

        HashSet<Integer> set1 = new HashSet<>();

        set1.add(10);
        set1.add(20);
        set1.add(30);

        System.out.println();
        if(set1.contains(20)){
            System.out.println(true);
        }else if (set1.contains(100)){
            System.out.println(false);
        }

        System.out.println(set.size());

        HashSet<Integer> set2 = new HashSet<>();

        int[] arr1 = {4,7,2,9,7};

        for (int i= arr1.length - 1;i >= 0;i--){
            if(set2.contains(arr1[i])){
                System.out.println("Duplicate found");
            }
            set2.add(arr1[i]);
        }

        set2.forEach(s -> System.out.println(s));

    }
}
