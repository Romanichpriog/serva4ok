package com.serva4ok.Egator.controller;


import com.serva4ok.Egator.domain.Exercise;
import com.serva4ok.Egator.repos.ExerciseRepo;
import com.sun.tools.jdeps.JdepsFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller

public class ExerciseController {
    @Autowired
    private ExerciseRepo exerciseRepo;
    @GetMapping("/greetings")
    public String greeting(
            @RequestParam(name="name", required = false,defaultValue = "world")  String name, Map<String,Object> model
    ){
        model.put("name",name);
        return "exercise";
    }
    @GetMapping
    public String main(Map<String,Object> model){
        Iterable<Exercise> exercises = exerciseRepo.findAll();
        model.put("exercises",exercises);
        return "main";
    }
    @PostMapping
    public String add(@RequestParam String nomer,@RequestParam String textzadania,@RequestParam(required = false) String uslovie, @RequestParam String otvet, @RequestParam(required = false) String text, Map<String,Object> model){
        if (uslovie==null){
            Exercise exercise = new Exercise(nomer,textzadania,"",otvet,text);
            exerciseRepo.save(exercise);
        }
        if (text==null){
            Exercise exercise = new Exercise(nomer,textzadania,uslovie,otvet,"");
            exerciseRepo.save(exercise);
        }else {
            Exercise exercise = new Exercise(nomer, textzadania, uslovie, otvet, text);
            exerciseRepo.save(exercise);
        }

        Iterable<Exercise> exercises = exerciseRepo.findAll();
        model.put("exercises",exercises);
        return "main";


    }


}
