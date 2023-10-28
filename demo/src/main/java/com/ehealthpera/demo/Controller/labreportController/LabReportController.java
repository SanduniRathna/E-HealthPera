package com.ehealthpera.demo.Controller.labreportController;

import com.ehealthpera.demo.Dto.labDTO.LabReportDTO;
import com.ehealthpera.demo.Dto.labDTO.LabReportRequestByDoctorDTO;
import com.ehealthpera.demo.Entity.laboratoryEntity.LabReport;
import com.ehealthpera.demo.Service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/lab")
@CrossOrigin
public class LabReportController {
    @Autowired
    private LabService labService;

    /* About student Lob report details*/

    //Create request for lab report
    @PostMapping("lab-report-request")
    private String sendLabReportRequest(LabReportRequestByDoctorDTO labReportRequestByDoctorDTO){
        return labService.sendLabReportRequest(labReportRequestByDoctorDTO);
    }

    //Create a lab report
    @PostMapping("create-lab-report")
    private String createLabReport(@RequestBody LabReportDTO labReportDTO){
        return labService.createLabReport(labReportDTO);
    }

    //Get lab reports

    //get latest lab report


}
