package com.ehealthpera.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "siblings")
public class Siblings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "siblingsId")
    private long siblingsId;
    private String siblingsName;
    private int siblingsAge;

    @ManyToOne
    @JoinColumn(name = "studentEnrolmentNumber")
    private Student student;
}
