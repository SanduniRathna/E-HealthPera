package com.ehealthpera.demo.Entity;

import com.ehealthpera.demo.Entity.medicineEntity.MedicineRecord;
import com.ehealthpera.demo.enums.FoodHabits;
import com.ehealthpera.demo.enums.MaritalStatus;
import com.ehealthpera.demo.enums.Nationality;
import com.ehealthpera.demo.enums.Sex;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="student")
public class Student {
    @Column(name = "name")
    private String name;
    @Id
    @Column(name = "enrolmentNumber",nullable = false)
    private String enrolmentNumber;
    @Column(name = "nationalId",nullable = false)
    private String nationalId;
    @Column(name = "alIndexNumber",nullable = false)
    private int alIndexNumber;
    @Column(name="birthDate")
    private Date birthDate;
    @Column(name = "sex")
    private Sex sex;
    @Column(name = "nationality")
    private Nationality nationality;
    @Column(name = "maritalStatus")
    private MaritalStatus maritalStatus;
    @Column(name = "address")
    private String address;
    @Column(name = "olSchoolName")
    private String olSchoolName;
    @Column(name = "alSchoolName")
    private String alSchoolName;
    @Column(name = "extraCurricularActivities")
    private List<String> extraCurricularActivities;
    @Column(name = "foodHabits")
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
    private boolean wasMotherDead;
    private boolean wasFatherDead;

    //get siblings details
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<Siblings> siblings;

    //get physical disability details
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<PhysicalDisability> physicalDisabilityList;

    //get chronic disease details
    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private ChronicDisease chronicDiseaseList;

    //get covid vaccination details
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<CovidVaccine> covidVaccineList;

    //get drug allergy details
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<DrugAllergy> drugAllergyList;

    //get food allergy details
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<FoodAllergy> foodAllergyList;

    //get surgery details
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<SurgeryDetails> surgeryDetailsList;

    //get hospitalized details
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<HospitalizedDetails> hospitalizedDetailsList;

    //when mother or father dead get details
    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private IfFatherDead ifFatherDead;
    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private IfMotherDead ifMotherDead;

    //create medicine record
    @OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
    private List<MedicineRecord> medicineRecordList;

}
