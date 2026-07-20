package com.xworkz.map.Runner;

import java.util.HashMap;
import java.util.Map;

public class BankAccount {
    public static void main(String[] args) {

        Map<Integer,String > map = new HashMap<>();

        map.put(5678,"Akasha");
        map.put(3794,"Naga");
        map.put(4323,"Sameer");
        map.put(2353,"Devnath");
        map.put(9437,"Varsha");

        System.out.println("The map Size:"+map.size());
        System.out.println();

        map.keySet().forEach(k -> System.out.println(k));
        System.out.println();

        map.values().forEach(v -> System.out.println(v));


    }
}
