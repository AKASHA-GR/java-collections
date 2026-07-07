package com.xworkz.runner;

import com.xworkz.dto.CityDTO;

import java.util.Arrays;
import java.util.List;

public class CityStreamOperations {


    public static int sumOfDigits(int number){
        int sum = 0;
        while (number > 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }



    public static void main(String[] args) {

        List<CityDTO> cities = Arrays.asList(
                new CityDTO("Bengaluru", 560001),
                new CityDTO("Mysuru", 570001),
                new CityDTO("Hubballi", 580001),
                new CityDTO("Dharwad", 580008),
                new CityDTO("Mumbai", 400001),
                new CityDTO("Delhi", 110001),
                new CityDTO("Chennai", 600001),
                new CityDTO("Hyderabad", 500001),
                new CityDTO("Pune", 411001),
                new CityDTO("Jaipur", 302001),
                new CityDTO("Ahmedabad", 380001),
                new CityDTO("Mangalore", 575001),
                new CityDTO("Davanagere", 577002),
                new CityDTO("Madurai", 625001),
                new CityDTO("Nagpur", 440001)
        );

        System.out.println("a. Cities with pin-codes between 500000 and 599999:");
        cities.stream()
                .filter(cityDTO -> cityDTO.getPincode() >= 500000 && cityDTO.getPincode() <= 599999)
                .forEach(cityDTO -> System.out.println(cityDTO));
        System.out.println();


        System.out.println("b. city names longer then 6 characters:");
        cities.stream()
                .filter(cityDTO -> cityDTO.getName().length() > 6 )
                .forEach(cityDTO -> System.out.println(cityDTO));
        System.out.println();

        System.out.println("c. Pincode contains digit '1':");
        cities.stream()
                .filter(cityDTO -> String.valueOf(cityDTO.getPincode()).contains("1"))
                .forEach(cityDTO -> System.out.println(cityDTO));
        System.out.println();

        System.out.println("d. Even pincodes:");
        cities.stream()
                .filter(cityDTO -> cityDTO.getPincode() % 2 == 0)
                .forEach(cityDTO -> System.out.println(cityDTO));
        System.out.println();

        System.out.println("e. Odd pincodes:");
        cities.stream()
                .filter(cityDTO -> cityDTO.getPincode() % 2 != 0)
                .forEach(cityDTO -> System.out.println(cityDTO));
        System.out.println();

        System.out.println("f. City starts with M or D:");
        cities.stream()
                .filter(cityDTO -> cityDTO.getName().startsWith("M") || cityDTO.getName().startsWith("D"))
                .forEach(cityDTO -> System.out.println(cityDTO));
        System.out.println();

        System.out.println("g. Pincode divisible by 3:");
        cities.stream()
                .filter(cityDTO -> cityDTO.getPincode() % 3 ==0)
                .forEach(cityDTO -> System.out.println(cityDTO));
        System.out.println();

        System.out.println("h. Sum of pincode digits > 20:");
        cities.stream()
                .filter(cityDTO -> sumOfDigits(cityDTO.getPincode()) > 20)
                .forEach(cityDTO -> System.out.println(cityDTO));
        System.out.println();

        System.out.println("i. City name contains 'a':");
        cities.stream()
                .filter(cityDTO -> cityDTO.getName().toLowerCase().contains("a"))
                .forEach(cityDTO -> System.out.println(cityDTO));
        System.out.println();

        System.out.println("j. Pincode ends with 001:");
        cities.stream()
                .filter(cityDTO -> String.valueOf(cityDTO.getPincode()).endsWith("001"))
                .forEach(cityDTO -> System.out.println(cityDTO));
        System.out.println();
    }

}
