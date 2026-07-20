package com.xworkz.map.Runner;

import com.xworkz.map.dto.ChiefMinisterDTO;
import com.xworkz.map.dto.StateDTO;

import java.util.HashMap;
import java.util.Map;

public class StateRunner {
    public static void main(String[] args) {

        Map<StateDTO, ChiefMinisterDTO> map = new HashMap<>();

        map.put(new StateDTO("Karnataka","Bengaluru",68000000),new ChiefMinisterDTO("DK Shivakumar",59,"INC"));
        map.put(new StateDTO("Tamil Nadu","Chennai",78000000),new ChiefMinisterDTO("C. Joseph Vijay",52,"TVK"));
        map.put(new StateDTO("Maharashtra","Mumbai",124000000),new ChiefMinisterDTO("Devendra Fadnavis",55,"BJP"));
        map.put(new StateDTO("Kerala","Thiruvananthapuram",3500000),new ChiefMinisterDTO("Pinarayi Vijayan",80,"CPI(M)"));
        map.put(new StateDTO("Telangana","Hyderabad",40000000),new ChiefMinisterDTO("A. Revanth Reddy",56,"INC"));

        System.out.println("Map Size : " + map.size());
        System.out.println();

        map.keySet().forEach(k -> System.out.println(k));
        System.out.println();

        map.values().forEach(v -> System.out.println(v));



    }
}