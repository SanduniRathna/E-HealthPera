package com.ehealthpera.demo.Dto.ststicDTO;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class NewsDTO {
    private String title;
    private String description;
}
