package com.ehealthpera.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="ifMotherDead")
public class IfMotherDead {
    @Id
    @Column(name = "ifMotherDeadId",nullable = false)
    private String ifMotherDeadId;
    @Column(name = "reason")
    private String reason;

    @OneToOne
    @JoinColumn(name = "enrolmentNumber")
    private Student student;
}
