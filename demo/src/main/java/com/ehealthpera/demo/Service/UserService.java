package com.ehealthpera.demo.Service;

import com.ehealthpera.demo.Dto.UserDTO;
import com.ehealthpera.demo.Entity.User;

import java.util.List;

public interface UserService {
    public String signupNewUser(UserDTO userDTO);
    public List<User> getAllUsers();
}
