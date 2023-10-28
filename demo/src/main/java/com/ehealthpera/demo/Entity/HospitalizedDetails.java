package com.ehealthpera.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "hospitalizedDetails")
public class HospitalizedDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hospitalizedDetailsId")
    private Long hospitalizedDetailsId;
    private Date date;
    private String condition;

    @ManyToOne
    @JoinColumn(name = "enrolmentNumber")
    private Student student;

}
