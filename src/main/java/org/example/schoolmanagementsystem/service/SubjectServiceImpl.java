package org.example.schoolmanagementsystem.service;

import org.example.schoolmanagementsystem.dto.SubjectDto;
import org.example.schoolmanagementsystem.entities.Subject;
import org.example.schoolmanagementsystem.mapper.SubjectMapper;
import org.example.schoolmanagementsystem.repo.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectServiceImpl implements SubjectService{

    @Autowired
    private SubjectRepo subjectRepo;

    @Override
    public Subject addSubject(SubjectDto subjectDto) {
         Subject s = SubjectMapper.mapToSubject(subjectDto);
        return subjectRepo.save(s);
    }

    @Override
    public List<Subject> getAllSubjects() {
        return subjectRepo.findAll();
    }
}
