package com.xworkz.collectionIntro.sorting.comparable.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class CricketPlayerDTO implements Serializable,Comparable<CricketPlayerDTO> {

    private String name;
    private int runs;

    @Override
    public int compareTo(CricketPlayerDTO o) {
        return this.runs - o.runs;
    }
}
