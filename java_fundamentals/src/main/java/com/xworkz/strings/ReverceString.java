package com.xworkz.strings;

public class ReverceString {
    public static void main(String[] args) {
        String str = "Akasha";
        String rev = "";

        for(int i=str.length() - 1;i >= 0;i--){
            rev += str.charAt(i);
        }

        System.out.println(rev);
    }
}
