package com.xworkz.collectionIntro.add.runner;

import com.xworkz.collectionIntro.add.dto.DiscountDTO;

import java.util.ArrayList;
import java.util.Collection;

public class DiscountRunner {
    public static void main(String[] args) {
        Collection<DiscountDTO> discountDTOS = new ArrayList<>();

        DiscountDTO discountDTO = new DiscountDTO(4401,"SBVKABFVA","Special Customer","20%","02/24/2027");
        DiscountDTO discountDTO1 = new DiscountDTO(4402,"BIREVBAK","Special Customer","15%","01/03/2027");

        discountDTOS.add(discountDTO);
        discountDTOS.add(discountDTO1);
        System.out.println("The Discount details:"+ discountDTOS.size());
        System.out.println("The Discount details:"+ discountDTOS);
    }
}
