package com.xworkz.collectionIntro.sorting.simple.runner;

import com.xworkz.collectionIntro.sorting.simple.dto.MenuDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MenuRunner {
    public static void main(String[] args) {
        List<MenuDTO> menus = new ArrayList<>();

        menus.add(new MenuDTO("Pizza", 250, true, 10));
        menus.add(new MenuDTO("Burger", 180, false, 5));
        menus.add(new MenuDTO("Dosa", 80, true, 15));
        menus.add(new MenuDTO("Biryani", 220, false, 20));
        menus.add(new MenuDTO("idli",60,true,10));

        System.out.println("Before Sorting");
        menus.forEach(MenuDTO -> System.out.println(MenuDTO));

        Collections.sort(menus);

        System.out.println("\nAfter Sorting");
        menus.forEach(MenuDTO -> System.out.println(MenuDTO));
    }
}
