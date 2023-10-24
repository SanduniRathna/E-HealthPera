package com.ehealthpera.demo.Dto;

import com.ehealthpera.demo.enums.FoodHabits;
import com.ehealthpera.demo.enums.MaritalStatus;
import com.ehealthpera.demo.enums.Nationality;
import com.ehealthpera.demo.enums.Sex;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDTO {
    private String name;
    private String enrolmentNumber;
    private String nationalId;
    private int alIndexNumber;
    private Date birthDate;
    private Sex sex;
    private Nationality nationality;
    private MaritalStatus maritalStatus;
    private String address;
    private String olSchoolName;
    private String alSchoolName;
    private List<String> extraCurricularActivities;
    private FoodHabits foodHabits;
    private String motherOccupation;
    private String fatherOccupation;
    private int numberOfSiblings;
    private boolean hospitalized;
    private boolean undergoneMajorSurgery;
    private boolean chronicDisease;
    private boolean physicalDisability;
    private boolean  havingAllergyToFood;
    private boolean havingAllergyToDrugs;
    private String personToBeEmergency;
    private String emergencyPersonAddress;
    private String emergencyPhoneNumber;
    private boolean wasCovidVaccinate;


}
