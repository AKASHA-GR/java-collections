package com.xworkz.collectionIntro.sorting.comparable.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class BookPagesDTO implements Serializable,Comparable<BookPagesDTO>{

    private int pages;
    private String name;
    private int price;
    private double discount;
    private String author;

    @Override
    public int compareTo(BookPagesDTO o) {
        return this.price - o.price;
    }
}
