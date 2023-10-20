package com.ehealthpera.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity(name="studentMedicine")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MedicineRecord {
    @ManyToOne
    @Id
    @JoinColumn(name="id")
    private String id;

    @Column(name="date")
    private Date date;

    @Column(name="medicine_list", length = 2000)
    private String medicineList;

}
