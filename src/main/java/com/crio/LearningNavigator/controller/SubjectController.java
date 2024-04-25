package com.crio.LearningNavigator.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crio.LearningNavigator.dto.Subject;
import com.crio.LearningNavigator.exchanges.CreateSubjectRequest;
import com.crio.LearningNavigator.exchanges.GetAllSubjectsResponse;

import jakarta.validation.Valid;

@RestController
@RequestMapping(SubjectController.SUBJECT_API_ENDPOINT)
public class SubjectController {
    public static final String SUBJECT_API_ENDPOINT = "/subjects";

    @PostMapping
    public ResponseEntity<Subject> createSubject(@Valid @RequestBody CreateSubjectRequest createSubjectRequest) {
        return null;
    }

    @GetMapping("/{subjectId}")
    public ResponseEntity<Subject> getSubjectById(@PathVariable long subjectId) {
        return null;
    }

    @GetMapping
    public ResponseEntity<GetAllSubjectsResponse> getAllSubjects() {
        return null;
    }

    @DeleteMapping("/{subjectId}")
    public ResponseEntity<String> deleteSubject(@PathVariable long subjectId) {
        return null;
    }
}
