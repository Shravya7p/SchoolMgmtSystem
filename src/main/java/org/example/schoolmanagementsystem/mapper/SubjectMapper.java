package org.example.schoolmanagementsystem.mapper;

import lombok.experimental.UtilityClass;
import org.example.schoolmanagementsystem.dto.SubjectDto;
import org.example.schoolmanagementsystem.entities.Subject;

@UtilityClass
public class SubjectMapper {

    public static Subject mapToSubject(SubjectDto subjectDto){
        return Subject.builder()
                .subjectName(subjectDto.getSubjectName())
                .desc(subjectDto.getDesc())
                .build();
    }
}
