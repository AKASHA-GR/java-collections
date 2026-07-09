package com.xworkz.collectionIntro.sorting.comparator.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Comparator;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class UniversityDTO implements Serializable, Comparator<UniversityDTO> {

    private String universityName;
    private int studentCount;


    @Override
    public int compare(UniversityDTO o1, UniversityDTO o2) {
        return 0;
    }
}
