package com.xworkz.collectionIntro.sorting.comparable.runner;

import com.xworkz.collectionIntro.sorting.comparable.dto.MovieRatingDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieRatingRunner {
    public static void main(String[] args) {


        List<MovieRatingDTO> list = new ArrayList<>();

        list.add(new MovieRatingDTO("The Shawshank Redemption", 9.3));
        list.add(new MovieRatingDTO("The Godfather", 9.2));
        list.add(new MovieRatingDTO("The Godfather: Part II", 9.0));
        list.add(new MovieRatingDTO("Pulp Fiction", 8.9));
        list.add(new MovieRatingDTO("The Good, the Bad and the Ugly", 9.0));
        list.add(new MovieRatingDTO("The Dark Knight", 9.0));
        list.add(new MovieRatingDTO("12 Angry Men", 8.9));
        list.add(new MovieRatingDTO("Schindler's List", 8.9));
        list.add(new MovieRatingDTO("The Lord of the Rings: The Return of the King", 8.9));
        list.add(new MovieRatingDTO("Fight Club", 8.8));
        list.add(new MovieRatingDTO("The Matrix", 8.7));
        list.add(new MovieRatingDTO("Seven", 8.7));
        list.add(new MovieRatingDTO("The Silence of the Lambs", 8.7));
        list.add(new MovieRatingDTO("Forrest Gump", 8.7));
        list.add(new MovieRatingDTO("One Flew Over the Cuckoo's Nest", 8.7));

        System.out.println("Before Sorting");
        list.forEach(movie -> System.out.println(movie));
        System.out.println();

        //ascending order
        Collections.sort(list);


        System.out.println("After Sorting");
        list.forEach(movie -> System.out.println(movie));
        System.out.println();



    }
}
