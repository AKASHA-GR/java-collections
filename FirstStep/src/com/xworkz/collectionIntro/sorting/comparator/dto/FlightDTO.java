package com.xworkz.collectionIntro.sorting.comparator.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Comparator;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class FlightDTO implements Serializable, Comparator<FlightDTO> {

    private String flightName;
    private double ticketPrice;
    private int duration;
    private String destination;

    @Override
    public int compare(FlightDTO o1, FlightDTO o2) {
        return 0;
    }
}
