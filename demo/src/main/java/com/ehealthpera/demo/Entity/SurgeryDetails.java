package com.ehealthpera.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "surgeryDetails")
public class SurgeryDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "surgeryDetailsId")
    private long surgeryDetailsId;
    private String details;

    //private  attach a photocopy of the diagnosis card

    @ManyToOne
    @JoinColumn(name = "enrolmentNumber")
    private Student student;
}
