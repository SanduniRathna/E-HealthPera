package com.ehealthpera.demo.Controller;

import com.ehealthpera.demo.Dto.UserDTO;
import com.ehealthpera.demo.Entity.User;
import com.ehealthpera.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user/")
@CrossOrigin

public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public String userSignUp(@RequestBody UserDTO userDTO){
        return userService.signupNewUser(userDTO);
    }

    //get all users
    @GetMapping("/getallusers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
   /* @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);

    }
    @GetMapping("/getUserById/{ID}")
    public UserDTO getUserById(@PathVariable String ID) {

        return userService.getUserById(ID);
    }*/


}
