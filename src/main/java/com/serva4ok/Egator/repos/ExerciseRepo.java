package com.serva4ok.Egator.repos;

import com.serva4ok.Egator.domain.Exercise;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ExerciseRepo extends CrudRepository<Exercise,Long> {
    List<Exercise> findByNomer(String nomer);
}
