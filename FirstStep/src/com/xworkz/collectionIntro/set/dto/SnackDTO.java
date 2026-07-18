package com.xworkz.collectionIntro.set.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Objects;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class SnackDTO implements Serializable,Comparable<SnackDTO> {
    private String name;
    private String flavor;
    private double weight;
    private double price;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof SnackDTO)) return false;
        SnackDTO snackDTO = (SnackDTO) obj;
        return this.name.equals(snackDTO.name) &&
                this.flavor.equals(snackDTO.flavor) &&
                this.weight == snackDTO.weight &&
                this.price == snackDTO.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, flavor,weight,price);
    }

    @Override
    public int compareTo(SnackDTO o) {
        return this.name.compareTo(o.name);
    }
}

