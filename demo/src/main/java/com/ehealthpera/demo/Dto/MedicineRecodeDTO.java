package com.ehealthpera.demo.Dto;

import com.ehealthpera.demo.Entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class MedicineRecodeDTO {
    private MedicineIdDTO medicineIdDTO;
    private User user;
    private List<String> medicineRecords;
    private boolean pharmacyGive;
}
