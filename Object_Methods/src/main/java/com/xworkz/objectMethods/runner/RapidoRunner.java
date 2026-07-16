package com.xworkz.objectMethods.runner;

import com.xworkz.objectMethods.dto.RapidoDTO;

import java.util.HashSet;
import java.util.Set;

public class RapidoRunner {
    public static void main(String[] args) {

        Set<RapidoDTO> set = new HashSet<>();


        RapidoDTO rapidoDTO = new RapidoDTO("Akasha", "1", "akasha@example.com", "1234567890", "123 Street");
        RapidoDTO rapidoDTO1 = new RapidoDTO("Harish", "2", "harish@example.com", "0987654321", "321 Avenue");
        RapidoDTO rapidoDTO2 = new RapidoDTO("Nagaprajwal", "3", "nagaprajwal@example.com", "5555555555", "456 Boulevard");
        RapidoDTO rapidoDTO3 = new RapidoDTO("Chinmay", "4", "chinmay@example.com", "5035551212", "789 Court");
        RapidoDTO rapidoDTO4 = new RapidoDTO("Manogna", "5", "manogna@example.com", "2125558888", "987 Lane");
        RapidoDTO rapidoDTO5 = new RapidoDTO("Varun", "6", "varun@example.com", "4085557777", "654 Drive");
        RapidoDTO rapidoDTO6 = new RapidoDTO("Kiran", "7", "kiran@example.com", "6505559999", "345 Circle");
        RapidoDTO rapidoDTO8 = new RapidoDTO("Kiran", "7", "kiran@example.com", "6505559999", "345 Circle");
        RapidoDTO rapidoDTO7 = (RapidoDTO) rapidoDTO.clone();

        set.add(rapidoDTO);
        set.add(rapidoDTO1);
        set.add(rapidoDTO2);
        set.add(rapidoDTO3);
        set.add(rapidoDTO4);
        set.add(rapidoDTO5);
        set.add(rapidoDTO8);

        //there is eight object is there but one is duplicate that is rapidoDTO7 because size is 7
        System.out.println("The size of the set: " + set.size());

        System.out.println("The hashcode of all objects in the set: ");
        System.out.println(rapidoDTO1.hashCode());
        System.out.println(rapidoDTO.hashCode());
        System.out.println(rapidoDTO2.hashCode());
        System.out.println(rapidoDTO3.hashCode());
        System.out.println(rapidoDTO4.hashCode());
        System.out.println(rapidoDTO5.hashCode());
        System.out.println(rapidoDTO8.hashCode());
        System.out.println();

        //rapidoDTO7 is duplicate
        System.out.println(rapidoDTO7.hashCode());
        System.out.println();

        System.out.println("The equals method:");
        System.out.println(rapidoDTO1.equals(rapidoDTO7));
        System.out.println(rapidoDTO.equals(rapidoDTO7));
        System.out.println(rapidoDTO6.equals(rapidoDTO6));
        System.out.println(rapidoDTO6.equals(rapidoDTO8));
        System.out.println(rapidoDTO8.equals(rapidoDTO6));
        System.out.println();

        System.out.println("The ToString method:");
        System.out.println(rapidoDTO);
        System.out.println(rapidoDTO1);
        System.out.println(rapidoDTO2);
        System.out.println(rapidoDTO3);
        System.out.println(rapidoDTO4);
        System.out.println(rapidoDTO5);
        System.out.println(rapidoDTO6);
        System.out.println(rapidoDTO7);
        System.out.println(rapidoDTO8);
        System.out.println();

        System.out.println("The set: ");
        System.out.println(set);
        System.out.println();
        
        System.out.println("The clone method:");
        System.out.println(rapidoDTO6.clone());
        System.out.println();









    }
}
