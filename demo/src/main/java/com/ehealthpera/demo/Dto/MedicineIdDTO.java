package com.ehealthpera.demo.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MedicineIdDTO {
    private String id;
    private Date date;
    private boolean pharmacyGive;
}
