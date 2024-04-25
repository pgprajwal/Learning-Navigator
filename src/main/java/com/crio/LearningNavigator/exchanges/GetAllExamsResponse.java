package com.crio.LearningNavigator.exchanges;

import java.util.List;

import com.crio.LearningNavigator.dto.Exam;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GetAllExamsResponse {
    private List<Exam> exams;
}
