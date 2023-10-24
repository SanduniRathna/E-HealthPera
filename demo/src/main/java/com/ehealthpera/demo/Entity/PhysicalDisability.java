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
@Table(name = "physicalDisability")
public class PhysicalDisability {
    @Id
    @Column(name = "enrolmentNumber")
    private String enrolmentNumber;

    private String type;
    private boolean requireAnyAssistance;
}
