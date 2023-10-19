package com.ehealthpera.demo.Service;

import com.ehealthpera.demo.Dto.UserDTO;
import com.ehealthpera.demo.Repository.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private PasswordEncorder passwordEncorder;

    public User registerUser(User user){
        //Check if the user email is already taken
        if(userRepo.findByUserEmail(user.getEmail()) != null){
            throw new RuntimeException("User already exists");
        }

        //Encrypt the user's password before saving it
        user.setPassword(passwordEncorder.encode(user.getPAssword()));

        return userRepo.save(user);
    }
    public UserDTO saveUser(UserDTO userDTO){
        //userRepo.save(new User(userDTO.getId()));
//        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }


}
