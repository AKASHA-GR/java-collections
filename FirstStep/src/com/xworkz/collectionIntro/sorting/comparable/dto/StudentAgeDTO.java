package com.xworkz.collectionIntro.sorting.comparable.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class StudentAgeDTO implements Serializable,Comparable<StudentAgeDTO> {
    private int id;
    private String name;
    private int age;
    private int marks;

    @Override
    public int compareTo(StudentAgeDTO o) {
        return o.age - this.age;
    }
}
