package com.xworkz.arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 15, 30, 45, 60, 75, 90};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int num:arr){
            if(num > largest){
                largest = num;
            }
        }

        for(int num:arr){
            if(num > secondLargest && num != largest){
                secondLargest = num;
            }
        }


        System.out.println(secondLargest);
    }
}
