package com.ehealthpera.demo.Service;

import com.ehealthpera.demo.Dto.LoginDTO;
import com.ehealthpera.demo.Dto.UserDTO;
import com.ehealthpera.demo.Entity.User;
import com.ehealthpera.demo.Service.response.LoginResponse;

import java.util.List;

public interface UserService {
    //user sing up service method
    public String signupNewUser(UserDTO userDTO);
    //get all users service method
    public List<User> getAllUsers();

    //login service method
    public LoginResponse loginUser(LoginDTO loginDTO);
}
