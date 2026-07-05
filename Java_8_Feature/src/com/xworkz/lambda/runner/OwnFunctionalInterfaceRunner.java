package com.xworkz.lambda.runner;

import com.xworkz.lambda.own.*;
import com.xworkz.lambda.own01.*;

import java.awt.*;

public class OwnFunctionalInterfaceRunner {
    public static void main(String[] args) {

        StartEngine startEngine = () -> System.out.println("Car Engine Started");
        startEngine.start();
        System.out.println("==================================================");

        StopFan stopFan = () -> System.out.println("The Fan Stopped");
        stopFan.stop();
        System.out.println("==================================================");

        CalculateGST calculateGST = (amount) -> amount * 0.18;
        System.out.println("GST:"+calculateGST.calculate(15000));
        System.out.println("===================================================");

        ValidMarriage validMarriage = (maleAge, femaleAge) -> femaleAge >= 18 && maleAge >= 21;
        System.out.println("The male and female age is valid:"+validMarriage.eligible(25,22));
        System.out.println("====================================================");

        StudentGrade studentGrade = (marks) -> marks >= 90? 'A':'B';
        System.out.println("The student Grade:"+studentGrade.grade(88));
        System.out.println("====================================================");

        EmployeeBonus employeeBonus = (salary) -> salary * 0.20;
        System.out.println("Employee Bonus:"+employeeBonus.bonus(50000));
        System.out.println("====================================================");

        AddNumbers addNumbers = (a,b) -> a + b;
        System.out.println("Add numbers:"+addNumbers.add(23,77));
        System.out.println("====================================================");

        MultiplyNumbers multiplyNumbers = (a, b) -> a * b;
        System.out.println("Multiply Numbers:"+multiplyNumbers.multiply(10,20));
        System.out.println("====================================================");

        Divide divide = (a,b) -> a/b;
        System.out.println("Divide numbers:"+divide.divide(77,3));
        System.out.println("====================================================");

        CircleArea circleArea = radius -> 3.14*radius*radius;
        System.out.println("Circle Area:" +circleArea.area(5));
        System.out.println("====================================================");

        RectangleArea rectangleArea = (l,w) -> l * w;
        System.out.println("The RectangleArea:"+rectangleArea.area(5,4));
        System.out.println("=====================================================");

        BankInterest bankInterest = (p,r,t) -> (p*r*t)/100;
        System.out.println("The Bank Interest:"+bankInterest.interest(30000,3.8,2));
        System.out.println("=====================================================");

        CelsiusToFahrenheit celsiusToFahrenheit = (c) -> (c*9/5)+32;
        System.out.println("the CelsiusToFahrenheit:"+celsiusToFahrenheit.convert(32));
        System.out.println("======================================================");

        Login login = (u, p) -> u.equals("admin") && p.equals("123");
        System.out.println("The username and password is correct:"+login.validate("admin","123"));
        System.out.println("======================================================");

        Greeting greeting = name -> "Welcome " +name;
        System.out.println("The Greeting:"+greeting.greet("Akasha"));
        System.out.println("======================================================");

        Reverse reverse = s -> new StringBuilder(s).reverse().toString();
        System.out.println("The Revers String:"+reverse.reverse("AMMA"));
        System.out.println("======================================================");

        StringLength stringLength = (s) -> s.length();
        System.out.println("The StringLength:"+stringLength.length("I am learning functional interface."));
        System.out.println("=======================================================");

        FirstCharacter firstCharacter = (s) -> s.charAt(0);
        System.out.println("The first Character:"+firstCharacter.first("Akaza"));
        System.out.println("=======================================================");

        LastCharacter lastCharacter = (s) -> s.charAt(s.length() - 1);
        System.out.println("The last Character:" +lastCharacter.last("Money"));
        System.out.println("=======================================================");

        EvenNumber evenNumber = (n) -> n%2 == 0;
        System.out.println("It is even number:"+evenNumber.check(57));
        System.out.println("=======================================================");

        OddNumber oddNumber = (n) -> n%2!= 0;
        System.out.println("It is odd number:"+oddNumber.check(57));
        System.out.println("========================================================");

        MaxNum maxNum = (a, b) -> Math.max(a,b);
        System.out.println("The Maximum Number:"+maxNum.max(10,20));
        System.out.println("========================================================");

        MinNum minNum = (a,b) -> Math.min(a,b);
        System.out.println("The Minimum Number:"+minNum.min(10,20));
        System.out.println("========================================================");

        Square square = (n) -> n * n;
        System.out.println("The square of 7:"+square.square(7));
        System.out.println("=======================================================");

        Cube cube = (n) -> n*n*n;
        System.out.println("Teh Cube of 7:"+cube.cube(7));
        System.out.println("=======================================================");

        











        System.out.println("====================================================================\n" +
                "====================================================================\n" +
                "====================================================================\n");

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

        System.out.println("-----------------------------------");

        TV tv = (name) -> System.out.println("The chanle name: " +name);
        tv.playChanle("TV9");
        System.out.println("-----------------------------------");

        Cycle cycle = () -> System.out.println("The cycle is used to transport the small things.");
        cycle.transport();
        System.out.println("------------------------------------");

        Slipper slipper = () -> System.out.println("The slipper protect the human feet.");
        slipper.feetProtection();
        System.out.println("-------------------------------------");

        Door door = () -> System.out.println("The door is open");
        door.open();


    }
}
