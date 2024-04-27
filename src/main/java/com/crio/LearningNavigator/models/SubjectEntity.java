package com.crio.LearningNavigator.models;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "subjects")
public class SubjectEntity {
    
    @Id
    @Column(name = "subjectId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;  

    @Column(name = "subjectName")
    private String name;

    @ManyToMany(mappedBy = "subjectEntities", fetch = FetchType.EAGER)
    private Set<StudentEntity> registeredStudents = new HashSet<>();
}
