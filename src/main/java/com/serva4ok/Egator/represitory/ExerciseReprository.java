package com.serva4ok.Egator.represitory;

import com.serva4ok.Egator.model.Exercise;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExerciseReprository extends CrudRepository<Exercise, Long> {
    List<Exercise> findbyId(Long id);
}
