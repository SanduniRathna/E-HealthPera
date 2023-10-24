package com.ehealthpera.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "chronicDisease")
public class ChronicDisease {
    @Id
    @Column(name = "enrolmentNumber")
    private String enrolmentNumber;
    private boolean diabetesMellitus;
    private boolean bronchialAsthma;
    private boolean mentalIllness;
    private boolean epilepsy;
    private boolean arthritis;
    private boolean heartDiseases;
    private boolean eczema;
    private boolean other;

}
