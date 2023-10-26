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
@Table(name="ifMotherDead")
public class IfMotherDead {
    @Id
    @Column(name = "enrolmentNumber",nullable = false)
    private String enrolmentNumber;
    @Column(name = "reason")
    private String reason;
}