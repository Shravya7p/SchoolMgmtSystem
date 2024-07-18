package org.example.schoolmanagementsystem.service;

import org.example.schoolmanagementsystem.entities.User;
import org.example.schoolmanagementsystem.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAllUsers() {
        //return List.of(userRepository.findAll());
        List<User> l = userRepository.findAll();
        return l;
    }
}
