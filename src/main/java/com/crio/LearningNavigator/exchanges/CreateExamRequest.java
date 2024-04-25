package com.crio.LearningNavigator.exchanges;

import com.crio.LearningNavigator.dto.Subject;

import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateExamRequest {
    
    @NotNull
    private Subject subject;
}
