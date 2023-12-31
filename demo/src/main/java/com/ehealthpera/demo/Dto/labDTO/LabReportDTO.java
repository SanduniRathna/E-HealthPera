package com.ehealthpera.demo.Dto.labDTO;

import com.ehealthpera.demo.enums.LabReportType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LabReportDTO {
    private String labNumber;
    private String enrolmentNumber;
    private String requestedBy;
    private byte[] reportFile;
    private LabReportType labReportType;
}
