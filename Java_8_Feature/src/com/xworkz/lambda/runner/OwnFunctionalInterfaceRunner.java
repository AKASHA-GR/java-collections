package com.xworkz.lambda.runner;

import com.xworkz.lambda.own.*;

public class OwnFunctionalInterfaceRunner {
    public static void main(String[] args) {

        Bangle bangle = (shape) -> System.out.println("The shape of bangle is: "+shape);
        bangle.role("Circle");
        System.out.println("------------------------------");


        Glucose glucose = () -> System.out.println("The price glucose is 10 Rupees.");
        glucose.energy();
        System.out.println("--------------------------------");

        WashingMachine washingMachine = (cloth) -> System.out.println("The washingMachine clean the cloths like:"+cloth);
        washingMachine.rotate("cotton,silk,fabric");
        System.out.println("---------------------------------");

        Metro metro = (x) -> x*6;
        System.out.println("The distance price:"+metro.getPrice(10));
        System.out.println("----------------------------------");

        Electricity electricity = (units) -> units * 9;
        System.out.println("The Electricity bill is:"+electricity.getPriceByUnit(57));
        System.out.println("----------------------------------");

        Vote vote = (age) -> age > 18;
        System.out.println("He is have vote power:"+ vote.varifyByAge(19));
        System.out.println("-----------------------------------");


        Bike bike = () -> {
            return new String[]{"Honda", "Yamaha", "KTM"};
        };

        String[] bikes = bike.getName();

        for (String b : bikes) {
            System.out.println(b);
        }

        System.out.println("------------------------------------");

    }
}
