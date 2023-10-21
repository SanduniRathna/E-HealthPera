package com.ehealthpera.demo.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MedicineIdDTO {
    private MedicineIdDTO medicineIdDTO;
    private UserDTO userDTO;
    private List<String> medicineRecords;
}
