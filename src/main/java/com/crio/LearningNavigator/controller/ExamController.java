package com.crio.LearningNavigator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crio.LearningNavigator.dto.Exam;
import com.crio.LearningNavigator.exchanges.CreateExamRequest;
import com.crio.LearningNavigator.exchanges.GetAllExamsResponse;

import jakarta.validation.Valid;

@RestController
@RequestMapping(ExamController.EXAM_API_ENDPOINT)
public class ExamController {
    public static final String EXAM_API_ENDPOINT = "/exams";

    @PostMapping
    public ResponseEntity<Exam> createExam(@Valid @RequestBody CreateExamRequest createExamRequest) {
        return null;
    }

    @GetMapping("/{examId}")
    public ResponseEntity<Exam> getExamById(@PathVariable long examId) {
        return null;
    }

    @GetMapping
    public ResponseEntity<GetAllExamsResponse> getAllExams() {
        return null;
    }

    @DeleteMapping("/{examId}")
    public ResponseEntity<String> deleteExam(@PathVariable long examId) {
        return null;
    }
}
