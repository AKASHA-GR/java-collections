package com.xworkz.mapMethods.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Objects;

@Setter
@Getter
@ToString
public class CollegeDTO implements Serializable {

    private int collegeId;
    private String collegeName;
    private String city;
    private String university;
    private int establishedYear;


    public CollegeDTO(int collegeId, String collegeName, String city,
                      String university, int establishedYear) {
        this.collegeId = collegeId;
        this.collegeName = collegeName;
        this.city = city;
        this.university = university;
        this.establishedYear = establishedYear;
    }

    @Override
    public String toString() {
        return "CollegeDTO{" +
                "collegeId=" + collegeId +
                ", collegeName='" + collegeName + '\'' +
                ", city='" + city + '\'' +
                ", university='" + university + '\'' +
                ", establishedYear=" + establishedYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CollegeDTO)) return false;
        CollegeDTO that = (CollegeDTO) o;
        return collegeId == that.collegeId &&
                establishedYear == that.establishedYear &&
                Objects.equals(collegeName, that.collegeName) &&
                Objects.equals(city, that.city) &&
                Objects.equals(university, that.university);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collegeId, collegeName, city, university, establishedYear);
    }
}
