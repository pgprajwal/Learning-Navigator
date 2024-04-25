package com.crio.LearningNavigator.dto;

import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student {

    private long id;

    private String name;

    private Set<Subject> enrolledSubjects;

    private Set<Exam> registeredExams;
    
}
