package com.ehealthpera.demo.Service.impl;

import com.ehealthpera.demo.Dto.LoginDTO;
import com.ehealthpera.demo.Dto.UserDTO;
import com.ehealthpera.demo.Entity.User;
import com.ehealthpera.demo.Repository.UserRepo;
import com.ehealthpera.demo.Service.UserService;
import com.ehealthpera.demo.Service.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;
import java.util.Optional;

public class UserImpl implements UserService {
    @Autowired
    public PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepo userRepo;

    //sign up method
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

    //get all users method
    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    //login method
    @Override
    public LoginResponse loginUser(LoginDTO loginDTO){
        String message ="";
        User user1= userRepo.findByEmail(loginDTO.getEmail());

        if(user1!=null){
            String password=loginDTO.getPassword();
            String encodedPassword= user1.getPassword();
            Boolean isPWRight = passwordEncoder.matches(password,encodedPassword);

            if(isPWRight){
                Optional<User> user=userRepo.findOneEmailAndPassword(loginDTO.getEmail(),encodedPassword);
                if(user.isPresent()){
                    return new LoginResponse("Login success",true);
                }else{
                    return new LoginResponse("Login Faild",false);
                }
            }else{
                return new LoginResponse("Password not match",false);
            }
        }else{
            return new LoginResponse("Email not found",false);
        }
    }
}
