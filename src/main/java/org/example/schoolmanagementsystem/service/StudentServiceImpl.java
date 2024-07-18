package org.example.schoolmanagementsystem.service;

import org.example.schoolmanagementsystem.entities.Attendance;
import org.example.schoolmanagementsystem.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepo studentRepo;

    @Override
    public List<Attendance> getByStudentId(Long id) {
        List<Attendance> al = studentRepo.findByStudentId(id);
        return al;
    }
}
