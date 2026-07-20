package com.xworkz.map.Runner;

import java.util.HashMap;
import java.util.Map;

public class ValidateRunner {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("Manogna","manu@gmail.com");
        map.put("Naveen","naveen@gmail.com");
        map.put("Girish","girish@gmail.com");
        map.put("Shivu","shivu@gmail.com");
        map.put("Bharat","bharath@gmail.com");

        System.out.println("The size:"+map.size());
        System.out.println();

        map.keySet().forEach(k -> System.out.println(k));
        System.out.println();

        map.values().forEach(v -> System.out.println(v));

    }
}
