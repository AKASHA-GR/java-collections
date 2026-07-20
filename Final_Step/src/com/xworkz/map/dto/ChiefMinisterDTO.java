package com.xworkz.map.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@AllArgsConstructor
@Getter
@ToString
public class ChiefMinisterDTO implements Serializable {
    private String name;
    private int age;
    private String party;
}
