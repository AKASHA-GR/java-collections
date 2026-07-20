package com.xworkz.map.Runner;

import com.xworkz.map.dto.HeroDTO;
import com.xworkz.map.dto.MovieDTO;

import java.util.HashMap;
import java.util.Map;

public class MovieRunner {
    public static void main(String[] args) {

        Map<MovieDTO, HeroDTO> map = new HashMap<>();

        map.put(new MovieDTO("KGF","Action",2018),new HeroDTO("Yash",39,"Kannada"));
        map.put(new MovieDTO("RRR","Action",2022),new HeroDTO("Ram Charan",40,"Telugu"));
        map.put(new MovieDTO("Jailer","Action",2023),new HeroDTO("Rajinikanth",74,"Tamil"));
        map.put(new MovieDTO("Kantara","Action",2022),new HeroDTO("Rishb Shetty",42,"Kannada"));
        map.put(new MovieDTO("Pushpa","Action",2021),new HeroDTO("Allu arjun",43,"telugu"));


        System.out.println("The map size:"+map.size());
        System.out.println();

        map.keySet().forEach(k -> System.out.println(k));
        System.out.println();

        map.values().forEach(v -> System.out.println(v));

    }
}
