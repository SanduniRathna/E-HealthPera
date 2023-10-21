package com.ehealthpera.demo.Service;

import com.ehealthpera.demo.Dto.LoginDTO;
import com.ehealthpera.demo.Dto.UserDTO;
import com.ehealthpera.demo.Entity.User;
import com.ehealthpera.demo.Service.response.LoginResponse;

import java.util.List;

public interface UserService {
    //user sing up service method
    String signupNewUser(UserDTO userDTO);
    //get all users service method
    List<User> getAllUsers();
    //get user by search user id
    User getUserById(String id);

    //login service method
    LoginResponse loginUser(LoginDTO loginDTO);
}
