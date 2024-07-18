package org.example.schoolmanagementsystem.controller;

import org.example.schoolmanagementsystem.dto.SubjectDto;
import org.example.schoolmanagementsystem.entities.Subject;
import org.example.schoolmanagementsystem.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @PostMapping
    public ResponseEntity<Subject> addSSubject(@RequestBody SubjectDto subjectDto){
        Subject savedSubject = subjectService.addSubject(subjectDto);
        return new ResponseEntity<>(savedSubject, HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<Subject>> getAllSubjects(){
        List<Subject> subjectList = subjectService.getAllSubjects();
        return new ResponseEntity<>(subjectList,HttpStatus.OK);
    }
}
