package com.crio.LearningNavigator.services;

import java.util.List;

import com.crio.LearningNavigator.dto.Exam;
import com.crio.LearningNavigator.exchanges.CreateExamRequest;

public interface ExamService {
    
    Exam createExam(CreateExamRequest createExamRequest);

    Exam findExamById(long examId);

    List<Exam> findAllExams();

    void deleteExam(long examId);
}
