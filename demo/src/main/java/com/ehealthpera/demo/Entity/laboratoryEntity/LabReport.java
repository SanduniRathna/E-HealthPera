package com.ehealthpera.demo.Entity.laboratoryEntity;

import com.ehealthpera.demo.Entity.Student;
import com.ehealthpera.demo.enums.LabReportType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "labReports")
public class LabReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "labReportsId")
    private Long labReportsId;

    private String labNumber;
    private String enrolmentNumber;
    private LocalDateTime createTime;
    private LocalDate createDate;
    private String requestedBy;
    @Lob
    private byte[] reportFile;
    private LabReportType labReportType;

    /*@ManyToOne
    @JoinColumn(name = "enrolmentNumber")
    private Student student;*/
}
