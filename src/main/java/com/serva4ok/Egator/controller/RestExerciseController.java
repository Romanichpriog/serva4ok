package com.serva4ok.Egator.controller;

import com.serva4ok.Egator.domain.Exercise;
import com.serva4ok.Egator.repos.ExerciseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("get")
public class RestExerciseController {



    private ExerciseRepo exerciseRepo;
    @Autowired
    public RestExerciseController(ExerciseRepo exerciseRepo) {
        this.exerciseRepo = exerciseRepo;
    }

    @RequestMapping("/findbynomer")
    public String findByNomer(@RequestParam("nomer") String nomer){
        String result="";
        for(Exercise exercise: exerciseRepo.findByNomer(nomer)){
            result+= exercise.toString();
        }
        return result;

    }

}
