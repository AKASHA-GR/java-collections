package com.xworkz.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Simple {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        map.put(100,"Akasha");
        map.put(150,"Hemanth");
        map.put(200,"Krishna");
        map.put(250,"Prateek");
        map.put(300,"Sagar");

        System.out.println(map);
        System.out.println("The map size:"+map.size());
        System.out.println();


        Map<Integer,String> map1 = new TreeMap<>();
        map1.put(100,"Akasha");
        map1.put(150,"Hemanth");
        map1.put(200,"Krishna");
        map1.put(250,"Prateek");
        map1.put(300,"Sagar");

        System.out.println(map1);
        System.out.println("The map size:"+map1.size());
        System.out.println(map1.get(100));
        System.out.println(map1.remove(300));
        System.out.println(map1.containsKey(100));
        System.out.println(map1.containsValue("Akasha"));
        System.out.println(map1.containsValue("Priya"));
        System.out.println();




    }
}
