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
@Table(name = "foodAllergy")
public class FoodAllergy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "foodAllergyId")
    private Long foodAllergyId;

    private List<String> allergyFoodsName;

    @ManyToOne
    @JoinColumn(name = "enrolmentNumber")
    private Student student;

}
