package com.crio.LearningNavigator.services;

import java.util.List;

import com.crio.LearningNavigator.dto.Subject;
import com.crio.LearningNavigator.exchanges.CreateSubjectRequest;

public interface SubjectService {

    Subject createSubject(CreateSubjectRequest createSubjectRequest);

    Subject findSubjectById(long subjectId);

    List<Subject> findAllSubjects();

    void deleteSubject(long subjectId);

}
