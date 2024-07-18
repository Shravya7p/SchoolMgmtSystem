package org.example.schoolmanagementsystem.repo;

import org.example.schoolmanagementsystem.entities.Attendance;
import org.example.schoolmanagementsystem.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AttendanceRepo extends JpaRepository<Attendance,Long> {


}
