package com.crio.LearningNavigator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crio.LearningNavigator.dto.Student;
import com.crio.LearningNavigator.exchanges.GetAllStudentsResponse;
import com.crio.LearningNavigator.exchanges.RegisterStudentRequest;

import jakarta.validation.Valid;

@RestController
@RequestMapping(StudentController.STUDENT_API_ENDPOINT)
public class StudentController {
    public static final String STUDENT_API_ENDPOINT = "/students";

    @PostMapping
    public ResponseEntity<Student> registerStudent(@Valid @RequestBody RegisterStudentRequest registerStudentRequest) {
        return null;
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable long studentId) {
        return null;
    }

    @PutMapping("/{studentId}/subject/{subjectId}")
    public ResponseEntity<Student> enrollStudentInSubject(@PathVariable long studentId, @PathVariable long subjectId) {
        return null;
    }

    @PutMapping("/{studentId}/exam/{examId}")
    public ResponseEntity<Student> registerStudentForExam(@PathVariable long studentId, @PathVariable long examId) {
        return null;
    }

    @GetMapping
    public ResponseEntity<GetAllStudentsResponse> getAllStudents() {
        return null;
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity<String> deregisterStudent(@PathVariable long studentId) {
        return null;
    }
}
