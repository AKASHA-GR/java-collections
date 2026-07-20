package com.xworkz.map.Runner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReligionGodRunner {
    public static void main(String[] args) {

        Map<String, List<String>> map = new HashMap<>();

        map.put("Hinduism", new ArrayList<String>() {{ add("Vishnu"); add("Shiva"); add("Brahma"); }});
        map.put("Christianity", new ArrayList<String>() {{ add("God"); add("Jesus"); add("Holy Spirit"); }});
        map.put("Islam", new ArrayList<String>() {{ add("Allah"); }});
        map.put("Buddhism", new ArrayList<String>() {{ add("Buddha"); }});
        map.put("Sikhism", new ArrayList<String>() {{ add("Waheguru"); }});

        System.out.println("Map Size: " + map.size());
        System.out.println("\nThe Keys:");
        map.keySet().forEach(k -> System.out.println(k));
        System.out.println("\nThe Values:");
        map.values().forEach(v -> System.out.println(v)); 

    }
}
