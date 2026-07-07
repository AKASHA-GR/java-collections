package com.xworkz.filter;

import java.util.Arrays;
import java.util.List;

public class CountryStreamOperation {
    public static void main(String[] args) {

        List<String> countries = Arrays.asList(
                "India",
                "Indonesia",
                "Australia",
                "South Africa",
                "United States",
                "United Kingdom",
                "Canada",
                "China",
                "Japan",
                "Sri Lanka",
                "New Zealand",
                "Saudi Arabia",
                "Brazil",
                "Russia",
                "Italy",
                "Nepal",
                "Germany",
                "France",
                "South Korea",
                "United Arab Emirates"
        );


        System.out.println("Countries start with I:");
        countries.stream()
                 .filter(country -> country.startsWith("I"))
                 .forEach(country -> System.out.println(country));
        System.out.println();


        System.out.println("Countries end with A:");
        countries.stream()
                .filter(country -> country.endsWith("A") || country.endsWith("a"))
                .forEach(country -> System.out.println(country));
        System.out.println();


        System.out.println("Countries with two or more words:");
        countries.stream()
                .filter(country -> country.trim().contains(" "))
                .forEach(country -> System.out.println(country));
        System.out.println();


        System.out.println("Countries with length < 10");
        countries.stream()
                .filter(country -> country.length() > 10)
                .forEach(country -> System.out.println(country));
        System.out.println();


        System.out.println("Countries where length is less than or equal to 5:");
        countries.stream()
                .filter(country -> country.length() <= 5)
                .forEach(country -> System.out.println(country));
        System.out.println();

        System.out.println("All Countries:");
        countries.stream()
                .forEach(country -> System.out.println(country));

    }
}
