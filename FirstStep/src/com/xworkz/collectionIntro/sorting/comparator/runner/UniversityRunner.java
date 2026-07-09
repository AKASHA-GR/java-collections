package com.xworkz.collectionIntro.sorting.comparator.runner;

import com.xworkz.collectionIntro.sorting.comparator.dto.UniversityDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UniversityRunner {
    public static void main(String[] args) {

        List<UniversityDTO> list = new ArrayList<>();

        list.add(new UniversityDTO("University of Sydney", 100));
        list.add(new UniversityDTO("University of Melbourne", 90));
        list.add(new UniversityDTO("University of Waterloo", 80));
        list.add(new UniversityDTO("University of Tasmania", 70));
        list.add(new UniversityDTO("University of Western Australia", 60));
        list.add(new UniversityDTO("University of Newcastle", 50));
        list.add(new UniversityDTO("University of Queensland", 40));
        list.add(new UniversityDTO("University of Western Sydney", 30));
        list.add(new UniversityDTO("University of Canberra", 20));
        list.add(new UniversityDTO("University of South Australia", 10));
        list.add(new UniversityDTO("Australian National University", 0));

        Collections.sort(list, (o1, o2) -> Integer.compare(o1.getStudentCount(), o2.getStudentCount()));

        System.out.println("After Sorting by Student Count");
        list.forEach(university -> System.out.println(university));
        System.out.println();

    }
}
