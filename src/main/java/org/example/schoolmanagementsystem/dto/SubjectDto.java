package org.example.schoolmanagementsystem.dto;

import jakarta.persistence.Entity;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.example.schoolmanagementsystem.entities.Subject;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SubjectDto {

    Subject subjectName;

    String desc;
}
