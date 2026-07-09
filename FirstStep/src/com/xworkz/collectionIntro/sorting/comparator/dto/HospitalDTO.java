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
public class HospitalDTO implements Serializable, Comparator<HospitalDTO> {

    private int patientId;
    private String patientName;
    private int age;
    private String disease;


    @Override
    public int compare(HospitalDTO o1, HospitalDTO o2) {
        return Integer.compare(o1.age, o2.age);
    }
}
