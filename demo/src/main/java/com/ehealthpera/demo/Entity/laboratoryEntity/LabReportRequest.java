package com.ehealthpera.demo.Entity.laboratoryEntity;

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
@Table(name = "labReportRequest")
public class LabReportRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "labReportRequestId")
    private Long labReportRequestId;
    private String enrolmentNumber;
    private LabReportType labReportType;
    private String requestedBy;
    private LocalDateTime createTime;
    private LocalDate createDate;
    private boolean sendReport;
    private LocalDateTime doneTime;
    private LocalDate doneDate;

}

