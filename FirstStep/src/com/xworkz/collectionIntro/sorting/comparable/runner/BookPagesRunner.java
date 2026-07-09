package com.xworkz.collectionIntro.sorting.comparable.runner;

import com.xworkz.collectionIntro.sorting.comparable.dto.BookPagesDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookPagesRunner {
    public static void main(String[] args) {

        List<BookPagesDTO> list = new ArrayList<>();


        list.add(new BookPagesDTO(100, "To Kill a Mockingbird", 259, 10.99, "Harper Lee"));
        list.add(new BookPagesDTO(101, "The Great Gatsby", 236, 7.99, "F. Scott Fitzgerald"));
        list.add(new BookPagesDTO(102, "The Catcher in the Rye", 234, 7.99, "J.D. Salinger"));
        list.add(new BookPagesDTO(103, "The Alchemist", 194, 8.99, "Paulo Coelho"));
        list.add(new BookPagesDTO(104, "Pride and Prejudice", 348, 12.99, "Jane Austen"));
        list.add(new BookPagesDTO(105, "The Lord of the Rings", 576, 15.99, "J.R.R. Tolkien"));
        list.add(new BookPagesDTO(106, "The Hobbit", 296, 9.99, "J.R.R. Tolkien"));
        list.add(new BookPagesDTO(107, "The Hitchhiker's Guide to the Galaxy", 256, 12.99, "Douglas Adams"));
        list.add(new BookPagesDTO(108, "Harry Potter and the Sorcerer's Stone", 304, 12.99, "J.K. Rowling"));
        list.add(new BookPagesDTO(109, "The Silmarillion", 480, 19.99, "J.R.R. Tolkien"));


        System.out.println("Before Sorting");
        list.forEach(book -> System.out.println(book));
        System.out.println();

        Collections.sort(list);

        System.out.println("After Sorting");
        list.forEach(book -> System.out.println(book));
        System.out.println();

    }
}
