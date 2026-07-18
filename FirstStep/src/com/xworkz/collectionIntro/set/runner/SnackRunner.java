package com.xworkz.collectionIntro.set.runner;

import com.xworkz.collectionIntro.set.dto.SnackDTO;

import java.util.*;
import java.util.stream.Collectors;

public class SnackRunner {
    public static void main(String[] args) {
        Set<SnackDTO> snackDTOS = new HashSet<>();


        SnackDTO snackDTO1 = new SnackDTO("Chips", "Salted", 10, 1.5);
        SnackDTO snackDTO2 = new SnackDTO("Chocolate Bar", "Dark", 20, 1.2);
        SnackDTO snackDTO3 = new SnackDTO("Potato Chips", "Kosher", 15, 1.7);
        SnackDTO snackDTO4 = new SnackDTO("Popcorn", "Butter", 18, 1.9);
        SnackDTO snackDTO5 = new SnackDTO("Pretzel Rope", "Spicy", 12, 2.5);
        SnackDTO snackDTO6 = new SnackDTO("Pretzel Rope", "Spicy", 12, 2.5);

        snackDTOS.add(snackDTO1);
        snackDTOS.add(snackDTO2);
        snackDTOS.add(snackDTO3);
        snackDTOS.add(snackDTO4);
        snackDTOS.add(snackDTO5);
        snackDTOS.add(snackDTO6);


        System.out.println("The size of the set: "+ snackDTOS.size());

        System.out.println("\nThe duplicate data:\n"+snackDTO5+"\n"+snackDTO6+"\n");

        //the reference snackDTO5 and snackDTO6 are pointing to the same object,beacause of the size is still 5
        System.out.println("The size of the set:" + snackDTOS.size());

        //hashcode is same for snackDTO5 and snackDTO6
        System.out.println("\nThe hashcode of snackDTO5: "+snackDTO5.hashCode());
        System.out.println("The hashcode of snackDTO6: "+snackDTO6.hashCode());

        //Remove a snack by creating new object with same values
        SnackDTO snackDTO7 = new SnackDTO("Chips","Salted",10,1.5);
        snackDTOS.remove(snackDTO7);
        System.out.println("\nAfter removing a snack: "+snackDTOS.size());

        System.out.println("\nAfter removing a snack:\n");
        snackDTOS.forEach(System.out::println);

        SnackDTO snackDTO8 = new SnackDTO("Potato Chips", "Kosher", 15, 1.7);
        boolean found= snackDTOS.contains(snackDTO8);
        System.out.println("\nIs snackDTO8 found in the set:"+found);


        snackDTOS.clear();
        System.out.println("\nAfter clearing the set: "+snackDTOS.size());

        System.out.println("\nIs the set empty:"+snackDTOS.isEmpty());


        SnackDTO snackDTO9 = new SnackDTO("Chips","spicy",10,5);
        SnackDTO snackDTO10 = new SnackDTO("Gobi","spicy",25,40);
        SnackDTO snackDTO11 = new SnackDTO("Biscuit", "orange", 15, 30);

        snackDTOS.add(snackDTO9);
        snackDTOS.add(snackDTO10);
        snackDTOS.add(snackDTO11);

        System.out.println("\nAfter adding new snacks: "+snackDTOS.size());
        System.out.println();

        //lambda expression
        snackDTOS.forEach(biscuit -> System.out.println(biscuit));

        System.out.println("\nAfter converting to array:");
        SnackDTO[] snackDTOSArray = snackDTOS.toArray(new SnackDTO[0]);
        System.out.println(Arrays.toString(snackDTOSArray));

        System.out.println("\nAfter iterating:");
        Iterator<SnackDTO> iterator = snackDTOS.iterator();
        while (iterator.hasNext()){
            SnackDTO element = iterator.next();
            System.out.println(element);
        }

        System.out.println("\nAfter removing snacks with price > 30:");
        snackDTOS.removeIf(snackDTO -> snackDTO.getPrice() > 30);
        snackDTOS.forEach(snackDTO -> System.out.println(snackDTO));

        //Create HashSet with initial capacity
        Set<SnackDTO> snackDTOS1 = new HashSet<>(10);
        snackDTOS1.add(snackDTO9);
        snackDTOS1.add(snackDTO10);
        snackDTOS1.add(snackDTO11);
        System.out.println("\nAfter adding new snacks: "+snackDTOS1.size());
        System.out.println();

        //lambda expression
        snackDTOS1.forEach(snackDTO -> System.out.println(snackDTO));

        //Create HashSet with load factor
        Set<SnackDTO> snackDTOS2 = new HashSet<>(10, 0.75f);
        snackDTOS2.add(snackDTO9);
        snackDTOS2.add(snackDTO10);
        snackDTOS2.add(snackDTO11);
        System.out.println("\nAfter adding new snacks: "+ snackDTOS2.size());
        System.out.println();

        //lambda expression
        snackDTOS2.forEach(snackDTO -> System.out.println(snackDTO));

        //Add all elements from another HashSet
        HashSet<SnackDTO> snackDTOS3 = new HashSet<>();
        SnackDTO snackDTO12 = new SnackDTO("Lays Potato Chips", "Sweet", 25, 1.5);
        SnackDTO snackDTO13 = new SnackDTO("Pringles", "Salty", 10, 1.25);
        SnackDTO snackDTO14 = new SnackDTO("Cheetos", "Salty", 20, 1.75);

        snackDTOS3.add(snackDTO12);
        snackDTOS3.add(snackDTO13);
        snackDTOS3.add(snackDTO14);

        snackDTOS2.addAll(snackDTOS3);

        //Retain only elements present in another HashSet
        snackDTOS2.retainAll(snackDTOS3);
        System.out.println("\nAfter retaining only elements present in another HashSet: "+snackDTOS2.size());
        System.out.println();
        snackDTOS2.forEach(snackDTO -> System.out.println(snackDTO));

        //Remove all elements present in another HashSet
        System.out.println("\nAfter removing all elements present in another HashSet: "+snackDTOS.size());
        snackDTOS.removeAll(snackDTOS3);
        System.out.println();
        snackDTOS.forEach(snackDTO -> System.out.println(snackDTO));


        //Check if HashSet contains all elements of another collection
        System.out.println("\nAfter checking if HashSet contains all elements of another collection: "+snackDTOS.containsAll(snackDTOS3));
        System.out.println();
        snackDTOS.forEach(snackDTO -> System.out.println(snackDTO));
        System.out.println();

        //Create HashSet from List
        List<SnackDTO> snackDTOSList = new ArrayList<>(snackDTOS);
        Set<SnackDTO> snackDTOS4 = new HashSet<>(snackDTOSList);
        System.out.println("\nAfter creating HashSet from List: "+snackDTOS4.size());
        System.out.println();
        snackDTOS4.forEach(snackDTO -> System.out.println(snackDTO));


        //Find snack with highest price
        double highestPrice = Double.MIN_VALUE;
        SnackDTO snackDTOWithHighestPrice = null;
        for (SnackDTO snackDTO : snackDTOS4) {
            if (snackDTO.getPrice() > highestPrice) {
                highestPrice = snackDTO.getPrice();
                snackDTOWithHighestPrice = snackDTO;
            }
        }
        System.out.println("\nSnack with highest price: " + snackDTOWithHighestPrice);
        System.out.println();

        //Count snacks with specific flavor
        long count = snackDTOS4.stream()
                .filter(snackDTO -> snackDTO.getFlavor().equals("Salted"))
                .count();

        //Calculate total weight of all snacks
        double totalWeight = snackDTOS4.stream()
                .mapToDouble(SnackDTO::getWeight)
                .sum();
        System.out.println("\nTotal weight of all snacks: " + totalWeight);
        System.out.println();


        //Group snacks by flavor



        //Clone HashSet
        Set<SnackDTO> snackDTOS5 = new HashSet<>(snackDTOS4);
        System.out.println("\nAfter cloning HashSet: "+snackDTOS5.size());
        System.out.println();

        snackDTOS5.forEach(snackDTO -> System.out.println(snackDTO));
        System.out.println();












    }



}
