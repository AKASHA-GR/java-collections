package com.xworkz.dsa;

public class Anagram {
    public static void main(String[] args) {
        String first = "listen".toLowerCase().trim();
        String second = "silent".toLowerCase().trim();


        if(first.length() != second.length()){
            System.out.println("Not Anagrams");
            return;
        }

        int[] alp = new int[26];

        for(int i=0;i<first.length();i++){
            alp[first.charAt(i) - 'a']++;
            alp[second.charAt(i) - 'a']--;
        }

        for(int num:alp){
            if(num != 0){
                System.out.println("Not Anagrams");
            }
        }


        System.out.println("Anagrams");

    }
}
