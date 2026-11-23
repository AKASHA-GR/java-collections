package com.xworkz.loops;

import javax.jws.soap.SOAPBinding;

public class DivisibleBy3And5 {
    public static void main(String[] args) {

        int count = 0;
        int sum = 0;
        int[] arr = new int[100];

        for(int i = 0;i <= 100;i++){
            if(i % 3 == 0 && i % 5 == 0) {
                if(i != 0){
                    arr[count++] = i;
                    sum += i;
                }
            }
        }

        System.out.print("The numbers:");
        for(int num:arr){
            if(num != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\n"+ "The count of the divisible number:"+count);
        System.out.println("The sum of the divisible number:"+sum);


    }
}
