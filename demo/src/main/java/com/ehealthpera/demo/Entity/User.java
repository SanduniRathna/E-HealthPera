package com.ehealthpera.demo.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name ="user")
public class User {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name="email",nullable = false)
    private String email;

    @Column(name="password",nullable = false)
    private String password;

    @Column(name="national_id",nullable = false)
    private String nationalId;

    @Column(name="phone_number",nullable = false)
    private String phoneNumber;

}
