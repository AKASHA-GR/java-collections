package com.xworkz.collectionIntro.sorting.comparator.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Comparator;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class HospitalDTO implements Serializable {

    private int patientId;
    private String patientName;
    private int age;
    private String disease;



}
