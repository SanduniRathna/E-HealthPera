package com.ehealthpera.demo.Dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {
    @NotEmpty
    private String id;
    @NotEmpty(message="Name can not be empty!")
    private String name;
    @NotEmpty(message="Email can not be empty!")
    private String email;
    @NotEmpty(message="Password can not be empty!")
    private String password;
    @NotEmpty(message="National ID can not be empty!")
    private String nationalId;

    private int phoneNumber;


}
