package com.xworkz.collectionIntro.set.runner;

import com.xworkz.collectionIntro.set.dto.SnackDTO;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SnackTreeRunner {
    public static void main(String[] args) {

        //task for treeSet
        Set<SnackDTO> snackDTOS4 = new TreeSet<>();

        SnackDTO snackDTO1 = new SnackDTO("Lays Potato Chips", "Sweet", 25, 1.5);
        SnackDTO snackDTO2 = new SnackDTO("Pringles", "Sweet", 25, 1.25);
        SnackDTO snackDTO3 = new SnackDTO("Cheetos", "Salty", 30, 1.75);
        SnackDTO snackDTO4 = new SnackDTO("Twix", "Sweet", 20, 2.0);
        SnackDTO snackDTO5 = new SnackDTO("Kit Kat", "Sweet", 15, 1.99);
        SnackDTO snackDTO6 = new SnackDTO("Aa", "Sweet", 15, 1.99);
        SnackDTO snackDTO7 = new SnackDTO("BB", "Sweet", 15, 1.99);
        SnackDTO snackDTO8 = new SnackDTO("BB", "Sweet", 15, 1.99);
        SnackDTO snackDTO9 = new SnackDTO("Aa", "Sweet", 15, 1.99);

        snackDTOS4.add(snackDTO1);
        snackDTOS4.add(snackDTO2);
        snackDTOS4.add(snackDTO3);
        snackDTOS4.add(snackDTO4);
        snackDTOS4.add(snackDTO5);
        snackDTOS4.add(snackDTO6);
        snackDTOS4.add(snackDTO7);
        snackDTOS4.add(snackDTO8);
        snackDTOS4.add(snackDTO9);

        System.out.println("\nAfter adding new snacks: "+ snackDTOS4.size());
        System.out.println();

        snackDTOS4.forEach(snackDTO -> System.out.println(snackDTO.hashCode()));
        System.out.println();
        snackDTOS4.forEach(snackDTO -> System.out.println(snackDTO));

        //Create TreeSet with comparator (by flavor)
        Set<SnackDTO> snackDTOS5 = new TreeSet<>((s1, s2) -> s1.getFlavor().compareTo(s2.getFlavor()));
        snackDTOS5.addAll(snackDTOS4);

        System.out.println("\nAfter creating TreeSet with comparator (by flavor): " + snackDTOS5.size());
        System.out.println();

        snackDTOS5.forEach(snackDTO -> System.out.println(snackDTO));

        //Create TreeSet with comparator (by weight)
        System.out.println("\nAfter creating TreeSet with comparator (by weight): ");
        Set<SnackDTO> snackDTOS6 = new TreeSet<>((s1,s2) -> Double.compare(s1.getWeight(), s2.getWeight()));
        snackDTOS6.addAll(snackDTOS4);

        snackDTOS6.forEach(SnackDTO -> System.out.println(SnackDTO));
        System.out.println();

        //Get first element (lowest price)
        Iterator<SnackDTO> iterator = snackDTOS6.iterator();
        SnackDTO firstElement = iterator.next();
        System.out.println("First element (lowest price): ");
        System.out.println(firstElement);
        System.out.println();


        //Get last element (highest price)
        Iterator<SnackDTO> iterator2 = ((TreeSet<SnackDTO>) snackDTOS6).descendingIterator();
        SnackDTO lastElement = iterator2.next();
        System.out.println("Last element (highest price): ");
        System.out.println(lastElement);
        System.out.println();

        //Merge two TreeSets
        Set<SnackDTO> snackDTOS7 = new TreeSet<>();
        snackDTOS7.addAll(snackDTOS4);
        snackDTOS7.addAll(snackDTOS5);

        System.out.println("\nAfter merging two TreeSets: " + snackDTOS7.size());
        System.out.println();

        snackDTOS7.forEach(snackDTO -> System.out.println(snackDTO));






    }
}
