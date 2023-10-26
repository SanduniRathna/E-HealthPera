package com.ehealthpera.demo.Controller;

import com.ehealthpera.demo.Dto.StudentDTO;
import com.ehealthpera.demo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/student")
@CrossOrigin

public class StudentController {
    @Autowired
    private StudentService studentService;

    //sign up student
    @PostMapping("/signupstudent")
    public String studentSignUp(@RequestBody StudentDTO studentDTO){
        StudentService.studentSignUp(studentDTO);
        return "he";
    }
}
