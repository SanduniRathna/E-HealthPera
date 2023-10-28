package com.ehealthpera.demo.Service.impl;

import com.ehealthpera.demo.Dto.StudentDTO;
import com.ehealthpera.demo.Dto.medicineRecordDTO.MedicineRecordDTO;
import com.ehealthpera.demo.Entity.Student;
import com.ehealthpera.demo.Entity.medicineEntity.MedicineRecord;
import com.ehealthpera.demo.Repository.MedicineRecordRepo;
import com.ehealthpera.demo.Repository.StudentRepo;
import com.ehealthpera.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
public class StudentImpl implements StudentService{

    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private MedicineRecordRepo medicineRecordRepo;

    //check enrollment number is already taken
    @Override
    public boolean enrolmentNumberIsalreadyTaken(String enrolmentNumber){
        if(studentRepo.countByEnrolmentNumber(enrolmentNumber)>0){
            return true;
        }else{
            return false;
        }
    }

    //student sign up
    @Override
    public void studentSignUp(StudentDTO studentDTO) {
        Student student1=new Student();

        student1.setName(studentDTO.getName());
        student1.setEnrolmentNumber(studentDTO.getEnrolmentNumber());
        student1.setNationalId(studentDTO.getNationalId());
        student1.setAlIndexNumber(studentDTO.getAlIndexNumber());
        student1.setBirthDate(studentDTO.getBirthDate());
        student1.setSex(studentDTO.getSex());
        student1.setNationality(studentDTO.getNationality());
        student1.setMaritalStatus(studentDTO.getMaritalStatus());
        student1.setAddress(studentDTO.getAddress());
        student1.setOlSchoolName(studentDTO.getOlSchoolName());
        student1.setAlSchoolName(studentDTO.getAlSchoolName());
        student1.setExtraCurricularActivities(studentDTO.getExtraCurricularActivities());
        student1.setFoodHabits(studentDTO.getFoodHabits());
        student1.setMotherOccupation(studentDTO.getMotherOccupation());
        student1.setFatherOccupation(studentDTO.getFatherOccupation());
        student1.setNumberOfSiblings(studentDTO.getNumberOfSiblings());
        student1.setHospitalized(studentDTO.isHospitalized());
        student1.setUndergoneMajorSurgery(studentDTO.isUndergoneMajorSurgery());
        student1.setChronicDisease(studentDTO.isChronicDisease());
        student1.setPhysicalDisability(studentDTO.isPhysicalDisability());
        student1.setHavingAllergyToFood(studentDTO.isHavingAllergyToFood());
        student1.setHavingAllergyToDrugs(studentDTO.isHavingAllergyToDrugs());
        student1.setPersonToBeEmergency(studentDTO.getPersonToBeEmergency());
        student1.setEmergencyPersonAddress(studentDTO.getEmergencyPersonAddress());
        student1.setEnrolmentNumber(studentDTO.getEnrolmentNumber());
        student1.setWasCovidVaccinate(studentDTO.isWasCovidVaccinate());

        //get siblings data to table
        if(studentDTO.getNumberOfSiblings()>0){
            student1.setSiblings(studentDTO.getSiblings());
        }
        //get hospitalized data to the table
        if(studentDTO.isHospitalized()){
            student1.setHospitalizedDetailsList(studentDTO.getHospitalizedDetailsList());
        }
        //get Surgery details
        if(studentDTO.isUndergoneMajorSurgery()){
            student1.setSurgeryDetailsList(studentDTO.getSurgeryDetailsList());
        }
        //get Chronic Disability details
        if(studentDTO.isPhysicalDisability()){
            student1.setPhysicalDisabilityList(studentDTO.getPhysicalDisabilityList());
        }
        //get food allergy details
        if(studentDTO.isHavingAllergyToFood()){
            student1.setFoodAllergyList(studentDTO.getFoodAllergyList());
        }
        //get drug allergy details
        if(studentDTO.isHavingAllergyToDrugs()){
            student1.setDrugAllergyList(studentDTO.getDrugAllergyList());
        }
        //get covid vaccination details
        if(studentDTO.isWasCovidVaccinate()){
            student1.setCovidVaccineList(studentDTO.getCovidVaccineList());
        }
        studentRepo.save(student1);

    }

    //create medicine record
    @Override
    public String createMedicineRecord(MedicineRecordDTO medicineRecordDTO){
        MedicineRecord medicineRecord1 =new MedicineRecord();
        medicineRecord1.setCreateTime(LocalDateTime.now());
        medicineRecord1.setCreateDate(LocalDate.now());
        medicineRecord1.setMedicineList(medicineRecordDTO.getMedicineList());
        medicineRecord1.setStudent(studentRepo.findByEnrolmentNumber(medicineRecordDTO.getEnrolmentNumber()));

        medicineRecordRepo.save(medicineRecord1);
        return "medicine record save successfully";
    }

    //get student profile
    public Student getStudentProfile(String enrolmentNumber){
        return studentRepo.findByEnrolmentNumber(enrolmentNumber);
    }

    //get medicine records
    public MedicineRecord getStudentMedicineRecord(String enrolmentNumber){
        return medicineRecordRepo.findByEnrolmentNumber(enrolmentNumber);
    }
}
