package com.xworkz.collectionIntro.sorting.comparator.runner;

import com.xworkz.collectionIntro.sorting.comparator.dto.FlightDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FlightRunner {
    public static void main(String[] args) {

        List<FlightDTO> list = new ArrayList<>();


        list.add(new FlightDTO("Flight 1", 1000, 3, "New York"));
        list.add(new FlightDTO("Flight 2", 800, 2, "Paris"));
        list.add(new FlightDTO("Flight 3", 1500, 4, "London"));
        list.add(new FlightDTO("Flight 4", 1200, 5, "Delhi"));
        list.add(new FlightDTO("Flight 5", 700, 1, "Tokyo"));
        list.add(new FlightDTO("Flight 6", 1100, 3, "Berlin"));
        list.add(new FlightDTO("Flight 7", 900, 2, "Mumbai"));
        list.add(new FlightDTO("Flight 8", 1300, 4, "Sydney"));
        list.add(new FlightDTO("Flight 9", 1000, 5, "Beijing"));
        list.add(new FlightDTO("Flight 10", 800, 1, "Dubai"));
        list.add(new FlightDTO("Flight 11", 1400, 3, "Moscow"));
        list.add(new FlightDTO("Flight 12", 1200, 2, "Toronto"));


        Collections.sort(list, (o1, o2) -> Double.compare(o1.getTicketPrice(), o2.getTicketPrice()));

        System.out.println("After Sorting by Ticket Price");
        list.forEach(flight -> System.out.println(flight));
        System.out.println();

        Collections.sort(list, (o1, o2) -> Integer.compare(o1.getDuration(), o2.getDuration()));

        System.out.println("After Sorting by Duration");
        list.forEach(flight -> System.out.println(flight));
        System.out.println();


        Collections.sort(list, (o1, o2) -> o1.getDestination().compareTo(o2.getDestination()));

        System.out.println("After Sorting by Destination");
        list.forEach(flight -> System.out.println(flight));
        System.out.println();

    }
}
