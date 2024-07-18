package org.example.schoolmanagementsystem.repo;

import org.example.schoolmanagementsystem.entities.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subject,Long> {
}
