package com.ehealthpera.demo.Controller;

import com.ehealthpera.demo.Dto.LoginDTO;
import com.ehealthpera.demo.Dto.UserDTO;
import com.ehealthpera.demo.Entity.User;
import com.ehealthpera.demo.Service.UserService;
import com.ehealthpera.demo.Service.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    //user Login
    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO){
        LoginResponse loginResponse=userService.loginUser(loginDTO);
        return ResponseEntity.ok(loginResponse);
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
