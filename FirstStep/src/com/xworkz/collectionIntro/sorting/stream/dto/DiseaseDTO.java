package com.xworkz.collectionIntro.sorting.stream.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;


@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class DiseaseDTO implements Serializable,Comparable<DiseaseDTO> {


    private int id;
    private String name;
    private String description;
    private String symptoms;
    private String cause;
    private String treatment;
    private String cure;
    private String prevention;
    private String etiology;

    @Override
    public int compareTo(DiseaseDTO o) {
        return Integer.compare(this.id,o.id);
    }
}
