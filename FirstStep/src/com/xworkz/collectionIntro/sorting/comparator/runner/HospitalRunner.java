package com.xworkz.collectionIntro.sorting.comparator.runner;

import com.xworkz.collectionIntro.sorting.comparator.dto.HospitalDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HospitalRunner {
    public static void main(String[] args) {

        List<HospitalDTO> list = new ArrayList<>();


        list.add(new HospitalDTO(1, "John", 25, "Diabetes"));
        list.add(new HospitalDTO(2, "Ray", 30, "Cancer"));
        list.add(new HospitalDTO(3, "Sam", 20, "Heart"));
        list.add(new HospitalDTO(4, "Max", 28, "Stroke"));
        list.add(new HospitalDTO(5, "Peter", 35, "Kidney"));
        list.add(new HospitalDTO(6, "Tom", 22, "Bronch"));
        list.add(new HospitalDTO(7, "Jerry", 29, "Liver"));
        list.add(new HospitalDTO(8, "Spike", 32, "Lung"));
        list.add(new HospitalDTO(9, "Tyler", 27, "Infection"));
        list.add(new HospitalDTO(10, "Ben", 21, "Anemia"));
        list.add(new HospitalDTO(11, "Alex", 33, "Eye"));
        list.add(new HospitalDTO(12, "Mike", 26, "Ear"));
        list.add(new HospitalDTO(13, "Chris", 24, "Joint"));
        list.add(new HospitalDTO(14, "Mark", 31, "Brain"));
        list.add(new HospitalDTO(15, "David", 23, "Skin"));


        System.out.println("Before Sorting");
        list.forEach(hospital -> System.out.println(hospital));
        System.out.println();

        Comparator<HospitalDTO> comparator = (o1,o2) -> Integer.compare(o1.getAge(), o2.getAge());
        Collections.sort(list, comparator);

        System.out.println("After Sorting by Age");
        list.forEach(hospital -> System.out.println(hospital));
        System.out.println();

        Collections.sort(list, (o1, o2) -> o1.getPatientName().compareTo(o2.getPatientName()));

        System.out.println("After Sorting by Name");
        list.forEach(hospital -> System.out.println(hospital));
        System.out.println();

        Collections.sort(list,(o1,o2) -> Integer.compare(o1.getPatientId(), o2.getPatientId()));

        System.out.println("After Sorting by Patient ID");
        list.forEach(hospital -> System.out.println(hospital));
        System.out.println();

    }
}
