package com.xworkz.map.Runner;

import java.util.HashMap;
import java.util.Map;

public class MovieHeroRunner {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("pushpa","Allu Arjun");
        map.put("RRR","Ram Charan and Jr NTR");
        map.put("Baahubali","Prabhas");
        map.put("Agneeapth","Hrithik Roshan");
        map.put("Akash","Punith");

        System.out.println("The map size:"+map.size());
        System.out.println("\nThe kays:");
        map.keySet().forEach(k -> System.out.println(k));
        System.out.println("\nThe values:");
        map.values().forEach(v -> System.out.println(v));

    }
}
