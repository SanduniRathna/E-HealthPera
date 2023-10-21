package com.ehealthpera.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="studentMedicine")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MedicineRecord {

    @EmbeddedId
    private MedicineId medicineId;

    @ManyToOne
    @JoinColumn(name="id",insertable = false,updatable = false)
    private User user;

    @Column(name="medicineList")
    private List<String> medicineList;


}


