package com.xworkz.map.Runner;

import java.util.HashMap;
import java.util.Map;

public class UserPasswordRunner {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<String, String>();

        map.put("akash@gmail.com","Akash@1223");
        map.put("hemanth@gmail.com","hemanth@1223");
        map.put("vrun@gmail.com","Varun@1223");
        map.put("harish@gmail.com","Harish@1223");
        map.put("prateek@gmail.com","Prateek@1223");

        System.out.println("The Map size:"+map.size());
        System.out.println("\nThe Keys:");
        map.keySet().forEach(k -> System.out.println(k));
        System.out.println();
        System.out.println("The values:");
        map.values().forEach(v -> System.out.println(v));

    }
}
