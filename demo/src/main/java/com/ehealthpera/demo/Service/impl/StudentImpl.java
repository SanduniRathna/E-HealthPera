package com.ehealthpera.demo.Service.impl;

import com.ehealthpera.demo.Dto.SiblingsDTO;
import com.ehealthpera.demo.Dto.StudentDTO;
import com.ehealthpera.demo.Dto.medicineRecordDTO.MedicineRecordDTO;
import com.ehealthpera.demo.Entity.*;
import com.ehealthpera.demo.Entity.medicineEntity.MedicineRecord;
import com.ehealthpera.demo.Repository.MedicineRecordRepo;
import com.ehealthpera.demo.Repository.StudentRepo;
import com.ehealthpera.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
        student1.setWasMotherDead(studentDTO.isWasMotherDead());
        student1.setWasFatherDead(studentDTO.isWasFatherDead());

        //get siblings data to table
        if(studentDTO.getNumberOfSiblings()>0){
            List<Siblings> siblings=new ArrayList<>();
            for(Siblings siblingsDTO:studentDTO.getSiblings()){
                Siblings siblings1 = new Siblings();
                siblings1.setSiblingsName(siblingsDTO.getSiblingsName());
                siblings1.setSiblingsAge(siblingsDTO.getSiblingsAge());
                siblings1.setStudent(student1);
                siblings.add(siblings1);

            }
            //save siblings data to student profile
            student1.setSiblings(siblings);
        }
        //get hospitalized data to the table
        if(studentDTO.isHospitalized()){
            List<HospitalizedDetails> hospitalizedDetailsList=new ArrayList<>();
            for(HospitalizedDetails hospitalizedDetails:studentDTO.getHospitalizedDetailsList()){
                HospitalizedDetails hospitalizedDetails1=new HospitalizedDetails();
                hospitalizedDetails1.setDate(hospitalizedDetails.getDate());
                hospitalizedDetails1.setHealthCondition(hospitalizedDetails.getHealthCondition());
                hospitalizedDetails1.setStudent(student1);
                hospitalizedDetailsList.add(hospitalizedDetails1);
            }
            student1.setHospitalizedDetailsList(hospitalizedDetailsList);
        }
        //get Surgery details
        if(studentDTO.isUndergoneMajorSurgery()){
           List<SurgeryDetails> surgeryDetailsList=new ArrayList<>();
           for(SurgeryDetails surgeryDetails:studentDTO.getSurgeryDetailsList()){
               SurgeryDetails surgeryDetails1=new SurgeryDetails();

               //save details one by one to the table
               surgeryDetails1.setDetails(surgeryDetails.getDetails());
               surgeryDetails1.setStudent(student1);
               surgeryDetailsList.add(surgeryDetails1);
           }
           //set this Surgery details to the student table Surgery details list
            student1.setSurgeryDetailsList(surgeryDetailsList);
        }
        //get physical Disability details
        if(studentDTO.isPhysicalDisability()){
            List<PhysicalDisability> physicalDisabilitiesList=new ArrayList<>();

            //sve all the details to physical disability table
            for(PhysicalDisability physicalDisability:studentDTO.getPhysicalDisabilityList()){

                PhysicalDisability physicalDisability1=new PhysicalDisability();
                physicalDisability1.setType(physicalDisability.getType());
                physicalDisability1.setRequireAnyAssistance(physicalDisability.getRequireAnyAssistance());
                physicalDisability1.setStudent(student1);
                physicalDisabilitiesList.add(physicalDisability1);
            }
            student1.setPhysicalDisabilityList(physicalDisabilitiesList);
        }
        //get food allergy details
        if(studentDTO.isHavingAllergyToFood()){
            List<FoodAllergy> foodAllergyList=new ArrayList<>();

            for(FoodAllergy foodAllergy:studentDTO.getFoodAllergyList()){
                FoodAllergy foodAllergy1=new FoodAllergy();

                //get all food allergy details to the food allergy details table one by one
                foodAllergy1.setAllergyFoodsName(foodAllergy.getAllergyFoodsName());
                foodAllergy1.setStudent(student1);
                foodAllergyList.add(foodAllergy1);
            }

            //set food allergy details in student table
            student1.setFoodAllergyList(foodAllergyList);
        }
        //get drug allergy details
        if(studentDTO.isHavingAllergyToDrugs()){
            List<DrugAllergy> drugAllergyList=new ArrayList<>();

            for(DrugAllergy drugAllergy:studentDTO.getDrugAllergyList()){
                DrugAllergy drugAllergy1=new DrugAllergy();

                //set all allergy drugs for drug allergy table one by one
                drugAllergy1.setAllergyDrugsName(drugAllergy.getAllergyDrugsName());
                drugAllergy1.setStudent(student1);
                //save details in the list
                drugAllergyList.add(drugAllergy1);
            }

            //save allergy drug details in the student table
            student1.setDrugAllergyList(drugAllergyList);
        }
        //get covid vaccination details
        if(studentDTO.isWasCovidVaccinate()){
            List<CovidVaccine> covidVaccineList= new ArrayList<>();
            for(CovidVaccine covidVaccine:studentDTO.getCovidVaccineList()){
                CovidVaccine covidVaccine1=new CovidVaccine();
                covidVaccine1.setDose(covidVaccine.getDose());
                covidVaccine1.setVaccineName(covidVaccine.getVaccineName());
                covidVaccine1.setDateOfVaccination(covidVaccine.getDateOfVaccination());
                covidVaccine1.setStudent(student1);
                covidVaccineList.add(covidVaccine1);
            }
            student1.setCovidVaccineList(covidVaccineList);
        }

        //get chronic disease details
        if(studentDTO.isChronicDisease()){


        }

        //if mother dead
        if(studentDTO.isWasMotherDead()){
            IfMotherDead ifMotherDead=studentDTO.getIfMotherDead();
            ifMotherDead.setStudent(student1);
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
