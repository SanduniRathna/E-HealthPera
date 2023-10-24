package com.ehealthpera.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    @Column(name = "enrolmentNumber")
    private String enrolmentNumber;

    private int dose;
    private String vaccineName;
    private Date dateOfVaccination;

}
