package com.ehealthpera.demo.Dto;

import com.ehealthpera.demo.Entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SiblingsDTO {
    private long siblingsId;
    private String siblingsName;
    private int siblingsAge;

    private Student student;
}
