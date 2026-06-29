package com.xworkz.collectionIntro.runner;

import com.xworkz.collectionIntro.dto.CustomerDTO;

import java.util.ArrayList;
import java.util.Collection;

public class CustomerRunner {
    public static void main(String[] args){
        Collection<CustomerDTO> customerDTOS = new ArrayList<>();

        CustomerDTO customerDTO = new CustomerDTO(101,"Nagaprajwal","naga@gmail.com",5987356787L,"Hiriyur");
        CustomerDTO customerDTO1 = new CustomerDTO(102,"Akasha","akashmlk2021@gmail.com",5687659267L,"Chitradurga");
        CustomerDTO customerDTO2 = new CustomerDTO(103,"Harish","harish@gmail.com",5667484326L,"Tumkur");
        CustomerDTO customerDTO3 = new CustomerDTO(103,"Hemanth","hemanth@gmail.com",8383744374L,"Davangere");
        CustomerDTO customerDTO4 = new CustomerDTO(103,"Pratheek","pratheek@gmail.com",7346574482L,"Mangaluru");

        customerDTOS.add(customerDTO);
        customerDTOS.add(customerDTO1);
        customerDTOS.add(customerDTO2);
        customerDTOS.add(customerDTO3);
        customerDTOS.add(customerDTO4);
        System.out.println("The customer list:"+ customerDTOS.size());
        System.out.println();
        System.out.println("The customer list:"+ customerDTOS);

    }
}
