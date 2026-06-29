package com.xworkz.collectionIntro.iterator.dto;

import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@ToString

public class SpaceProbeDTO implements Serializable {

    private String probeId;
    private String missionName;
    private String targetCelestialBody;
    private String manufacturer;
    private double launchMass;
    private LocalDateTime launchDate;
    private LocalDateTime arrivalDate;
    private String propulsionType;
    private double powerOutput;
    private String communicationFrequency;
    private double distanceFromEarth;
    private double orbitalVelocity;
    private String primaryInstrument;
    private String secondaryInstrument;
    private int missionDurationDays;
    private boolean isActive;
    private String status;
    private double fuelRemaining;
    private String trajectoryPath;

}

