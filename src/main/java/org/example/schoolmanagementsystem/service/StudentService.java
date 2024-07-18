package org.example.schoolmanagementsystem.service;

import org.example.schoolmanagementsystem.entities.Attendance;

import java.util.List;

public interface StudentService {

    List<Attendance> getByStudentId(Long id);
}
