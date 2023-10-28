package com.ehealthpera.demo.Entity.medicineEntity;

import com.ehealthpera.demo.Entity.Student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "medicineRecord")
public class MedicineRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medicineRecordId")
    private Long medicineRecordId;
    private LocalDateTime createTime;
    private LocalDate createDate;
    private List<String> medicineList;

    @ManyToOne
    @JoinColumn(name = "enrolmentNumber")
    private Student student;
}
