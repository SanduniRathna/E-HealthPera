package com.ehealthpera.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "chronicDisease")
public class ChronicDisease {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chronicDiseaseId")
    private Long chronicDiseaseId;
    private boolean diabetesMellitus;
    private boolean bronchialAsthma;
    private boolean mentalIllness;
    private boolean epilepsy;
    private boolean arthritis;
    private boolean heartDiseases;
    private boolean eczema;
    private List<String> other;

}
