package com.ehealthpera.demo.Dto.labDTO;

import com.ehealthpera.demo.enums.LabReportType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LabReportRequestByDoctorDTO {
    private String enrolmentNumber;
    private LabReportType labReportType;
    private String requestedBy;
}
