package com.ehealthpera.demo.Repository;

import com.ehealthpera.demo.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface StudentRepo extends JpaRepository<Student,String> {
    Long countByEnrolmentNumber(String enrolmentNumber);
    Student findByEnrolmentNumber(String enrolmentNumber);
}
