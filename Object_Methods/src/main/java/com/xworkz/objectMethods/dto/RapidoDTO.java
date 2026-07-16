package com.xworkz.objectMethods.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Setter
@Getter
@AllArgsConstructor
public class RapidoDTO implements Serializable, Cloneable {

    private String Name;
    private String Id;
    private String Email;
    private String Phone;
    private String Address;

    @Override
    public Object clone() {
        try {
            return (RapidoDTO)super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RapidoDTO rapidoDTO = (RapidoDTO) o;
        return Objects.equals(Name, rapidoDTO.Name) && Objects.equals(Id, rapidoDTO.Id) && Objects.equals(Email, rapidoDTO.Email) && Objects.equals(Phone, rapidoDTO.Phone) && Objects.equals(Address, rapidoDTO.Address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Id, Email, Phone, Address);
    }

    @Override
    public String toString() {
        return "RapidoDTO{" +
                "Name='" + Name + '\'' +
                ", Id='" + Id + '\'' +
                ", Email='" + Email + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
