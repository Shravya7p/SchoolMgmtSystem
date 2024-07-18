package org.example.schoolmanagementsystem.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Attendance {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
     Long id;

    @ManyToOne
    @JoinColumn(name="student_id")
     Student student;


}
