package com.xworkz.collectionIntro.runner;

import com.xworkz.collectionIntro.dto.InventoryDTO;

import java.util.ArrayList;
import java.util.Collection;

public class InventoryRunner {
    public static void main(String[] args) {
        Collection<InventoryDTO> inventory = new ArrayList<>();

        InventoryDTO inventoryDTO = new InventoryDTO(33331,"Akasha","Chitradurga",250,"ShopBox");
        InventoryDTO inventoryDTO1 = new InventoryDTO(33332,"Raghu","Mysuru",150,"MeeraOil");

        inventory.add(inventoryDTO);
        inventory.add(inventoryDTO1);
        System.out.println("Inventry details:"+inventory.size());
        System.out.println();
        System.out.println("Inventry details:"+inventory);
    }
}
