package com.ehealthpera.demo.Service.impl;

import com.ehealthpera.demo.Dto.labDTO.LabReportDTO;
import com.ehealthpera.demo.Dto.labDTO.LabReportRequestByDoctorDTO;
import com.ehealthpera.demo.Entity.laboratoryEntity.LabReport;
import com.ehealthpera.demo.Entity.laboratoryEntity.LabReportRequest;
import com.ehealthpera.demo.Repository.LabReportRepo;
import com.ehealthpera.demo.Repository.LabReportRequestRepo;
import com.ehealthpera.demo.Service.LabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class LabImpl implements LabService {
    @Autowired
    private LabReportRequestRepo labReportRequestRepo;

    @Autowired
    private LabReportRepo labReportRepo;

    //send request for lab report
    @Override
    public String sendLabReportRequest(LabReportRequestByDoctorDTO labReportRequestByDoctorDTO){
        LabReportRequest labReportRequest1=new LabReportRequest();
        labReportRequest1.setEnrolmentNumber(labReportRequestByDoctorDTO.getEnrolmentNumber());
        labReportRequest1.setLabReportType(labReportRequestByDoctorDTO.getLabReportType());
        labReportRequest1.setRequestedBy(labReportRequestByDoctorDTO.getRequestedBy());
        labReportRequest1.setCreateDate(LocalDate.now());
        labReportRequest1.setCreateTime(LocalDateTime.now());

        labReportRequestRepo.save(labReportRequest1);
        return "Request send successfully!";
    }

    //create lab report
    public String createLabReport(LabReportDTO labReportDTO){
        LabReport labReport1=new LabReport();
        labReport1.setEnrolmentNumber(labReportDTO.getEnrolmentNumber());
        labReport1.setRequestedBy(labReportDTO.getRequestedBy());
        labReport1.setReportFile(labReportDTO.getReportFile());
        labReport1.setLabReportType(labReportDTO.getLabReportType());
        labReport1.setCreateDate(LocalDate.now());
        labReport1.setCreateTime(LocalDateTime.now());

        labReportRepo.save(labReport1);
        return "Create "+labReport1.getLabReportType()+" report successfully!";
    }
}
