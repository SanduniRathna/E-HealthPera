package com.ehealthpera.demo.Controller;

import com.ehealthpera.demo.Dto.StudentDTO;
import com.ehealthpera.demo.Dto.medicineRecordDTO.MedicineRecordDTO;
import com.ehealthpera.demo.Entity.Student;
import com.ehealthpera.demo.Entity.medicineEntity.MedicineRecord;
import com.ehealthpera.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/student")
@CrossOrigin

public class StudentController {
    @Autowired
    private StudentService studentService;


    //sign up student
    @PostMapping("/signup-student")
    public String studentSignUp(@RequestBody StudentDTO studentDTO){
        if(studentService.enrolmentNumberIsalreadyTaken(studentDTO.getEnrolmentNumber())){
            return "Entered enrolment number already taken";
        }else{
            studentService.studentSignUp(studentDTO);
            return "Successfully register";
        }
    }

    //get user profile by enrolment number
    @GetMapping("/get-student-profile-by-enrolment-number")
    public Student getStudentProfile(String enrolmentNumber){
        return studentService.getStudentProfile(enrolmentNumber);
    }

    /* About student medicine records*/

    //create medicine record for student
 @PatchMapping("/create-medicine-record")
    public String createMedicineRecord(@RequestBody MedicineRecordDTO medicineRecordDTO){
        if(studentService.enrolmentNumberIsalreadyTaken(medicineRecordDTO.getEnrolmentNumber())){
            return studentService.createMedicineRecord(medicineRecordDTO);
        }else{
            return "No account for this user enrolment number!,Please register first.";
        }
 }
    //get student medicine details
    @GetMapping("/get-student-medicine-record")
    public MedicineRecord getStudentMedicineRecord(String enrolmentNumber){
        return studentService.getStudentMedicineRecord(enrolmentNumber);
    }

}
