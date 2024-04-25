package com.crio.LearningNavigator.repositoryServices;

import java.util.List;

import com.crio.LearningNavigator.dto.Subject;

public interface SubjectRepositoryService {

    Subject createSubject(String subjectName);

    Subject findSubjectById(long subjectId);

    List<Subject> findAllSubjects();

    void deleteSubject(long subjectId);
}
