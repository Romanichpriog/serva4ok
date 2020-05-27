package com.serva4ok.Egator.controller;

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

    @RequestMapping("/wholewariant")
    public List<Map<String,String>> wholeVariant(@RequestParam("nomer") String nomer){
        List<Map<String,String>> serans;
        List<Map<String,String>> polnie= new ArrayList<>();
        for (int i=1;i<27;i++) {
            Integer io=i;
            serans= new ArrayList<>();


            for (Exercise exercise : exerciseRepo.findByNomer(io.toString())) {
                serans.add(new HashMap<String, String>() {{
                    put("nomer", exercise.getNomer());
                    put("textzadania", exercise.getTextzadania());
                    put("uslovie", exercise.getUslovie());
                    put("otvet", exercise.getOtvet());
                    put("text", exercise.getText());
                }});
                polnie.add(serans.get(Integer.parseInt(nomer)));

            }
        }
        return polnie;

    }

    @RequestMapping("/findbynomer")
    public List<Map<String,String>> findByNomer(@RequestParam("nomer") String nomer){
        List<Map<String,String>> serans = new ArrayList<>();
        for(Exercise exercise: exerciseRepo.findByNomer(nomer)){
            serans.add(new HashMap<String,String>() {{put("nomer",exercise.getNomer());put("textzadania",exercise.getTextzadania());put("uslovie",exercise.getUslovie());put("otvet",exercise.getOtvet());put("text",exercise.getText());}});

        }
        return serans;

    }

}
