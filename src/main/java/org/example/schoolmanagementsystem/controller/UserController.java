package org.example.schoolmanagementsystem.controller;


import lombok.AllArgsConstructor;
import org.apache.catalina.UserDatabase;
import org.example.schoolmanagementsystem.dto.UserDto;
import org.example.schoolmanagementsystem.entities.User;
import org.example.schoolmanagementsystem.service.AuthService;
import org.example.schoolmanagementsystem.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/user")
public class UserController {

    private final AuthService authService;

    private final UserService userService;


    @PostMapping("")
    public User createUser(@RequestBody UserDto userDto){
        return authService.createUser(userDto);
    }


    @GetMapping("/admin/*")
    public ResponseEntity<List<User>> getAllUsers(){
        List<User> l = userService.getAllUsers();
        return new ResponseEntity<>(l, HttpStatus.OK);
    }

}
