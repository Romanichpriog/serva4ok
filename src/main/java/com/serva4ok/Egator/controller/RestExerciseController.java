package com.serva4ok.Egator.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.serva4ok.Egator.domain.Exercise;
import com.serva4ok.Egator.repos.ExerciseRepo;
import netscape.javascript.JSObject;
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
        List<String> testovik= new ArrayList<>();
        List<Map<String,String>> serans = new ArrayList<>();
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        for(Exercise exercise: exerciseRepo.findByNomer(nomer)){
            testovik.add(gson.toJson(exercise));
            serans.add(new HashMap<String,String>() {{put("nomer",exercise.getNomer());put("textzadania",exercise.getTextzadania());put("uslovie",exercise.getUslovie());put("otvet",exercise.getOtvet());put("text",exercise.getText());}});

        }
        return testovik;

    }

    @RequestMapping("/test")
    public List<Map<String,String>> test(@RequestParam("nomer") String nomer){

        List<Map<String,String>> varikNavarik = new ArrayList<>();
        for (Integer i = 1;i<27;i++) {
            List<Map<String,String>> serans = new ArrayList<>();

            for (Exercise exercise : exerciseRepo.findByNomer(i.toString())) {
                serans.add(new HashMap<String, String>() {{
                    put("nomer", exercise.getNomer());
                    put("textzadania", exercise.getTextzadania());
                    put("uslovie", exercise.getUslovie());
                    put("otvet", exercise.getOtvet());
                    put("text", exercise.getText());
                }});

            }
            varikNavarik.add(serans.get(Integer.parseInt(nomer)));
        }
        return varikNavarik;

    }

}
