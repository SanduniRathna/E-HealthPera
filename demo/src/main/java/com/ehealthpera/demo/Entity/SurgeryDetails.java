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
@Table(name = "surgeryDetails")
public class SurgeryDetails {
    @Id
    @Column(name = "enrolmentNumber")
    private String enrolmentNumber;

    //private  attach a photocopy of the diagnosis card
}
