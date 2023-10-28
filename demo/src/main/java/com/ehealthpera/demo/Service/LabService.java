package com.ehealthpera.demo.Service;

import com.ehealthpera.demo.Dto.labDTO.LabReportDTO;
import com.ehealthpera.demo.Dto.labDTO.LabReportRequestByDoctorDTO;
import com.ehealthpera.demo.Entity.laboratoryEntity.LabReport;

public interface LabService {
    String sendLabReportRequest(LabReportRequestByDoctorDTO labReportRequestByDoctorDTO);

    String createLabReport(LabReportDTO labReportDTO);
}
