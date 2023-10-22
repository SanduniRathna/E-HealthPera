package com.ehealthpera.demo.Entity;

import com.ehealthpera.demo.Dto.MedicineIdDTO;
import com.ehealthpera.demo.Entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="studentMedicine")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class MedicineRecord {

    @EmbeddedId
    @Id
    private MedicineIdDTO medicineId;

    @ManyToOne
    @JoinColumn(name="id",insertable = false,updatable = false)
    private User user;

    @Column(name="medicineList")
    private List<String> medicineList;

    @Column(name = "give-medicine")
    private boolean pharmacyGive;

    //constructor for doctor create medicine records


    public MedicineRecord(MedicineIdDTO medicineId, User user, List<String> medicineList) {
        this.medicineId = medicineId;
        this.user=user;
        this.medicineList = medicineList;
    }
}


