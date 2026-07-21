package com.xworkz.mapMethods.runner;

import com.xworkz.mapMethods.dto.CollegeDTO;
import com.xworkz.mapMethods.dto.StudentDTO;

import java.util.HashMap;
import java.util.Map;

public class StudentCollegeRunner {
    public static void main(String[] args) {

        Map<StudentDTO, CollegeDTO> map = new HashMap<>();

        map.put(new StudentDTO(101,"Akasha",23,"Computer science",8.1),new CollegeDTO(1,"Government Engineering college,challakere","Challakere","VTU",2021));
        map.put(new StudentDTO(102,"Chinmay",24,"Computer science",7.5),new CollegeDTO(2,"KVGC Engineering college","Mangaloru","VTU",1999));
        map.put(new StudentDTO(103, "Hemanth", 20, "Electronics", 9.1),new CollegeDTO(3, "PQR Engineering College", "Hubballi", "VTU", 2010));
        map.put(new StudentDTO(104, "Priya", 21, "Mechanical", 7.9),new CollegeDTO(4, "National Engineering College", "Belagavi", "VTU", 2001));
        map.put(new StudentDTO(105, "Kiran", 22, "Civil", 8.0),new CollegeDTO(5, "Global College of Engineering", "Davanagere", "VTU", 2003));

        Map<StudentDTO,CollegeDTO> map1 = new HashMap<>();


        StudentDTO student1 = new StudentDTO(101, "Rahul", 23, "Mechanical", 8.5);
        CollegeDTO college1 = new CollegeDTO(1, "SVN College of Engineering", "Chennai", "Anna University", 2010);

        StudentDTO student2 = new StudentDTO(102, "Shruti", 24, "Electrical", 7.9);
        CollegeDTO college2 = new CollegeDTO(2, "JSS College of Engineering", "Bangalore", "Karnataka University", 2003);

        map1.put(student1, college1);
        map1.put(student2, college2);

        map.putAll(map1);

        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });
        System.out.println();

        System.out.println("The get values:");
        System.out.println(map.get(new StudentDTO(101,"Akasha",23,"Computer science",8.1)));
        System.out.println();

        System.out.println("Check the value is exist or not:");
        System.out.println(map.containsValue(new CollegeDTO(1,"Government Engineering college,challakere","Challakere","VTU",2021)));
        System.out.println();

        System.out.println("Check the key is exist or not:");
        System.out.println(map.containsKey(new StudentDTO(101,"Akasha",23,"Computer science",8.1)));

        

    }
}
