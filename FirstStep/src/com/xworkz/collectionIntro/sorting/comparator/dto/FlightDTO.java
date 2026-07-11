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
public class FlightDTO implements Serializable{

    private String flightName;
    private double ticketPrice;
    private int duration;
    private String destination;

}
