package com.xworkz.collectionIntro.runner;

import com.xworkz.collectionIntro.constent.Status;
import com.xworkz.collectionIntro.dto.CategoryDTO;

import java.util.ArrayList;
import java.util.Collection;

public class CategoryRunner {
    public static void main(String[] args) {
        Collection<CategoryDTO> category = new ArrayList<>();

        CategoryDTO categoryDTO = new CategoryDTO(10101,"Electronics","like phone,laptop and other",101, Status.DELIVERED);
        CategoryDTO categoryDTO1 = new CategoryDTO(10102,"Alcohol","like wine,bear and other",102, Status.DELIVERED);

        category.add(categoryDTO);
        category.add(categoryDTO1);
        System.out.println("The catagory size:"+category.size());
        System.out.println();
        System.out.println("The catagory details:"+category);
    }
}
