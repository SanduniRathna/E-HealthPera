package com.ehealthpera.demo.Entity.staticEntity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "news")
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "newsId")
    private Long newsId;
    private String title;
    private String description;
    private LocalDateTime createTime;
    private LocalDate createDate;
}
