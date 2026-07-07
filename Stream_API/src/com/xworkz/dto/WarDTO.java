package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class WarDTO implements Serializable {

    private String warName;
    private LocalDate startDate;
    private LocalDate endDate;
    private String location;
    private List<String> countriesInvolved;
    private int casualties;
    private String outcome;
    private int durationDays;
    private String commander;
    private String reason;

}
