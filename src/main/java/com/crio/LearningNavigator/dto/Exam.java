package com.crio.LearningNavigator.dto;

import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Exam {
   
    private long id;

    private Subject subject;

    private Set<Student> enrolledStudents;
}
