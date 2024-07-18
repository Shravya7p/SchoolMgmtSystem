package org.example.schoolmanagementsystem.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.schoolmanagementsystem.enums.AttendanceStatus;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    @Enumerated(EnumType.STRING)
    AttendanceStatus attendanceStatus;

    @OneToMany(mappedBy = "student")
     List<Subject> subjectList;
}
