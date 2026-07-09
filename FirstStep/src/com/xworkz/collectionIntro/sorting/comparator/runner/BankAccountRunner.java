package com.xworkz.collectionIntro.sorting.comparator.runner;

import com.xworkz.collectionIntro.sorting.comparator.dto.BankAccountDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankAccountRunner {
    public static void main(String[] args) {

        List<BankAccountDTO> list = new ArrayList<>();


        BankAccountDTO bankAccountDTO1 = new BankAccountDTO(123456789, "John Doe", 1000.00);
        BankAccountDTO bankAccountDTO2 = new BankAccountDTO(987654321, "Jane Smith", 2000.00);
        BankAccountDTO bankAccountDTO3 = new BankAccountDTO(543216789, "Mike Johnson", 500.00);
        BankAccountDTO bankAccountDTO4 = new BankAccountDTO(321654987, "Sarah Williams", 800.00);
        BankAccountDTO bankAccountDTO5 = new BankAccountDTO(789456123, "Bob Brown", 1500.00);
        BankAccountDTO bankAccountDTO6 = new BankAccountDTO(654321098, "Alice Green", 2500.00);
        BankAccountDTO bankAccountDTO7 = new BankAccountDTO(432198765, "David Wilson", 3000.00);
        BankAccountDTO bankAccountDTO8 = new BankAccountDTO(210987654, "Emily Davis", 1200.00);
        BankAccountDTO bankAccountDTO9 = new BankAccountDTO(876543210, "Daniel Anderson", 1800.00);
        BankAccountDTO bankAccountDTO10 = new BankAccountDTO(765432109, "Olivia Johnson", 200.00);
        BankAccountDTO bankAccountDTO11 = new BankAccountDTO(654321098, "Noah Thompson", 3500.00);
        BankAccountDTO bankAccountDTO12 = new BankAccountDTO(543210987, "Ava Martin", 100.00);

        list.add(bankAccountDTO1);
        list.add(bankAccountDTO2);
        list.add(bankAccountDTO3);
        list.add(bankAccountDTO4);
        list.add(bankAccountDTO5);
        list.add(bankAccountDTO6);
        list.add(bankAccountDTO7);
        list.add(bankAccountDTO8);
        list.add(bankAccountDTO9);
        list.add(bankAccountDTO10);
        list.add(bankAccountDTO11);
        list.add(bankAccountDTO12);

        Collections.sort(list, (o1, o2) -> Double.compare(o1.getBalance(), o2.getBalance()));

        System.out.println("After Sorting by Balance");
        list.forEach(bankAccount -> System.out.println(bankAccount));
        System.out.println();

        Collections.sort(list, (o1, o2) -> o1.getHolderName().compareTo(o2.getHolderName()));

        System.out.println("After Sorting by Holder Name");
        list.forEach(bankAccount -> System.out.println(bankAccount));
        System.out.println();

        Collections.sort(list, (o1, o2) -> Long.compare(o1.getAccountNumber(), o2.getAccountNumber()));

        System.out.println("After Sorting by Account Number");
        list.forEach(bankAccount -> System.out.println(bankAccount));
        System.out.println();

    }
}
