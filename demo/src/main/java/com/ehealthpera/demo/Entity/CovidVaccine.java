package com.ehealthpera.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "covidVaccine")
public class CovidVaccine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "covidVaccineId")
    private Long covidVaccineId;

    private int dose;
    private String vaccineName;
    private Date dateOfVaccination;

    @ManyToOne
    @JoinColumn(name = "enrolmentNumber")
    private Student student;

}
