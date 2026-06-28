package com.xworkz.collectionIntro.runner;

import com.xworkz.collectionIntro.dto.DiscountDTO;

import java.util.ArrayList;
import java.util.Collection;

public class DiscountRunner {
    public static void main(String[] args) {
        Collection<DiscountDTO> discount = new ArrayList<>();

        DiscountDTO discountDTO = new DiscountDTO(4401,"SBVKABFVA","Special Customer","20%","02/24/2027");
        DiscountDTO discountDTO1 = new DiscountDTO(4402,"BIREVBAK","Special Customer","15%","01/03/2027");

        discount.add(discountDTO);
        discount.add(discountDTO1);
        System.out.println("The Discount details:"+discount.size());
        System.out.println("The Discount details:"+discount);
    }
}
