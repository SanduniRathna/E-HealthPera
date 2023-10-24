package com.ehealthpera.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "siblings")
public class Siblings {
    @Id
    private String enrolmentNumber;
    private String siblingsName;
    private int siblingsAge;
}
