package com.serva4ok.Egator.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.serva4ok.Egator.domain.Exercise;
import com.serva4ok.Egator.repos.ExerciseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("get")
public class RestExerciseController {



    private ExerciseRepo exerciseRepo;
    @Autowired
    public RestExerciseController(ExerciseRepo exerciseRepo) {
        this.exerciseRepo = exerciseRepo;
    }

    @RequestMapping("/findbynomer")
    public List<String> findByNomer(@RequestParam("nomer") String nomer){
        List<String> serans = new ArrayList<>();
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        for(Exercise exercise: exerciseRepo.findByNomer(nomer)){

            serans.add(gson.toJson(exercise));



        }
        return serans;

    }

}
