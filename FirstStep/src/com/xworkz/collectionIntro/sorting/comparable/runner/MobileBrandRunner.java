package com.xworkz.collectionIntro.sorting.comparable.runner;

import com.xworkz.collectionIntro.sorting.comparable.dto.MobileBrandDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobileBrandRunner {
    public static void main(String[] args) {

        List<MobileBrandDTO> list = new ArrayList<>();


        list.add(new MobileBrandDTO("Samsung", 10000, 8, "Black"));
        list.add(new MobileBrandDTO("Apple", 12000, 8, "Gray"));
        list.add(new MobileBrandDTO("OnePlus", 15000, 6, "Black"));
        list.add(new MobileBrandDTO("Nokia", 8000, 4, "Black"));
        list.add(new MobileBrandDTO("Motorola", 10000, 4, "Black"));
        list.add(new MobileBrandDTO("Sony", 12000, 6, "Gray"));
        list.add(new MobileBrandDTO("LG", 15000, 8, "Black"));
        list.add(new MobileBrandDTO("Xiaomi", 8000, 4, "Gray"));
        list.add(new MobileBrandDTO("HTC", 10000, 4, "Black"));
        list.add(new MobileBrandDTO("Huawei", 12000, 6, "Black"));
        list.add(new MobileBrandDTO("Oppo", 15000, 8, "Gray"));
        list.add(new MobileBrandDTO("Vivo", 8000, 4, "Black"));
        list.add(new MobileBrandDTO("Nokia", 10000, 4, "Gray"));
        list.add(new MobileBrandDTO("LG", 12000, 6, "Black"));
        list.add(new MobileBrandDTO("Xiaomi", 15000, 8, "Gray"));


        System.out.println("Before Sorting");
        list.forEach(mobile -> System.out.println(mobile));
        System.out.println();

        Collections.sort(list);

        System.out.println("After Sorting");
        list.forEach(mobile -> System.out.println(mobile));
        System.out.println();

    }
}
