package com.crio.LearningNavigator.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "exams")
public class ExamEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne
    private SubjectEntity subjectEntity;

    @ManyToMany(mappedBy = "registeredExams", fetch = FetchType.EAGER)
    private Set<StudentEntity> studentEntities = new HashSet<>();
}
