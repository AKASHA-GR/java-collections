package com.xworkz.map.hashtable.runner;

import com.xworkz.map.hashtable.dto.BikeDTO;

import java.util.Hashtable;
import java.util.Map;

public class BikeRunner {
    public static void main(String[] args) {

        Map<Integer, BikeDTO> map = new Hashtable<>();

        map.put(1011,new BikeDTO("Hero Splendor Plus"," Hero MotoCorp",77777,70));
        map.put(1012,new BikeDTO("TVS Raider","TVS Motor Company",82860,72));
        map.put(1013,new BikeDTO("Honda SP 125","Honda Motorcycle",89279,63));
        map.put(1014,new BikeDTO("Hero HF Deluxe","Hero MotoCorp",55992,70));
        map.put(1015,new BikeDTO("Bajaj Platina 100"," Bajaj Auto",68989,75));
        map.put(1016,new BikeDTO("Bajaj Platina 100"," Bajaj Auto",68989,75));

        map.keySet().forEach(k -> System.out.println(k));
        System.out.println();
        map.values().forEach(v -> System.out.println(v));
        System.out.println();

        map.entrySet().forEach(entry ->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });
        System.out.println();

        System.out.println(map.get(1012));
        System.out.println();

        System.out.println(map.containsValue(new BikeDTO("TVS Raider","TVS Motor Company",82860,72)));
        System.out.println();

        System.out.println(map.containsKey(1014));
        System.out.println();

        map.replace(1016, new BikeDTO("Hero Splendor Plus"," Hero MotoCorp",77777,70));
        System.out.println(map.get(1016));
        System.out.println();


    }
}
