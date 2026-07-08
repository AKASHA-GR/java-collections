package com.xworkz.runner;

import com.xworkz.dto.WarDTO;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class WarStream {
    public static void main(String[] args) {

        List<WarDTO> wars = Arrays.asList(

                new WarDTO("World War I",
                        LocalDate.of(1914,7,28),
                        LocalDate.of(1918,11,11),
                        "Europe",
                        Arrays.asList("Germany","France","Britain","Russia"),
                        17000000,
                        "Victory",
                        1567,
                        "General Foch",
                        "Alliance Conflict"),

                new WarDTO("World War II",
                        LocalDate.of(1939,9,1),
                        LocalDate.of(1945,9,2),
                        "Europe",
                        Arrays.asList("Germany","Japan","USA","Britain","Russia"),
                        70000000,
                        "Victory",
                        2194,
                        "General Eisenhower",
                        "Expansionism"),

                new WarDTO("Kargil War",
                        LocalDate.of(1999,5,3),
                        LocalDate.of(1999,7,26),
                        "Asia",
                        Arrays.asList("India","Pakistan"),
                        5000,
                        "Victory",
                        85,
                        "General Malik",
                        "Territorial dispute"),

                new WarDTO("Napoleonic War",
                        LocalDate.of(1803,5,18),
                        LocalDate.of(1815,11,20),
                        "Europe",
                        Arrays.asList("France","Britain","Austria","Russia"),
                        3500000,
                        "Defeat",
                        4569,
                        "Napoleon",
                        "Empire Expansion"),

                new WarDTO("Indo-China War",
                        LocalDate.of(1962,10,20),
                        LocalDate.of(1962,11,21),
                        "Asia",
                        Arrays.asList("India","China"),
                        3000,
                        "Defeat",
                        32,
                        "General Kaul",
                        "Border dispute"),

                new WarDTO("Gulf War",
                        LocalDate.of(1990,8,2),
                        LocalDate.of(1991,2,28),
                        "Middle East",
                        Arrays.asList("Iraq","USA","Kuwait"),
                        25000,
                        "Victory",
                        210,
                        "General Schwarzkopf",
                        "Territorial dispute")
        );

        // BASIC PROPERTY FILTERING 1111111111111111111111111111111111111111111111111111111111111111111
        System.out.println("The Name starting with a specific letter W:");
        wars.stream()
            .filter(warDTO -> warDTO.getWarName().startsWith("W"))
            .forEach(warDTO -> System.out.println(warDTO));
        System.out.println();

        System.out.println("The wars by location:");
        wars.stream()
                .filter(warDTO -> warDTO.getLocation().equalsIgnoreCase("Europe"))
                .forEach(warDTO -> System.out.println(warDTO));
        System.out.println();

        System.out.println("The wars outcome is:");
        wars.stream()
                .filter(warDTO -> warDTO.getOutcome().equalsIgnoreCase("Victory"))
                .forEach(warDTO -> System.out.println(warDTO) );
        System.out.println();

        System.out.println("The wars by commander name");
        wars.stream()
            .filter(warDTO -> warDTO.getReason().equalsIgnoreCase("Napoleon"))
            .forEach(warDTO -> System.out.println(warDTO));
        System.out.println();


        System.out.println("The wars reason is:");
        wars.stream()
                .filter(warDTO -> warDTO.getReason().equalsIgnoreCase("Territorial dispute"))
                .forEach(warDTO -> System.out.println(warDTO));
        System.out.println();

        //DATE FILTERING 22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222
        System.out.println("The wars that started after 1900:");
        wars.stream()
                .filter(warDTO -> warDTO.getStartDate().isAfter(LocalDate.of(1900,1,1)))
                .forEach(warDTO -> System.out.println(warDTO));
        System.out.println();

        System.out.println("The wars that ended before 1800:");
        wars.stream()
                .filter(warDTO -> warDTO.getEndDate().isBefore(LocalDate.of(1800,1,1)))
                .forEach(warDTO -> System.out.println(warDTO));
        System.out.println();

        System.out.println("The wars that occurred in a 20th century:");
        wars.stream()
                .filter(warDTO -> warDTO.getStartDate().getYear() >= 1901 && warDTO.getStartDate().getYear() <= 2000)
                .forEach(warDTO -> System.out.println(warDTO));
        System.out.println();

        System.out.println("The wars with duration greater than 365 days:");
        wars.stream()
                .filter(warDTO -> warDTO.getDurationDays() > 365)
                .forEach(warDTO -> System.out.println(warDTO));
        System.out.println();

        System.out.println("The wars with duration less than 30 days:");
        wars.stream()
                .filter(warDTO -> warDTO.getDurationDays() < 30)
                .forEach(warDTO -> System.out.println(warDTO));
        System.out.println();


        // NUMERICAL FILTERING 333333333333333333333333333333333333333333333333

        System.out.println("The Casualties > 100000: ");
        wars.stream()
                .filter(warDTO -> warDTO.getCasualties() > 100000)
                .forEach(warDTO -> System.out.println(warDTO));
        System.out.println();


        System.out.println("The Casualties < 10000:");
        wars.stream()
                .filter(warDTO -> warDTO.getCasualties() < 10000)
                .forEach(warDTO -> System.out.println(warDTO));
        System.out.println();

        System.out.println("The Casualties between 50000 and 500000:");
        wars.stream()
                .filter(warDTO -> warDTO.getCasualties() >= 50000 && warDTO.getCasualties() <= 500000)
                .forEach(warDTO -> System.out.println(warDTO));
        System.out.println();

        System.out.println("The Duration divisible by 7:");
        wars.stream()
                .filter(warDTO -> warDTO.getDurationDays() % 7 == 0)
                .forEach(warDTO -> System.out.println(warDTO));
        System.out.println();


        //COLLECTION FILTERING 44444444444444444444444444444444444444444444444444444444444444444444444

        System.out.println("The  Wars involving India:");
        wars.stream()
                .filter(warDTO -> warDTO.getCountriesInvolved().contains("India"))
                .forEach(warDTO -> System.out.println(warDTO));
        System.out.println();

        System.out.println("The More than 3 countries:");
        wars.stream()
                .filter(warDTO -> warDTO.getCountriesInvolved().size() > 3)
                .forEach(warDTO -> System.out.println(warDTO));
        System.out.println();

        System.out.println("The Exactly 2 countries:");
        wars.stream()
                .filter(warDTO -> warDTO.getCountriesInvolved().size() == 2)
                .forEach(warDTO -> System.out.println(warDTO));
        System.out.println();


        // ADVANCED FILTERING

        System.out.println("The Casualties > 50000 AND Duration >100:");
        wars.stream()
                .filter(warDTO -> warDTO.getCasualties() > 500000 && warDTO.getDurationDays() > 100)
                .forEach(warDTO -> System.out.println(warDTO));
        System.out.println();

        System.out.println("The Commander contains 'Gen':");
        wars.stream()
                .filter(warDTO -> warDTO.getCommander().contains("Gen"))
                .forEach(warDTO -> System.out.println(warDTO));
        System.out.println();

        System.out.println("The Asia + Victory + Casualties >10000:");
        wars.stream()
                .filter(warDTO -> warDTO.getLocation().equalsIgnoreCase("Asia"))
                .filter(warDTO -> warDTO.getOutcome().equalsIgnoreCase("Victory"))
                .filter(warDTO -> warDTO.getCasualties() > 10000)
                .forEach(warDTO -> System.out.println(warDTO));
        System.out.println();

    }
}
