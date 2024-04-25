package com.crio.LearningNavigator.repositoryServices;

import java.util.List;

import com.crio.LearningNavigator.dto.Exam;
import com.crio.LearningNavigator.dto.Subject;

public interface ExamRepositoryService {
    Exam createExam(Subject subject);

    Exam findExamById(long examId);

    List<Exam> findAllExams();

    void deleteExam(long examId);
}
