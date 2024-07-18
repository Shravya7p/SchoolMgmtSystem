package org.example.schoolmanagementsystem.service;

import org.example.schoolmanagementsystem.entities.Attendance;
import org.example.schoolmanagementsystem.repo.AttendanceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceServiceImpl implements AttendanceService{

    @Autowired
    AttendanceRepo attendanceRepo;

    @Override
    public List<Attendance> getAllAttendance() {
        List<Attendance> l = attendanceRepo.findAll();
        return l;
    }
}
