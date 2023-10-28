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
        Student student1=new Student();

        //get siblings data to array


    }
}
