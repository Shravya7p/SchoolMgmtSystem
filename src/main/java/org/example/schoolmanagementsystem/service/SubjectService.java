package org.example.schoolmanagementsystem.service;

import org.example.schoolmanagementsystem.dto.SubjectDto;
import org.example.schoolmanagementsystem.entities.Subject;

import java.util.List;

public interface SubjectService {

    Subject addSubject(SubjectDto subjectDto);
    List<Subject> getAllSubjects();
}
