package com.ehealthpera.demo.Dto.medicineRecordDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class MedicineRecordDTO {
    private String enrolmentNumber;
    private List<String> medicineList;
}
