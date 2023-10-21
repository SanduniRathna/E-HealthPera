package com.ehealthpera.demo.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class MedicineId implements Serializable {
    @Column(name = "id")
    private String id;

    @Column(name = "date")
    private Date date;
}
