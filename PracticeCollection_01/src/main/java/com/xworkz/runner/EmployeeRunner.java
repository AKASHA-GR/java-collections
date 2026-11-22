package com.xworkz.runner;

import com.xworkz.dto.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeRunner {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(11,"Akasha","IT",12000,24));
        employees.add(new Employee(12,"Ravi","HR",15000,30));
        employees.add(new Employee(13,"Sita","Finance",18000,28));
        employees.add(new Employee(14,"Ramesh","IT",22000,35));
        employees.add(new Employee(15,"Geeta","HR",25000,32));
        employees.add(new Employee(16,"Kiran","Finance",20000,29));
        employees.add(new Employee(17,"Anil","IT",30000,40));
        employees.add(new Employee(18,"Sunita","HR",28000,27));
        employees.add(new Employee(19,"Vikram","Finance",35000,38));
        employees.add(new Employee(20,"Priya","IT",40000,26));


        employees.stream()
                .forEach(employee -> System.out.println(employee));




        System.out.println("\nEmployees with salary greater than 20000:");
        employees.stream()
                .filter(employee -> employee.getSalary() > 20000)
                .forEach(employee -> System.out.println(employee));

        System.out.println("\nEmployees in IT department:");
        employees.stream()
                .filter(employee -> employee.getDepartment().equals("IT"))
                .forEach(employee -> System.out.println(employee));

        System.out.println("\nEmployee with the highest salary:");
        employees.stream()
                .max(Comparator.comparing(employee -> employee.getSalary()))
                .ifPresent(employee -> System.out.println(employee));


        System.out.println("\nFind the employee with the lowest salary.");
        Optional<Employee> employeeLS = employees.stream().min(Comparator.comparing(employee -> employee.getSalary()));
        System.out.println(employeeLS);

        System.out.println("\nSort employees by salary in ascending order");
        employees.stream()
                .sorted(Comparator.comparing(employee -> employee.getSalary()))
                .toList()
                .forEach(employee -> System.out.println(employee));

        System.out.println("\nSort employees by salary in descending order");
        employees.stream()
                .sorted(Comparator.comparing(employee -> employee.getSalary()))
                .toList().reversed()
                .forEach(employee -> System.out.println(employee));

        System.out.println("\nGet only employee names");
        employees.stream()
                .map(employee -> employee.getName())
                .forEach(employee -> System.out.println(employee));

        System.out.println("\nCount the number of employees in the \"IT\" department.");
        long employeeCont = employees.stream()
                .filter(employee -> employee.getDepartment().contains("IT"))
                .count();

        System.out.println(employeeCont);


        System.out.println("\nCalculate the average salary.");
        employees.stream()
                .mapToDouble(employee -> employee.getSalary())
                .average()
                .ifPresent(avg -> System.out.println("Average salary: " + avg));

        System.out.println("\nFind employees whose age is between 25 and 30.");
        employees.stream()
                .filter(employee -> employee.getAge() >25 && employee.getAge() < 30)
                .forEach(employee -> System.out.println(employee));


        System.out.println("\n Group employees by department");
        employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getDepartment()))
                .forEach((department, empList) -> {
                    System.out.println(department + ": " + empList);
                });

        System.out.println("\nFind the highest-paid employee in each department.");
//        employees.stream()
//                .collect(Collectors.groupingBy(employee -> employee.getDepartment(),Collectors.maxBy(Comparator.comparing(employee -> employee.getSalary()))))
//                        .forEach((department,employee) -> {
//                            employee.ifPresent(employee1 -> System.out.println(department+ ": "+employee1));
//                        });

        Map<String,Optional<Employee>> highPaid = employees.stream()
                        .collect(Collectors.groupingBy(employee -> employee.getDepartment(),Collectors.maxBy(Comparator.comparing(employee -> employee.getSalary()))));


        highPaid.forEach((department,employee) -> {
            System.out.println(department+": "+employee.get());
        });


        System.out.println("\n Calculate total salary paid by each department.");
        Map<String,Double> totleSalaryByDepartment = employees.stream()
                        .collect(Collectors.groupingBy(employee -> employee.getDepartment(),Collectors.summingDouble(employee -> employee.getSalary())));

        totleSalaryByDepartment.forEach((department,totleSalary) -> {
            System.out.println(department+": "+totleSalary);
        });

        System.out.println("\nFind duplicate department names.");
        Set<String> duplicateDepartments = employees.stream()
                .collect(Collectors.groupingBy(employee -> employee.getDepartment(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toSet());

        System.out.println(duplicateDepartments);







    }
}
