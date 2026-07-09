package com.xworkz.collectionIntro.sorting.comparator.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Comparator;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class BankAccountDTO implements Serializable, Comparator<BankAccountDTO> {

    private long accountNumber;
    private String holderName;
    private double balance;


    @Override
    public int compare(BankAccountDTO o1, BankAccountDTO o2) {
        return 0;
    }
}
