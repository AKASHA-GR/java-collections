package com.xworkz.collectionIntro.add.runner;

import com.xworkz.collectionIntro.add.dto.ReviewDTO;

import java.util.ArrayList;
import java.util.Collection;

public class ReviewRunner {
    public static void main(String[] args) {
        Collection<ReviewDTO> reviewDTOS = new ArrayList<>();

        ReviewDTO reviewDTO = new ReviewDTO(33445501,101,77701,4.5,"Good Product");
        ReviewDTO reviewDTO1 = new ReviewDTO(33445502,102,77702,2.5,"Average Product");

        reviewDTOS.add(reviewDTO);
        reviewDTOS.add(reviewDTO1);
        System.out.println("The review details:"+reviewDTOS.size());
        System.out.println();
        System.out.println("The review details:"+reviewDTOS);
    }
}
