package com.ehealthpera.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "physicalDisability")
public class PhysicalDisability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long physicalDisabilityId;

    private String type;
    private String requireAnyAssistance;

    @ManyToOne
    @JoinColumn(name = "enrolmentNumber")
    private Student student;
}
