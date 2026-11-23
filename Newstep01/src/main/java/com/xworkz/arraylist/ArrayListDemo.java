package com.xworkz.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        List<String> lists = new ArrayList<>();
        lists.add("chanakesawa");
        lists.add("giri_Reddy");
        lists.add("sardar_vallabhai_patel");

        for (String str : lists){
            System.out.println(str);
        }
        System.out.println();

        Iterator<String> it = lists.iterator();

        while (it.hasNext()){
            String data = it.next();

            if(data.equals("giri_Reddy")){
                it.remove();
            }

        }
        System.out.println(lists);
    }
}
