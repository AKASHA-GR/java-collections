package com.xworkz.collectionIntro.add.runner;

import com.xworkz.collectionIntro.add.constant.Status;
import com.xworkz.collectionIntro.add.dto.CategoryDTO;

import java.util.ArrayList;
import java.util.Collection;

public class CategoryRunner {
    public static void main(String[] args) {
        Collection<CategoryDTO> categoryDTOS = new ArrayList<>();

        CategoryDTO categoryDTO = new CategoryDTO(10101,"Electronics","like phone,laptop and other",101, Status.DELIVERED);
        CategoryDTO categoryDTO1 = new CategoryDTO(10102,"Alcohol","like wine,bear and other",102, Status.DELIVERED);

        categoryDTOS.add(categoryDTO);
        categoryDTOS.add(categoryDTO1);
        System.out.println("The catagory size:"+ categoryDTOS.size());
        System.out.println();
        System.out.println("The catagory details:"+ categoryDTOS);
    }
}
