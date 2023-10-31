package com.ehealthpera.demo.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class HospitalizedDTO {
    private Date date;
    private String healthCondition;
}
