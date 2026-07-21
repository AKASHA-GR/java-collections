package com.xworkz.mapMethods.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Objects;

@Setter
@Getter
@ToString
public class StudentDTO implements Serializable {

    private int id;
    private String name;
    private int age;
    private String branch;
    private double cgpa;

    public StudentDTO(int id, String name, int age, String branch, double cgpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.branch = branch;
        this.cgpa = cgpa;
    }


    @Override
    public String toString() {
        return "StudentDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", branch='" + branch + '\'' +
                ", cgpa=" + cgpa +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentDTO)) return false;
        StudentDTO that = (StudentDTO) o;
        return id == that.id &&
                age == that.age &&
                Double.compare(that.cgpa, cgpa) == 0 &&
                Objects.equals(name, that.name) &&
                Objects.equals(branch, that.branch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, branch, cgpa);
    }
}
