package com.ehealthpera.demo.Service;

import com.ehealthpera.demo.Dto.StudentDTO;
import com.ehealthpera.demo.Dto.medicineRecordDTO.MedicineRecordDTO;
import com.ehealthpera.demo.Entity.Student;
import com.ehealthpera.demo.Entity.medicineEntity.MedicineRecord;

public interface StudentService {
    //check enrollment number is already taken
    boolean enrolmentNumberIsalreadyTaken(String enrolmentNumber);

    //student sign up
    void studentSignUp(StudentDTO studentDTO);

    //create medicine record
    String createMedicineRecord(MedicineRecordDTO medicineRecordDTO);

    //get student profile
    Student getStudentProfile(String enrolmentNumber);

    //get medicine records
    MedicineRecord getStudentMedicineRecord(String enrolmentNumber);
}
