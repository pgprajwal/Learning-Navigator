package com.crio.LearningNavigator.exchanges;

import java.util.List;

import com.crio.LearningNavigator.dto.Student;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetAllStudentsResponse {
    private List<Student> students;
}
