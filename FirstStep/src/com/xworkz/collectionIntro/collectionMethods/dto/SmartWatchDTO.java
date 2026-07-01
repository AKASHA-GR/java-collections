package com.xworkz.collectionIntro.collectionMethods.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class SmartWatchDTO implements Serializable {

    private String brand;
    private String model;
    private String color;
    private double displaySize;
    private boolean hasGPS;
    private boolean hasHeartRateMonitor;
    private int batteryLifeDays;
    private double price;
    private String operatingSystem;
    private LocalDate releaseDate;


}
