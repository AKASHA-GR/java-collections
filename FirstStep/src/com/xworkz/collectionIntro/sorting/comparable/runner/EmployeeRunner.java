package com.xworkz.collectionIntro.sorting.comparable.runner;

import com.xworkz.collectionIntro.sorting.comparable.dto.EmployeeSalary;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeRunner {
    public static void main(String[] args) {

        List<EmployeeSalary> list = new ArrayList<>();


        list.add(new EmployeeSalary(1, "Ram", 6000, "IT"));
        list.add(new EmployeeSalary(2, "Shyam", 5000, "HR"));
        list.add(new EmployeeSalary(3, "Bharat", 4000, "Marketing"));
        list.add(new EmployeeSalary(4, "Ravi", 3000, "Admin"));
        list.add(new EmployeeSalary(5, "Rohit", 2000, "Sales"));
        list.add(new EmployeeSalary(6, "Rahul", 1500, "Sales"));
        list.add(new EmployeeSalary(7, "Rahul", 1000, "Admin"));
        list.add(new EmployeeSalary(8, "Karan", 12000,  "Sales"));
        list.add(new EmployeeSalary(9, "Hari", 9000, "IT"));
        list.add(new EmployeeSalary(10, "Vijay", 7000, "Admin"));


        System.out.println("Before Sorting");
        list.forEach(employee -> System.out.println(employee));
        System.out.println();

        //descending order
        Collections.sort(list);

        System.out.println("After Sorting");
        list.forEach(employee -> System.out.println(employee));
        System.out.println();



    }
}
