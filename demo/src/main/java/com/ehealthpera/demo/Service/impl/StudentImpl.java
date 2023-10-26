package com.ehealthpera.demo.Service.impl;

import com.ehealthpera.demo.Dto.StudentDTO;
import com.ehealthpera.demo.Entity.Siblings;
import com.ehealthpera.demo.Entity.Student;
import com.ehealthpera.demo.Repository.SiblingsRepo;
import com.ehealthpera.demo.Repository.StudentRepo;
import com.ehealthpera.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.json.JSONArray;

@Service
public class StudentImpl {

    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private SiblingsRepo siblingsRepo;
    void studentSignUp(StudentDTO studentDTO) {
        Student student1=new Student(
                studentDTO.getName(),
                studentDTO.getEnrolmentNumber(),
                studentDTO.getNationalId(),
                studentDTO.getAlIndexNumber(),
                studentDTO.getBirthDate(),
                studentDTO.getSex(),
                studentDTO.getNationality(),
                studentDTO.getMaritalStatus(),
                studentDTO.getAddress(),
                studentDTO.getOlSchoolName(),
                studentDTO.getAlSchoolName(),
                studentDTO.getExtraCurricularActivities(),
                studentDTO.getFoodHabits(),
                studentDTO.getMotherOccupation(),
                studentDTO.getFatherOccupation(),
                studentDTO.getNumberOfSiblings(),
                studentDTO.isHospitalized(),
                studentDTO.isUndergoneMajorSurgery(),
                studentDTO.isChronicDisease(),
                studentDTO.isPhysicalDisability(),
                studentDTO.isHavingAllergyToFood(),
                studentDTO.isHavingAllergyToDrugs(),
                studentDTO.getPersonToBeEmergency(),
                studentDTO.getEmergencyPersonAddress(),
                studentDTO.getEmergencyPhoneNumber(),
                studentDTO.isWasCovidVaccinate(),
                studentDTO.getSiblings()
        );

        //get siblings data to array

        JSONObject
        if(studentDTO.getNumberOfSiblings()>0){
            Siblings siblings1=new Siblings();
            siblings1.setSiblingsName(studentDTO.getSiblings().);
            siblingsRepo.save()
        }

    }
}
