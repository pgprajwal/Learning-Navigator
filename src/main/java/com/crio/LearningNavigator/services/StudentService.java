package com.crio.LearningNavigator.services;

import java.util.List;

import com.crio.LearningNavigator.dto.Student;
import com.crio.LearningNavigator.exchanges.RegisterStudentRequest;

public interface StudentService {

    Student registerStudent(RegisterStudentRequest registerStudentRequest);

    Student findStudentById(long studentId);

    Student enrollStudentInSubject(long studentId, long subjectId);

    Student registerStudentForExam(long studentId, long examId);

    List<Student> findAllStudents();

    void deregisterStudent(long studentId);
}
