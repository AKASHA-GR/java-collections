package com.xworkz.collectionIntro.sorting.comparable.runner;

import com.xworkz.collectionIntro.sorting.comparable.dto.StudentAgeDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {
    public static void main(String[] args) {

        List<StudentAgeDTO> list = new ArrayList<>();

        StudentAgeDTO studentAgeDTO = new StudentAgeDTO(1,"Ramesh",23,85);
        StudentAgeDTO studentAgeDTO1 = new StudentAgeDTO(2,"Rakesh",22,90);
        StudentAgeDTO studentAgeDTO2 = new StudentAgeDTO(3,"Rajesh",21,88);
        StudentAgeDTO studentAgeDTO3 = new StudentAgeDTO(4,"Aravind",24,92);
        StudentAgeDTO studentAgeDTO4 = new StudentAgeDTO(5,"Raj",25,89);
        StudentAgeDTO studentAgeDTO5 = new StudentAgeDTO(6,"Naga",22,91);
        StudentAgeDTO studentAgeDTO6 = new StudentAgeDTO(7,"varun",23,76);
        StudentAgeDTO studentAgeDTO7 = new StudentAgeDTO(8,"shravan",25,88);
        StudentAgeDTO studentAgeDTO8 = new StudentAgeDTO(9,"prakash",19,77);
        StudentAgeDTO studentAgeDTO9 = new StudentAgeDTO(10,"yidu",20,63);
        list.add(studentAgeDTO);
        list.add(studentAgeDTO1);
        list.add(studentAgeDTO2);
        list.add(studentAgeDTO3);
        list.add(studentAgeDTO4);
        list.add(studentAgeDTO5);
        list.add(studentAgeDTO6);
        list.add(studentAgeDTO7);
        list.add(studentAgeDTO8);
        list.add(studentAgeDTO9);

        System.out.println("Before Sorting");
        list.forEach(studentAge -> System.out.println(studentAge));
        System.out.println();

        //descending order
        Collections.sort(list);

        System.out.println("After Sorting");
        list.forEach(studentAge -> System.out.println(studentAge));
        System.out.println();
    }
}
