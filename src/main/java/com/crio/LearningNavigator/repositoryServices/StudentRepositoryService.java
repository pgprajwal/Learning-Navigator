package com.crio.LearningNavigator.repositoryServices;

import java.util.List;

import com.crio.LearningNavigator.dto.Student;

public interface StudentRepositoryService {

    Student createStudent(String studentName);

    Student findStudentById(long studentId);

    Student enrollStudentInSubject(long studentId, long subjectId);

    Student registerStudentForExam(long studentId, long examId);

    List<Student> findAllStudents();

    void deleteStudent(long studentId);
}
