package com.ehealthpera.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "drugAllergy")
public class DrugAllergy {
    @Id
    @Column(name = "enrolmentNumber")
    private String enrolmentNumber;

    private List<String> allergyDrugsName;
}
