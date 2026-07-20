package com.xworkz.map.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;


@ToString
@Getter
@Setter
@AllArgsConstructor
public class StateDTO implements Serializable {
    private String name;
    private String capital;
    private long population;
}
