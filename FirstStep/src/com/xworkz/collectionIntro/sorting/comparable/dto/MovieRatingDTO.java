package com.xworkz.collectionIntro.sorting.comparable.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class MovieRatingDTO implements Serializable,Comparable<MovieRatingDTO> {

    private String name;
    private double rating;

    @Override
    public int compareTo(MovieRatingDTO o) {
        return Double.compare(this.rating, o.rating);
    }
}
