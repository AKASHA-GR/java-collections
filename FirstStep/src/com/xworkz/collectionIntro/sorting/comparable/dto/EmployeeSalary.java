package com.xworkz.collectionIntro.sorting.comparable.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class EmployeeSalary implements Serializable,Comparable<EmployeeSalary> {
    private int id;
    private String name;
    private int salary;
    private String department;




    @Override
    public int compareTo(EmployeeSalary o) {
        return Double.compare(o.salary, this.salary);
    }
}
