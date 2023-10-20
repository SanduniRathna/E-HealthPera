package com.ehealthpera.demo.Service.impl;

import com.ehealthpera.demo.Dto.UserDTO;
import com.ehealthpera.demo.Entity.User;
import com.ehealthpera.demo.Repository.UserRepo;
import com.ehealthpera.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

public class UserImpl implements UserService {
    @Autowired
    public PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepo userRepo;

    @Override
    public String signupNewUser( UserDTO userDTO){
        User user = new User(
                userDTO.getId(),
                userDTO.getName(),
                userDTO.getEmail(),
                this.passwordEncoder.encode(userDTO.getPassword()),
                userDTO.getNationalId(),
                userDTO.getPhoneNumber()
        );

        userRepo.save(user);
        return user.getName();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
}
